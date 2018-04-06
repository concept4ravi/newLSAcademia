package testCases.AcademicAdministration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pageObjects.SidePanal;
import pageObjects.AcademicAdministration.AcademicStructure_Programe_Page;
import pageObjects.StudentRecord.AwardsScholarships_Page;
import utility.Log;
import utility.Utils;

public class AcademicStructure_Programe_Delete{
	public static void execute() throws Exception {

		SidePanal.lnk_AcademicStructure().click();
		Log.info("Academic Structure Link clicked");
		SidePanal.lnk_Programs().click();
		Log.info("Programs Link Clicked");
		Thread.sleep(2000);
		WebElement e = AcademicStructure_Programe_Page.returnElement(By.xpath("//a[contains(text(),'CS')]"));
		Utils.scrollByVisibleElement(e);
		//Utils.scrollByVisibleElement(e);
		e.click();
		Log.info("CS Clicked");
		Thread.sleep(1000);
		Utils.scrollByVisibleElement(AwardsScholarships_Page.btn_Delete());
		AcademicStructure_Programe_Page.btn_Delete().click();
		Thread.sleep(1000);
		AcademicStructure_Programe_Page.btn_Ok().click();
		
		Thread.sleep(2000);
		Utils.btn_TabClose().click();
		Log.info("Tab Closed");
	}
}

