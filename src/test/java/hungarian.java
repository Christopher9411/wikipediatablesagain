import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class hungarian {

    public static final By MENU = By.xpath("/html/body/header/nav/div/div/div/div/ul/li[5]/a");
    public static final By ARTICLE = By.xpath("//a [@href ='/belpol/a-bevetelek-is-elparologtak-a-velencei-to-partjan-240985']");

//https://magyarnarancs.hu/
    public void magyar(){
        WebDriver driver = Util.getDriver();
        driver.findElement(MENU).click();
        WebElement article = driver.findElement(ARTICLE);
        article.click();
    }

}
