import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writeintofile {

    public static final By PIZZA_TEXT = By.xpath("/html/body/div/div[1]/div/div/main/article/div/div/div/section[1]/div[3]/div/div/div[2]/div/p");
//https://websitedemos.net/pizzeria-04/

    public static void write() throws IOException {
        WebDriver driver = Util.getDriver();
       String pizza_text =driver.findElement(PIZZA_TEXT).getText();
        File file1 = new File("sample.txt");
        FileUtils.writeStringToFile(file1, pizza_text);
        WebElement pizza = driver.findElement(PIZZA_TEXT);
        driver.close();

    }
}