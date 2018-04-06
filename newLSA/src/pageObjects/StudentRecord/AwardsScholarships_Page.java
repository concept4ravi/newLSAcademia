package pageObjects.StudentRecord;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
public class AwardsScholarships_Page extends BaseClass{
	private static WebElement element = null;

	public AwardsScholarships_Page(WebDriver driver){
		super(driver);
	}
	
	public static WebElement txtbx_StudentId() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//input[@tabindex='12']"));
			Log.info("'StudentId' text box is found on AwardsScholarships Page");
		}catch (Exception e){
			Log.error("'StudentId' text box is not found on AwardsScholarships Page");
			throw(e);
		}
		return element;
	}
	public static WebElement txtbx_Amount() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//input[@maxlength='9']"));
			Log.info("'Amount' text box is found on AwardsScholarships Page");
		}catch (Exception e){
			Log.error("'Amount' text box is not found on AwardsScholarships Page");
			throw(e);
		}
		return element;
	}
	public static WebElement emptySpace() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//div[@style='top: 0px; left: 0px; overflow: auto; z-index: 0; margin: 0px; outline-style: none; width: 25%; height: 100%; vertical-align: top; display: inline-block; position: relative;']"));
			
		}catch (Exception e){
			
			throw(e);
		}
		return element;
	}
	public static WebElement btn_New() throws Exception{
		try{
			element = driver.findElement(By.xpath("//button[contains(.,'New')]"));
			Log.info("'New' Button found on AwardsScholarships Page");
		}catch (Exception e){
			Log.error("'New' Button not found on AwardsScholarships Page");
			throw(e);
		}
		return element;
	}
	public static List<WebElement> selectMulti_Prize() throws Exception{
		List<WebElement> elements;
		try{ 
			elements= driver.findElements(By.xpath("//select[@class='selectItemText']"));
			
		}catch (Exception e){
			
			throw(e);
		}
		return elements;
	}
	public static List<WebElement> btnMulti_Delete() throws Exception{
		List<WebElement> elements;
		try{ 
			elements= driver.findElements(By.xpath("//a[contains(.,'Delete')]"));
			
		}catch (Exception e){
			
			throw(e);
		}
		return elements;
	}
	public static List<WebElement> selectMulti_Date() throws Exception{
		List<WebElement> elements;
		try{ 
			elements= driver.findElements(By.xpath("//input[@class='gwt-DateBox']"));
			
		}catch (Exception e){
			
			throw(e);
		}
		return elements;
	}
	public static WebElement btn_Submit() throws Exception{
		try{
			element = driver.findElement(By.xpath("//button[contains(@accesskey,'S')]"));
			Log.info("'Submit' Button found on AwardsScholarships Page");
		}catch (Exception e){
			Log.error("'Submit' Button not found on AwardsScholarships Page");
			throw(e);
		}
		return element;
	}
	
}
