package POMexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Guru99Login {
	WebDriver driver;
	 
    public static String user99GuruName = "uid";
 
    public static String password99Guru = "password";
 
    public static String titleText ="barone";
 
    public static String login = "btnLogin";
 
     
 
    public Guru99Login(WebDriver driver){
 
        this.driver = driver;
 
    }
 
    //Set user name in textbox
 
    public void setUserName(String strUserName){
 
        driver.findElement(By.name(user99GuruName)).sendKeys(strUserName);;
 
    }
 
     
 
    //Set password in password textbox
 
    public void setPassword(String strPassword){
 
         driver.findElement(By.name(password99Guru)).sendKeys(strPassword);
 
    }
 
     
 
    //Click on login button
 
    public void clickLogin(){
 
            driver.findElement(By.name(login)).click();
 
    }
 
     
 
    //Get the title of Login Page
 
    public String getLoginTitle(){
 
     return    driver.findElement(By.className(titleText)).getText();
 
    }
 
    /**
 
     * This POM method will be exposed in test case to login in the application
 
     * @param strUserName
 
     * @param strPasword
 
     * @return
 
     */
 
    public void loginToGuru99(String strUserName,String strPasword){
 
        //Fill user name
 
        this.setUserName(strUserName);
 
        //Fill password
 
        this.setPassword(strPasword);
 
        //Click Login button
 
        this.clickLogin();        
 
         
 
    }
 

}
