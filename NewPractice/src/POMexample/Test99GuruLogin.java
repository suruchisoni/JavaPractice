package POMexample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test99GuruLogin {
	WebDriver driver;
	 
    Guru99Login objLogin;
 
    Guru99HomePage objHomePage;
 
     
 
    @BeforeTest
 
    public void setup(){
 
        driver = new FirefoxDriver();
 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        driver.get("http://demo.guru99.com/V4/");
 
    }
 
  
    @Test(priority=0)
 
    public void test_Home_Page_Appear_Correct(){
 
 
    objLogin = new Guru99Login(driver);
    objHomePage = new Guru99HomePage(driver);
 
 
    String loginPageTitle = objLogin.getLoginTitle();
 
    Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
  
    objLogin.loginToGuru99("mgr123", "mgr!23");
 
  
    Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));
 
    }
}
