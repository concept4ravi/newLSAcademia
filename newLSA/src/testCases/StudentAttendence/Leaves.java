package testCases.StudentAttendence;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pageObjects.SidePanal;
import pageObjects.AcademicAdministration.AcademicStructure_Courses_Page;
import pageObjects.StudentAttendance.ByTeacher_Page;
import pageObjects.StudentAttendance.Leaves_Page;
import utility.Log;
import utility.Utils;

public class Leaves{
	public static void execute() throws Exception {
		SidePanal.lnk_Leaves().click();
		Log.info("Leaves Link clicked");
		new Select(Leaves_Page.select_Session()).selectByVisibleText("2010");
		Leaves_Page.lnk_ShowData().click();
		Log.info("Show Data Link clicked");
		Thread.sleep(2000);
		Leaves_Page.lnk_AddRow().click();
		Log.info("Add-Row Link clicked");
		ArrayList<WebElement> elements = (ArrayList<WebElement>)AcademicStructure_Courses_Page.returnList(By.cssSelector(".selectItemText"));
		new Select(elements.get(1)).selectByVisibleText("casual");
		ByTeacher_Page.btn_MarkAttendence().click();
		Thread.sleep(3000);
		ByTeacher_Page.btn_Delete().click();
		Thread.sleep(1000);
		ByTeacher_Page.btn_Ok().click();
		Thread.sleep(5000);
		Log.info("Record Added Successfully.");
		Thread.sleep(2000);
		Utils.btn_TabClose().click();
		Log.info("Tab Closed");
	}
}

