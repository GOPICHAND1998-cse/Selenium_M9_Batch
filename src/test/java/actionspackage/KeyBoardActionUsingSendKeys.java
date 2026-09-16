package actionspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class KeyBoardActionUsingSendKeys
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

            driver.get("https://demowebshop.tricentis.com/");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            Actions action = new Actions(driver);

            action.sendKeys(driver.findElement(By.xpath("//input[@id='small-searchterms']")),"" +
                            "Books",
                             Keys.ENTER)
                    .perform();

            action.keyDown(Keys.CONTROL)
                    .sendKeys("A")
                    .keyUp(Keys.CONTROL)
                    .perform();

            Thread.sleep(2000);

            action.keyDown(Keys.CONTROL)
                    .sendKeys("R")
                    .keyUp(Keys.CONTROL)
                    .perform();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
