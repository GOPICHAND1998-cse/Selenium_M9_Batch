package ddtppackage;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.Properties;

public class LogInUsingPropertyFile
{
    public static String browser;
    public static String url;
    public static String username;
    public static String password;

    public static WebDriver driver;

    public static void main(String[] args)
    {
       try
       {
           FileInputStream fis = new FileInputStream("./src/test/resources/CommonDataFolder/Config.properties");

           Properties property = new Properties();

           property.load(fis);

           browser = property.getProperty("browser");
           url = property.getProperty("url");
           username = property.getProperty("username");
           password = property.getProperty("password");

           switch (browser.toLowerCase())
           {
               case "chrome":
                   driver = new ChromeDriver();
                   break;

               case "edge":
                   driver = new EdgeDriver();
                   break;

               case "firefox":
                   driver = new FirefoxDriver();
                   break;

               default: throw new InvalidArgumentException("Invalid Browser Name");

           }

           driver.manage().window().maximize();

           driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

           driver.get(url);

           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

           driver.findElement(By.xpath("//input[@id='user-name']"))
                   .sendKeys(username);

           driver.findElement(By.xpath("//input[@id='password']"))
                   .sendKeys(password);

           driver.findElement(By.xpath("//input[@id='login-button']"))
                   .click();
           driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

           driver.get(url);

           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

           driver.findElement(By.xpath("//input[@id='user-name']"))
                   .sendKeys(username);

           driver.findElement(By.xpath("//input[@id='password']"))
                   .sendKeys(password);

           driver.findElement(By.xpath("//input[@id='login-button']"))
                   .click();

           driver.findElement(By.xpath("//a[@id='item_4_title_link']"))
                   .click();

           String productName = driver.findElement(By.xpath("//div[@data-test='inventory-item-name']"))
                                        .getText();

           property.setProperty("desiredProduct",productName);

           FileOutputStream fos = new FileOutputStream("./src/test/resources/CommonDataFolder/Config.properties");


           property.store(fos,"Edited By ATE Pritam");

       }
       catch (Exception e)
       {
           e.printStackTrace();
       }

    }
}
