package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.Lib;

public class SearchResult extends Lib{
	
	
public static void PhilosophyOfScience(WebDriver driver) throws IOException, InterruptedException	{
WebElement POS=findelement(driver,readproperties("pos"));
POS.click();
Thread.sleep(2000);
}
	
	
	

}
