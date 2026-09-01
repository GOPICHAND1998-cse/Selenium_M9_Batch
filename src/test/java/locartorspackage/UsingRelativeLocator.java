package locartorspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class UsingRelativeLocator
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            Thread.sleep(2000);

            driver.get("https://demowebshop.tricentis.com/");

            Thread.sleep(8000);

            driver.findElement(RelativeLocator.with(By.xpath("//input[@value='Search store']"))
                                              .near(By.xpath("//input[@value='Search']")))
                    .sendKeys("Books");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
