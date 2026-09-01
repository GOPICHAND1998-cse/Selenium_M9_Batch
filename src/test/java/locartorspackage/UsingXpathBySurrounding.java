package locartorspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsingXpathBySurrounding
{
    public static void main(String[] args)
    {
        try
        {
            WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--incognito"));

            driver.manage().window().maximize();

            Thread.sleep(2000);

            driver.get("https://www.makemytrip.com/");

            Thread.sleep(8000);

            driver.findElement(By.xpath("//span[@data-cy='closeModal']"))
                    .click();

            Thread.sleep(2000);

            driver.findElement(By.xpath("//div[@class='flt_fsw_inputBox dates inactiveWidget ']"))
                    .click();

            Thread.sleep(2000);


            while(true)
            {
                String monthName= driver.findElement(By.xpath("//div[@class='DayPicker-Caption']"))
                        .getText();

                if (monthName.equals("January 2027"))
                {
                    driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='8']"))
                            .click();
                    break;
                }
                else{
                    Thread.sleep(2000);

                    driver.findElement(By.xpath("//span[@aria-label='Next Month']"))
                            .click();
                }
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
