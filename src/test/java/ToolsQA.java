import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//https://demoqa.com/
public class ToolsQA {
    public static final By MENUBOOK = By.cssSelector("div.card:nth-child(6) > div:nth-child(1) > div");
    public static final By INPUT_FIELD = By.xpath("//input[@id='searchBox']");


    public static void tool(){
        WebDriver driver = Util.getDriver();
        WebDriverWait webdriverWait = new WebDriverWait(driver, 9);
        webdriverWait.until(ExpectedConditions.visibilityOfElementLocated(MENUBOOK));
        WebElement menu= driver.findElement(MENUBOOK);
        menu.click();
        WebElement input = driver.findElement(INPUT_FIELD);
        input.sendKeys("Git Pocket Guide");
    }


}
