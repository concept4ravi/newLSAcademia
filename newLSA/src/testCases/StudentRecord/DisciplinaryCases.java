package testCases.StudentRecord;

import org.openqa.selenium.support.ui.Select;

import pageObjects.SidePanal;
import pageObjects.StudentRecord.DisciplinaryCases_Page;
import utility.Log;
import utility.Utils;

public class DisciplinaryCases{
	public static void execute() throws Exception {
		SidePanal.lnk_StudentUpdates().click();
		Log.info("StudentUpdates");
		SidePanal.lnk_DisciplinaryCases().click();
		Log.info("DisciplinaryCases");
		Utils.enterData(DisciplinaryCases_Page.txtbx_StudentId(),"test");
		Log.info("StudentId Entered");
		DisciplinaryCases_Page.txtbx_Name().click();
		Thread.sleep(2000);
		DisciplinaryCases_Page.btn_New().click();
		new Select(DisciplinaryCases_Page.select_CaseType()).selectByVisibleText("Cheating");
		Thread.sleep(2000);
		Utils.enterData(DisciplinaryCases_Page.txtbx_CaseNo(),"000011");
		Thread.sleep(2000);
		new Select(DisciplinaryCases_Page.select_ActionTaken()).selectByVisibleText("FIR");
		Thread.sleep(2000);
		DisciplinaryCases_Page.btn_Submit().click();
		Thread.sleep(2000);
		/*boolean check = MaintainDocumentList_Page.lbl_ItemInfoMsg().getText().contains("Record(s) Updated Successfully.");
		Assert.assertTrue(check, "Duplicate Record Found");
		Log.info("Record Added Successfully.");*/
		Utils.btn_TabClose().click();
		Log.info("Tab Closed");
	}
}
