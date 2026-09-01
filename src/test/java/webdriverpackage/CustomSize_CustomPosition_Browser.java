package webdriverpackage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomSize_CustomPosition_Browser
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          Thread.sleep(2000);

          driver.get("https://www.naaptol.com/");

          Thread.sleep(2000);

          driver.manage().window().setSize(new Dimension(400,600));

          Thread.sleep(2000);

          System.out.println(driver.manage().window().getSize());

          driver.manage().window().setPosition(new Point(600,200));

          Thread.sleep(2000);

          System.out.println(driver.manage().window().getPosition());

      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
