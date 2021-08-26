import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bartervg {

    public static final By SEARCH_FIELD = By.xpath("//input[@id='q']");
    public static final By SEARCHED_ELEMENT = By.xpath("/html/body/main/div/ul[1]/li[3]/a");
    public static final By SEARCH_BUTTON =By.xpath("//input[@id='search']");

//https://barter.vg/

    public static void bartering(){
        WebDriver driver = Util.getDriver();
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(SEARCH_FIELD));
        driver.findElement(SEARCH_FIELD).sendKeys("GTA");
        driver.findElement(SEARCH_BUTTON).click();
        driver.findElement(SEARCHED_ELEMENT).click();





    }

}
