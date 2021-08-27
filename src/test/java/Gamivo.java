import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gamivo {

    //https://www.gamivo.com/
    public static final By SEARCH_FIELD = By.xpath("//input[@id='searchInputDesktop']");
    public static final By SEARCH_BUTTON = By.xpath("/html/body/app-root/div/app-header/div/div/div[1]/div[2]/div/div[1]/div/app-search/form/div/div[1]");
    public static final By PRODUCT = By.xpath("/html/body/app-root/div/div/ng-component/div/app-product-list/div/div/div/div[2]/div[2]/app-list/section/table/tbody/tr[9]/td[1]/app-image/figure/img");



    public static void shopping(){
        WebDriver driver = Util.getDriver();
        WebElement search_field = driver.findElement(SEARCH_FIELD);
        search_field.sendKeys("gta");
        driver.findElement(SEARCH_BUTTON).click();
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(PRODUCT));
        driver.findElement(PRODUCT).click();


    }

}
