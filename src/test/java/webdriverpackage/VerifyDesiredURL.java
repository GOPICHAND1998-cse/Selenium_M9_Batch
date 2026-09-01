package webdriverpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyDesiredURL
{
    public static void main(String[] args)
    {

        try
        {
            String desiredURL = "https://www.flipkart.com/";

            WebDriver driver = new ChromeDriver();

            Thread.sleep(2000);

            driver.get(desiredURL);

            Thread.sleep(2000);

            String actualURL = driver.getCurrentUrl();

            if (actualURL.equals(desiredURL))
            {
                System.out.println("Our Desired URL is Opened");
            }
            else{
                System.out.println("Our Desired URL is not Opened");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
