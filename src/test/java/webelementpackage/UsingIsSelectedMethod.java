package webelementpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIsSelectedMethod
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            Thread.sleep(2000);

            driver.get("https://the-internet.herokuapp.com/checkboxes");

            Thread.sleep(2000);

            WebElement checkBox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));

            if (!checkBox1.isSelected())
            {
                checkBox1.click();
            }



        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
