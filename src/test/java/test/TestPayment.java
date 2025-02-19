package test;

import org.junit.jupiter.api.DisplayName;
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

    @DisplayName("enter phone")
    @Test
    public void test1(){
        paymentPage.enterPhone();
    }

    @DisplayName("enter sum")
    @Test
    public void test2(){ paymentPage.enterSum();}

    @DisplayName("enter email")
    @Test
    public void test3(){ paymentPage.enterEmail();}

    @DisplayName("click ok")
    @Test
    public void test5(){ paymentPage.clickOk();}

    @DisplayName("check sum")
    @Test
    public void test6(){ paymentPage.checkSum();}
}
