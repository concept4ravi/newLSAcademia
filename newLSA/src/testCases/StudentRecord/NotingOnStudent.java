package testCases.StudentRecord;

import org.openqa.selenium.support.ui.Select;

import pageObjects.SidePanal;
import pageObjects.StudentRecord.NotingOnStudent_Page;
import utility.Log;
import utility.Utils;

public class NotingOnStudent{
	public static void execute() throws Exception {
		SidePanal.lnk_StudentUpdates().click();
		Log.info("StudentUpdates");
		SidePanal.lnk_NotingOnStudents().click();
		Log.info("Noting on students");
		Utils.enterData(NotingOnStudent_Page.txtbx_StudentId(),"test");
		Log.info("StudentId Entered");
		NotingOnStudent_Page.txtbx_Name().click();
		Thread.sleep(1000);
		NotingOnStudent_Page.btn_New().click();
		
		new Select(NotingOnStudent_Page.select_RemarkType()).selectByVisibleText("academic remark");
		
		Utils.enterData(NotingOnStudent_Page.txtbx_Remark(),"Remark");
		NotingOnStudent_Page.btn_Submit().click();
		/*boolean check = NotingOnStudent_Page.lbl_ItemInfoMsg().getText().contains("Database Updated");
		Assert.assertTrue(check, "Duplicate Record Found");
		Log.info("Record(s) Added Successfully.");*/
		Thread.sleep(2000);
		Utils.btn_TabClose().click();
		Log.info("Tab Closed");
	}
}
