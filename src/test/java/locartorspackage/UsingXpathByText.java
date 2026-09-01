package locartorspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathByText
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            Thread.sleep(2000);

            driver.get("https://chat.qspiders.com/");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//input[@id='username']"))
                    .sendKeys("john@gmail.com");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//input[@name='password']"))
                    .sendKeys("Password@12345");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//button[text()='Login']"))
                    .click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
