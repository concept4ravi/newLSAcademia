package testCases.AcademicAdministration;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pageObjects.SidePanal;
import pageObjects.AcademicAdministration.AcademicStructure_Courses_Page;
import utility.Log;
import utility.Utils;

public class AcademicStructure_Courses_Add{
	public static void execute() throws Exception {

		SidePanal.lnk_AcademicStructure().click();
		Log.info("Academic Structure Link clicked");
		SidePanal.lnk_AcademicStructure_Courses().click();
		Log.info("Courses Link Clicked");
		ArrayList<WebElement> elements = (ArrayList<WebElement>)AcademicStructure_Courses_Page.returnList(By.cssSelector(".selectItemText"));
		new Select(elements.get(0)).selectByVisibleText("MBA Ent");
		Log.info("MBA Ent selected");
		Thread.sleep(2000);
		AcademicStructure_Courses_Page.btn_New().click();
		Log.info("New Button Clicked");
		Thread.sleep(2000);
		new Select(elements.get(1)).selectByVisibleText("abc");
		Log.info("Inventory Type");
		new Select(elements.get(2)).selectByVisibleText("abc");
		Log.info("Reappear Inventory Type");
		new Select(elements.get(3)).selectByVisibleText("abc");
		Log.info("Repeat Inventory Type");
		new Select(elements.get(4)).selectByVisibleText("Graduation");
		Log.info("Subject Level Entered");
		Utils.enterData(AcademicStructure_Courses_Page.txtbx_ShortName(),"ad");
		Log.info("ShortName Entered");
		Utils.enterData(AcademicStructure_Courses_Page.txtbx_Name(),"abcd");
		Log.info("Name Entered");
		Utils.enterData(AcademicStructure_Courses_Page.txtbx_SubjectCode(),"1111");
		Log.info("Subject Code Entered");
		Utils.scrollByVisibleElement(elements.get(5));
		new Select(elements.get(5)).selectByVisibleText("CREDIT");
		Log.info("Choice Type");
		Utils.enterData(AcademicStructure_Courses_Page.txtbx_Credits(),"4");
		Log.info("Credit Entered");
		AcademicStructure_Courses_Page.btn_Submit().click();


		Log.info("Record Added Successfully.");
		Thread.sleep(2000);
		Utils.btn_TabClose().click();
		Log.info("Tab Closed");

	}
}

