package stepDefinitions;

import helpers.Hook;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import Application_Pages.Adidas_Home_Page;
import Application_Pages.Men_BaseketBall_Shoes_Page;

public class Verify_Women_TShirt_Checkout_Process {

	private WebDriver driver;
	Adidas_Home_Page homePage=new Adidas_Home_Page(driver);
	Men_BaseketBall_Shoes_Page menBaseketBallShoesPg=new Men_BaseketBall_Shoes_Page(driver);
	
	public Verify_Women_TShirt_Checkout_Process() {
		this.driver = Hook.getDriver();
		
	}
	@When("^Open a browser and open Adidas online store site$")
	public void i_open_a_browser_and_open_policy_baazzar_site() throws Throwable {
		driver.get("https://shop.adidas.co.in/");
		
		System.out.println("Adidas site is opened successfully");
		Thread.sleep(3000);
	}
	
	@Then("^Verify Adidas online store Home Page$")
	public void Verify_Adidas_Online_Store_Home_Page() throws Throwable {
				
		System.out.println("Inside Adidas Online Store home page verification step");
		homePage=new Adidas_Home_Page(driver);
		homePage.verify_Adidas_Logo();
	}
	
	@And("^Hover over Women Menu$")
		public void Hover_Over_Men_Menu() throws Throwable {
		String menuChoice="Women";
		homePage.hover_Over_Menu(menuChoice);		
		}
	
	@Then("^Verify Women Menu opens$")
	public void Verify_Men_Menu_opens() throws Throwable {
		homePage.verify_Women_Clothing_Menu_Display();
	}
	
}
	

