package popuppackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingJSPopUps
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

          driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");

          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


          driver.findElement(By.xpath("//button[text()='Alert']"))
                  .click();

          Thread.sleep(2000);

          Alert alert = driver.switchTo().alert();

          alert.accept();

          Thread.sleep(2000);

          driver.findElement(By.cssSelector("button[onclick='myDesk()']"))
                  .click();

          Thread.sleep(2000);

          alert.dismiss();

          Thread.sleep(2000);

          driver.findElement(By.cssSelector("button[onclick='myPromp()']"))
                  .click();

          Thread.sleep(2000);

          alert.sendKeys("Selenium");

//          Thread.sleep(2000);
//
//          alert.accept();


      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
