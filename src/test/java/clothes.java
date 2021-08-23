import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class clothes {
//http://automationpractice.com/index.php
static WebDriver driver = Util.getDriver();
    public static final By BLOUSE = By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[2]/div/div[1]/div/a[1]/img");
    public static final By ADD_TO_CART =By.xpath("//p[@id='add_to_cart']");
    public static final By CHECKOUT =By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span");
    public static final By PROCEED_TO_CHECKOUT =By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']");
    public static final By TERMS_OF_SERVICE =By.xpath("//input[@id='cgv']");


public void clothing_shopping(){
    WebElement blouse =driver.findElement(BLOUSE);
    blouse.click();







}







}
