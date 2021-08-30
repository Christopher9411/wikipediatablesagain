import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TablePress {

    public static final By TABLE = By.xpath("//tbody[@class='row-hover']");
    public static final By NEXT_BUTTON = By.xpath(" //*[contains(@class,'paginate_button next')]");

    public static void table_iteration(){
        WebDriver driver = Util.getDriver();
        List<String>results = new ArrayList<String>();
        List<WebElement>table = driver.findElements(TABLE);
        for(WebElement tables : table){
            results.add(tables.getText());
            System.out.println(tables.getText());
        }
    }

//https://tablepress.org/demo/




    public static void table_iteration2(){
        WebDriver driver = Util.getDriver();
        List<String> results = new ArrayList<String>();
        List<WebElement> tables = driver.findElements(TABLE);
        for (WebElement table : tables){
            List<WebElement>cells = table.findElements(By.xpath("./tr/td[3]"));
            for (WebElement cell : cells){
                results.add(cell.getText());
                System.out.println(results);
            }
        }


    }

public static void table_move_and_print() throws IOException {
    WebDriver driver = Util.getDriver();
    FileWriter file = new FileWriter("table.txt");
        String isButtonIsActive = driver.findElement(NEXT_BUTTON).getAttribute("class");
        while(!isButtonIsActive.contains("disabled")){
            isButtonIsActive = driver.findElement(NEXT_BUTTON).getAttribute("class");
            List<WebElement>tables = driver.findElements(TABLE);
            for(WebElement table : tables){
                System.out.println(table.getText());
                String data = table.getText();
                file.write(data + "\n");
            }
            driver.findElement(NEXT_BUTTON).click();

        }
        file.close();

    }




}
