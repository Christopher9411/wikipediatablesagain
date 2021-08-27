import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class indiana_edu {

    //https://info.sice.indiana.edu/~hrosenba/Demo/Demo4.html

    public static final By TABLE = By.xpath("/html/body/center[1]/table/tbody");
    public static final By TEXT = By.xpath("/html/body/pre");



    public static void indiana(){
        WebDriver driver = Util.getDriver();
        List<String> results = new ArrayList<String>();
        List<WebElement> table = driver.findElements(TABLE);
        for(WebElement element : table){
            results.add(element.getText());
            System.out.println(results);
        }
    }



    public static void text(){
        WebDriver driver = Util.getDriver();
        String text =driver.findElement(TEXT).getText();
        System.out.println(text);

    }


    public static void table_write_to_file() throws IOException {
        WebDriver driver = Util.getDriver();
        FileWriter file = new FileWriter("indiana.txt");
        List<String> results = new ArrayList<String>();
        List<WebElement>table = driver.findElements(TABLE);
        for (WebElement tables : table){
           List <WebElement> cells = tables.findElements(By.xpath("./tr/td"));
           for (WebElement cell : cells){
              results.add(cell.getText());
              System.out.println(results);
              String data = cell.getText();
              file.write(data+"\n");

           }
           file.close();
        }
    }


}
