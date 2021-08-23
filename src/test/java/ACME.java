import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ACME {

//https://demo.applitools.com/
    public static final By USERNAME = By.xpath("//input[@id='username']");
    public static final By PASSWORD =By.xpath("//input[@id='password']");
    public static final By LOGIN =By.xpath("//a[@id='log-in']");
    public static final By REQUEST_INCREASE =By.xpath("/html/body/div/div[3]/div[2]/div/div/div[1]/div[2]/div/div/div/div[2]/div[3]/a/span");




    public static void acme_site(){
        WebDriver driver = Util.getDriver();
        driver.findElement(USERNAME).sendKeys("Gomez");
        driver.findElement(PASSWORD).sendKeys("gonzales123@");
        driver.findElement(LOGIN).click();
        driver.findElement(REQUEST_INCREASE).click();



    }



}
