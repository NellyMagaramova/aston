package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.test.MtsPaymentPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestPayment {
    private WebDriver driver;
    private MtsPaymentPage paymentPage;

    @BeforeEach
    public void setup(){
        driver = new ChromeDriver();
        paymentPage = new MtsPaymentPage(driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterEach
    void  teardown() {
        driver.quit();
    }


    @DisplayName("enter phone")
    @Test
    public void testPhone(){
        paymentPage.enterPhone();
    }

    @DisplayName("enter sum")
    @Test
    public void testSumm(){ paymentPage.enterSum();}

    @DisplayName("enter email")
    @Test
    public void testEmail(){ paymentPage.enterEmail();}

    @DisplayName("click ok")
    @Test
    public void testOk(){ paymentPage.clickOk();}

    @DisplayName("check sum")
    @Test
    public void testCheckSum(){ paymentPage.checkSum();}
}
