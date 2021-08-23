import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class compendium {


    public static final By BOOKS =By.xpath("/html/body/div[1]/div[1]/div[3]/div/ul/li[3]/a");
    public static final By BOOK_DETAILS =By.xpath(" //*[contains(text(),'Learn more about the book \"Dear Evil Tester')]");
    public static final By BOOK_INFO =By.xpath("/html/body/div[1]/div[2]/p[1]");
//https://compendiumdev.co.uk/default.php
    public static void booking(){
        WebDriver driver = Util.getDriver();
        WebElement books = driver.findElement(BOOKS);
        books.click();
        WebElement book_details=driver.findElement(BOOK_DETAILS);
        book_details.click();
        WebElement book_info =driver.findElement(BOOK_INFO);
        String book_description= book_info.getText();
        System.out.println(book_description);


    }




}
