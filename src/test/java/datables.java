import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class datables {

public static final By TABLES = By.xpath("//table[@id='example']");
public static final By BUTTON_NEXT = By.xpath("//a[@id='example_next']");
//https://datatables.net/examples/basic_init/state_save.html

public void iterate() throws IOException {
    WebDriver driver = Util.getDriver();
    String ButtonIsActive = driver.findElement(BUTTON_NEXT).getAttribute("class");
    FileWriter file = new FileWriter("names.txt", true);
    while(!ButtonIsActive.contains("disabled")){
        ButtonIsActive = driver.findElement(BUTTON_NEXT).getAttribute("class");
        List<WebElement> names = driver.findElements(TABLES);
        for (WebElement name:names){
            System.out.println(name.getText());
            String data = name.getText();
            file.write(data+"\n");
        }
        driver.findElement(BUTTON_NEXT).click();
    }




}



}
