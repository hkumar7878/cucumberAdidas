package stepDefinitions;

import helpers.Hook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import utility.Hook;

public class Adidas_Men_BasketBall_Page_Verification {

	private WebDriver driver;
	
	public Adidas_Men_BasketBall_Page_Verification() {
		this.driver = Hook.getDriver();
	}
	
	@When("^Open a browser and open Adidas online store site$")
	public void i_open_a_browser_and_open_policy_baazzar_site() throws Throwable {
		driver.get("https://shop.adidas.co.in/");
		//driver.get("https://grofers.com/");
		System.out.println("Adidas site is opened successfully");
		Thread.sleep(3000);

	}
	
	@Then("^Verify Adidas online store Home Page$")
	public void Verify_Adidas_Online_Store_Home_Page() throws Throwable {
		
		
		System.out.println("Inside Adidas Online Store home page verification step");
		WebElement adidas_Logo=driver.findElement(By.xpath("//img[@id='logoImg']")); ////img[@id='logoImg']
		//Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", image);
		Assert.assertTrue(adidas_Logo.isDisplayed(), "PB home page is not displayed");
		System.out.println("Adidas online store HOME Page is displayed successfully");
	}
	
	@And("^Hover over Men Menu$")
		public void Hover_Over_Men_Menu() throws Throwable {
		
		Actions Action= new Actions(driver);
		WebElement men_Menu=driver.findElement(By.xpath("//a[@id='MEN']"));
		Action.moveToElement(men_Menu).build().perform();
		Thread.sleep(10000);
			
		}
	
	@Then("^Verify Men Menu opens$")
	public void Verify_Men_Menu_opens() throws Throwable {
	
	WebElement menWear=driver.findElement(By.xpath("//a[@id='MEN-FOOTWEAR']"));
	Boolean flag=menWear.isDisplayed();
	Assert.assertTrue(flag, "Men Wear drop down is not displayed");
	System.out.println("Men Wear drop down is displayed successfully");
			
	}
	
	@Then("^Click on Basketball link$")
	public void Click_On_Basketball_Link() throws Throwable {
		
	WebElement basketBallLink=driver.findElement(By.xpath("(//a[@id='MEN-FOOTWEAR']/..)//following-sibling::ul/li/a[@href='https://shop.adidas.co.in/#c/men-basketball-shoes/Pag-60/No-0/0']"));
	if(basketBallLink.isDisplayed())
	{
		basketBallLink.click();
		
		WebElement searchBox=driver.findElement(By.xpath("//input[@id='searchTextBox']"));
		if(searchBox.isDisplayed())
		{
			searchBox.click();
			System.out.println("Search box is clicked successfully");
		}
		
		else
		{
			System.out.println("Search box is not displayed");
		}
	}
	
	else
		System.out.println("Basketball link is not displayed");
	}
	
	@Then("^verify Men Basketball page appears$")
	public void Verify_Men_Basketball_Page_Appears() throws Throwable {
		
		WebElement menBasketballHd=driver.findElement(By.xpath("//h1[contains(text(),'Basketball Shoes')]"));
		if(menBasketballHd.isDisplayed())
		{
			String menBasketballText=menBasketballHd.getText();
			String pageTitle=driver.getTitle();
			if(menBasketballText.contains("basketball shoes") && pageTitle.contains("Buy adidas Basketball"))
			{
				System.out.println("Landed on Menbasketball page correctly");
			}
			
			else
				System.out.println("Failed to display Menbasketball page");
			
				
		}
		else
		{
			System.out.println("Not Landed on Menbasketball page");
		}
		
		}

	
}