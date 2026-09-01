package locartorspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathByNormalizeSpace
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            Thread.sleep(2000);

            driver.get("https://demowebshop.tricentis.com/");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//a[normalize-space()='Books']"))
                    .click();

            Thread.sleep(2000);

            driver.findElement(By.xpath("//li[.='Register']"))
                    .click();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
