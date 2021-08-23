import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;



class bootsrap {

    public static final By TABLE = By.xpath("//div[@class=\'fixed-table-container\']");
    public static final By TABLES = By.xpath("/html/body/section/section/section/article/figure[1]/div[1]/div[2]/div[2]/table/tbody");
    //https://demo.provost.utoronto.ca/theme-features/per-page-options/bootstrap-tables/

    public static List<String> tables() {
        WebDriver driver = Util.getDriver();
        List<String> result = new ArrayList<String>();
        List<WebElement> table = driver.findElements(TABLE);

        for (WebElement element : table) {
            result.add(element.getText());
            System.out.println(result);
        }
        return result;

    }


    public static List<String> table_looped() {
        WebDriver driver = Util.getDriver();
        List<String> results = new ArrayList<String>();
        List<WebElement> tables = driver.findElements(TABLES);
        for (WebElement element : tables) {
            List<WebElement> cells = element.findElements(By.xpath("./tr/td[1"));
            for (WebElement cell : cells) {
                String text = cell.getText();
                results.add(text);
                System.out.println(results);
            }

        }
        return results;
    }
}













