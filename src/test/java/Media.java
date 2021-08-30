import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Media {

    public static final By COOKIE = By.xpath("//*[@id=\"cookie-info-layer\"]/div[1]/div/div[2]/a/span");
    public static final By MENU = By.xpath("//a[@class='site-navigation2__link site-navigation2__link--primary-toggle']");

//https://www.mediamarkt.hu/

    public void menuclick(){
        WebDriver driver = Util.getDriver();
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(COOKIE)).click();
        Select select = new Select( driver.findElement(MENU));
        select.selectByValue("Film");
    }




    public static void menuelement(){


    }
}
