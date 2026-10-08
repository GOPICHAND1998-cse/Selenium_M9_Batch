package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavBarPOM
{
    @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
    private WebElement menuIcon;

    @FindBy(xpath = "//div[@id='shopping_cart_container']")
    private WebElement cartIcon;

    @FindBy(xpath = "//span[@data-test='shopping-cart-badge']")
    private WebElement numberOfItems;

    public NavBarPOM(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public WebElement getMenuIcon() {
        return menuIcon;
    }

    public WebElement getCartIcon() {
        return cartIcon;
    }

    public WebElement getNumberOfItems() {
        return numberOfItems;
    }

    public void clickOnMenuIcon()
    {
        menuIcon.click();
    }

    public void clickOnCartIcon()
    {
        cartIcon.click();
    }

    public String getTotalNumberOfItems()
    {
        return numberOfItems.getText();
    }
}

