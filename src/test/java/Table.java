import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static org.openqa.selenium.By.xpath;

public class Table {
    static WebDriver driver = Util.getDriver();

    private static final By TABLE = xpath("/html/body/div[2]/main/div[3]/div[1]/table/tbody/tr");

    public List<String> iterate_table() {

        List<WebElement> tables = driver.findElements(TABLE);
        List<String> result = new ArrayList<>();
        for (WebElement row : tables) {
          String text= row.findElement(By.xpath("./th")).getText();
          result.add(text);

        }
         return result;

    }


}
