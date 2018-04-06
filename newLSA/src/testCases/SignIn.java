package testCases;

import org.testng.Assert;

import pageObjects.Home_Page;
import pageObjects.LoggedIn_Page;
import utility.Constant;
import utility.Log;
import utility.Utils;

public class SignIn{
	public static void execute() throws Exception {
		Thread.sleep(1000);
		Utils.enterData(Home_Page.txtbx_Username(), Constant.Username);
		Utils.enterData(Home_Page.txtbx_Password(), Constant.Password); 
		Thread.sleep(3000);
		Home_Page.btn_Login().click();
		Assert.assertTrue(LoggedIn_Page.isLogoImageAvailable(),"'Login Failed'");
		Log.info("Login Success");
	}
}
