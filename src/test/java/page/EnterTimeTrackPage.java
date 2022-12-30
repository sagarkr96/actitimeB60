package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class EnterTimeTrackPage {
	private ExtentTest test;
	
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	@FindBy(xpath = "(//div[@class='menu_icon'][1])[2]")
	private WebElement settings;
	
	@FindBy(xpath = "//a[text()='Types of Work']")
	private WebElement typesOfWork;
	
	public EnterTimeTrackPage(WebDriver driver,ExtentTest test) {
		PageFactory.initElements(driver, this);
		this.test=test;
	}
	
	public boolean verifyHomePageIsDisplayed(WebDriverWait wait) {
		
		try{
			wait.until(ExpectedConditions.visibilityOf(logoutLink));
			test.log(LogStatus.PASS,"Home Page is Displayed");
			return true;
		}
		catch (Exception e) {
			test.log(LogStatus.FAIL,"Home Page is not Displayed");
			e.printStackTrace();
			return false;
		}
	}
	
	public void clickSettings()
	{
		settings.click();
		test.log(LogStatus.INFO, "click on the settings");
	}
	public void selectTypesOfWork()
	{
		typesOfWork.click();
		test.log(LogStatus.INFO, "select types of work under settings");
	}
	
}
