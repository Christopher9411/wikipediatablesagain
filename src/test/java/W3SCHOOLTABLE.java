import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class W3SCHOOLTABLE {
    //https://www.w3schools.com/html/html_tables.asp
    public static final By TABLE = By.xpath("//table[@id='customers']/tbody");


    public static void w3school() throws IOException {
        WebDriver driver = Util.getDriver();
        FileWriter file = new FileWriter("offices.txt", true);
        List<String> expected = new ArrayList<String>();
        List<WebElement> tables = driver.findElements(TABLE);
        for (WebElement table : tables) {
            String text = table.findElement(By.xpath("./tr")).getText();
            file.write(text);
        }

    }
}



