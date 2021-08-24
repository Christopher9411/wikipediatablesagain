import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptAlertBox {
//https://www.seleniumeasy.com/test/javascript-alert-box-demo.html
    public static final By AlERT_BOX = By.xpath("/html/body/div[2]/div/div[2]/div[3]/div[2]/button");


    public static void alert_click() {
        WebDriver driver = Util.getDriver();
        WebElement alert_box = driver.findElement(AlERT_BOX);
        alert_box.click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Kristóf");
        alert.accept();


    }


}
