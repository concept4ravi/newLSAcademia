package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;
public class Home_Page extends BaseClass{
	private static WebElement element = null;

	public Home_Page(WebDriver driver){
		super(driver);
	}

	public static WebElement txtbx_Username() throws Exception{
		try{ 
			element = driver.findElement(By.id("userName"));
			Log.info("Username text box is found on the Home Page");
		}catch (Exception e){
			Log.error("Username text box is not found on the Home Page");
			throw(e);
		}
		return element;
	}
	public static WebElement txtbx_Password() throws Exception{
		try{
			element = driver.findElement(By.id("password"));

			Log.info("Password Text box is found on the Home Page");
		}catch (Exception e){
			Log.error("Password Text box is not found on the Home Page");
			throw(e);
		}
		return element;
	}
	public static WebElement btn_Login() throws Exception{
		try{
			element = driver.findElement(By.id("loginSubmit"));

			Log.info("Login Button found on the Home Page");
		}catch (Exception e){
			Log.error("Login Button not found on the Home Page");
			throw(e);
		}
		return element;
	}
	public static void good() {
		try {
			
		}catch(Exception e) {
			
		}
	}
}
