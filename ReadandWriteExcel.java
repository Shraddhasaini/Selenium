package automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadandWriteExcel {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\shrad\\OneDrive\\Documents\\UPES\\SEM 6\\Test Automation Lab\\Shraddha.xlsx");
        // Access the required test data sheet
        XSSFWorkbook wb1 = new XSSFWorkbook(fis);
        XSSFSheet ws1 = wb1.getSheet("Sheet1");
        int rowcount = ws1.getLastRowNum();
        for(int i = 0;i<=rowcount;i++)
        {
        int colcount = ws1.getRow(i).getLastCellNum();
        for(int k =0;k<colcount;k++)
        {
        Cell c1 = ws1.getRow(i).getCell(k);
        System.out.println("Row:="+ i + ";" + "Column:=" + k + " : "+
        c1.getStringCellValue());
        }
        }
        wb1.close();
        fis.close();
	}
}