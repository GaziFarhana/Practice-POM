package Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.BillingAddress;
import Pages.CheckOutMethod;
import Pages.Courseformat;
import Pages.Homepage;
import Pages.Proceedtocheckout;
import Pages.SearchResult;



public class test {

public WebDriver driver;
	
	@Before
	public void initialize() {

		System.out.println("this is before class annotation!!!!!");
		System.getProperty("webdriver,chrome,driver", 
				"/Users/gazifarhana/eclipse-workspace1/GrateCourse/chromedriver");

		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.thegreatcourses.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	@org.junit.Test

	public void testtt() throws InterruptedException, IOException {

		System.out.println("test!!!!!!!!");	
	
//Homepage.science(driver);
//Homepage.search(driver);
//SearchResult.PhilosophyOfScience(driver);
//Courseformat.Format(driver);
//Courseformat.AddToCart(driver);
//Proceedtocheckout.checkout(driver);
//CheckOutMethod.enteremail(driver);
//CheckOutMethod.newcustomer(driver);
//CheckOutMethod.Clickcontinue(driver);
//BillingAddress.firstname(driver);
//BillingAddress.lastname(driver);
//BillingAddress.address1(driver);
//BillingAddress.address2(driver);
//BillingAddress.city(driver);
//BillingAddress.State(driver);
//BillingAddress.zipcode(driver);
//BillingAddress.password(driver);
//BillingAddress.confirmpassword(driver);
//BillingAddress.shipping(driver);
//BillingAddress.clickContinue(driver);
		
		
		
		
		
		
		
		
	}
	
	
	@After
	public void teardown() {
		System.out.println("this is after class annotation!!!");
		System.out.println("test finished!!!!!");
		driver.manage().deleteAllCookies();
		driver.close();

	}	
	
	
	
}
