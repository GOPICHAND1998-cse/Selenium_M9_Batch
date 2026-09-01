package locartorspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Id_Name
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          Thread.sleep(2000);

          driver.get("https://www.netflix.com/in/");

          Thread.sleep(2000);

          driver.findElement(By.name("email")).sendKeys("john@gmail.com");
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
