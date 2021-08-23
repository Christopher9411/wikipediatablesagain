import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.openqa.selenium.By.xpath;

public class Table {
    static WebDriver driver = Util.getDriver();

    private static final By TABLE = xpath("/html/body/div[2]/main/div[3]/div[1]/table/tbody");
    private static final By TECHLIST = xpath("/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div/div[1]/table/tbody");
    private static final By TABLE2 = xpath("/html/body/section/section/section/article/figure[1]/div[1]/div[2]/div[2]/table/tbody");

    public List<String> iterate_table() {
//"https://getbootstrap.com/docs/5.0/content/tables/
        List<WebElement> tables = driver.findElements(TABLE);
        List<String> result = new ArrayList<>();
        for (WebElement row : tables) {
            String text = row.findElement(By.xpath("./th")).getText();
            result.add(text);
            System.out.println(text);

        }
        return result;

    }


    public static List<String> table_loop() {
        //https://www.techlistic.com/p/demo-selenium-practice.html
        List<WebElement> tables = driver.findElements(TECHLIST);
        List<String> results = new ArrayList<String>();
        for (WebElement row : tables) {
            List<WebElement> cells = row.findElements(By.xpath("./tr/td[2]"));
            for (WebElement cell : cells) {
                String text = cell.getText();
                results.add(text);
                System.out.println(text);
            }
        }
        return results;
    }

    //https://demo.provost.utoronto.ca/theme-features/per-page-options/bootstrap-tables/
    public static List<String> table_loop3() {
        List<String> results = new ArrayList<String>();
        List<WebElement> tables = driver.findElements(TABLE2);
        for (WebElement row : tables) {
            List<WebElement> cells = driver.findElements(By.xpath("./tr/td[3]"));
            for (WebElement cell : cells) {
                String text = cell.getText();
                results.add(text);
                System.out.println(text);
            }


        }
        return results;
    }


    public static List<String> table_loop4() throws IOException {
        FileWriter file = new FileWriter("offices.txt", true);
        List<WebElement> tables = driver.findElements(TABLE);
        List<String> result = new ArrayList<>();
        for (WebElement row : tables) {
            System.out.println(row.getText());
            String data = row.getText();
            file.write(data + "\n");


        }
        return result;
    }
}















