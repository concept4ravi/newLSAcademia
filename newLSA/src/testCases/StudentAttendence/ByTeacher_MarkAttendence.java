package testCases.StudentAttendence;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pageObjects.SidePanal;
import pageObjects.AcademicAdministration.AcademicStructure_Courses_Page;
import pageObjects.StudentAttendance.ByTeacher_Page;
import utility.Log;
import utility.Utils;

public class ByTeacher_MarkAttendence{
	public static void execute() throws Exception {
		SidePanal.lnk_MarkAttendence().click();
		Log.info("Mark Attendence Link clicked");
		SidePanal.lnk_ByTeacher().click();
		Log.info("By Teacher Link Clicked");
		new Select(ByTeacher_Page.select_Section()).selectByIndex(1);
		new Select(ByTeacher_Page.select_Activity()).selectByVisibleText("Theory");
		ByTeacher_Page.select_Hours().click();
		ArrayList<WebElement> elements = (ArrayList<WebElement>)AcademicStructure_Courses_Page.returnList(By.xpath("//input[@type='checkbox']"));
		Thread.sleep(2000);
		elements.get(2).click();
		ByTeacher_Page.btn_MarkAttendence().click();
		Thread.sleep(3000);
		ByTeacher_Page.btn_MarkAllPresent().click();
		Thread.sleep(1000);
		ByTeacher_Page.btn_Submit().click();
		Thread.sleep(1000);
		ByTeacher_Page.btn_Ok().click();
		Thread.sleep(5000);
		Log.info("Record Added Successfully.");
		Thread.sleep(2000);
		Utils.btn_TabClose().click();
		Log.info("Tab Closed");
	}
}

