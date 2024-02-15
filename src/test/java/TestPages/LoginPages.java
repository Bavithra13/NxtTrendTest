package TestPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPages{
    WebDriver driver;
    WebDriverWait wait;

    By UserNameE1 = By.id("inputHours");


    public void LoginPages(WebDriver driver){
        this.driver = driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void GetUserNameE1 (String username){
        driver.findElement(UserNameE1).sendKeys(username);
    }



}
