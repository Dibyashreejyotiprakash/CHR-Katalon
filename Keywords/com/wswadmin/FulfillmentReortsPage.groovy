package com.wswadmin

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.utilities.Interaction
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.testng.Assert

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

public class FulfillmentReortsPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By corpddntextbox = By.xpath("//*[@id='ctl00_cphMain_rcbCorp_Input']")
	By reportslabel = By.xpath("//*[text()='Reports']")
	By searchbtn = By.xpath("//*[@id='cphMain_btnSearch']")
	By firstrecord = By.xpath("//*[@id='ctl00_cphMain_radGrdFulfillmentProductItems_ctl00__0']")
	By itemname = By.xpath("//*[@id='ctl00_cphMain_txtItemName']")
	By firstitemname = By.xpath("//*[@id='ctl00_cphMain_radGrdFulfillmentProductItems_ctl00__1']//td[3]")
	By firstproductunitname = By.xpath("//*[@id='ctl00_cphMain_radGrdFulfillmentProductItems_ctl00__0']//td[1]")
	By productunittextbox = By.xpath("//*[@id='ctl00_cphMain_rcbProductUnit_Input']")
	By reportsbtn = By.xpath("//*[@id='ctl00_cphMain_radGrdFulfillmentProductItems_ctl00_ctl02_ctl00_ExportToExcelButton']")


	@Keyword
	public void VerifyFulfillmentReortsPage() {
		try{
			action.VerifyCurrentPage("Reports.aspx")
		}
		catch(Exception e) {
			Assert.fail("Verify Fulfillment Reports Page failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyAllFields() {
		try{
			boolean statusofcorporationddn = action.IsElementDisplayed(corpddntextbox)
			Assert.assertTrue(statusofcorporationddn)

			boolean statusofitemname = action.IsElementDisplayed(itemname)
			Assert.assertTrue(statusofitemname)

			boolean statusofproductunittextbox = action.IsElementDisplayed(productunittextbox)
			Assert.assertTrue(statusofproductunittextbox)

			boolean statusofsearchbtn  = action.IsElementDisplayed(searchbtn)
			Assert.assertTrue(statusofsearchbtn)

			boolean statusofreportsbtn = action.IsElementDisplayed(reportsbtn)
			Assert.assertTrue(statusofreportsbtn)
		}
		catch(Exception e) {
			Assert.fail("Verify All Fields failed due to "+ e)
		}
	}

	@Keyword
	public void SearchByCorporationName() {
		try{
			action.Type(corpddntextbox, "300 - Instant Impact 4.0 Demo Corp (Dist.)")
			action.WaitUntilElementClickable(searchbtn)
			action.Click(searchbtn)

			boolean statusoffirstrecord = action.IsElementDisplayed(firstrecord)
			Assert.assertTrue(statusoffirstrecord)
		}
		catch(Exception e) {
			Assert.fail("Search By CorporationName failed due to "+ e)
		}
	}


	@Keyword
	public void SearchByItemNameName() {
		try{
			action.Type(corpddntextbox, "300 - Instant Impact 4.0 Demo Corp (Dist.)")
			WebUI.delay(3)
			action.Click(searchbtn)
			WebUI.delay(3)
			boolean statusoffirstrecord = action.IsElementDisplayed(firstrecord)
			Assert.assertTrue(statusoffirstrecord)

			if(statusoffirstrecord == true) {
				String firstdisplayeditemname = action.GetText(firstitemname)
				WebUI.delay(3)
				action.Type(itemname, firstdisplayeditemname)
				WebUI.delay(3)
				action.Click(searchbtn)
			}
		}
		catch(Exception e) {
			Assert.fail("Search By CorporationName failed due to "+ e)
		}
	}


	@Keyword
	public void SearchByProductUnitName() {
		try{
			action.Type(corpddntextbox, "300 - Instant Impact 4.0 Demo Corp (Dist.)")
			WebUI.delay(3)
			action.Click(searchbtn)
			WebUI.delay(3)
			boolean statusoffirstrecord = action.IsElementDisplayed(firstrecord)
			Assert.assertTrue(statusoffirstrecord)

			if(statusoffirstrecord == true) {
				String firstdisplayedproductunitname  = action.GetText(firstproductunitname)
				WebUI.delay(3)
				action.Type(productunittextbox, firstdisplayedproductunitname)
				WebUI.delay(3)
				action.Click(reportslabel)
				WebUI.delay(3)
				action.Click(searchbtn)
			}
		}
		catch(Exception e) {
			Assert.fail("Search By Product Unit name failed due to "+ e)
		}
	}
}
