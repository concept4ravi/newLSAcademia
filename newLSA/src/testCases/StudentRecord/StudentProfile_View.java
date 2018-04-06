package testCases.StudentRecord;

import pageObjects.SidePanal;
import pageObjects.StudentRecord.StudentProfile_Page;
import utility.Log;
import utility.Utils;

public class StudentProfile_View{
	public static void execute() throws Exception {
		SidePanal.lnk_StudentProfile().click();
		Thread.sleep(2000);
		Utils.enterData(StudentProfile_Page.txtbx_StudentIdModalDialog(), "test");
		Thread.sleep(2000);
		StudentProfile_Page.btn_View_Modal().click();
		Thread.sleep(2000);
		
		Utils.btn_TabClose().click();
		Log.info("Tab Closed");
	}
}
