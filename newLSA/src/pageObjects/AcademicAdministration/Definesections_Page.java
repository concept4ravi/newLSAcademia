package pageObjects.AcademicAdministration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
public class Definesections_Page extends BaseClass{
	private static WebElement element = null;

	public Definesections_Page(WebDriver driver){
		super(driver);
	} 
	
	public static WebElement chkbx_SubjectLevel() throws Exception{
		try{ 
			element = driver.findElements(By.xpath("//input[contains(@name,'sel_defineStrtgy')]")).get(1);
			Log.info("'Subject Level' check box is found on the Define sections Page");
		}catch (Exception e){
			Log.error("'Subject Level' check box is not found on the Define sections Page");
			throw(e);
		}
		return element;
	}
	public static WebElement select_Subject() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//select[@tabindex='4']"));
			Log.info("'Subject' is found on the Define sections Page");
		}catch (Exception e){
			Log.error("'Subject Level' is not found on the Define sections Page");
			throw(e);
		}
		return element;
	}
	public static WebElement lnk_Show() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//a[contains(text(),'Show')]"));
			Log.info("'Show' link is found on the Define sections Page");
		}catch (Exception e){
			Log.error("'Show' Link is not found on the Define sections Page");
			throw(e);
		}
		return element;
	}
	public static WebElement txtbx_Section() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//input[@tabindex='50']"));
			Log.info("'Section' text box is found on the Define sections Page");
		}catch (Exception e){
			Log.error("'Section' text box  is not found on the Define sections Page");
			throw(e);
		}
		return element;
	}
	public static WebElement txtbx_Description() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//input[@tabindex='55']"));
			Log.info("'Description' text box is found on the Define sections Page");
		}catch (Exception e){
			Log.error("'Description' text box is not found on the Define sections Page");
			throw(e);
		}
		return element;
	}
	public static WebElement txtbx_MaxStudent() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//input[@tabindex='60']"));
			Log.info("'MaxStudent' text box is found on the Define sections Page");
		}catch (Exception e){
			Log.error("'MaxStudent' text box is not found on the Define sections Page");
			throw(e);
		}
		return element;
	}
}
