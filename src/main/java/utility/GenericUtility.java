package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericUtility {
	
	public static void javaScriptWait_pageToLoad(WebDriver driver, WebElement we)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(we));
		
	}
	
	public static void wait_pageToLoad(WebDriver driver, WebElement we,String waitTypeOption,int timeToWait)
	{
		switch (waitTypeOption) 
		{
			case "elementClickable":
			
			WebDriverWait wait=new WebDriverWait(driver,timeToWait);
			WebElement we1=wait.until(ExpectedConditions.elementToBeClickable(we));
			break;
		
		default:		
			break;
		}
	}	
}
			
		
		
		
