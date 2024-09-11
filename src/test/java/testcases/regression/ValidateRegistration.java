package testcases.regression;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class ValidateRegistration extends BaseTest {
	
	@Test
	public void validateRegistrationTest()
	{
		LoginPage loginPage=new LoginPage();
		
		loginPage.regiterLink();
		
		
		
	}

}
