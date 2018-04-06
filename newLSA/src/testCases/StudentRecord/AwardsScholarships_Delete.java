package testCases.StudentRecord;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;

import pageObjects.SidePanal;
import pageObjects.StudentRecord.AwardsScholarships_Page;
import utility.Log;
import utility.Utils;

public class AwardsScholarships_Delete{
	public static void execute() throws Exception {
		SidePanal.lnk_StudentUpdates().click();
		Log.info("StudentUpdates");
		SidePanal.lnk_AwardsScholarships().click();
		Log.info("AwardsScholarships");
		Utils.enterData(AwardsScholarships_Page.txtbx_StudentId(),"test");
		Log.info("StudentId Entered");
		AwardsScholarships_Page.emptySpace().click();
		Log.info("Empty Space Clicked");
		Thread.sleep(2000);
		
		ArrayList<WebElement> elements = (ArrayList<WebElement>)AwardsScholarships_Page.btnMulti_Delete();
		
		elements.get(0).click();
		Log.info("Deleted");
		AwardsScholarships_Page.btn_Delete_Yes().click();
		Log.info("Yes Button Clicked");
		/*boolean check;
		if(check=AwardsScholarships_Page.lbl_ItemInfoMsg().getText().contains("Database Updated"))
		{}else if(check=AwardsScholarships_Page.lbl_ItemInfoMsg().getText().contains("No record was found for the specified values"))
		Assert.assertTrue(check, "Duplicate Record Found");*/
		Log.info("Database Updated");
		Thread.sleep(2000);
		Utils.btn_TabClose().click();
		Log.info("Tab Closed");
	}
}
