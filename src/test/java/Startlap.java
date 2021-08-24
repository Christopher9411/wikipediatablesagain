import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Startlap {

//https://www.startlap.hu/

    public static final By ECONOMY_CATEGORIES = By.xpath("/html/body/div[3]/div[1]/div[2]/div/div[3]/div[1]/a[5]/span");
    public static final By ARTICLE = By.xpath("/html/body/div[3]/div/div/div[3]/div/main/article/div/div[2]/div[2]/div/div/div[2]/div/div/div[4]/div/a[2]/p/span");

    public static void start() {
        WebDriver driver = Util.getDriver();
        WebElement economy_categories = driver.findElement(ECONOMY_CATEGORIES);
        economy_categories.click();
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(ARTICLE));
        WebElement article = driver.findElement(ARTICLE);
        article.click();




    }
}