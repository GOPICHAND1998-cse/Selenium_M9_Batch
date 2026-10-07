package ddtppackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilitypackage.ActionsUtility;
import utilitypackage.BrowserUtility;
import utilitypackage.PropertyFileUtility;

public class LogInUsingUtilities
{
    public static String browser;
    public static String url;
    public static String username;
    public static String password;

    public static BrowserUtility browserUtils;
    public static ActionsUtility actions;

    public static WebDriver driver;

    public static void main(String[] args)
    {
        try
        {
           browser = PropertyFileUtility.getData("browser");
           url = PropertyFileUtility.getData("url");
           username = PropertyFileUtility.getData("username");
           password = PropertyFileUtility.getData("password");


           browserUtils = new BrowserUtility();

           browserUtils.openBrowser(browser);
           browserUtils.maximizeBrowser();
           browserUtils.waitForPageLoad(10);
           browserUtils.openUrl(url);
           browserUtils.waitForElement(10);

           driver = browserUtils.getDriver();

           actions = new ActionsUtility(driver);

           WebElement userNameField = driver.findElement(By.xpath("//input[@id='user-name']"));
           WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
           WebElement logInButton = driver.findElement(By.xpath("//input[@id='login-button']"));

           actions.writeInInputField(userNameField,username);
           actions.writeInInputField(passwordField,password);
           actions.clickOnElement(logInButton);


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
