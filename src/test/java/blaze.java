import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class blaze {

    public static final By MENU = By.xpath("/html/body/div[5]/div/div[1]/div/a");
//https://www.demoblaze.com/


    public static boolean clickMenuButton(String select) {
        WebDriver driver = Util.getDriver();
        List<WebElement> items = driver.findElements(MENU);
        boolean result = false;
        for (WebElement item : items) {
            if (item.getText().contains(select)) {
                item.click();
                result = true;
                System.out.println("element has been clicked");
            }


        }
        return result;


    }
}

