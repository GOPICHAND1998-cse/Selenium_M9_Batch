package ddtppackage;

import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;

public class fetchingSingleDataFromExcel
{
    public static void main(String[] args) {

        try
        {
            FileInputStream fis = new FileInputStream("./src/test/resources/TestData_folder/SwagLabsUserInfo.xlsx");

            Workbook workbook = WorkbookFactory.create(fis);

            Sheet sheet = workbook.getSheet("LogInCredentials");

            Row row = sheet.getRow(1);

            Cell cell = row.getCell(0);

            String data = cell.getStringCellValue();

            System.out.println(data);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}
