package testCases.StudentRecord;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pageObjects.SidePanal;
import pageObjects.StudentRecord.StudentProfile_Page;
import utility.Log;
import utility.Utils;

public class StudentProfile_Add{
	public static void execute() throws Exception {
		SidePanal.lnk_StudentProfile().click();
		Log.info("StudentProfile Clicked");
		Utils.enterData(StudentProfile_Page.txtbx_StudentIdModalDialog(), "test4");
		Log.info("StudentId Entered");
		StudentProfile_Page.btn_Add_Modal().click();
		Log.info("Add Button Clicked");
		/*System.out.println(StudentProfile_Page.lbl_formLabel().getText());
		boolean check = StudentProfile_Page.lbl_formLabel().getText().contains("ADD");
		Assert.assertTrue(check, "Failed");*/
		Thread.sleep(2000);
		Utils.enterData(StudentProfile_Page.txtbx_StudentId(),"test4");
		Thread.sleep(2000);
		Utils.enterData(StudentProfile_Page.txtbx_FirstName(),"name");
		Log.info("First Name Entered");
		new Select(StudentProfile_Page.select_Campus()).selectByVisibleText("ABC");
		Log.info("Campus Selected");
		new Select(StudentProfile_Page.select_Programme()).selectByVisibleText("MBA (Full Time)");
		Log.info("Programme Selected");
//		Thread.sleep(3000);
//		new Select(StudentProfile_Page.select_Discipline()).selectByVisibleText("Finance");
//		Log.info("Discipline Entered");
		Utils.enterData(StudentProfile_Page.txtbx_DOB(),"29/02/1996");
		Log.info("DOB Entered");
		Utils.enterData(StudentProfile_Page.txtbx_Email(),"a@a.com");
		Log.info("Email Entered");
//		Thread.sleep(3000);
		Utils.scrollByVisibleElement(StudentProfile_Page.txtbx_Mobile());
		Utils.enterData(StudentProfile_Page.txtbx_Mobile(),"8974563210");
		Log.info("Mobile No Entered");
		ArrayList<WebElement> elements=(ArrayList<WebElement>)StudentProfile_Page.select_ExamList();
		new Select(elements.get(0)).selectByVisibleText("CAT");
		new Select(elements.get(1)).selectByVisibleText("Entreprenuer");
		new Select(elements.get(2)).selectByVisibleText("2013");
		new Select(elements.get(3)).selectByVisibleText("Haryana General");
		Thread.sleep(2000);
		StudentProfile_Page.btn_Submit().click();
		Log.info("Submit Button Clicked");
		Thread.sleep(2000);
		Utils.btn_TabClose().click();
		Log.info("Tab Closed");
	}
}
