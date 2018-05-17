package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.Lib;

public class Courseformat extends Lib{
	
	public static void Format(WebDriver driver) throws IOException, InterruptedException {
	WebElement DVD=findelement(driver,readproperties("dvd"))	;
	
	DVD.click();
	Thread.sleep(2000);
		
		
	}
public static void AddToCart(WebDriver driver) throws IOException, InterruptedException {
	WebElement addtocart=findelement(driver,readproperties("addtocart"));
	addtocart.click();
	Thread.sleep(2000);
	
	
	
	
}
}
