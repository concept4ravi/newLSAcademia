 package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;
public class SidePanal extends BaseClass{
	private static WebElement element = null;

	public SidePanal(WebDriver driver){
		super(driver);
	} 

	public static WebElement lnk_Academics() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("(//a[contains(text(),'Academics')])[2]"));
			Log.info("'Academics' link is found on the SidePanel");
		}catch (Exception e){
			Log.error("'Academics' link is not found on the SidePanel");
			throw(e);
		}
		return element;
	}
	public static WebElement lnk_ByTeacher() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//div[contains(text(),'By Teacher')]"));
			Log.info("'Academics' link is found on the SidePanel");
		}catch (Exception e){
			Log.error("'Academics' link is not found on the SidePanel");
			throw(e);
		}
		return element;
	}
	public static WebElement lnk_StudentAttendence() throws Exception{
		try{ 
			element = driver.findElements(By.xpath("//a[contains(text(),'Student Attendance')]")).get(0);
			Log.info("'Academics' link is found on the SidePanel");
		}catch (Exception e){
			Log.error("'Academics' link is not found on the SidePanel");
			throw(e);
		}
		return element;
	}
	public static WebElement lnk_ByTeacherMultiDate() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//div[contains(text(),'By Teacher Multiple Dates')]"));
			Log.info("'By Teacher Multiple Dates' link is found on the SidePanel");
		}catch (Exception e){
			Log.error("'By Teacher Multiple Dates' link is not found on the SidePanel");
			throw(e);
		}
		return element;
	}	
	public static WebElement lnk_MarkAttendence() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//div[contains(text(),'Mark Attendance')]"));
			Log.info("'Academics' link is found on the SidePanel");
		}catch (Exception e){
			Log.error("'Academics' link is not found on the SidePanel");
			throw(e);
		}
		return element;
	}
	public static WebElement lnk_AcademicsAdministration() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//a[contains(text(),'Academic Administration')]"));
			Log.info("'Academics Administration' link is found on the SidePanel");
		}catch (Exception e){
			Log.error("'Academics Administration' link is not found on the SidePanel");
			throw(e);
		}
		return element;
	}
	public static WebElement lnk_Leaves() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//div[contains(text(),'Leaves')]"));
			Log.info("'Leaves' link is found on the SidePanel");
		}catch (Exception e){
			Log.error("'Leaves' link is not found on the SidePanel");
			throw(e);
		}
		return element;
	}
	public static WebElement lnk_Registration() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//div[contains(text(),'Registration')]"));
			Log.info("'Registration' link is found on the SidePanel");
		}catch (Exception e){
			Log.error("'Registration' link is not found on the SidePanel");
			throw(e);
		}
		return element;
	}
	public static WebElement lnk_Registration_InitiateProcess() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//div[contains(text(),'Initiate Process')]"));
			Log.info("'Initiate Process' link is found on the SidePanel");
		}catch (Exception e){
			Log.error("'Initiate Process' link is not found on the SidePanel");
			throw(e);
		}
		return element;
	}
	public static WebElement lnk_Registration_InitiateProcess_DefSessYear() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//div[contains(text(),'Define Session in Year')]"));
			Log.info("'Define Session in Year' link is found on the SidePanel");
		}catch (Exception e){
			Log.error("'Define Session in Year' link is not found on the SidePanel");
			throw(e);
		}
		return element;
	}
	public static WebElement lnk_Registration_InitiateProcess_SubRegRule() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//div[contains(text(),'Subject Register Rules')]"));
			Log.info("'Subject Register Rules' link is found on the SidePanel");
		}catch (Exception e){
			Log.error("'Subject Register Rules' link is not found on the SidePanel");
			throw(e);
		}
		return element;
	}
	public static WebElement lnk_Sections() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//div[contains(text(),'Sections')]"));
			Log.info("'Academics' link is found on the SidePanel");
		}catch (Exception e){
			Log.error("'Academics' link is not found on the SidePanel");
			throw(e);
		}
		return element;
	}
	public static WebElement lnk_DefineSections() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//div[contains(text(),'Define sections')]"));
			Log.info("'Define sections' link is found on the SidePanel");
		}catch (Exception e){
			Log.error("'Define sections' link is not found on the SidePanel");
			throw(e);
		}
		return element;
	}
	public static WebElement lnk_Programs() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//div[contains(text(),'Programs')]"));
			Log.info("'Academics' link is found on the SidePanel");
		}catch (Exception e){
			Log.error("'Academics' link is not found on the SidePanel");
			throw(e);
		}
		return element;
	}
	public static WebElement lnk_AcademicStructure() throws Exception{
		try{
			
			element = driver.findElements(By.xpath("//div[contains(text(),'Academic')]")).get(0);
			Log.info("'Academics' link is found on the SidePanel");
		}catch (Exception e){
			Log.error("'Academics' link is not found on the SidePanel");
			throw(e);
		}
		return element;
	}
	
	public static WebElement lnk_AcademicStructure_Courses() throws Exception{
		try{
			
			element = driver.findElements(By.xpath("//div[contains(text(),'Courses')]")).get(0);
			Log.info("'Courses' link is found on the SidePanel");
		}catch (Exception e){
			Log.error("'Courses' link is not found on the SidePanel");
			throw(e);
		}
		return element;
	}

	public static WebElement lnk_StudentRecord() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//a[contains(text(),'Student Record')]"));
			Log.info("'Student Record' link is found on the SidePanel");
		}catch (Exception e){
			Log.error("'Student Record' link is not found on the SidePanel");
			throw(e);
		}
		return element;
	}
	public static WebElement lnk_NotingOnStudents() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//div[contains(text(),'Noting on students')]"));
			Log.info("'Noting on students' link is found on the SidePanel");
		}catch (Exception e){
			Log.error("'Noting on students' link is not found on the SidePanel");
			throw(e);
		}
		return element;
	}
	public static WebElement lnk_DocumentMonitoring() throws Exception{
		try{ 
			element=driver.findElement(By.xpath("//div[contains(text(),'Document Monitoring')]"));
			Log.info("'Document Monitoring' link is found on the SidePanel");
		}catch (Exception e){
			Log.error("'Document Monitoring' link is not found on the SidePanel");
			throw(e);
		}
		return element;
	}
	public static WebElement lnk_MaintainDocumentList() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//div[contains(text(),'Maintain Document List')]"));
			Log.info("'Maintain Document List' link is found on the SidePanel");
		}catch (Exception e){
			Log.error("'Maintain Document List' link is not found on the SidePanel");
			throw(e);
		}
		return element;
	}
	public static WebElement lnk_MaintainDocument() throws Exception{
		try{ 
			element = driver.findElements(By.xpath("//div[contains(text(),'Maintain Document')]")).get(1);
			Log.info("'Maintain Document' link is found on the SidePanel");
		}catch (Exception e){
			Log.error("'Maintain Document' link is not found on the SidePanel");
			throw(e);
		}
		return element;
	}
	public static WebElement lnk_StudentProfile() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//body[@id='mainBody']/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[3]/div/table/tbody/tr/td/table/tbody/tr/td/div/div"));
			Log.info("'StudentProfile' link is found on the SidePanel");
		}catch (Exception e){
			Log.error("'StudentProfile' link is not found on the SidePanel");
			throw(e);
		}
		return element;
	}
	public static WebElement lnk_StudentUpdates() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//div[contains(text(),'Student Updates')]"));
			Log.info("'Student Updates' link is found on the SidePanel");
		}catch (Exception e){
			Log.error("'Student Updates' link is not found on the SidePanel");
			throw(e);
		}
		return element;
	}
	public static WebElement lnk_ChangeStudentId() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//div[contains(text(),'Change Student ID')]"));
			Log.info("'Change Student ID' link is found on the SidePanel");
		}catch (Exception e){
			Log.error("'Change Student ID' link is not found on the SidePanel");
			throw(e);

		}
		return element;
	}
	public static WebElement lnk_ChangeSpecialization() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//div[contains(text(),'Change Specialization')]"));
			Log.info("'Change Specialization' link is found on the SidePanel");
		}catch (Exception e){
			Log.error("'Change Specialization' link is not found on the SidePanel");
			throw(e);
		}
		return element;
	}

	public static WebElement lnk_DisciplinaryCases() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//div[contains(text(),'Disciplinary Cases')]"));
			Log.info("'Disciplinary Cases' link is found on the SidePanel");
		}catch (Exception e){
			Log.error("'Disciplinary Cases' link is not found on the SidePanel");
			throw(e);
		}
		return element;
	}
	public static WebElement lnk_AwardsScholarships() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//div[contains(text(),'Awards / Scholarships')]"));
			Log.info("'Awards / Scholarships' link is found on the SidePanel");
		}catch (Exception e){
			Log.error("'Awards / Scholarships' link is not found on the SidePanel");
			throw(e);
		}
		return element;
	}
	public static WebElement lnk_CoursewiseDetailReport() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//div[contains(text(),'Coursewise Detail Report')]"));
			Log.info("'Coursewise Detail Report' link is found on the SidePanel");
		}catch (Exception e){
			Log.error("'Coursewise Detail Report' link is not found on the SidePanel");
			throw(e);
		}
		return element;
	}


	
}
