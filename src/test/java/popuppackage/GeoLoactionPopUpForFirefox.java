package popuppackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.time.Duration;

public class GeoLoactionPopUpForFirefox
{
    public static void main(String[] args)
    {
        try
        {
//            FirefoxOptions options = new FirefoxOptions();
//


//            FirefoxProfile profile = new FirefoxProfile();
//            profile.setPreference("permissions.default.desktop-notification",2);

            FirefoxOptions options = new FirefoxOptions();
            options.addPreference("geo.enabled",false);
            options.addPreference("dom.webnotifications.enabled",false);

            WebDriver driver = new FirefoxDriver(options);

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));

            driver.get("https://www.easemytrip.com/");

        }
        catch (Exception e)
        {
            e.printStackTrace();

        }

    }
}
