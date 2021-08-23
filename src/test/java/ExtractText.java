import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class ExtractText {
    public static final By TEXT = By.xpath("/html/body/div[6]/div/div[1]/div/div/p");

//https://www.demoblaze.com/
    public static void write() throws IOException {
        WebDriver driver = Util.getDriver();

        String write_text = driver.findElement(TEXT).getText();

        File f = new File("write_text.txt");
        try {
            FileUtils.writeStringToFile(f, write_text, Charset.defaultCharset());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

