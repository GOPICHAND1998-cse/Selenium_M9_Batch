package jspackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class PerformingScrollingUsingScrollBy
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

            driver.get("https://www.worldometers.info/geography/flags-of-the-world/#google_vignette");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            JavascriptExecutor executor = (JavascriptExecutor) driver;

            Thread.sleep(1000);

            executor.executeScript("window.scrollBy(0,1000)");

            Thread.sleep(1000);

            executor.executeScript("window.scrollBy(0,1000)");

            Thread.sleep(1000);

            executor.executeScript("window.scrollBy(0,1000)");

            Thread.sleep(1000);

            executor.executeScript("window.scrollBy(0,1000)");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
