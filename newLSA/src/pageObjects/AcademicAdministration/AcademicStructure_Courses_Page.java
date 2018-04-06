package pageObjects.AcademicAdministration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
public class AcademicStructure_Courses_Page extends BaseClass{
	private static WebElement element = null;

	public AcademicStructure_Courses_Page(WebDriver driver){
		super(driver);
	} 
	
	
	
	
	
	
	
	
	
	
	public static WebElement txtbx_ShortName() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//input[@tabindex='7']"));
			Log.info("'ShortName' is found on the Courses Page");
		}catch (Exception e){
			Log.error("'ShortName' is not found on the Courses Page");
			throw(e);
		}
		return element;
	}

	public static WebElement txtbx_Name() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//input[@tabindex='9']"));
			Log.info("'Name' is found on the Courses Page");
		}catch (Exception e){
			Log.error("'Name' is not found on the Courses Page");
			throw(e);
		}
		return element;
	}
	public static WebElement txtbx_SubjectCode() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//input[@tabindex='11']"));
			Log.info("'SubjectCode' is found on the Courses Page");
		}catch (Exception e){
			Log.error("'SubjectCode' is not found on the Courses Page");
			throw(e);
		}
		return element;
	}
	public static WebElement txtbx_RptOrder() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//input[@tabindex='13']"));
			Log.info("'RptOrder' is found on the Courses Page");
		}catch (Exception e){
			Log.error("'RptOrder' is not found on the Courses Page");
			throw(e);
		}
		return element;
	}
	public static WebElement txtbx_Credits() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//input[@tabindex='24']"));
			Log.info("'Credits' is found on the Courses Page");
		}catch (Exception e){
			Log.error("'Credits' is not found on the Courses Page");
			throw(e);
		}
		return element;
	}
	

}
