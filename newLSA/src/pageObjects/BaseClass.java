package pageObjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class BaseClass {
	protected static WebElement element = null;
	public static WebDriver driver;
	public static boolean bResult;
	public  BaseClass(WebDriver driver){
		BaseClass.driver = driver;
		BaseClass.bResult = true;
	}
	public static String getTitle(){

		return driver.getTitle();
	}
	public static String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	public static void turnOffImplicitWaits() {
	    driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	}
	public static void turnOnImplicitWaits() {
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public static void switchToActiveElement() {
	    driver.switchTo().activeElement();
	}
	public static void switchToFrame(String name) {
	    driver.switchTo().frame(name);
	}
	public static void returnToParent() {
	    driver.switchTo().parentFrame();
	}
	public static void switchWindow() {
		System.out.println( driver.getWindowHandles().size());
	   
	}
	public static WebElement btn_New() throws Exception{
		
		try{
			element = driver.findElement(By.xpath("//button[contains(text(),'New')]"));

			Log.info("'New Button' found Page");
		}catch (Exception e){
			Log.error("'New Button' not found Page");
			throw(e);
		}

		return element;
	}
	public static WebElement lbl_errMsg() throws Exception{
		try{ 
			element=driver.findElement(By.id("Label256"));	// Application No. Label
			
		}catch (Exception e){
			throw(e);
		}
		return element;
		
	}
	public static WebElement btn_Submit() throws Exception{
		try{
			element = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));

			Log.info("'Submit' Button found on Page");
		}catch (Exception e){
			Log.error("'View' Button not found on Page");
			throw(e);
		}
		return element;
	}
	
	public static WebElement btn_Delete() throws Exception{
		try{
			element = driver.findElement(By.xpath("//button[contains(text(),'Delete')]"));

			Log.info("'Delete' Button found on Page");
		}catch (Exception e){
			Log.error("'Delete' Button not found on Page");
			throw(e);
		}
		return element;
	}

	public static List<WebElement> returnList(By path) throws Exception{
		List<WebElement> elements;
		try{ 
			elements= driver.findElements(path);

		}catch (Exception e){

			throw(e);
		}
		return elements;
	}
	public static WebElement lbl_ItemInfoMsg() throws Exception{
		try{ 
			element=driver.findElement(By.cssSelector(".itemInfoLabel"));	// Application No. Label
			
		}catch (Exception e){
			throw(e);
		}
		return element;
		
	}
	
	public static WebElement returnElement(By path) throws Exception{
		try{ 
			element=driver.findElement(path);	
			
		}catch (Exception e){
			throw(e);
		}
		return element;
		
	}
	public static WebElement btn_Ok() throws Exception{
		try{
			element = driver.findElement(By.xpath("//button[contains(text(),'Ok')]"));
			Log.info("'Ok' Button found on Page");
		}catch (Exception e){
			Log.error("'Ok' Button not found on Page");
			throw(e);
		}
		return element;
	}
	public static WebElement btn_View() throws Exception{
		try{
			element = driver.findElement(By.xpath("//button[contains(text(),'View')]"));
			Log.info("'View' Button found on Page");
		}catch (Exception e){
			Log.error("'View' Button not found on Page");
			throw(e);
		}
		return element;
	}
	public static WebElement btn_Delete_Yes() throws Exception{
		try{
			element = driver.findElement(By.xpath("//button[contains(text(),'Yes')]"));
			Log.info("'Delete Yes' Button found on Page");
		}catch (Exception e){
			Log.error("'Delete Yes' Button not found on Page");
			throw(e);
		}
		return element;
	}
	public static WebElement lnk_AddRow() throws Exception{
		try{
			element = driver.findElement(By.xpath("//a[contains(text(),'Add-Row')]"));
			Log.info("'Add-Row' link found on Page");
		}catch (Exception e){
			Log.error("'Add-Row' link not found on Page");
			throw(e);
		}
		return element;
	}
}
