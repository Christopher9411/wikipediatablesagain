import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Steam {

    //https://store.steampowered.com/?l=hungarian
    public static final By SEARCH_INPUT = By.xpath("//input[@id='store_nav_search_term']");
    public static final By GAME_DESCRIPTION = By.xpath("//div[@class='game_area_purchase_game_wrapper game_purchase_sub_dropdown']");
    public static final By REVIEW_TYPES = By.xpath(" //*[contains(text(),'Review Type')]");
    public static final By SEARCH_BUTTON = By.xpath("//*[@id=\"store_search_link\"]/img");
    public static final By SEARCHED_ELEMENT = By.xpath("//*[@id=\"search_resultsRows\"]/a[1]/div[1]/img");
    public static final By AGE_VERIFICATION = By.xpath("//*[@id=\"app_agegate\"]/div[1]/div[4]/a[1]/span");
    public static final By AGE_DROPDOWN = By.xpath("//*[@id=\"ageYear\"]");


    public static void buy_checkout() {
        WebDriver driver = Util.getDriver();
        WebDriverWait waot = new WebDriverWait(driver, 5);
        waot.until(ExpectedConditions.visibilityOfElementLocated(SEARCH_INPUT));
        WebElement search_input = driver.findElement(SEARCH_INPUT);
        search_input.sendKeys("GTA");
        WebElement search_button = driver.findElement(SEARCH_BUTTON);
        search_button.click();
        WebElement searched_element = driver.findElement(SEARCHED_ELEMENT);
        searched_element.click();
        Select select = new Select(driver.findElement(AGE_DROPDOWN));
        select.selectByValue("1994");
        WebElement age_verification = driver.findElement(AGE_VERIFICATION);
        age_verification.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(GAME_DESCRIPTION));
        String game_description = driver.findElement(GAME_DESCRIPTION).getText();
        System.out.println(game_description);
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        List<WebElement> links = driver.findElements(By.tagName("a"));
        for (WebElement link : links) {

            System.out.println(link.getText() + " - " + link.getAttribute("href"));
        }

    }

}
