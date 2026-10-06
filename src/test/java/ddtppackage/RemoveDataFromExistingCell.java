package ddtppackage;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class RemoveDataFromExistingCell
{
    public static void main(String[] args) {

        try
        {
            FileInputStream fis = new FileInputStream("./src/test/resources/TestData_folder/SwagLabsUserInfo.xlsx");

            Workbook workbook = WorkbookFactory.create(fis);

            Sheet sheet = workbook.getSheet("LogInCredentials");

            Row row = sheet.getRow(0);

            row.removeCell(row.getCell(2));

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
