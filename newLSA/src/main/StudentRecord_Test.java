package main;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.BaseClass;
import pageObjects.SidePanal;
import testCases.SignIn;
import testCases.StudentRecord.AwardsScholarships_Add;
import testCases.StudentRecord.AwardsScholarships_Delete;
import testCases.StudentRecord.DisciplinaryCases;
import testCases.StudentRecord.MaintainDocument;
import testCases.StudentRecord.MaintainDocumentList_Add;
import testCases.StudentRecord.NotingOnStudent;
import testCases.StudentRecord.StudentProfile_Add;
import testCases.StudentRecord.StudentProfile_View;
import utility.Log;
import utility.Utils;

public class StudentRecord_Test{
	public WebDriver driver;

	@BeforeTest
	@Parameters({"browser"})
	public void beforeTest(String browser) throws Exception {

		//System.out.println(Constant.basePath);
		DOMConfigurator.configure("log4j.xml");
		driver = Utils.OpenBrowser(browser);
		new BaseClass(driver); 

	}
	// This is the starting of the Main Test Case

	@Test(retryAnalyzer = utility.RetryAnalyzer.class)
	public void signInAndMoveToStudentRecord() throws Exception {
		Log.startTestCase("signInAndMoveToStudentRecord");
		SignIn.execute();
		Utils.zoomOut();
		Thread.sleep(2000);
		SidePanal.lnk_Academics().click();
		Log.info("Academics clicked");
		SidePanal.lnk_StudentRecord().click();
		Log.info("StudentRecord clicked");
	}
	@Test(dependsOnMethods="signInAndMoveToStudentRecord",enabled=true,
			retryAnalyzer = utility.RetryAnalyzer.class)
	public void studentProfile_Add() throws Exception {
		Log.startTestCase("studentProfile_Add");
		try{
			StudentProfile_Add.execute();
			if(BaseClass.bResult==true){
				Log.info("Complete");
				System.out.println("Complete : StudentProfile_Add");
			}
		}catch(AssertionError e) {
			Utils.takeScreenshot();
			Log.error(e.getMessage());
			throw(e);
		}
		catch (Exception e){
			Utils.takeScreenshot();
			Log.info("Not Complete");
			Log.error(e.getMessage());
			// SendMail.sendMail("Error : Server Delay");
			System.out.println("Error : StudentProfile_Add");
			throw (e);
		}
	}

