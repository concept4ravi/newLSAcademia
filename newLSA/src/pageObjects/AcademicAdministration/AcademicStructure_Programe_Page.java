package pageObjects.AcademicAdministration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
public class AcademicStructure_Programe_Page extends BaseClass{
	private static WebElement element = null;

	public AcademicStructure_Programe_Page(WebDriver driver){
		super(driver);
	} 
	public static WebElement txtbx_StudentId() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//input[@tabindex='8']"));
			Log.info("'Student Id' is found on the NotingOnStudent Page");
		}catch (Exception e){
			Log.error("'Student Id' is not found on the NotingOnStudent Page");
			throw(e);
		}
		return element;
	}

	public static WebElement txtbx_Name() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//input[@tabindex='11']"));
			Log.info("'Name' text box is found on the NotingOnStudent Page");
		}catch (Exception e){
			Log.error("'Name' text box is not found on the NotingOnStudent Page");
			throw(e);
		}
		return element;
	}


	public static List<WebElement> txtbxMulti_AddProgrameForm() throws Exception{
		List<WebElement> elements;
		try{ 
			elements= driver.findElements(By.xpath("//input[@class='textfieldStyle textField']"));

		}catch (Exception e){

			throw(e);
		}
		return elements;
	}

	public static WebElement select_RemarkType() throws Exception{
		try{
			element = driver.findElement(By.xpath("//select[@class='selectItemText']"));

			Log.info("'Remark Type' drop-down found on the NotingOnStudent Page");
		}catch (Exception e){
			Log.error("'Remark Type' drop-down not found on the NotingOnStudent Page");
			throw(e);
		}
		return element;
	}

	public static WebElement txtbx_Remark() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//textarea[@tabindex='69']"));
			Log.info("'Remark' text box is found on the NotingOnStudent Page");
		}catch (Exception e){
			Log.error("'Remark' text box is not found on the NotingOnStudent Page");
			throw(e);
		}
		return element;
	}


}
