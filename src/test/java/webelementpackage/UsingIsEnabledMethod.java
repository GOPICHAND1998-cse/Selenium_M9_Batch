package webelementpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIsEnabledMethod
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            Thread.sleep(2000);

            driver.get("https://www.instagram.com/");

            Thread.sleep(2000);

            driver.findElement(By.cssSelector("button._aswp._aswq._aswu._asw_._asx2"))
                    .click();

            Thread.sleep(2000);

            WebElement passwordField  = driver.findElement(By.xpath("//input[@name='pass']"));

            if (passwordField.isEnabled())
            {
                System.out.println("The Button is enabled");

                passwordField.sendKeys("DemoPassword");
            }
            else{
                System.out.println("The Button is disabled");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
