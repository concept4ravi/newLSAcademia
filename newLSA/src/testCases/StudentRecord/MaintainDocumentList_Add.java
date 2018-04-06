package testCases.StudentRecord;

import pageObjects.SidePanal;
import pageObjects.StudentRecord.MaintainDocumentList_Page;
import utility.Log;
import utility.Utils;

public class MaintainDocumentList_Add{
	public static void execute() throws Exception {
		SidePanal.lnk_DocumentMonitoring().click();
		Log.info("DocumentMonitoring");
		SidePanal.lnk_MaintainDocumentList().click();
		Log.info("MaintainDocumentList");
		MaintainDocumentList_Page.lnk_AddRow().click();
		Log.info("AddRow");
		Utils.enterData(MaintainDocumentList_Page.txtbx_DocumentDescription(),"Document1");
		Log.info("Document Name Entered");
		MaintainDocumentList_Page.btn_Submit().click();
		Log.info("Submit Button Clicked");
		
		Log.info("Record Added Successfully.");
		Thread.sleep(2000);
		Utils.btn_TabClose().click();
		Log.info("Tab Closed");
	}
}
