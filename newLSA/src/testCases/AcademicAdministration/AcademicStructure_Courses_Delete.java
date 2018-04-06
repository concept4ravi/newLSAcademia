package testCases.AcademicAdministration;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pageObjects.SidePanal;
import pageObjects.AcademicAdministration.AcademicStructure_Courses_Page;
import utility.Log;
import utility.Utils;

public class AcademicStructure_Courses_Delete{
	public static void execute() throws Exception {

		SidePanal.lnk_AcademicStructure().click();
		Log.info("Academic Structure Link clicked");
		SidePanal.lnk_AcademicStructure_Courses().click();
		Log.info("Courses Link Clicked");
		ArrayList<WebElement> elements = (ArrayList<WebElement>)AcademicStructure_Courses_Page.returnList(By.cssSelector(".selectItemText"));
		new Select(elements.get(0)).selectByVisibleText("MBA Ent");
		Log.info("MBA Ent selected");
		Thread.sleep(2000);
		WebElement e = AcademicStructure_Courses_Page.returnElement(By.xpath("//input[@value='abcd']"));
		e.click();
		Log.info("abcd Clicked");
		Thread.sleep(1000);
		Utils.scrollByVisibleElement(AcademicStructure_Courses_Page.btn_Delete());
		AcademicStructure_Courses_Page.btn_Delete().click();
		Thread.sleep(1000);
		AcademicStructure_Courses_Page.btn_Ok().click();
		
		Log.info("Record Added Successfully.");
		Thread.sleep(2000);
		Utils.btn_TabClose().click();
		Log.info("Tab Closed");

	}
}

