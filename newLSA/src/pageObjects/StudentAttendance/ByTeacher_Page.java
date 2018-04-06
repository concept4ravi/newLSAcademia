package pageObjects.StudentAttendance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
public class ByTeacher_Page extends BaseClass{
	private static WebElement element = null;
	public ByTeacher_Page(WebDriver driver){
		super(driver);
	} 
	public static WebElement select_Section() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//select[@tabindex='9']"));
			Log.info("'Section' is found on the ByTeacher_Page");
		}catch (Exception e){
			Log.error("'Section' is not found on the ByTeacher_Page");
			throw(e);
		}
		return element;
	}
	public static WebElement select_Activity() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//select[@tabindex='21']"));
			Log.info("'Activity' is found on the ByTeacher_Page");
		}catch (Exception e){
			Log.error("'Activity' is not found on the ByTeacher_Page");
			throw(e);
		}
		return element;
	}
	public static WebElement select_Hours() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//div[@class='pickerIconStyle']"));
			Log.info("'Hours' is found on the ByTeacher_Page");
		}catch (Exception e){
			Log.error("'Hours' is not found on the ByTeacher_Page");
			throw(e);
		}
		return element;
	}
	public static WebElement btn_MarkAttendence() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//button[contains(text(),'Mark Attendance')]"));
			Log.info("'Mark Attendence' is found on the ByTeacher_Page");
		}catch (Exception e){
			Log.error("'Mark Attendence' is not found on the ByTeacher_Page");
			throw(e);
		}
		return element;
	}
	public static WebElement btn_MarkAllPresent() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//button[contains(text(),'Mark All Present')]"));
			Log.info("'Mark All Present' is found on the ByTeacher_Page");
		}catch (Exception e){
			Log.error("'Mark All Present' is not found on the ByTeacher_Page");
			throw(e);
		}
		return element;
	}
	
}
