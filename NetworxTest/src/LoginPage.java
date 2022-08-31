import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class LoginPage {
    WebDriver driver;
	
	
	By userNameField = By.id("companyName");
	By passField = By.id("password");
	By signInBtn = By.xpath("/html/body/div[3]/div/form/input[2]");
		
	
    public LoginPage(WebDriver driver) {		
		this.driver = driver;		
	}
    
   
	public void login(String userName, String pass) {    	
    	driver.findElement(userNameField).sendKeys(userName);
    	driver.findElement(passField).sendKeys(pass);
    	driver.findElement(signInBtn).click();    	
    		
    	String actualTitle = driver.getTitle();    	
    	String expectedTitle = "Leads";    
    	Assert.assertEquals("The actual and expected title don’t match",actualTitle, expectedTitle);
    }
    
    public void checkLoginAccountName(String name) {
    ////	String text = driver.findElement(accountName).getText();
    	
    //	Assert.assertTrue("Verification Failed: Wrong user name after login", text.contains(name)); 
    	
    	
    }
    

}
