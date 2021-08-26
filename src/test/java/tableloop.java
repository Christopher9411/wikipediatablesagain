import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class tableloop {

    public static final By TABLE = By.xpath("//table[@id='customers']");
//https://www.w3schools.com/html/html_tables.asp

    public static void table_iteration(){
         WebDriver driver = Util.getDriver();
        List<String> results = new ArrayList<String>();
        List<WebElement> tables = driver.findElements(TABLE);
        for (WebElement table : tables){
            results.add(table.getText());
            System.out.println(results);

        }

    }


    public static void table_iteration2(){
        WebDriver driver = Util.getDriver();
        List<String> results = new ArrayList<String>();
        List<WebElement> tables = driver.findElements(TABLE);
        for (WebElement table : tables){
            List<WebElement>cells = table.findElements(By.xpath("./tbody/tr/th"));
            for (WebElement cell : cells){
                results.add(cell.getText());
                System.out.println(results);
            }
        }


    }



}
