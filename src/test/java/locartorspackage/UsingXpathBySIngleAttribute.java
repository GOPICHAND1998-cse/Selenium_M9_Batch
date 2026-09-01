package locartorspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathBySIngleAttribute
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          Thread.sleep(2000);

          driver.get("https://www.amazon.in/");

          Thread.sleep(4000);

          driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))
                  .sendKeys("Vivo x300 pro");

          Thread.sleep(2000);

          driver.findElement(By.xpath("//a[text()='Prime Video']"))
                  .click();
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
