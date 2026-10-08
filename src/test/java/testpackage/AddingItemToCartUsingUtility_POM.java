package testpackage;

import org.openqa.selenium.WebDriver;
import pompackage.InventoryPagePOM;
import pompackage.LogInPagePOM;
import pompackage.NavBarPOM;
import pompackage.ProductPagePOM;
import utilitypackage.ActionsUtility;
import utilitypackage.BrowserUtility;
import utilitypackage.PropertyFileUtility;

public class AddingItemToCartUsingUtility_POM
{
    public static String browser;
    public static String url;
    public static String username;
    public static String password;
    public static String desiredProduct;

    public static BrowserUtility browserUtils;
    public static ActionsUtility actions;

    public static WebDriver driver;

    public static LogInPagePOM login;
    public static NavBarPOM navbar;
    public static InventoryPagePOM inventory;
    public static ProductPagePOM product;

    public static void main(String[] args)
    {
      try
      {
          browser = PropertyFileUtility.getData("browser");
          url = PropertyFileUtility.getData("url");
          username = PropertyFileUtility.getData("username");
          password = PropertyFileUtility.getData("password");
          desiredProduct = PropertyFileUtility.getData("desiredProduct");

          browserUtils = new BrowserUtility();

          browserUtils.openBrowser(browser);
          browserUtils.maximizeBrowser();
          browserUtils.waitForPageLoad(10);
          browserUtils.openUrl(url);
          browserUtils.waitForElement(10);

          driver = browserUtils.getDriver();

          login = new LogInPagePOM(driver);
          navbar = new NavBarPOM(driver);
          inventory = new InventoryPagePOM(driver);
          product = new ProductPagePOM(driver);

          login.performLogIn(username,password);

          inventory.selectDesiredItemByName(desiredProduct);

          product.clickOnAddToCart();

          navbar.clickOnCartIcon();

      }
      catch (Exception e)
      {
          e.printStackTrace();
      }

    }
}
