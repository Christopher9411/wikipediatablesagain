import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileWriter;
import java.io.IOException;

public class AstraZeneca {
//https://www.astrazeneca.com/country-sites/hungary.html

    public static final By MENU = By.xpath("//a[@href='#kutat-s-s-fejleszt-s-0']");
    public static final By ARTICLE_TEXT = By.xpath("//div[@id='kutat-s-s-fejleszt-s-0']");
    public static final By COOKIES = By.xpath("//*[contains(text(),'Allow All Cookies')]");


    public static void medicine() throws IOException {
        WebDriver driver = Util.getDriver();
         WebElement article = driver.findElement(MENU);
         article.click();
         FileWriter writer = new FileWriter("medicine.txt" );
         WebDriverWait wait2 = new WebDriverWait(driver,5);
         wait2.until(ExpectedConditions.visibilityOfElementLocated(ARTICLE_TEXT));
         String article_retrieved = driver.findElement(ARTICLE_TEXT).getText();
         writer.write(article_retrieved+"\n");
         writer.close();


    }



}
