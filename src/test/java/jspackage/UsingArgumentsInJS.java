package jspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UsingArgumentsInJS
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

            driver.get("https://demowebshop.tricentis.com/");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.findElement(By.xpath("//a[@href='/login']")).click();

            WebElement userNameField = driver.findElement(By.xpath("//input[@name='Email']"));

            WebElement passwordField = driver.findElement(By.xpath("//input[@name='Password']"));

            WebElement logInButton = driver.findElement(By.xpath("//input[@value='Log in']"));

            JavascriptExecutor executor = (JavascriptExecutor) driver;

            executor.executeScript("arguments[0].value='dummymail11@gmail.com';" +
                                            "arguments[1].value='Password';" +
                                            "arguments[2].click();"
                                ,userNameField,passwordField,logInButton);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
