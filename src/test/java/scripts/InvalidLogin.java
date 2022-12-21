package scripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Util;
import page.EnterTimeTrackPage;
import page.LoginPage;

public class InvalidLogin extends BaseTest {

	@Test(priority = 2)
	public void testInvalidLogin()
	{
		//read from Excel file
		String un = Util.getXlData(XL_PATH, "LoginData", 2, 0);
		String pw = Util.getXlData(XL_PATH, "LoginData", 2, 1);
		
		//1.enter invalid username
		LoginPage login=new LoginPage(driver, test);
		login.setUserName(un);
		
		
		//2.enter invalid password
		login.setPassword(pw);
		
		//3.click login button
		login.clickLoginButton();
		
		//4.verify error msg is displayed
		EnterTimeTrackPage ettPage=new EnterTimeTrackPage(driver, test);
		boolean result = ettPage.verifyHomePageIsDisplayed(wait);
		Assert.assertTrue(result, "Home page is not displayed");
		
		
		
	}
}
