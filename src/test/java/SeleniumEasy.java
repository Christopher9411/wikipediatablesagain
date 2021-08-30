import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SeleniumEasy {

    public static final By INPUTFIELD1 = By.xpath("//input[@id='sum1']");
    public static final By INPUTFIELD2 = By.xpath("//input[@id='sum2']");
    public static final By GETSUM = By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/form/button");
    public static final By DISPLAYED_VALUE = By.xpath("//span[@id='displayvalue']");
    public static final By INPUT_FIELD = By.xpath("//*[@id='user-message' and @class='form-control']");
    public static final By INPUT_BUTTON = By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[2]/form/button");
    public static final By ALERT_BUTTON = By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div/div[2]/a");
    public static final By AlERT_ACCEPT = By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div/div[2]/a");
    public static final By DROPDOWN_MENU = By.xpath("/html/body/div[1]/div[2]/nav/div/div[2]/ul[1]/li[1]/a");
    public static final By COOKIE = By.xpath("//*[@id=\"at-cv-lightbox-button-holder\"]/a[2]");


    //https://www.seleniumeasy.com/test/basic-first-form-demo.html
    public static void seleniumsum() {
        WebDriver driver = Util.getDriver();
        driver.findElement(INPUTFIELD1).sendKeys("5");
        driver.findElement(INPUTFIELD2).sendKeys("7");
        driver.findElement(GETSUM).click();

    }


    public static void inputfield() {
        WebDriver driver = Util.getDriver();
        driver.findElement(INPUT_FIELD).sendKeys("Kristóf");
        driver.findElement(INPUT_BUTTON).click();

    }

    //https://www.seleniumeasy.com/test/bootstrap-modal-demo.html
    public static void alertwindow() throws InterruptedException {
        WebDriver driver = Util.getDriver();
        WebElement alert = driver.findElement(ALERT_BUTTON);
        alert.click();
        Thread.sleep(5000);

        Alert aler = driver.switchTo().alert();
        aler.accept();
    }


    public static void menza() {
        WebDriver driver = Util.getDriver();
        WebDriverWait wait = new WebDriverWait(driver,9);
        wait.until(ExpectedConditions.visibilityOfElementLocated(COOKIE)).click();
        Select select = new Select(driver.findElement(DROPDOWN_MENU));
        select.selectByValue("Simple Form Demo");


    }


}