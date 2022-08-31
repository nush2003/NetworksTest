import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class MainPage {
	WebDriver driver;
		
	
	By mainMenu = By.className("main-menu");
	
	
    public MainPage(WebDriver driver) {		
		this.driver = driver;		
	}	
	
	
	public void clickOnMainMenuLink(String linkName) {	
	
		driver.findElement(mainMenu).findElement(By.xpath("//a[contains(.,'"+linkName+"')]")).click();
	
	}
	
	
	
}
