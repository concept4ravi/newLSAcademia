package pageObjects.StudentRecord;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
public class MaintainDocumentList_Page extends BaseClass{
	private static WebElement element = null;

	public MaintainDocumentList_Page(WebDriver driver){
		super(driver);
	}
	
	public static WebElement lnk_AddRow() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//a[contains(text(),'Add Row')]"));
			Log.info("'AddRow' Link is found on the MaintainDocumentList Page");
		}catch (Exception e){
			Log.error("'AddRow' Link is not found on the MaintainDocumentList Page");
			throw(e);
		}
		return element;
	}
	
	public static WebElement txtbx_DocumentDescription() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//input[@value='']"));
			Log.info("'DocumentDescription' Text Box is found on the MaintainDocumentList Page");
		}catch (Exception e){
			Log.error("'DocumentDescription' Text Box is not found on the MaintainDocumentList Page");
			throw(e);
		}
		return element;
	}

}
