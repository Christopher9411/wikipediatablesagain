import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IKK {
//https://ikk.hu/

    public static final By MENU = By.xpath("//button[@class='chakra-button css-5dk675']");
    public static final By DROPDOWN_MENU = By.xpath("//*[contains(@class,'css-17w4tfg')]");
    public static final By COOKIES = By.xpath("//*[@id=\"__next\"]/div[5]/div/div[2]/button[2]");
    public static final By SUBMENU = By.xpath("//*[contains(@class,' css-ofl1dg')]");
    public static final By CLICK_MENU = By.xpath(" //*[contains(@class,'css-1a8m4nr')]");
    public static final By NEXT_MENU = By.xpath(" //*[contains(@class,'css-y8q9d7')]");


    public static void cookie() {
        WebDriver driver = Util.getDriver();
        WebElement cookie = driver.findElement(COOKIES);
        cookie.click();
    }


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


    public static void cookies() {
        WebDriver driver = Util.getDriver();
        WebElement cookies = driver.findElement(COOKIES);
        cookies.click();

    }

    public static void navigate() {
        WebDriver driver = Util.getDriver();
        WebElement navigateButton = driver.findElement(NEXT_MENU);

        navigateButton.click();
    }

    public static String linkTitleText() {
        WebDriver driver = Util.getDriver();
        WebElement linkText = driver.findElement(CLICK_MENU);
        String result = linkText.getText();

        return result;
    }

    public static List<String> fullListAlchemist() throws IOException {
        FileWriter file = new FileWriter("szöveg.txt");
        List<String> result = new ArrayList<>();

        while (true) {
            String linkTitle = linkTitleText();
            if (!result.contains(linkTitle)) {
                System.out.println(linkTitle);
                result.add(linkTitle);
                navigate();
            } else {
                break;
            }
        }
        return result;
    }
}