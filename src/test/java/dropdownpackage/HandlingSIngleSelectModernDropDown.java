package dropdownpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandlingSIngleSelectModernDropDown
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

            driver.get("https://www.tutorialspoint.com/selenium/practice/select-menu.php");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

            driver.findElement(By.xpath("//input[@placeholder='Please select...']"))
                    .click();

            List<WebElement> allOptions = driver.findElements(By.xpath("//div[@role='listbox']/descendant::div[@role='option']/descendant::span[contains(@class,'mbsc-ios mbsc-ltr mbsc-wheel-checkmark')]"));

            for(WebElement option : allOptions)
            {
                if (option.getText().equals("Electronics & Computers"))
                {
                    option.click();
                    break;
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
