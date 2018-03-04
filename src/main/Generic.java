/*package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericUtility {
	
	WebDriver driver;
	
	public GenericUtility(WebDriver driver) {
		this.driver=driver;
	    //PageFactory.initElements(driver, this);
	}
	
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
			WebElement we1=(WebElement) wait.until(ExpectedConditions.elementToBeClickable(we));
			break;
		
		default:		
			break;
		}
	}	
	
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
		*/