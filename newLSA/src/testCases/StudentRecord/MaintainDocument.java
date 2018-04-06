package testCases.StudentRecord;

import pageObjects.SidePanal;
import pageObjects.StudentRecord.MaintainDocument_Page;
import utility.Log;
import utility.Utils;

public class MaintainDocument{
	public static void execute() throws Exception {
		SidePanal.lnk_DocumentMonitoring().click();
		Log.info("DocumentMonitoring Clicked");
		SidePanal.lnk_MaintainDocument().click();
		Log.info("MaintainDocument Clicked");
		Utils.enterData(MaintainDocument_Page.txtbx_StudentId(),"test");
		Log.info("Student Id Entered");
		MaintainDocument_Page.emptySpace().click();
		Log.info("Empty Space Clicked");
		MaintainDocument_Page.lnk_SelectAll().click();
		Log.info("Select All Clicked");
		
		MaintainDocument_Page.btn_Submit().click();
		Log.info("Submit Button Clicked");
		/*boolean check = MaintainDocumentList_Page.lbl_ItemInfoMsg().getText().contains("Record(s) Updated Successfully.");
		Assert.assertTrue(check, "Duplicate Record Found");
		Log.info("Record Added Successfully.");*/
		Thread.sleep(2000);
		Utils.btn_TabClose().click();
		Log.info("Tab Closed");
	}
}
