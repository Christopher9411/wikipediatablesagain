import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fourfourfour {
//https://444.hu/
    public static final By COOKIES = By.xpath("/html/body/div[1]/div/div/div/div[2]/div/button[3]");
    public static final By SEARCH_BAR = By.xpath("//a[@id='ember79']");
    public static final By SEARCH_BUTTON = By.xpath("//button[@id='ember139']");
    public static final By ARTICLE = By.xpath("/html/body/div/div[2]/div[2]/div/div/div[23]/div[2]/article/div[1]/h1/a");

    public static void negy() {
        WebDriver driver = Util.getDriver();
      WebElement cookies = driver.findElement(COOKIES);
      cookies.click();
      WebDriverWait webdriverWait = new WebDriverWait(driver,7);
        webdriverWait.until(ExpectedConditions.visibilityOfElementLocated(SEARCH_BAR)).click();
        WebElement search = driver.findElement(SEARCH_BAR);
        search.sendKeys("kutya");
        search.click();
        WebElement search_button = driver.findElement(SEARCH_BUTTON);
        search_button.click();
        WebElement article = driver.findElement(ARTICLE);
        article.click();




    }


}
