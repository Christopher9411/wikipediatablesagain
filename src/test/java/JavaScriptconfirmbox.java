import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptconfirmbox {
   public static final By ALERT_BUTTON = By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/button");

//https://www.seleniumeasy.com/test/javascript-alert-box-demo.html
public static void alert_box(){
    WebDriver driver = Util.getDriver();
    driver.findElement(ALERT_BUTTON).click();
   Alert alert =driver.switchTo().alert();
   String alert_text = alert.getText();
   alert.accept();


}

}
