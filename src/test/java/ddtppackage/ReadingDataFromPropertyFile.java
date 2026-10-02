package ddtppackage;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadingDataFromPropertyFile
{
    public static void main(String[] args)
    {
      try
      {
          FileInputStream fis = new FileInputStream("./src/test/resources/CommonDataFolder/Config.properties");

          Properties property =new Properties();

          property.load(fis);

          String  browser = property.getProperty("browser");

          System.out.println(browser);
      }
      catch (Exception e) {
          e.printStackTrace();
      }
    }
}
