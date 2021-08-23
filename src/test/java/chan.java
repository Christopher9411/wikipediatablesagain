import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class chan {
    public static final By VIDEO_GAMES = By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div[1]/ul[2]/li[1]/a");
    public static final By DISCLAIMER_ACCEPT = By.xpath(" //*[contains(text(),'Accept')]");
    public static final By THREAD_REPLY = By.xpath("/html/body/form[2]/div[1]/div[1]/div[1]/div[1]/div[3]/span[4]/span/a");
    public static final By COMMENT_OPENING = By.xpath("/html/body/form[2]/div[1]/div[2]/div[1]/a");
    public static final By COMMENTER_NAME = By.xpath("//input[@name='name' and @placeholder='Name']");



//https://www.4chan.org/

    public static void fourchan() {
        WebDriver driver = Util.getDriver();
        driver.findElement(VIDEO_GAMES).click();
        driver.findElement(DISCLAIMER_ACCEPT).click();
        driver.findElement(THREAD_REPLY).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        driver.findElement(COMMENT_OPENING).click();
        driver.findElement(COMMENTER_NAME).sendKeys("Anonymus");
       // driver.findElement()


    }


}
