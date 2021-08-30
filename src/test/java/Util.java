import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Collections;

public class Util {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("user-data-dir=c:\\Users\\Tatsuya Hiroki\\AppData\\Local\\Google\\Chrome\\User Data");
            options.addArguments("--incognito");
            options.addArguments("--disable-notifications"); // visszautasít minden böngésző felkérést pl: értesítések küldése
            options.addArguments("start-maximized"); // teljes képernyőben való használat
            options.setExperimentalOption("useAutomationExtension", true);
            options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
            driver = new ChromeDriver(options);
            driver.get("https://tablepress.org/demo/");
            driver.manage().deleteAllCookies();

        }

        return driver;
    }
}










