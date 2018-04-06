package testCases.StudentRecord;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import pageObjects.SidePanal;
import pageObjects.StudentRecord.AwardsScholarships_Page;
import pageObjects.StudentRecord.DisciplinaryCases_Page;
import pageObjects.StudentRecord.MaintainDocumentList_Page;
import utility.Log;
import utility.Utils;

public class AwardsScholarships_Add{
	public static void execute() throws Exception {
		SidePanal.lnk_StudentUpdates().click();
		Log.info("StudentUpdates");
		SidePanal.lnk_AwardsScholarships().click();
		Log.info("AwardsScholarships");
		Utils.enterData(AwardsScholarships_Page.txtbx_StudentId(),"test");
		Log.info("StudentId Entered");
		AwardsScholarships_Page.emptySpace().click();
		Thread.sleep(2000);
		DisciplinaryCases_Page.btn_New().click();
		ArrayList<WebElement> elements = (ArrayList<WebElement>)AwardsScholarships_Page.selectMulti_Prize();
		new Select(elements.get(0)).selectByVisibleText("Bronze Medalist");
		new Select(elements.get(1)).selectByVisibleText("Director");
		new Select(elements.get(2)).selectByVisibleText("Cash");
		elements.clear();
		elements = (ArrayList<WebElement>)AwardsScholarships_Page.selectMulti_Date();
		Thread.sleep(2000);
		elements.get(0).sendKeys("01/04/2018");
		Utils.enterData(AwardsScholarships_Page.txtbx_Amount(),"1000");
		AwardsScholarships_Page.btn_Submit().click();
		Thread.sleep(2000);
		AwardsScholarships_Page.btn_Ok().click();
		boolean check = MaintainDocumentList_Page.lbl_ItemInfoMsg().getText().contains("Database Updated");
		Assert.assertTrue(check, "Duplicate Record Found");
		Log.info("Record Added Successfully.");
		Thread.sleep(2000);
		Utils.btn_TabClose().click();
		Log.info("Tab Closed");
		
	}
}

