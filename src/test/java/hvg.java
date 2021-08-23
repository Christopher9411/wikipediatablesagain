import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public class hvg {
    public static final By ARTICLE = By.xpath("//*[@id=\"frissdoboz_b_verzio_teljes\"]/section/article[6]/div/h1/a");
    public static final By ARTICLE_TEXT = By.xpath("//div[@class='article-content entry-content']");

//https://hvg.hu/
    public static void news() {
        WebDriver driver = Util.getDriver();
        File file = new File("hvg.txt");
        WebElement article = driver.findElement(ARTICLE);
        article.click();
        WebDriverWait wait = new WebDriverWait(driver,9);
        wait.until(ExpectedConditions.visibilityOfElementLocated(ARTICLE_TEXT));
        WebElement article_text = driver.findElement(ARTICLE_TEXT);
        String article_retrieved = article.getText();
        try {
            FileUtils.writeStringToFile(file, article_retrieved, Charset.defaultCharset());


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



