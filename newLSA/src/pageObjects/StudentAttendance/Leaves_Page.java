package pageObjects.StudentAttendance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
public class Leaves_Page extends BaseClass{
	private static WebElement element = null;

	public Leaves_Page(WebDriver driver){
		super(driver);
	} 
	
	
	
	
	
	
	
	
	
	
	public static WebElement select_Session() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//select[@tabindex='0']"));
			Log.info("'Session' is found on the Leaves_Page");
		}catch (Exception e){
			Log.error("'Session' is not found on the Leaves_Page");
			throw(e);
		}
		return element;
	}
	public static WebElement lnk_ShowData() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//a[contains(text(),'Show Data')]"));
			Log.info("'Show Data' is found on the ByTeacher_Page");
		}catch (Exception e){
			Log.error("'Show Data' is not found on the ByTeacher_Page");
			throw(e);
		}
		return element;
	}
	
}
