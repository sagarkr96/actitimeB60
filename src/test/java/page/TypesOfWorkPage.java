package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

public class TypesOfWorkPage {
	private WebDriver driver;
	private ExtentTest test;
	
	
	
	public TypesOfWorkPage(WebDriver driver,ExtentTest test)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
		
	}
	
	
	
	
	
	
}