	@Test(dependsOnMethods="signInAndMoveToStudentRecord",enabled=true,
			retryAnalyzer = utility.RetryAnalyzer.class)
	public void studentProfile_View() throws Exception {
		Log.startTestCase("studentProfile_View");
		try{
			StudentProfile_View.execute();
			if(BaseClass.bResult==true){
				Log.info("Complete");
				System.out.println("Complete : StudentProfile_View");
			}
		}catch(AssertionError e) {
			Utils.takeScreenshot();
			Log.error(e.getMessage());
			throw(e);
		}
		catch (Exception e){
			Utils.takeScreenshot();
			Log.info("Not Complete");
			Log.error(e.getMessage());
			// SendMail.sendMail("Error : Server Delay");
			System.out.println("Error : StudentProfile_View");
			throw (e);
		}
	}
	@Test(dependsOnMethods="signInAndMoveToStudentRecord",enabled=true,
			retryAnalyzer = utility.RetryAnalyzer.class)
	public void MaintainDocument() throws Exception {
		Log.startTestCase("MaintainDocument");
		try{
			MaintainDocument.execute();
			if(BaseClass.bResult==true){
				Log.info("Complete");
				System.out.println("Complete : MaintainDocument");
			}
		}catch(AssertionError e) {
			Utils.takeScreenshot();
			Log.error(e.getMessage());
			throw(e);
		}
		catch (Exception e){
			Utils.takeScreenshot();
			Log.info("Not Complete");
			Log.error(e.getMessage());
			// SendMail.sendMail("Error : Server Delay");
			System.out.println("Error : MaintainDocument");
			throw (e);
		}
	}
	@Test(dependsOnMethods="signInAndMoveToStudentRecord",enabled=true,
			retryAnalyzer = utility.RetryAnalyzer.class)
	public void MaintainDocumentList_Add() throws Exception {
		Log.startTestCase("MaintainDocumentList_Add");
		try{
			MaintainDocumentList_Add.execute();
			if(BaseClass.bResult==true){
				Log.info("Complete");
				System.out.println("Complete : MaintainDocumentList_Add");
			}
		}catch(AssertionError e) {
			Utils.takeScreenshot();
			Log.error(e.getMessage());
			throw(e);
		}
		catch (Exception e){
			Utils.takeScreenshot();
			Log.info("Not Complete");
			Log.error(e.getMessage());
			// SendMail.sendMail("Error : Server Delay");
			System.out.println("Error : MaintainDocumentList_Add");
			throw (e);
		}
	}
	@Test(dependsOnMethods="signInAndMoveToStudentRecord",enabled=false,
			retryAnalyzer = utility.RetryAnalyzer.class,priority=1)
	public void AwardsScholarships_Add() throws Exception {
		Log.startTestCase("AwardsScholarships_Add");
		try{
			AwardsScholarships_Add.execute();
			if(BaseClass.bResult==true){
				Log.info("Complete");
				System.out.println("Complete : AwardsScholarships_Add");
			}
		}catch(AssertionError e) {
			Utils.takeScreenshot();
			Log.error(e.getMessage());
			throw(e);
		}
		catch (Exception e){
			Utils.takeScreenshot();
			Log.info("Not Complete");
			Log.error(e.getMessage());
			// SendMail.sendMail("Error : Server Delay");
			System.out.println("Error : AwardsScholarships_Add");
			throw (e);
		}
	}
	@Test(dependsOnMethods="signInAndMoveToStudentRecord",enabled=false,
			retryAnalyzer = utility.RetryAnalyzer.class,priority=2)
	public void AwardsScholarships_Delete() throws Exception {
		Log.startTestCase("AwardsScholarships_Delete");
		try{
			AwardsScholarships_Delete.execute();
			if(BaseClass.bResult==true){
				Log.info("Complete");
				System.out.println("Complete : AwardsScholarships_Delete");
			}
		}catch(AssertionError e) {
			Utils.takeScreenshot();
			Log.error(e.getMessage());
			throw(e);
		}
		catch (Exception e){
			Utils.takeScreenshot();
			Log.info("Not Complete");
			Log.error(e.getMessage());
			// SendMail.sendMail("Error : Server Delay");
			System.out.println("Error : AwardsScholarships_Delete");
			throw (e);
		}
	}
	@Test(dependsOnMethods="signInAndMoveToStudentRecord",enabled=true,
			retryAnalyzer = utility.RetryAnalyzer.class)
	public void DisciplinaryCases() throws Exception {
		Log.startTestCase("DisciplinaryCases");
		try{
			DisciplinaryCases.execute();
			if(BaseClass.bResult==true){
				Log.info("Complete");
				System.out.println("Complete : DisciplinaryCases");
			}
		}catch(AssertionError e) {
			Utils.takeScreenshot();
			Log.error(e.getMessage());
			throw(e);
		}
		catch (Exception e){
			Utils.takeScreenshot();
			Log.info("Not Complete");
			Log.error(e.getMessage());
			// SendMail.sendMail("Error : Server Delay");
			System.out.println("Error : DisciplinaryCases");
			throw (e);
		}
	}
	@Test(dependsOnMethods="signInAndMoveToStudentRecord",enabled=true,
			retryAnalyzer = utility.RetryAnalyzer.class)
	public void NotingOnStudent() throws Exception {
		Log.startTestCase("NotingOnStudent");
		try{
			NotingOnStudent.execute();
			if(BaseClass.bResult==true){
				Log.info("Complete");
				System.out.println("Complete : NotingOnStudent");
			}
		}catch(AssertionError e) {
			Utils.takeScreenshot();
			Log.error(e.getMessage());
			throw(e);
		}
		catch (Exception e){
			Utils.takeScreenshot();
			Log.info("Not Complete");
			Log.error(e.getMessage());
			// SendMail.sendMail("Error : Server Delay");
			System.out.println("Error : NotingOnStudent");
			throw (e);
		}
	}
	@AfterMethod
	public void afterMethod(ITestResult result) throws InterruptedException {
		Log.endTestCase(result.getMethod().getMethodName());
		Thread.sleep(2000);
		
	}
	// Its time to close the test case		
	//	@AfterTest
	public void afterMethod() {
		// Closing the opened driver
		driver.close();
	}

}
