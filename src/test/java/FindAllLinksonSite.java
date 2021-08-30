import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FindAllLinksonSite {


 //https://www.reddit.com/

    public static void linkhuting(){
        WebDriver driver = Util.getDriver();
        List<WebElement>Links =driver.findElements(By.tagName("a"));
        for (WebElement Link :Links) {
            System.out.println("The links are: "+ Link.getText()+ "-"+Link.getAttribute("href"));
        }
    }


}
