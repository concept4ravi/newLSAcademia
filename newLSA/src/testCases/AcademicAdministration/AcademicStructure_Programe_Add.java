package testCases.AcademicAdministration;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pageObjects.SidePanal;
import pageObjects.AcademicAdministration.AcademicStructure_Programe_Page;
import pageObjects.StudentRecord.AwardsScholarships_Page;
import utility.Log;
import utility.Utils;

public class AcademicStructure_Programe_Add{
	public static void execute() throws Exception {

		SidePanal.lnk_AcademicStructure().click();
		Log.info("Academic Structure Link clicked");
		SidePanal.lnk_Programs().click();
		Log.info("Programs Link Clicked");
		AcademicStructure_Programe_Page.btn_New().click();
		Log.info("New Button Clicked");
		Thread.sleep(2000);
		ArrayList<WebElement> elements = (ArrayList<WebElement>)AcademicStructure_Programe_Page.returnList(By.cssSelector(".textfieldStyle"));
		Utils.enterData(elements.get(1),"CS");
		Log.info("Programs Entered");
		Utils.enterData(elements.get(2),"Computer Science");
		Log.info("Full Name Entered");
		Utils.enterData(elements.get(5),"3");
		Log.info("Min Duration Entered");
		Utils.enterData(elements.get(6),"3");
		Log.info("Max Duration Entered");
		Utils.enterData(elements.get(7),"3");
		Log.info("Num Stage Entered");

		elements = (ArrayList<WebElement>)AcademicStructure_Programe_Page.returnList(By.cssSelector(".selectItemText"));
		new Select(elements.get(0)).selectByVisibleText("Graduation");
		new Select(elements.get(2)).selectByVisibleText("12th");
		
		Utils.scrollByVisibleElement(AwardsScholarships_Page.btn_Submit());
		AwardsScholarships_Page.btn_Submit().click();


		Log.info("Record Added Successfully.");
		Thread.sleep(2000);
		Utils.btn_TabClose().click();
		Log.info("Tab Closed");

	}
}

