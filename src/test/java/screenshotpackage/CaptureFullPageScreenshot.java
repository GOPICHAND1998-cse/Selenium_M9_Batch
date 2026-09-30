package screenshotpackage;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.time.Duration;

public class CaptureFullPageScreenshot
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

          driver.get("https://www.amazon.in/");

          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

          Thread.sleep(2000);

          TakesScreenshot screenshot = (TakesScreenshot) driver;

          File tempFile = screenshot.getScreenshotAs(OutputType.FILE);

          File destFile = new File("./ScreenshotFolder/FirstSS.png");

          FileHandler.copy(tempFile,destFile);
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
