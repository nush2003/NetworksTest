import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class PlansPage {
WebDriver driver;
		
	
	By myPlans = By.className("my-plans");
	By selectedElements = By.className("selected-categories-list");
	
	
    public PlansPage(WebDriver driver) {		
		this.driver = driver;		
	}	
	
	
	public void choosePlanFromTheList(String planId) {	
	
		driver.findElement(myPlans).findElement(By.xpath("//li[contains(@data-href, '"+planId+"')]")).click();		
	}
	
	
	public boolean verifyTextPresent(String value)
	{
	  return driver.getPageSource().contains(value);
	}
	
	public void assertTextOnThePage(String text) {
		try
		{
		  Assert.assertTrue(verifyTextPresent(text));
		  System.out.println("The text '"+text+"' is presented on the page");
		}
		catch (Exception e)
		{
			System.out.println("The text '"+text+"' is not presented on the page");
		}
	}
	
	public void countSelectedCategories(int expectedNum) {
		List<WebElement>selCatList =driver.findElement(selectedElements).findElements(By.xpath("./div/input[@checked='checked']"));
		Assert.assertEquals(expectedNum, selCatList.size());	
		
	}

}
