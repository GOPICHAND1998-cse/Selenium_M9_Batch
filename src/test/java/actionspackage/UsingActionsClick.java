package actionspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class UsingActionsClick
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

            driver.get("https://demoqa.com/buttons");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            Actions action = new Actions(driver);

//            action.click(driver.findElement(By.xpath("//button[text()='Click Me']")))
//                    .pause(Duration.ofSeconds(2))
//                    .contextClick(driver.findElement(By.xpath("//button[@id='rightClickBtn']")))
//                    .pause(Duration.ofSeconds(2))
//                    .doubleClick(driver.findElement(By.xpath("//button[@id='doubleClickBtn']")))
//                    .perform();

            action.click(driver.findElement(By.xpath("//button[text()='Click Me']")))
                    .pause(Duration.ofSeconds(2))
                    .contextClick(driver.findElement(By.xpath("//button[@id='rightClickBtn']")))
                    .pause(Duration.ofSeconds(2))
                    .doubleClick(driver.findElement(By.xpath("//button[@id='doubleClickBtn']")))
                    .perform();


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
