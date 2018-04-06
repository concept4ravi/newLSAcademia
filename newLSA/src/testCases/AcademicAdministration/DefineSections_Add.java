package testCases.AcademicAdministration;

import org.openqa.selenium.support.ui.Select;

import pageObjects.SidePanal;
import pageObjects.AcademicAdministration.Definesections_Page;
import utility.Log;
import utility.Utils;

public class DefineSections_Add{
	public static void execute() throws Exception {

		SidePanal.lnk_Sections().click();
		Log.info("Sections Link clicked");
		SidePanal.lnk_DefineSections().click();
		Log.info("DefineSections Link clicked");
		Definesections_Page.chkbx_SubjectLevel().click();
		Log.info("SubjectLevel Checkbox Clicked");
		Thread.sleep(1000);
		new Select(Definesections_Page.select_Subject()).selectByVisibleText("Computer Graphics-Dept El-4");
		Log.info("Subject Selected");
		Thread.sleep(1000);
		Definesections_Page.lnk_Show().click();
		Log.info("Show Link Clicked");
		Thread.sleep(1000);
		Definesections_Page.btn_New().click();
		Log.info("New Button Clicked");
		Utils.enterData(Definesections_Page.txtbx_Section(), "B");
		Log.info("Section Entered");
		Utils.enterData(Definesections_Page.txtbx_Description(), "bbbb");
		Log.info("Description Entered");
		Utils.enterData(Definesections_Page.txtbx_MaxStudent(), "40s");
		Log.info("MaxStudent Entered");
		Definesections_Page.btn_Submit().click();
		Log.info("Record Added Successfully.");
		Thread.sleep(2000);
		Utils.btn_TabClose().click();
		Log.info("Tab Closed");
	}
}

