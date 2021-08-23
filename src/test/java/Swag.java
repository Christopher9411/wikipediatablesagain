import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Swag {
//https://www.saucedemo.com/
    public static final By LOGIN_WINDOW = By.xpath("//input[@id=\'user-name\']");
    public static final By PASSWORD = By.xpath("//input[@id='password']");
    public static final By LOGIN_BUTTON =By.xpath("//input[@id='login-button']");
    public static final By BACKPACK =By.xpath("//*[contains(text(),\'Sauce Labs Backpack\')]");
    public static final By ADD_TO_CART = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
    public static final By SHOPPING_CART =By.xpath("//span[@class='shopping_cart_badge']");
    public static final By CHECKOUT =By.xpath("//button[@id='checkout']");
    public static final By CHECKOUT_FIRST_NAME =By.xpath("//input[@id='first-name']");
    public static final By CHECKOUT_LAST_NAME= By.xpath("//input[@id='last-name']");
    public static final By CHECKOUT_POSTAL_CODE =By.xpath("//input[@id='postal-code']");
    public static final By CONTINUE =By.xpath("//input[@id='continue']");
    public static final By FINISH= By.xpath("//button[@id='finish']");
    public static final By ORDER_CONFIRMATION= By.xpath("//*[@id=\"checkout_complete_container\"]/div/text()");







    public static void swagger(){
        WebDriver driver = Util.getDriver();
        driver.findElement(LOGIN_WINDOW).sendKeys("standard_user");
        driver.findElement(PASSWORD).sendKeys("secret_sauce");
        driver.findElement(LOGIN_BUTTON).click();
        driver.findElement(BACKPACK).click();
        String text =driver.findElement(BACKPACK).getText();
        System.out.println(text);
        driver.findElement(ADD_TO_CART).click();
        driver.findElement(SHOPPING_CART).click();
        driver.findElement(CHECKOUT).click();
        driver.findElement(CHECKOUT_FIRST_NAME).sendKeys("Thomas");
        driver.findElement(CHECKOUT_LAST_NAME).sendKeys("Anderson");
        driver.findElement(CHECKOUT_POSTAL_CODE).sendKeys("1240");
        driver.findElement(CONTINUE).click();
        driver.findElement(FINISH).click();
        String order_confirmation = driver.findElement(ORDER_CONFIRMATION).getText();
        Assertions.assertEquals("Your order has been dispatched, and will arrive just as fast as the pony can get there!\n" +
                "Pony Express", order_confirmation);
        driver.close();





    }


}
