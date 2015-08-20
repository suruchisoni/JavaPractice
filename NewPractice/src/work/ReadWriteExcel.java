package work;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.Test;

public class ReadWriteExcel {

	
	public void readOneRow() throws IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Suruchi\\Documents\\Book1.xls");
		HSSFWorkbook wb = new HSSFWorkbook(file);
		HSSFSheet s = wb.getSheetAt(0);
		HSSFRow r1 = s.getRow(0);
		HSSFCell cellA1 = r1.getCell(1);
		
		String a1Val = (String) cellA1.getStringCellValue();
		System.out.println(a1Val);
		
	}
	

    public void readMultipleRows() throws IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Suruchi\\Documents\\Book1.xls");
		HSSFWorkbook wb = new HSSFWorkbook(file);
		HSSFSheet s = wb.getSheetAt(1);
		
		int rowCount = s.getLastRowNum();
		System.out.println("Row:"+rowCount );
        int noOfColumns = 3;
        for(int c = 0; c < noOfColumns; c++){
        	for(int r = 0; r <= rowCount; r++)
        	{
        		HSSFRow currentRow = s.getRow(r);
        		HSSFCell currentCell = currentRow.getCell(c);
        		String currentCellVal = currentCell.getStringCellValue();
        		System.out.println(currentCellVal);
        		
        	}
        }
       
      }
@Test
public void writeToExcel() throws IOException{
	
	FileInputStream fis = new FileInputStream("C:\\Users\\Suruchi\\Documents\\Book1.xls");
	HSSFWorkbook wb = new HSSFWorkbook(fis);
	HSSFSheet s = wb.getSheetAt(2);
	HSSFRow r = s.getRow(2);
	HSSFCell cell = r.createCell(1);
	cell.setCellType(cell.CELL_TYPE_STRING);
	cell.setCellValue("Selenium");
	
	FileOutputStream fos = new FileOutputStream("C:\\Users\\Suruchi\\Documents\\Book1.xls");
	wb.write(fos);
	fos.close();
	System.out.println("excel is written ");
	
}
}

