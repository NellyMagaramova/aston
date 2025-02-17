package test;

import org.test.MtsPaymentPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPayment {
    private WebDriver driver;
    private MtsPaymentPage paymentPage;

    @BeforeEach
    public void setup(){
        driver = new ChromeDriver();
        paymentPage = new MtsPaymentPage(driver);
    }

    @Test
    public void test1(){
        paymentPage.enterPhone();
    }
}
