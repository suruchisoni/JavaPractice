package work;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import jxl.write.Label;
import jxl.write.WritableWorkbook;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

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

  @Test
  public void newmethod() throws IOException{
	  
	  FirefoxDriver driver;
	  
	  driver = new FirefoxDriver();
	  
	  driver.get("https://www.amazon.com");
	  
	  String a,b;
	  
	  File fExcel = new File("C:\\Users\\suruchi_soni\\Desktop\\Suruchi\\Selenium\\test\\Input.xls");
      HSSFWorkbook wb = new HSSFWorkbook (); 
      HSSFWorkbook wb =  HSSFWorkbook.create(fExcel);
      wb.createSheet("Data");
	  
	  for(int i = 0; i < 3; i++) {
	        int j = i + 1 ;
	        a = driver.findElement(By.xpath(".//*[@id='nav-your-amazon']")).getText();
	        System.out.println("data1 = " +  a);
	        b = driver.findElement(By.xpath(".//*[@id='nav-xshop']/a[2]")).getText();
	        System.out.println("data2 = " +  b);

	        

	        HSSFSheet sh = wb.getSheetAt(0);

	        Label data1  = new Label(j, 1, a);
	        sh.createRow(0);

	        Label data2 = new Label(j, 1, b);
	        sh.createRow(1);
	        
	        FileOutputStream fos = new FileOutputStream("C:\\Users\\suruchi_soni\\Desktop\\Suruchi\\Selenium\\test\\Input.xls");
	        wb.write(fos);
	        wb.close();               
	    }
  }
    
   }

