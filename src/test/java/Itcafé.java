import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.By.xpath;

public class Itcafé {

   // https://itcafe.hu/index.html
   static WebDriver driver = Util.getDriver();
    private static final By SEARCH_BUTTON = xpath("/html/body/header/nav[1]/div/ul/li[1]/button");
    private static final By SEARCH_BAR = xpath("//input[@name='stext']");
    private static final By SEARCH_SUBMIT =xpath("//button[@class='btn btn-primary']");
    private static final By ARTICLE =xpath("//*[@id=\"center\"]/div[3]/ul/li[5]/div/h4/a");

    public static void itmethod(){
        WebDriverWait wait = new WebDriverWait(driver, 4);
        wait.until(ExpectedConditions.visibilityOfElementLocated(SEARCH_BUTTON));
        WebElement search_button = driver.findElement(SEARCH_BUTTON);
        search_button.click();
        WebDriverWait rest = new WebDriverWait(driver, 4);
        rest.until(ExpectedConditions.visibilityOfElementLocated(SEARCH_BAR));
        WebElement search_bar = driver.findElement(SEARCH_BAR);
        search_bar.sendKeys("pc");
        WebElement search_submit = driver.findElement(SEARCH_SUBMIT);
        search_submit.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");
        WebElement article =driver.findElement(ARTICLE);
        article.click();

    }

}














