import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class IKK {
//https://ikk.hu/

    public static final By MENU = By.xpath("//button[@class='chakra-button css-5dk675']");
    public static final By DROPDOWN_MENU = By.xpath("//*[contains(@class,'css-17w4tfg')]");
    public static final By COOKIES = By.xpath("//*[@id=\"__next\"]/div[5]/div/div[2]/button[2]/span");
    public static final By SUBMENU = By.xpath("//*[contains(@class,' css-ofl1dg')]");

    public void menuclick() {
        WebDriver driver = Util.getDriver();
        WebElement menu = driver.findElement(MENU);
        menu.click();
    }


    public static void menuloop() {

        WebDriver driver = Util.getDriver();
        WebElement cookies = driver.findElement(COOKIES);
        cookies.click();
        List<WebElement> menu = driver.findElements(DROPDOWN_MENU);
        if (menu.size() > 0) {
            menu.get(0).click();

        }
    }

    public static boolean clickOnNewsArticle(String nameArticle) {
        WebDriver driver = Util.getDriver();
            boolean isContains = false;
            List<WebElement> parentDiv = driver.findElements(SUBMENU);
            for (WebElement div : parentDiv) {
                WebElement currentDiv = div.findElement(By.xpath(".//a"));
                if (currentDiv.getText().equals(nameArticle)) {
                    isContains = true;
                    currentDiv.click();
                    break;
                }
            }
            return isContains;
        }
    }

