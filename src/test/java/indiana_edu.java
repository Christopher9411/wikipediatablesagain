import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class indiana_edu {

    //https://info.sice.indiana.edu/~hrosenba/Demo/Demo4.html

    public static final By TABLE = By.xpath("/html/body/center[1]/table/tbody/tr/td");



    public static void indiana(){
        WebDriver driver = Util.getDriver();
        List<String> results = new ArrayList<String>();
        List<WebElement> table = driver.findElements(TABLE);
        for(WebElement element : table){
            results.add(element.getText());
            System.out.println(results);
        }
    }

}
