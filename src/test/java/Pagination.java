import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Pagination {

    public static final By TABLE = By.xpath("/html/body/div[2]/div/div[2]/div/div/table/tbody//td[2]");
    public static final By NEXT_BUTT = By.xpath("//a[@id='example_next']");


   //https://www.seleniumeasy.com/test/table-sort-search-demo.html
    public static void pagin() throws IOException {
        WebDriver driver = Util.getDriver();
        String isButtonIsActive = driver.findElement(NEXT_BUTT).getAttribute("class");
        FileWriter file = new FileWriter("table.txt");
        while (!isButtonIsActive.contains("disabled")) {
            isButtonIsActive = driver.findElement(NEXT_BUTT).getAttribute("class");
            List<WebElement> tables = driver.findElements(TABLE);
            for (WebElement table : tables) {
                System.out.println(table.getText());
                String data = table.getText();
                file.write(data + "\n");
            }
            driver.findElement(NEXT_BUTT).click();
        }
        file.close();


        int lines = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("table.txt"));
            while (reader.readLine() != null) lines++;
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }


}
