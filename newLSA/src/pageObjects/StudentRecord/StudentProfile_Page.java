package pageObjects.StudentRecord;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
public class StudentProfile_Page extends BaseClass{
	private static WebElement element = null;

	public StudentProfile_Page(WebDriver driver){
		super(driver);
	} 
	public static WebElement txtbx_StudentIdModalDialog() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//input[@style='left: 0px; top: 0px; background-color: white; height: 25px; width: 175px; vertical-align: middle; text-align: left; position: relative;']"));
			Log.info("'Modal Dialog Student Id' is found on the StudentProfile Page");
		}catch (Exception e){
			Log.error("'Modal Dialog Student Id' is not found on the StudentProfile Page");
			throw(e);
		}
		return element;
	}
	
	public static boolean isLogoImageAvailable() throws Exception{
		try{ 
			driver.findElement(By.cssSelector(".logoImage"));
			Log.info("'LogoImage' is found on the StudentProfile_Page");
		}catch (Exception e){
			Log.error("'LogoImage' is not found on the StudentProfile_Page");
			return false;
		}
		return true;
	}
	public static WebElement txtbx_StudentId() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//input[@tabindex='4']"));
			Log.info("'StudentId' text box is found on the StudentProfile_Page");
		}catch (Exception e){
			Log.error("'StudentId' text box is not found on the StudentProfile_Page");
			throw(e);
		}
		return element;
	}
	public static WebElement txtbx_AddmisionDate() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//input[@tabindex='12']"));
			Log.info("'AddmisionDate' text box is found on the StudentProfile_Page");
		}catch (Exception e){
			Log.error("'AddmisionDate' text box is not found on the StudentProfile_Page");
			throw(e);
		}
		return element;
	}
	
	public static WebElement select_Campus() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//select[@tabindex='14']"));
			Log.info("'Campus' Select box is found on the StudentProfile_Page");
		}catch (Exception e){
			Log.error("'Campus' Select box is not found on the StudentProfile_Page");
			throw(e);
		}
		return element;
	}
	
	public static WebElement select_Programme() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//select[@tabindex='16']"));
			Log.info("'Programme' Select box is found on the StudentProfile_Page");
		}catch (Exception e){
			Log.error("'Programme' Select box is not found on the StudentProfile_Page");
			throw(e);
		}
		return element;
	}
	
	public static WebElement select_SessionJoined() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//select[@tabindex='18']"));
			Log.info("'SessionJoined' Select box is found on the StudentProfile_Page");
		}catch (Exception e){
			Log.error("'SessionJoined' Select box is not found on the StudentProfile_Page");
			throw(e);
		}
		return element;
	}
	
	public static WebElement select_Discipline() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//select[@tabindex='21']"));
			Log.info("'Discipline' Select box is found on the StudentProfile_Page");
		}catch (Exception e){
			Log.error("'Discipline' Select box is not found on the StudentProfile_Page");
			throw(e);
		}
		return element;
	}
	
	public static WebElement select_Semester() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//select[@tabindex='23']"));
			Log.info("'Semester' Select box is found on the StudentProfile_Page");
		}catch (Exception e){
			Log.error("'Semester' Select box is not found on the StudentProfile_Page");
			throw(e);
		}
		return element;
	}

	public static WebElement txtbx_DOB() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//input[@tabindex='37']"));
			Log.info("'DOB' text box is found on the StudentProfile_Page");
		}catch (Exception e){
			Log.error("'DOB' text box is not found on the StudentProfile_Page");
			throw(e);
		}
		return element;
	}
	/*public static WebElement select_Gender() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//select[@tabindex='23']"));
			Log.info("'Semester' Select box is found on the StudentProfile_Page");
		}catch (Exception e){
			Log.error("'Semester' Select box is not found on the StudentProfile_Page");
			throw(e);
		}
		return element;
	}*/

	public static WebElement txtbx_Email() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//input[@tabindex='45']"));
			Log.info("'Email' text box is found on the StudentProfile_Page");
		}catch (Exception e){
			Log.error("'Email' text box is not found on the StudentProfile_Page");
			throw(e);
		}
		return element;
	}
	
	
	public static WebElement txtbx_Mobile() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//input[@tabindex='49']"));
			Log.info("'Mobile No' text box is found on the StudentProfile_Page");
		}catch (Exception e){
			Log.error("'Mobile No' text box is not found on the StudentProfile_Page");
			throw(e);
		}
		return element;
	}
	
	
	public static WebElement txtbx_FirstName() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//input[@tabindex='27']"));
			Log.info("'First Name' text box is found on the LoggedIn Page");
		}catch (Exception e){
			Log.error("'First Name' text box is not found on the LoggedIn Page");
			throw(e);
		}
		return element;
	}
	
	
	public static List<WebElement> select_ExamList() throws Exception{
		List<WebElement> elements;
		try{ 
			elements= driver.findElements(By.xpath("//select[@style='width: 100%;']"));
			Log.info("'First Name' text box is found on the LoggedIn Page");
		}catch (Exception e){
			Log.error("'First Name' text box is not found on the LoggedIn Page");
			throw(e);
		}
		return elements;
	}
	
	/*
	public static boolean isApplicationFormAvailable() throws Exception{
		try{ 
			driver.findElement(By.id("Label140"));	// Application No. Label
			Log.info("Application Form available on the Home Page");
		}catch (Exception e){
			Log.error("Application Form not available on the Home Page on the Home Page");
			return false;
		}
		return true;
		
	}*/
	
	
	public static WebElement lbl_formLabel() throws Exception{
		try{ 
			element=driver.findElement(By.cssSelector(".formTitleLabel .titleBar"));	// Application No. Label
			
		}catch (Exception e){
			throw(e);
		}
		return element;
		
	}
	
	public static WebElement btn_View_Modal() throws Exception{
		try{
			element = driver.findElement(By.xpath("//button[contains(.,'View')]"));

			Log.info("'View' Button found on Modal on the StudentProfile Page");
		}catch (Exception e){
			Log.error("'View' Button not found on Modal on the StudentProfile Page");
			throw(e);
		}
		return element;
	}
	
	public static WebElement btn_Add_Modal() throws Exception{
		try{
			element = driver.findElement(By.xpath("//button[contains(.,'Add')]"));

			Log.info("'Add' Button found on Modal on the StudentProfile Page");
		}catch (Exception e){
			Log.error("'Add' Button not found on Modal on the StudentProfile Page");
			throw(e);
		}
		return element;
	}
	

}
