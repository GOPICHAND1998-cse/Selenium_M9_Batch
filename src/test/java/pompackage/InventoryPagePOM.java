package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class InventoryPagePOM
{
    @FindAll({@FindBy(xpath = "//div[@class='inventory_item']/descendant::div[contains(@class,'inventory_item_name')]"),
              @FindBy(xpath = "//div[contains(@class,'inventory_item_name')]")})
    private List<WebElement> allItems;

    public InventoryPagePOM(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public List<WebElement> getAllItems() {
        return allItems;
    }

    public void selectDesiredItemByName(String name)
    {
        for(WebElement item : allItems)
        {
            if (item.getText().equals(name))
            {
                item.click();
                break;
            }
        }
    }
}
