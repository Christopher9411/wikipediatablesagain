import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.xpath;

//https://www.demoblaze.com/
class DemoBlaze {
    static WebDriver driver = Util.getDriver();
    //  private static final By TABLE = xpath("//*[@id=\"itemc\"]");
    private static final By TABLE = xpath("/html/body/div[5]/div/div[1]/div");
    private static final By TABLE_ELEMENTS = xpath("/html/body/div[2]/main/div[3]/div[1]/table/tbody/tr");
    private static final By SUPPORT = xpath("//a[contains(text(),'Contact')]");
    private static final By RECIPIENT_EMAIL = xpath("//input[@id='recipient-email']");
    private static final By RECIPIENT_NAME = xpath("//input[@id='recipient-name']");
    private static final By MESSAGE_FIELD = xpath("//textarea[@id='message-text']");
    private static final By SEND_MESSAGE = xpath(" //*[contains(text(),'Send message')]");
    private static final By MENU = By.xpath("/html/body/div[5]/div/div[1]/div/a");
    private static final By SONY_LAPTOP = By.xpath(" //*[contains(text(),'Sony vaio i5')]");
    private static final By LAPTOP_TEXT = By.xpath("//div[@id='more-information']");
    private static final By LUMIA_PHONE = By.xpath("//a[@href='prod.html?idp_=2']");
    private static final By ADD_TO_CART = By.cssSelector("a.btn");
    private static final By PLACE_ORDER = By.xpath(" //*[contains(text(),'Place Order')]");
    private static final By NAME = By.xpath("//input[@id='name']");
    private static final By COUNTRY = By.xpath(" //input[@id='country']");
    private static final By CITY = By.xpath(" //input[@id='city']");
    private static final By CARD = By.xpath(" //input[@id='card']");
    private static final By MONTH = By.xpath(" //input[@id='month']");
    private static final By YEAR = By.xpath(" //input[@id='year']");
    private static final By PURCHASE = By.xpath(" //*[contains(text(),'Purchase')]");
    private static final By CONFIRM_OKAY = By.xpath(" //*[contains(text(),'OK')]");
    private static final By CART = By.xpath("//*[@id='cartur']");
    public static final By TABLES = By.xpath(" //*[contains(@class,'col-lg-4 col-md-6 mb-4')]");
    public static final By NEXT_BUTTON = By.xpath("//button[@id='next2']");


    public static void menu() {
        List<WebElement> menu_option = driver.findElements(TABLE);
        List<String> results = new ArrayList<String>();
        for (WebElement element : menu_option) {
            List<WebElement> text = element.findElements(By.xpath("./a"));
            for (WebElement texts : text) {
                String cell_data = texts.getText();
                results.add(cell_data);
                System.out.println(results);
            }


        }
    }


    public static void main(String[] args) {
        driver.get("https://www.demoblaze.com/");
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        for (WebElement links : allLinks) {
            System.out.println(links.getText() + "-" + links.getAttribute("href"));


        }
    }


    public static void contact_form() {
        driver.get("https://www.demoblaze.com/index.html");
        WebElement support = driver.findElement(SUPPORT);
        support.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(RECIPIENT_EMAIL));
        WebElement email = driver.findElement(RECIPIENT_EMAIL);
        email.sendKeys("teszt@123.com");
        WebElement name = driver.findElement(RECIPIENT_NAME);
        name.sendKeys("Joe");
        WebElement message = driver.findElement(MESSAGE_FIELD);
        message.sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla nec ex a est dapibus sagittis. Fusce tincidunt dolor cursus nibh pellentesque pellentesque. Nam sit amet pretium lectus, sed elementum tellus. Nulla facilisi. Proin dignissim aliquam tempus. Fusce nec lectus nec ipsum tempor sagittis. Curabitur semper justo elit, vitae vulputate mi commodo a. Nulla imperdiet congue mi, sed fermentum quam gravida in. Suspendisse magna tellus, auctor id ipsum vitae, ullamcorper facilisis eros. Vestibulum condimentum quis felis non lobortis. Fusce posuere, sapien id mollis viverra, diam massa blandit nulla, ac gravida ipsum velit a urna. Proin id porttitor mauris. Pellentesque facilisis vestibulum nunc, at pharetra est sollicitudin ac. Donec blandit euismod quam ut suscipit. Etiam sodales, enim et auctor imperdiet, sem tortor tincidunt ante, sed fringilla metus ex et massa. Donec placerat quam at libero convallis blandit vitae sit amet diam. ");
        WebElement sendmessage = driver.findElement(SEND_MESSAGE);
        sendmessage.click();
        driver.switchTo().alert().accept();
    }

    public static boolean clickMenuButton(String select) {
        driver.get("https://www.demoblaze.com/index.html#");
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


    public static void extract_text() {
        WebDriverWait wait = new WebDriverWait(driver, 4);
        wait.until(ExpectedConditions.visibilityOfElementLocated(SONY_LAPTOP));
        WebElement laptop = driver.findElement(SONY_LAPTOP);
        laptop.click();
        WebDriverWait waiting = new WebDriverWait(driver, 4);
        waiting.until(ExpectedConditions.visibilityOfElementLocated(LAPTOP_TEXT));

        WebElement laptop_description = driver.findElement(LAPTOP_TEXT);
        String laptop_text = laptop_description.getText();

        File f = new File("savetxt.txt");
        try {
            FileUtils.writeStringToFile(f, laptop_text, Charset.defaultCharset());
        } catch (IOException exc) {
            exc.printStackTrace();
        }
        driver.quit();
    }


    public static void purchase() {
        driver.get("https://www.demoblaze.com/index.html#");
        WebDriverWait waiting = new WebDriverWait(driver, 5);
        waiting.until(ExpectedConditions.visibilityOfElementLocated(LUMIA_PHONE));
        driver.findElement(LUMIA_PHONE).click();
        WebDriverWait rest = new WebDriverWait(driver, 5);
        rest.until(ExpectedConditions.visibilityOfElementLocated(ADD_TO_CART));
        driver.findElement(ADD_TO_CART).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Alert element = wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        driver.findElement(CART).click();
        driver.findElement(PLACE_ORDER).click();
        WebDriverWait sleep = new WebDriverWait(driver, 5);
        sleep.until(ExpectedConditions.visibilityOfElementLocated(NAME));
        driver.findElement(NAME).sendKeys("Thomas");
        driver.findElement(COUNTRY).sendKeys("France");
        driver.findElement(CITY).sendKeys("Paris");
        driver.findElement(CARD).sendKeys("2312-12213-12323");
        driver.findElement(MONTH).sendKeys("july");
        driver.findElement(YEAR).sendKeys("2026");
        driver.findElement(PURCHASE).click();
        WebElement purchase_text = driver.findElement(xpath("/html/body/div[10]/h2"));
        String purchased = purchase_text.getText();
        driver.findElement(CONFIRM_OKAY).click();
        Assertions.assertEquals("Thank you for your purchase!", purchased);


                }




          public static void table_iteration() throws IOException {
          String isButtonIsActive = driver.findElement(NEXT_BUTTON).getAttribute("class");
          FileWriter file = new FileWriter("products.txt");
          while (!isButtonIsActive.contains("disabled")){
              isButtonIsActive = driver.findElement(NEXT_BUTTON).getAttribute("class");
              List<WebElement>tables = driver.findElements(TABLES);
              for (WebElement table : tables) {
                  System.out.println(table.getText());
                  String data = table.getText();
                  file.write(data+"\n");
              }
              driver.findElement(NEXT_BUTTON).click();
          }
          file.close();

          }




            }


























