package testCases.AcademicAdministration;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pageObjects.SidePanal;
import pageObjects.AcademicAdministration.SubjectRegRule_Page;
import utility.Log;
import utility.Utils;

public class SubjectRegRule{
	public static void execute() throws Exception {

		SidePanal.lnk_Registration().click();
		Log.info("Registration Link clicked");
		SidePanal.lnk_Registration_InitiateProcess().click();
		Log.info("InitiateProcess Link clicked");
		SidePanal.lnk_Registration_InitiateProcess_SubRegRule().click();
		Log.info("Subject Reg Rule Link Clicked");
		Thread.sleep(1000);
		ArrayList<WebElement>  elements = (ArrayList<WebElement>)SubjectRegRule_Page.returnList(By.xpath("//select[@class='selectItemText']"));
		new Select(elements.get(1)).selectByVisibleText("MBA");
		Log.info("Program MBA Selected");
		Thread.sleep(1000);
		elements.clear();
		elements = (ArrayList<WebElement>)SubjectRegRule_Page.returnList(By.xpath("//select[@class='selectItemText']"));
		new Select(elements.get(6)).selectByVisibleText("Finance");
		Log.info("Discipline Selected");
		Thread.sleep(1000);
		new Select(elements.get(7)).selectByVisibleText("Regular Registration");
		Log.info("Reg. Type Selected");
		elements = (ArrayList<WebElement>)SubjectRegRule_Page.returnList(By.xpath("//input[@class='gwt-DateBox']"));
		Thread.sleep(1000);
		Utils.enterData(elements.get(8), "10/7/2013");
		Thread.sleep(1000);
		Utils.enterData(elements.get(9), "31/12/2013");
		Thread.sleep(1000);
		SubjectRegRule_Page.btn_Submit().click();
		Log.info("Record Added Successfully.");
		Thread.sleep(2000);
		Utils.btn_TabClose().click();
		Log.info("Tab Closed");

	}
}

