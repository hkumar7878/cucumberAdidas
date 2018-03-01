package Application_Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utility.ApplicationUtility;

public class Adidas_Home_Page {
	WebDriver driver;
	ApplicationUtility appUtil;
	
	public Adidas_Home_Page(WebDriver driver) {
		this.driver=driver;
	    PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//img[@id='logoImg']") 
	public WebElement logo_Adidas;
	
	@FindBy(how = How.XPATH, using = "//a[@id='MEN']") 
	public WebElement men_Menu;
	
	@FindBy(how = How.XPATH, using = "//a[@id='WOMEN']") 
	public WebElement women_Menu;
	
	@FindBy(how = How.XPATH, using = "//a[@id='MEN-FOOTWEAR']") 
	public WebElement men_FootWearMenu;
	
	@FindBy(how = How.XPATH, using = "(//a[@id='MEN-FOOTWEAR']/..)//following-sibling::ul/li/a[@href='https://shop.adidas.co.in/#c/men-basketball-shoes/Pag-60/No-0/0']") 
	public WebElement basketBallLink;
	
	@FindBy(how = How.XPATH, using = "//input[@id='searchTextBox']") 
	public WebElement txtBox_Search;
	
	
	public void verify_Adidas_Logo()
	{
		try
		{
			Assert.assertTrue(logo_Adidas.isDisplayed(), "PB home page is not displayed");
			System.out.println("Adidas online store HOME Page is displayed successfully");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void hover_Over_Menu(String menuType) throws InterruptedException
	{
		switch(menuType) {
		
		case "Men" :
			appUtil.menuSelection(driver, men_FootWearMenu);
			break;
		case "Women": 		
			appUtil.menuSelection(driver, women_Menu);
			break;
		default: 
			System.out.println("Default Case");
			
		}
		
	}
	
	public void verify_Men_FootWear_Menu_Display()
	{
		//WebElement menWear=driver.findElement(By.xpath("//a[@id='MEN-FOOTWEAR']"));

		Boolean flag=men_FootWearMenu.isDisplayed();
		Assert.assertTrue(flag, "Men Wear drop down is not displayed");
		System.out.println("Men Wear drop down is displayed successfully");
	}
	
	public void verify_Women_Clothing_Menu_Display()
	{
		//WebElement menWear=driver.findElement(By.xpath("//a[@id='MEN-FOOTWEAR']"));

		Boolean flag=men_FootWearMenu.isDisplayed();
		Assert.assertTrue(flag, "Men Wear drop down is not displayed");
		System.out.println("Men Wear drop down is displayed successfully");
	}
	
	public void click_BaseketBall_Option()
	{
		//WebElement basketBallLink=driver.findElement(By.xpath("(//a[@id='MEN-FOOTWEAR']/..)//following-sibling::ul/li/a[@href='https://shop.adidas.co.in/#c/men-basketball-shoes/Pag-60/No-0/0']"));
		if(basketBallLink.isDisplayed())
		{
			basketBallLink.click();
			
			//WebElement searchBox=driver.findElement(By.xpath("//input[@id='searchTextBox']"));
			if(txtBox_Search.isDisplayed())
			{
				txtBox_Search.click();
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
	}


