package org.test;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    private static final By COOKIE_ACCEPT_BUTTON = By.id("cookie-agree");

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://mts.by");
        acceptCookies();
    }

    public void acceptCookies(){
        try {
            WebElement buttonCookie = driver.findElement(COOKIE_ACCEPT_BUTTON);
            if (buttonCookie.isDisplayed()){
                buttonCookie.click();
            }
        }catch (TimeoutException ignore){

        }
    }
}
