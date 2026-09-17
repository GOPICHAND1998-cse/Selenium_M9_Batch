package robotpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.time.Duration;

public class UsingMouseMethods
{
    public static void main(String[] args)
    {
        try
        {
//            Thread.sleep(2000);
//
//
//           robot.mousePress(MouseEvent.BUTTON3_DOWN_MASK);
//           robot.mouseRelease(MouseEvent.BUTTON3_DOWN_MASK);
//
//           robot.delay(2000);
//
//           robot.mouseMove(500,40);

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            driver.get("https://www.amazon.in/");

            Robot robot = new Robot();
            robot.delay(8000);

            robot.mouseWheel(40);

            robot.delay(2000);

            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_T);
            robot.delay(500);
            robot.keyRelease(KeyEvent.VK_T);
            robot.keyRelease(KeyEvent.VK_CONTROL);

            robot.delay(2000);

            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.delay(500);
            robot.keyRelease(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_CONTROL);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
