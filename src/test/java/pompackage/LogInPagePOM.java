package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPagePOM
{
    WebDriver driver;

    By userNameField = By.xpath("//input[@id='user-name']");
    By passwordField = By.xpath("//input[@id='password']");
    By logInButton = By.xpath("//input[@id='login-button']");

    public LogInPagePOM(WebDriver driver)
    {
        this.driver = driver;
    }

    public void performLogIn(String username, String password)
    {
        driver.findElement(userNameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(logInButton).click();
    }
}
