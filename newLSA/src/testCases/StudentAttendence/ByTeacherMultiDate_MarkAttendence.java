package testCases.StudentAttendence;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pageObjects.SidePanal;
import pageObjects.StudentAttendance.ByTeacherMultiDate_Page;
import pageObjects.StudentAttendance.ByTeacher_Page;
import utility.Log;
import utility.Utils;

public class ByTeacherMultiDate_MarkAttendence{
	public static void execute() throws Exception {
		SidePanal.lnk_MarkAttendence().click();
		Log.info("Mark Attendence Link clicked");
		SidePanal.lnk_ByTeacherMultiDate().click();
		Log.info("By Teacher Link Clicked");
		new Select(ByTeacherMultiDate_Page.select_Section()).selectByIndex(1);
		new Select(ByTeacherMultiDate_Page.select_Activity()).selectByVisibleText("Theory");
		Thread.sleep(1000);
		ByTeacherMultiDate_Page.select_Hours().click();
		Thread.sleep(2000);
		ArrayList<WebElement> elements = (ArrayList<WebElement>)ByTeacherMultiDate_Page.returnList(By.xpath("//input[@type='checkbox']"));
		elements.get(2).click();
		ByTeacherMultiDate_Page.btn_MarkAttendence().click();
		Thread.sleep(2000);
		ByTeacherMultiDate_Page.btn_AddNewHeader().click();
		Thread.sleep(2000);
		ByTeacherMultiDate_Page.txt_Date().sendKeys("28/03/2018"+Keys.ESCAPE);
		Thread.sleep(1000);
		ByTeacherMultiDate_Page.select_Hours().click();
		Thread.sleep(2000);
		elements = (ArrayList<WebElement>)ByTeacherMultiDate_Page.returnList(By.xpath("//input[@type='checkbox']"));
		elements.get(2).click();
		ByTeacherMultiDate_Page.returnElement(By.xpath("//div[contains(text(),'Select Date and Period')]")).click();
		Thread.sleep(1000);
		ByTeacherMultiDate_Page.btn_AddDate().click();
		Thread.sleep(2000);
		ByTeacherMultiDate_Page.btn_MarkAllHeaderPresent().click();
		Thread.sleep(2000);
		ByTeacherMultiDate_Page.btn_Ok().click();
		Thread.sleep(2000);
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

