package webelementpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingSendKeysMethod
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            Thread.sleep(2000);

            driver.get("https://demowebshop.tricentis.com/login");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//input[@name='Email']"))
                    .sendKeys("dmail@gmail.com");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//input[@name='Password']"))
                    .sendKeys("Password@1234");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//input[@value='Log in']"))
//                    .sendKeys(Keys.ENTER);
                    .submit();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
