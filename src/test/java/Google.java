import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Google {
    public static final By INPUT_FIELD = By.xpath("//input[@class='gLFyf gsfi']");
    public static final By SEARCH_BUTTON =By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]");
    public static final By SEARCH_RESULT = By.xpath("/html/body/div[7]/div/div[9]/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/div/div[1]/a/h3");
    public static final By COOKIES_ACCEPT =By.xpath(" //*[contains(text(),'Egyetértek')]");
    public static final By BRAND = By.xpath("//*[@id=\"szemelyauto\"]/div[1]/form/div[1]/div/div[1]/div/div");
    public static final By CAR_SEARCH = By.xpath("//span[@class='MuiButton-label']");

    //https://www.google.com/webhp?hl=hu&ictx=2&sa=X&ved=0ahUKEwi1s6Tfm8fyAhXI3oUKHXBHC6IQPQgI
    public static void Google_search_button(){
        WebDriver driver = Util.getDriver();
        WebElement cookies_accept = driver.findElement(COOKIES_ACCEPT);
        cookies_accept.click();
        WebElement input = driver.findElement(INPUT_FIELD);
        input.sendKeys("autó");
        WebElement search_button =driver.findElement(SEARCH_BUTTON);
        search_button.click();
        WebElement search_result = driver.findElement(SEARCH_RESULT);
        search_result.click();
        Select select= new Select( driver.findElement(BRAND));
        select.selectByVisibleText("ABARTH");
        WebElement car_search = driver.findElement(CAR_SEARCH);
        car_search.click();



    }




}
