package test;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;

public class TestClass {
    private WebDriver driver;
    private String baseUrl;
    private WebElement element;


    @BeforeEach
    void setup() {
        driver = WebDriverManager.chromedriver().create();
        baseUrl = "https://mts.by";
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterEach
    void  teardown() {
        driver.quit();
    }

    @DisplayName("header")
    @Test
    public void testHeader() {
        element = driver.findElement(By.xpath("//h2[contains(text(),'Онлайн пополнение')]"));
        Assertions.assertTrue(element.isDisplayed());
    }

    @DisplayName("pay systems")
    @Test
    public void testPaySystems() throws Exception {
        element = driver.findElement(By.xpath("//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/visa.svg']"));
        Assertions.assertTrue(element.isDisplayed());
        element = driver.findElement(By.xpath("//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/visa-verified.svg']"));
        Assertions.assertTrue(element.isDisplayed());
        element = driver.findElement(By.xpath("//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/mastercard.svg']"));
        Assertions.assertTrue(element.isDisplayed());
        element = driver.findElement(By.xpath("//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/mastercard-secure.svg']"));
        Assertions.assertTrue(element.isDisplayed());
        element = driver.findElement(By.xpath("//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/belkart.svg']"));
        Assertions.assertTrue(element.isDisplayed());
    }

    @DisplayName("about service")
    @Test
    void testLink(){
        element = driver.findElement(By.linkText("Подробнее о сервисе"));
        element.click();
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(currentUrl, "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/");
    }

    @DisplayName("phone number")
    @Test
    public void testNumber() {
        element = driver.findElement(By.xpath("//input[@id='connection-phone']"));
        element.sendKeys("(29)777-77-77");
        element.sendKeys(Keys.RETURN);

        element = driver.findElement(By.xpath("//input[@id='connection-sum']"));
        element.sendKeys("345");
        element.sendKeys(Keys.RETURN);

        element = driver.findElement(By.xpath("//input[@id='connection-email']"));
        element.sendKeys("test@gmail.com");
        element.sendKeys(Keys.RETURN);
    }
}
