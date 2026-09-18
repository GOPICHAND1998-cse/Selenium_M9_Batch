package dropdownpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class HandlingSingleSelectDropdown
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

            driver.get("https://proleed.academy/exercises/selenium/automation-practice-form-with-radio-button-check-boxes-and-drop-down.php");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            Select select = new Select(driver.findElement(By.xpath("//select[@id='country_code']")));

            select.selectByVisibleText("India (+91)");

            Thread.sleep(2000);

            select.deselectByVisibleText("India (+91)");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
