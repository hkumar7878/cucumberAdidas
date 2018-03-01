package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ApplicationUtility {
	
	public void menuSelection(WebDriver driver,WebElement we)
	{
		try {
			
		Actions Action= new Actions(driver);
		Action.moveToElement(we).build().perform();
		Thread.sleep(5000);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
