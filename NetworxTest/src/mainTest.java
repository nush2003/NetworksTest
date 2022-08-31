
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class mainTest {
	static WebDriver driver;
	
	LoginPage login = new LoginPage(driver);
	MainPage mainP = new MainPage(driver);
	PlansPage plans = new PlansPage(driver);

	
	
	
	@BeforeClass
	public static void initDriver() {
		
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "\\Drivers\\chromedriver.exe");		
		ChromeOptions options = new ChromeOptions();		
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	
	 @Test
	 public void test() throws IOException, InterruptedException {
				
		driver.get("https://networx.atara2.networx.link/login");	
	    login.login("atara+atara2_user_1188183@networx.com", "Manag3r1");
	    mainP.clickOnMainMenuLink("Plans");
	    plans.choosePlanFromTheList("501349");
	    plans.assertTextOnThePage("Post-Pay Per Lead");
	    plans.countSelectedCategories(2);
	  				 
	 }  
	
	
	 
	 @AfterClass
	 public static void tearDown() {
		driver.quit();
	 }
	
}
