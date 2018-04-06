package testCases.AcademicAdministration;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pageObjects.SidePanal;
import pageObjects.AcademicAdministration.AcademicStructure_Courses_Page;
import pageObjects.AcademicAdministration.CoursewiseDetailReport_Page;
import utility.Log;
import utility.Utils;

public class CoursewiseDetailReport{
	public static void execute() throws Exception {

		ArrayList<WebElement> elements = (ArrayList<WebElement>)AcademicStructure_Courses_Page.returnList(By.xpath("//div[contains(text(),'Reports')]"));
		elements.get(0).click();
		Log.info("Reports Clicked");
		SidePanal.lnk_CoursewiseDetailReport().click();
		Log.info("CoursewiseDetailReport Clicked");
		Thread.sleep(2000);
		new Select(CoursewiseDetailReport_Page.select_Year()).selectByVisibleText("Semester 1");
		Log.info("Year Selected");
		int prevCount = CoursewiseDetailReport_Page.returnList(By.id("downloadLink")).size();
		Thread.sleep(2000);
		CoursewiseDetailReport_Page.btn_View().click();
		Thread.sleep(2000);
		CoursewiseDetailReport_Page.btn_Submit().click();
		Thread.sleep(2000);
		int newCount = CoursewiseDetailReport_Page.returnList(By.id("downloadLink")).size();
		
		
		if(newCount==(prevCount+1))
			Log.info("PDF Generated Successfully.");
		else Log.info("PDF Not Generated.");
		Thread.sleep(2000);
		Utils.btn_TabClose().click();
		Utils.btn_TabClose().click();
		Log.info("Tab Closed");

	}
}

