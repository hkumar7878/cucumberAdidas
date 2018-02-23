/**
 * 
 */
package helpers;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;


/**
 * @author CHIRAG
 *
 */
public class Hook {

	private static WebDriver driver;
	
	//@Before("@web")
	@Before("@RegressionTest2")
	public void setUp()
	{
		
		System.out.println("This will run BEFORE any scenario defined in the feature file");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//BrowsersExe//chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	
	@After
	public void tearDown()
	{
		driver.quit();
		System.out.println("This will run AFTER any scenario defined in the feature file");
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
}