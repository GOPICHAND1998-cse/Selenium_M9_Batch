package actionspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class UsingDragAndDropMethod
{
    public static void main(String[] args)
    {
        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

            driver.get("https://www.qa-practice.com/elements/dragndrop/boxes");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            Actions action = new Actions(driver);

            WebElement srcElement = driver.findElement(By.xpath("//div[@id='rect-draggable']"));

            WebElement destElement = driver.findElement(By.xpath("//div[@id='rect-droppable']"));

            action.dragAndDrop(srcElement,destElement).perform();


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
