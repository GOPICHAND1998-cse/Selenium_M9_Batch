package locartorspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathByMultiAttributes
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            Thread.sleep(2000);

            driver.get("https://www.youtube.com/");;

            Thread.sleep(2000);

            driver.findElement(By.xpath("//input[@name='search_query']"))
                    .sendKeys("India in 4K");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//button[@aria-label=\"Search\" and @title='Search']"))
                    .click();

            Thread.sleep(2000);

            driver.findElement(By.xpath("//img[contains(@class,'ytCoreImageHost ytCoreImageFillParentHeight ') and contains(@src,\"https://i.ytimg.com/vi/PVDVGFBMeUw/hq720.jpg?sqp=-oaymwEnCNAFEJQDSFryq4qpAxkIARUAAIhCGAHYAQHiAQoIGBACGAY4AUAB&rs=AOn4CLDFlUkcPfMS9z5YhmsVsUdES3-3lg\")]"))
                    .click();
        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
