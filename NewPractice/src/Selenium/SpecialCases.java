package Selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;

import com.thoughtworks.selenium.Wait;



public class SpecialCases {

	    WebDriver driver = new FirefoxDriver();
	    	    
	    public void captureScreenshot() throws IOException{
	    driver.get("https://www.google.com");
		   
	    TakesScreenshot scr = (TakesScreenshot) driver;
	    File fi = scr.getScreenshotAs(OutputType.FILE);
	    File dest = new File("C:\\Users\\Suruchi\\Desktop\\Suruchi\\New folder\\scrnshoot.png");
	    FileUtils.copyFile(fi, dest);
	    //OR
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\Suruchi\\Desktop\\Suruchi\\New folder\\scrnshoot.png"));
	    }
	    
	  
	    public void scrollDown(){
	     driver.get("https://amazon.com");	
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scroll(0,500);");
		}
	    
	    
	    public void hover() throws InterruptedException{
	    	driver.get("https://www.ebay.com");
	    	Thread.sleep(2000);
	    	Actions a = new Actions (driver);
	    	
	    	a.moveToElement(driver.findElement(By.linkText("Motors"))).build().perform();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("//a[contains(.,'Motorcycles')]")).click();
	    	//driver.findElement(By.xpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[4]/div[2]/div[1]/ul[1]/li[2]/a")).click();
	    	
	    }
	    
	    
	    public void frame() throws InterruptedException{
	    	 driver.get("https://amazon.com");
	    	 Thread.sleep(2000);
	    	 List<WebElement> list = driver.findElements(By.tagName("iframe"));
	    	 System.out.println(list.size());
	    	driver.switchTo().frame(0);
	    	driver.switchTo().defaultContent(); //switch to main window
	    }
	    
	   /* WebDriverWait wait = new WebDriverWait(driver, 20);
	    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.className("asd")));*/
	     
	    
	    
	    
	    
	    
	    @Test
	    public void findLinks() throws InterruptedException{
	    	
	    driver.get("https://www.google.com");
	    Thread.sleep(3000);
	    driver.findElement(By.className("gsfi")).click();
	    driver.findElement(By.className("gsfi")).sendKeys("Selenium");
	    driver.findElement(By.className("lsb")).click();
	    Thread.sleep(3000);
	    List<WebElement> list = driver.findElements(By.xpath("//a[contains(.,'Selenium']"));
	    //List<WebElement> list = driver.findElements(By.xpath("//h3[@class='r']/a"));
	    System.out.println("Number of links:" + list.size());
	    List<WebElement> subList = driver.findElements(By.xpath("//div[@class='f kv _SWb']/cite"));
	    
	    for(int i = 0; i < list.size(); i++)
	    	System.out.println(list.get(i).getText());
	    
	    	for(int j = 0; j < subList.size(); j++)
		    	System.out.println(subList.get(j).getText());
	    
	    	    	
	    }
	    
	    
	    
	    
	    
	    
	    
	}


