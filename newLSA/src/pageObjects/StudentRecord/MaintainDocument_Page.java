package pageObjects.StudentRecord;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
public class MaintainDocument_Page extends BaseClass{
	private static WebElement element = null;

	public MaintainDocument_Page(WebDriver driver){
		super(driver);
	}
	public static WebElement txtbx_StudentId() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//input[@tabindex='3']"));
			Log.info("'Student Id' is found on the MaintainDocument Page");
		}catch (Exception e){
			Log.error("'Student Id' is not found on the MaintainDocument Page");
			throw(e);
		}
		return element;
	}
	public static WebElement lnk_SelectAll() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//a[contains(text(),'Select ALL')]"));
			Log.info("'Select ALL' Link is found on the MaintainDocument Page");
		}catch (Exception e){
			Log.error("'Select ALL' Link is not found on the MaintainDocument Page");
			throw(e);
		}
		return element;
	}
	
	public static WebElement txtbx_DocumentDescription() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//input[@value='']"));
			Log.info("'DocumentDescription' Text Box is found on the MaintainDocument Page");
		}catch (Exception e){
			Log.error("'DocumentDescription' Text Box is not found on the MaintainDocument Page");
			throw(e);
		}
		return element;
	}

	public static WebElement emptySpace() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//div[@class='layoutAlignLeft isBorderBoxed']"));
			
		}catch (Exception e){
			
			throw(e);
		}
		return element;
	}
}
