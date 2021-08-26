import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class NRF {

    public static final By TABLE = By.xpath(("//table[@id='customers']"));
//https://www.w3schools.com/css/css_table.asp

    public static void iteration() {
        WebDriver driver = Util.getDriver();
        List<String> expected = new ArrayList<String>();
        List<WebElement> table = driver.findElements(TABLE);
        for (WebElement element : table) {
            expected.add(element.getText());
            System.out.println(expected);
        }
    }


    public static void iteration2() {
        WebDriver driver = Util.getDriver();
        List<String> results = new ArrayList<String>();
        List<WebElement> table = driver.findElements(TABLE);
        for (WebElement row : table) {
            List<WebElement> elements= row.findElements(By.xpath("/tbody/tr/td"));
            for (WebElement table1 : elements) {
                String text = table1.getText();
                results.add(text);
                System.out.println(results);
            }


        }
    }
}


