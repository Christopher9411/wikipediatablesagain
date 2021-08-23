import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import static org.openqa.selenium.By.xpath;

public class ExtractTableText {
    private static final By TABLE = xpath("/html/body/div[2]/main/div[3]/div[1]/table/tbody/tr");


    public static List<String> iterate_table() throws IOException {
        WebDriver driver = Util.getDriver();
        FileWriter file = new FileWriter("names.txt", true);
//"https://getbootstrap.com/docs/5.0/content/tables/
        List<WebElement> tables = driver.findElements(TABLE);
        List<String> result = new ArrayList<>();
        for (WebElement row : tables) {
            System.out.println(row.getText());
            String text = row.getText();
            file.write(text + "\n");
        }
        file.close();
        return result;
    }
}


