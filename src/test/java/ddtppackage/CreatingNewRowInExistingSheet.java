package ddtppackage;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CreatingNewRowInExistingSheet
{
    public static void main(String[] args)
    {
      try
      {
          FileInputStream fis = new FileInputStream("./src/test/resources/TestData_folder/SwagLabsUserInfo.xlsx");

          Workbook workbook = WorkbookFactory.create(fis);

          Sheet sheet = workbook.getSheet("LogInCredentials");

          Row newRow = sheet.createRow(7);

          newRow.createCell(0).setCellValue("newDummyUser");

          newRow.createCell(1).setCellValue("Password");


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
