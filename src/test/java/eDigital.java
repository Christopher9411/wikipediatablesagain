import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class eDigital {
//https://edigital.hu/fooldal?
    public static final By MENU = By.xpath(" //*[contains(@class,'raquo-link')]");
    public static final By POPUP = By.xpath("//*[@id=\"wps_popup\"]/div/div[1]");
    public static final By COOKIES = By.xpath("//*[@id=\"CybotCookiebotDialogBodyButtonAccept\"]");
    public static final By OPEN_MENU = By.xpath("/html/body/header/nav/div[2]/div/div[1]/div[1]/div/div[2]/button");
    public static final By POPUP_CLOSE = By.xpath("//*[@id=\"wps_popup\"]/div/div[1]");
    public static final By IRODATECHNIKA = By.xpath("//*[@id=\"6108726\"]/div/p[3]/a");

    public static void open_menu(){
        WebDriver driver = Util.getDriver();
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.visibilityOfElementLocated(COOKIES)).click();

    }



    public static boolean shopper(String producselect) {
        WebDriver driver = Util.getDriver();
        boolean result = false;
        List<WebElement> tables = driver.findElements(MENU);
        for (WebElement table : tables) {
            if (table.getText().contains(producselect)) {
                table.click();
                result = true;
            }
        }
        return result;
    }


public static void browse(){
    WebDriver driver = Util.getDriver();
    WebDriverWait wait = new WebDriverWait(driver,13);
    wait.until(ExpectedConditions.visibilityOfElementLocated(POPUP_CLOSE)).click();
    WebElement office = driver.findElement(IRODATECHNIKA);
        office.click();



}


}


