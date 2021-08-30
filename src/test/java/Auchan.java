import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Auchan {
    //https://www.auchan.hu/
    public static final By MENU = By.xpath("  //*[contains(text(),'Akciók')] ");
    public static final By COOKIES = By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]");


    public static void shoppin() {
        WebDriver driver = Util.getDriver();
        WebElement cookies = driver.findElement(COOKIES);
        cookies.click();
        WebDriverWait wait = new WebDriverWait(driver, 9);
        wait.until(ExpectedConditions.visibilityOfElementLocated(MENU));
        driver.findElement(MENU).click();
    }


    public static void tagname() {
        WebDriver driver = Util.getDriver();
        List<WebElement> tables = driver.findElements(By.tagName("a"));
        for (WebElement table : tables) {
            System.out.println(table.getText() + " - " + table.getAttribute("href"));

        }


    }
}


