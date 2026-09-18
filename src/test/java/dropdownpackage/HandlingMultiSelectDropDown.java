package dropdownpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class HandlingMultiSelectDropDown
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

            driver.get("https://techcanvass.com/Examples/multi-select.html?srsltid=AU7gw4WnSjArF1EWJ2dy2JwvDjOVr9PNyCyRXeWmOUCvmZiiV0WbPXiW");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            Select selectMulti = new Select(driver.findElement(By.xpath("//select[@id='multiselect']")));

            if (selectMulti.isMultiple())
            {
                selectMulti.selectByVisibleText("Volvo");
                selectMulti.selectByVisibleText("Audi");
                selectMulti.selectByVisibleText("Hyundai");
            }

            Thread.sleep(2000);

//            selectMulti.deselectByVisibleText("Hyundai");

            selectMulti.deselectAll();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
