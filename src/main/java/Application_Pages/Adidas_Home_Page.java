package Application_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Adidas_Home_Page {
	WebDriver driver;
	
	public Adidas_Home_Page(WebDriver driver) {
		this.driver=driver;
	    PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//img[@id='logoImg']") 
	public WebElement logo_Adidas;
	
	@FindBy(how = How.XPATH, using = "//a[@id='MEN']") 
	public WebElement men_Menu;
	
	@FindBy(how = How.XPATH, using = "//a[@id='MEN-FOOTWEAR']") 
	public WebElement men_FootWearMenu;
	
	@FindBy(how = How.XPATH, using = "(//a[@id='MEN-FOOTWEAR']/..)//following-sibling::ul/li/a[@href='https://shop.adidas.co.in/#c/men-basketball-shoes/Pag-60/No-0/0']") 
	public WebElement basketBallLink;
	
	@FindBy(how = How.XPATH, using = "//input[@id='searchTextBox']") 
	public WebElement txtBox_Search;
	
	
	
	public void verify_Adidas_Logo()
	{
		Assert.assertTrue(logo_Adidas.isDisplayed(), "PB home page is not displayed");
		System.out.println("Adidas online store HOME Page is displayed successfully");
	}
	
	public void hover_Over_Men_Menu() throws InterruptedException
	{
		
		Actions Action= new Actions(driver);
		Action.moveToElement(men_Menu).build().perform();
		Thread.sleep(5000);
	}
	
	public void verify_Men_FootWear_Menu_Display()
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


