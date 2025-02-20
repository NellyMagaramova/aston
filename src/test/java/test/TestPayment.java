package test;

import org.junit.jupiter.api.AfterEach;
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


    @Test
    public void test1(){
        paymentPage.enterPhone();
    }

    @Test
    public void test2(){ paymentPage.enterSum();}

    @Test
    public void test3(){ paymentPage.enterEmail();}

    @Test
    public void test4(){ paymentPage.enterEmail();}

    @Test
    public void test5(){ paymentPage.clickOk();}

    @Test
    public void test6(){ paymentPage.checkSum();}
}
