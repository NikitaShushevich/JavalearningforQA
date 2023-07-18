import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test01 {
    private WebDriver driver;
    private GooglePage googlePage;

    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com.ua/");
        googlePage = new GooglePage(driver);
    }

    @Test
    public void testGoogle() {
        googlePage.search("phone\n");
    }

    @Test
    public void testLangBtn() {
        googlePage.clickLangBtn();
    }

    @Test
    public void testLuckyBtn() {
        googlePage.clickLuckyBtn();
    }
    @Test
    public void testResult(){
        googlePage.search("toaster buy\n");

    }
    @Test
    public void testSearchone(){
        googlePage.search("one\n");
    }
    
}

class GooglePage {
    private WebDriver driver;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }

    public void search(String query) {
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(query);
    }

    public void clickLangBtn() {
        driver.findElement(By.xpath("//div[@id='SIvCob']/a")).click();
    }

    public void clickLuckyBtn() {
        driver.findElement(By.xpath("//li//following-sibling::div//input[@name='btnI']")).click();
    }

}
