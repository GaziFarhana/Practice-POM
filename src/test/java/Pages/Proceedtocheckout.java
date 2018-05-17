package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.Lib;

public class Proceedtocheckout extends Lib{
	
	public static void checkout(WebDriver driver) throws IOException, InterruptedException {
	WebElement checkout=findelement(driver,readproperties("Checkout"));
	checkout.click();
	Thread.sleep(2000);
	
	}

}
