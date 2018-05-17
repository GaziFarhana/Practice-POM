package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.Lib;

public class CheckOutMethod extends Lib{
	
	public static void enteremail(WebDriver driver) throws IOException, InterruptedException {
		WebElement email=findelement(driver,readproperties("loginemail"));
		email.sendKeys("noemail@hotmail.com");
		Thread.sleep(2000);
		
	}
public static void newcustomer(WebDriver driver) throws IOException, InterruptedException {
	WebElement newcustomer=findelement(driver,readproperties("loginpass"));
	newcustomer.click();
			Thread.sleep(2000);
}

public static void Clickcontinue (WebDriver driver) throws IOException, InterruptedException {
	WebElement click=findelement(driver,readproperties("clickcont"));
	click.click();
	Thread.sleep(2000);
}




}
