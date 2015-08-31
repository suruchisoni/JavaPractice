package BasicJavaProgs;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {
	
	FirefoxDriver driver;
	
	@Test
	public void testMethod(){
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.get("http://www.priceline.com/");
		
	}
	
	
	
	

}
