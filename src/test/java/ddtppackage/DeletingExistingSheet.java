package ddtppackage;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DeletingExistingSheet
{
    public static void main(String[] args)
    {
      try
      {
          FileInputStream fis = new FileInputStream("./src/test/resources/TestData_folder/SwagLabsUserInfo.xlsx");

          Workbook workbook = WorkbookFactory.create(fis);

          Sheet newSheet = workbook.getSheet("NewUserInfoSheet");

          int sheetIndex = workbook.getSheetIndex(newSheet);

          workbook.removeSheetAt(sheetIndex);

          FileOutputStream fos = new FileOutputStream("./src/test/resources/TestData_folder/SwagLabsUserInfo.xlsx");

          workbook.write(fos);

          workbook.close();

      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
