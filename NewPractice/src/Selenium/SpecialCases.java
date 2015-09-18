package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;



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
	    
	    @Test
	    public void scrollDown(){
	     driver.get("https://amazon.com");	
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scroll(0,500);");
		}
	    
	    
	}

