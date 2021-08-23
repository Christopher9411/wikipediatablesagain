import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alert {

    public static final By ALERT_BUTTON = By.cssSelector("div > div.col-md-6.text-left > div:nth-child(2) > div > div > div.panel-body > a");
    public static final By ALERT_ACCEPT =By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div/div[2]/div/div/div/div[4]/a[2]");
    public static final By ALERT_TEXT =By.xpath("//*[@id=\"myModal0\"]/div/div/div[3]");

//https://www.seleniumeasy.com/test/bootstrap-modal-demo.html

    public static void alertwindow(){
        WebDriver driver = Util.getDriver();
        WebElement alert_button =driver.findElement(ALERT_BUTTON);
        alert_button.click();
        String text= driver.findElement(ALERT_TEXT).getText();
        System.out.println(text);

    }


}
