package pageObjects.StudentRecord;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
public class DisciplinaryCases_Page extends BaseClass{
	private static WebElement element = null;

	public DisciplinaryCases_Page(WebDriver driver){
		super(driver);
	}
	
	public static WebElement txtbx_StudentId() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//input[@tabindex='8']"));
			Log.info("'StudentId' text box is found on DisciplinaryCases Page");
		}catch (Exception e){
			Log.error("'StudentId' text box is not found on DisciplinaryCases Page");
			throw(e);
		}
		return element;
	}
	public static WebElement txtbx_Name() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//input[@tabindex='11']"));
			Log.info("'Name' text box is found on DisciplinaryCases Page");
		}catch (Exception e){
			Log.error("'Name' text box is not found on DisciplinaryCases Page");
			throw(e);
		}
		return element;
	}
	public static WebElement txtbx_CaseNo() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//input[@tabindex='15']"));
			Log.info("'CaseNo' text box is found on DisciplinaryCases Page");
		}catch (Exception e){
			Log.error("'CaseNo' text box is not found on DisciplinaryCases Page");
			throw(e);
		}
		return element;
	}
	public static WebElement select_CaseType() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//select[@tabindex='0']"));
			Log.info("'CaseType' is found on DisciplinaryCases Page");
		}catch (Exception e){
			Log.error("'CaseType' is not found on DisciplinaryCases Page");
			throw(e);
		}
		return element;
	}
	public static WebElement select_ActionTaken() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//select[@tabindex='33']"));
			Log.info("'ActionTaken' is found on DisciplinaryCases Page");
		}catch (Exception e){
			Log.error("'ActionTaken' is not found on DisciplinaryCases Page");
			throw(e);
		}
		return element;
	}
		
}
