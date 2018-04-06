package pageObjects.StudentAttendance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;
public class ByTeacherMultiDate_Page extends ByTeacher_Page{
	private static WebElement element = null;
	public ByTeacherMultiDate_Page(WebDriver driver){
		super(driver);
	} 
	public static WebElement btn_AddNewHeader() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//a[contains(text(),'Add new Header')]"));
			Log.info("'Add new Header' is found on the ByTeacherMultiDate_Page");
		}catch (Exception e){
			Log.error("'Add new Header' is not found on the ByTeacherMultiDate_Page");
			throw(e);
		}
		return element;
	}
	public static WebElement btn_RemoveHeader() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//a[contains(text(),'Remove Header')]"));
			Log.info("'Remove Header' is found on the ByTeacherMultiDate_Page");
		}catch (Exception e){
			Log.error("'Remove Header' is not found on the ByTeacherMultiDate_Page");
			throw(e);
		}
		return element;
	}
	public static WebElement btn_MarkAllHeaderPresent() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//button[contains(text(),'Mark all Header  Present')]"));
			Log.info("'Mark all Header Present' is found on the ByTeacherMultiDate_Page");
		}catch (Exception e){
			Log.error("'Mark all Header Present' is not found on the ByTeacherMultiDate_Page");
			throw(e);
		}
		return element;
	}
	public static WebElement txt_Date() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//input[@class='gwt-DateBox']"));
			Log.info("'Date' is found on the ByTeacherMultiDate_Page");
		}catch (Exception e){
			Log.error("'Date' is not found on the ByTeacherMultiDate_Page");
			throw(e);
		}
		return element;
	}
	public static WebElement btn_AddDate() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//button[contains(text(),'Add Date')]"));
			Log.info("'Add Date' is found on the ByTeacherMultiDate_Page");
		}catch (Exception e){
			Log.error("'Add Date' is not found on the ByTeacherMultiDate_Page");
			throw(e);
		}
		return element;
	}
}
