import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertBoxConfirm {
//https://www.seleniumeasy.com/test/javascript-alert-box-demo.html

    public static final By ALERT_BOX = By.xpath("//button[@class='btn btn-default']");

    public static void confirm(){
        WebDriver driver = Util.getDriver();
        driver.findElement(ALERT_BOX).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
