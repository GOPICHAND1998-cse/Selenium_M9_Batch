package webdriverpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;

public class UsingNavigateMethods
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            Thread.sleep(2000);

            driver.get("https://www.myntra.com/");

            Thread.sleep(2000);

            driver.navigate().back();

            Thread.sleep(2000);

            driver.navigate().forward();

            Thread.sleep(2000);

            driver.navigate().refresh();

            Thread.sleep(2000);

            driver.navigate().to("https://www.ajio.com/");

            Thread.sleep(2000);

            URL url = new URL("https://relianceretail.com/reliance-trends.html");

            driver.navigate().to(url);

        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
