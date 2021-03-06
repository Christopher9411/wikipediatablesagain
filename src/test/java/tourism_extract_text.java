import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class tourism_extract_text {
    //https://websitedemos.net/outdoor-adventure-02/
    public static final By WEBSITE_TEXT = By.xpath("/html/body/div/div/div/div/main/article/div/div/div/div/section[5]/div/div/div[1]/div/div/div[3]/div");
    public static final By LEARN_MORE = By.xpath("/html/body/div/div/div/div/main/article/div/div/div/div/section[3]/div/div/div/div/div/section/div/div/div[1]/div/div/div[3]/div/div/a");
    public static final By FINANCIAL_ARTICLE = By.xpath("/html/body/div[1]/div[1]/div/div/main/article/div/div/div/section[1]/div/div/div/div/div/div[2]/div/div/div/div/a");
    public static final By FINANCIAL_ARTICLE_TEXT = By.xpath("//div[@class='entry-content clear']");

    public static void skiing() throws IOException {
        WebDriver driver = Util.getDriver();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(WEBSITE_TEXT));
        WebElement ski_text = driver.findElement(WEBSITE_TEXT);
        String ski_description = ski_text.getText();
        FileWriter files = new FileWriter("names.txt", true);
        files.write(ski_description);
        files.close();
    }
}


//https://websitedemos.net/business-magazine-04/
     /*   WebDriver drivers = Util.getDriver();
        WebElement business_article = driver.findElement(FINANCIAL_ARTICLE);
        business_article.click();
        WebElement article_text = driver.findElement(FINANCIAL_ARTICLE_TEXT);
        String article = article_text.getText();
        FileWriter file = new FileWriter("names.txt", true);
        file.write(article);
        file.close();
    }
}
*/
