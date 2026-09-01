package windowswitching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class AmazonWindowSwitching
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            Thread.sleep(2000);

            driver.get("https://www.amazon.in/");

            Thread.sleep(6000);

            String parentId = driver.getWindowHandle();

            driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))
                    .sendKeys("Vivo x300 Pro");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"))
                    .click();

            Thread.sleep(2000);

            driver.findElement(By.xpath("//h2[contains(@aria-label,'X300 Ultra 5G (Eclipse Black, 16GB RAM, 512GB Storage)')]"))
                    .click();

            Thread.sleep(2000);

            Set<String> allPageId = driver.getWindowHandles();

            for(String pageId : allPageId)
            {
                if (pageId.equals(parentId))
                {
                    continue;
                }
                else{
                    driver.switchTo().window(pageId);
                    break;
                }
            }

            Thread.sleep(2000);

            driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]"))
                    .click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
