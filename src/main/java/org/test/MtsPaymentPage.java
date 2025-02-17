package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MtsPaymentPage extends BasePage{
    private final By PAYMENT_PHONE = By.id("connection-phone");
    private final By PAYMENT_SUM = By.id("connection-sum");
    private final By PAYMENT_EMAIL = By.id("connection-email");
    private final By BUTTON_OK = By.xpath("//button[text()='Продолжить']");
    private final By SUM_CHECK = By.xpath("//span[contains(text(), 'Оплата')");
    private final By FRAME = By.className("bepaid-iframe");
    private final By BUTTON_SUBMIT_SUM = By.xpath("//button[@type='submit']");



    public MtsPaymentPage(WebDriver driver) {
        super(driver);
    }

    public void enterPhone() {
        WebElement phone = driver.findElement(PAYMENT_PHONE);
        phone.sendKeys("297777777");

    }

    public void enterSum() {
        WebElement sum = driver.findElement(PAYMENT_SUM);
        sum.sendKeys("500");
    }


    public void enterEmail() {
        WebElement sum = driver.findElement(PAYMENT_EMAIL);
        sum.sendKeys("test@mail.ru");
    }


    public void clickOk() {

        WebElement okButton = driver.findElement(BUTTON_OK);
        okButton.click();

    }

    public void checkSum() {
        WebElement iframe = driver.findElement(FRAME);
        driver.switchTo().frame(iframe);
        System.out.println("iframe.isDisplayed() = " + iframe.isDisplayed());
    }

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        MtsPaymentPage paymentPage = new MtsPaymentPage(driver);
        paymentPage.enterPhone();
        paymentPage.enterSum();
        paymentPage.enterEmail();
        paymentPage.clickOk();
        paymentPage.checkSum();
    }
}
