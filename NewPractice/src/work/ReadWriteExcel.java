package work;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;




import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
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

  
  public void writeFromSite() throws Exception{
	  
	  FirefoxDriver driver;
	  driver = new FirefoxDriver(); 
	  driver.get("https://www.amazon.com");
  
	  String a = driver.findElement(By.xpath(".//*[@id='nav-your-amazon']")).getText();
	  String b = driver.findElement(By.xpath(".//*[@id='nav-xshop']/a[2]")).getText();
	  String c = driver.findElement(By.xpath(".//*[@id='nav-xshop']/a[3]")).getText();
	   	  
	  System.out.println("data is:"+ a);
	  
	  File file = new File("testdata\\testfile.xls");
	  FileInputStream fis = new FileInputStream(file);
	  Workbook wb = new HSSFWorkbook(fis);
	  HSSFSheet sh = (HSSFSheet)wb.getSheetAt(0);
		//HSSFSheet sh = (HSSFSheet)wb.createSheet("Test");
		HSSFRow r = sh.createRow(0);
		HSSFCell cell = r.createCell(0);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(a);
		
		HSSFRow r1 = sh.createRow(1);
		HSSFCell cell1 = r1.createCell(0);
		cell1.setCellType(cell.CELL_TYPE_STRING);
		cell1.setCellValue(b);
		
		HSSFRow r2 = sh.createRow(2);
		HSSFCell cell2 = r2.createCell(0);
		cell2.setCellType(cell.CELL_TYPE_STRING);
		cell2.setCellValue(c);
		
		FileOutputStream fos = new FileOutputStream(file);
		wb.write(fos);
		wb.close();
		driver.quit();  
	   
  }



  
  
  public void writeArray() throws Exception{
	  
	  FirefoxDriver driver;
	  driver = new FirefoxDriver(); 
	  driver.get("https://www.amazon.com");
  
	    
	  //File file = new File("testdata\\testfile.xls");
	  FileInputStream fis = new FileInputStream("testdata\\testfile.xls");
	  //HSSFWorkbook wb = (HSSFWorkbook)WorkbookFactory.create(file);			
	  Workbook wb = new HSSFWorkbook(fis);
	  HSSFSheet sh = (HSSFSheet)wb.getSheetAt(0);
	  //HSSFSheet sh = (HSSFSheet)wb.createSheet("Test");
	  fis.close();
	  
	  File file = new File("testdata\\outputfile.xls");
	  FileInputStream finput = new FileInputStream(file);
	  HSSFWorkbook wb1 = (HSSFWorkbook)WorkbookFactory.create(finput);
	  //HSSFWorkbook wb1 = new HSSFWorkbook(finput);
      HSSFSheet sh1 = wb1.getSheetAt(0);
	  //HSSFSheet sh1 = wb1.createSheet("Test");
	  
      List<String> xpathList = new ArrayList<String>();
	  xpathList.add(driver.findElement(By.xpath(".//*[@id='nav-your-amazon']")).getText());
	  xpathList.add(driver.findElement(By.xpath(".//*[@id='nav-xshop']/a[2]")).getText());
	  xpathList.add(driver.findElement(By.xpath(".//*[@id='nav-xshop']/a[3]")).getText());
	  
		HSSFRow row = sh1.createRow((short) 0);
		HSSFCell cell = row.createCell(0);
	    cell.setCellValue("EXPECTED");
	    //cell.setCellStyle(style);
	    cell = row.createCell(1);
	    cell.setCellValue("ACTUAL");
	    //cell.setCellStyle(style);
	    cell = row.createCell(2);
	    cell.setCellValue("RESULT");
	    //cell.setCellStyle(style);
	    
	    String exceldata[]=new String[25];
	    for(int i=1;i<=sh.getLastRowNum();i++)
	    {
	           HSSFRow row1 = sh.getRow(i);
	           exceldata[i] = row1.getCell(0).toString();
	            row =sh1.createRow(i);
	            cell = row.createCell(0);
	            cell.setCellValue(exceldata[i]);                          
	            cell = row.createCell(2);
	            cell.setCellValue("FAIL"); 
	            //cell.setCellStyle(style);
	            for(int j=0;j<=xpathList.size()-1;j++)
	            { 
	                  //System.out.println("APP Data:" + subMenu_Tabs.get(j).getText());
	                   if(exceldata[i].trim().equals(xpathList.get(j).trim())) 
	                      {                            
	                        //System.out.println(exceldata[i] + "Is equal to " + subMenu_Tabs.get(j).getText());                                 
	                        cell = row.createCell(1);
	                        cell.setCellValue(xpathList.get(j)); 
	                        cell = row.createCell(2);
	                        cell.setCellValue("PASS");
	                        break;
	               
	                       }
         
		      
   }
	    }
	    finput.close();
	    FileOutputStream fos = new FileOutputStream(file);
		wb1.write(fos);
		fos.close();
		//driver.quit();
      }
  
  @Test
  public void createBlankWB() throws IOException {
     //Create Blank workbook
     HSSFWorkbook workbook = new HSSFWorkbook(); 
     //Create file system using specific name
     File file = new File("testdata\\Wb1.xls");
     FileOutputStream out = new FileOutputStream(file);
     //write operation workbook using file out object 
     workbook.write(out);
     out.close();
     System.out.println("createworkbook.xlsx written successfully");
  }  
  
  
  
   }

