package pageObjects.AcademicAdministration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
public class CoursewiseDetailReport_Page extends BaseClass{
	private static WebElement element = null;

	public CoursewiseDetailReport_Page(WebDriver driver){
		super(driver);
	} 
	
	public static WebElement select_Year() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("//select[@tabindex='3']"));
			Log.info("'Year/Sem' is found on the Courses Page");
		}catch (Exception e){
			Log.error("'Year/Sem' is not found on the Courses Page");
			throw(e);
		}
		return element;
	}
	
}
