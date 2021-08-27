import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;



public class hvg {
    public static final By FRESH_NEWS = By.xpath("/html/body/div[2]/div/div/header/div/div[3]/nav/div[1]/a/div");
    public static final By ARTICLE = By.xpath("//a[@title='A Dunába fulladt egy 22 éves lány Gödnél']");
    public static final By ARTICLE_TEXT = By.xpath("/html/body/div[3]/div/div/main/div[1]/div/div/div[2]/div[1]/div[2]/div[4]/p[2]");
    public static final By MENU = By.xpath("//*[contains(@class,' group ul-elem')]");
    public static final By ACCEPT_COOKIES = By.xpath("//*[@id=\"qc-cmp2-ui\"]/div[2]/div/button[3]");

//https://hvg.hu/
    public static void news() {
        WebDriver driver = Util.getDriver();
        File file = new File("hvg.txt");
        WebElement article = driver.findElement(ARTICLE);
        article.click();
        WebDriverWait wait = new WebDriverWait(driver,4);
        wait.until(ExpectedConditions.visibilityOfElementLocated(ARTICLE_TEXT));
        WebElement article_text = driver.findElement(ARTICLE_TEXT);
        String article_retrieved = article.getText();
        try {
            FileUtils.writeStringToFile(file, article_retrieved, Charset.defaultCharset());


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

public static void clickonmenu(){
    WebDriver driver = Util.getDriver();
    WebDriverWait wait = new WebDriverWait(driver,10);
    wait.until(ExpectedConditions.visibilityOfElementLocated(ACCEPT_COOKIES)).click();
    List<WebElement> table = driver.findElements(MENU);
    if(table.size()>0){
        table.get(0).click();
    }
}


}






