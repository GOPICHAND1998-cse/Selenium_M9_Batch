package ddtppackage;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CreatingNewSheet
{
    public static void main(String[] args)
    {
     try
     {
         FileInputStream fis = new FileInputStream("./src/test/resources/TestData_folder/SwagLabsUserInfo.xlsx");

         Workbook workbook = WorkbookFactory.create(fis);

         Sheet newUserInfoSheet = workbook.createSheet("NewUserInfoSheet");

         Row newRow = newUserInfoSheet.createRow(0);

         newRow.createCell(0).setCellValue("NewValue1");
         newRow.createCell(1).setCellValue("NewValue2");

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
