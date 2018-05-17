package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.Lib;

public class Homepage extends Lib{

	public static void science(WebDriver driver) throws IOException, InterruptedException {
		WebElement search=findelement(driver,readproperties("search"))	;
		search.sendKeys("science");
		Thread.sleep(2000);
		}
			
		public static void search(WebDriver driver) throws IOException, InterruptedException	{
			
		WebElement search=findelement(driver,readproperties("clicksearch"))	;
		search.click();
		Thread.sleep(2000);
			
		}
	
	
}
