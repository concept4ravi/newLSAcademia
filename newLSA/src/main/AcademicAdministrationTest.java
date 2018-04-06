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
import testCases.AcademicAdministration.AcademicStructure_Courses_Add;
import testCases.AcademicAdministration.AcademicStructure_Courses_Delete;
import testCases.AcademicAdministration.AcademicStructure_Programe_Add;
import testCases.AcademicAdministration.AcademicStructure_Programe_Delete;
import testCases.AcademicAdministration.CoursewiseDetailReport;
import testCases.AcademicAdministration.DefineSections_Add;
import testCases.AcademicAdministration.DefineSections_Delete;
import testCases.AcademicAdministration.SubjectRegRule;
import utility.Log;
import utility.Utils;

public class AcademicAdministrationTest{
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
		SidePanal.lnk_AcademicsAdministration().click();
		Log.info("Academics Administration clicked");
	}
	@Test(dependsOnMethods="signInAndMoveToStudentRecord",enabled=true,
			retryAnalyzer = utility.RetryAnalyzer.class,priority=0)
	public void AcademicStructure_Programe_Add() throws Exception {
		Log.startTestCase("AcademicStructure_Programe_Add");
		try{
			AcademicStructure_Programe_Add.execute();
			if(BaseClass.bResult==true){
				Log.info("Complete");
				System.out.println("Complete : AcademicStructure_Programe_Add");
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
			System.out.println("Error : AcademicStructure_Programe_Add");
			throw (e);
		}
	}

	@Test(dependsOnMethods="signInAndMoveToStudentRecord",enabled=true,
			retryAnalyzer = utility.RetryAnalyzer.class,priority=1)
	public void AcademicStructure_Programe_Delete() throws Exception {
		Log.startTestCase("AcademicStructure_Programe_Delete");
		try{
			AcademicStructure_Programe_Delete.execute();
			if(BaseClass.bResult==true){
				Log.info("Complete");
				System.out.println("Complete : AcademicStructure_Programe_Delete");
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
			System.out.println("Error : AcademicStructure_Programe_Delete");
			throw (e);
		}
	}
	@Test(dependsOnMethods="signInAndMoveToStudentRecord",enabled=true,
			retryAnalyzer = utility.RetryAnalyzer.class)
	public void SubjectRegRule() throws Exception {
		Log.startTestCase("SubjectRegRule");
		try{
			SubjectRegRule.execute();
			if(BaseClass.bResult==true){
				Log.info("Complete");
				System.out.println("Complete : SubjectRegRule");
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
			System.out.println("Error : SubjectRegRule");
			throw (e);
		}
	}
	@Test(dependsOnMethods="signInAndMoveToStudentRecord",enabled=true,
			retryAnalyzer = utility.RetryAnalyzer.class,priority=2)
	public void DefineSections_Add() throws Exception {
		Log.startTestCase("DefineSections_Add");
		try{
			DefineSections_Add.execute();
			if(BaseClass.bResult==true){
				Log.info("Complete");
				System.out.println("Complete : DefineSections_Add");
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
			System.out.println("Error : DefineSections_Add");
			throw (e);
		}
	}
	@Test(dependsOnMethods="signInAndMoveToStudentRecord",enabled=true,
			retryAnalyzer = utility.RetryAnalyzer.class,priority=3)
	public void DefineSections_Delete() throws Exception {
		Log.startTestCase("DefineSections_Delete");
		try{
			DefineSections_Delete.execute();
			if(BaseClass.bResult==true){
				Log.info("Complete");
				System.out.println("Complete : DefineSections_Delete");
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
			System.out.println("Error : DefineSections_Delete");
			throw (e);
		}
	}
	@Test(dependsOnMethods="signInAndMoveToStudentRecord",enabled=true,
			retryAnalyzer = utility.RetryAnalyzer.class,priority=4)
	public void AcademicStructure_Courses_Add() throws Exception {
		Log.startTestCase("AcademicStructure_Courses_Add");
		try{
			AcademicStructure_Courses_Add.execute();
			if(BaseClass.bResult==true){
				Log.info("Complete");
				System.out.println("Complete : AcademicStructure_Courses_Add");
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
			System.out.println("Error : AcademicStructure_Courses_Add");
			throw (e);
		}
	}
	@Test(dependsOnMethods="signInAndMoveToStudentRecord",enabled=true,
			retryAnalyzer = utility.RetryAnalyzer.class,priority=5)
	public void AcademicStructure_Courses_Delete() throws Exception {
		Log.startTestCase("AcademicStructure_Courses_Delete");
		try{
			AcademicStructure_Courses_Delete.execute();
			if(BaseClass.bResult==true){
				Log.info("Complete");
				System.out.println("Complete : AcademicStructure_Courses_Delete");
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
			System.out.println("Error : AcademicStructure_Courses_Delete");
			throw (e);
		}
	}
	@Test(dependsOnMethods="signInAndMoveToStudentRecord",enabled=true,
			retryAnalyzer = utility.RetryAnalyzer.class)
	public void CoursewiseDetailReport() throws Exception {
		Log.startTestCase("CoursewiseDetailReport");
		try{
			CoursewiseDetailReport.execute();
			if(BaseClass.bResult==true){
				Log.info("Complete");
				System.out.println("Complete : CoursewiseDetailReport");
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
			System.out.println("Error : CoursewiseDetailReport");
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
