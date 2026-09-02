package webelementpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingGetterMethod
{
    public static void main(String[] args)
    {
     try
     {
         WebDriver driver = new ChromeDriver();

         driver.manage().window().maximize();

         Thread.sleep(2000);

         driver.get("https://www.saucedemo.com/");

         Thread.sleep(2000);

         System.out.println(driver.findElement(By.xpath("//div[@class='login_logo']")).getText());

         WebElement logInBtn = driver.findElement(By.xpath("//input[@id='login-button']"));

         System.out.println("CssValue --->"+logInBtn.getAttribute("value"));

         System.out.println("Background Colour --->"+logInBtn.getCssValue("background-color"));

         System.out.println("Size of the element ===>"+logInBtn.getSize());

         System.out.println("Location of element"+logInBtn.getLocation());

         System.out.println("Location using Rect Class"+logInBtn.getRect().getPoint());
     }
     catch (Exception e)
     {
         e.printStackTrace();
     }
    }
}
