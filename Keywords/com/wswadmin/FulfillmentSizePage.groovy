package com.wswadmin

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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
import com.utilities.Interaction
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.testng.Assert

import com.kms.katalon.core.webui.driver.DriverFactory
public class FulfillmentSizePage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By addnewsizebtn = By.xpath("//*[@id='ctl00_cphMain_rgSize_ctl00_ctl02_ctl00_AddNewRecordButton']")
	By searchsizetextbox = By.xpath("//*[@id='ctl00_cphMain_rgSize_ctl00_ctl02_ctl03_FilterTextBox_SizeName']")
	By filterbtn = By.xpath("//*[@id='ctl00_cphMain_rgSize_ctl00_ctl02_ctl03_Filter_SizeName']")
	By removebtn = By.xpath("//*[@id='ctl00_cphMain_rgSize_ctl00_ctl04_gbcDeleteColumn']")
	By sizenametextbox = By.xpath("//*[@id='ctl00_cphMain_rgSize_ctl00_ctl02_ctl04_TB_SizeName']")
	By insertbtn = By.xpath("//*[@id='ctl00_cphMain_rgSize_ctl00_ctl02_ctl04_PerformInsertButton']")
	By searchbtn = By.xpath("//*[@id='ctl00_cphMain_rgSize_ctl00_ctl02_ctl03_Filter_SizeName']")
	By firstsizename = By.xpath("//*[@id='ctl00_cphMain_rgSize_ctl00__0']//tr//td[3]")
	By norecordsfoundmsg = By.xpath("//*[textx()='No records to display.']")

	@Keyword
	public void VerifyFulfillmentSizePage() {
		try{
			action.VerifyCurrentPage("FulfillmentSize.aspx")
		}
		catch(Exception e) {
			Assert.fail("Verify Fulfillment Size Page failed due to "+ e)
		}
	}


	@Keyword
	public void AddNewSize() {
		String newsize = action.GenerateRandomNumericString(7)
		try{
			action.Click(addnewsizebtn)
			WebUI.delay(3)
			action.Type(sizenametextbox, newsize)
			WebUI.delay(3)
			action.Click(insertbtn)
			WebUI.delay(3)
			action.Type(searchsizetextbox, newsize)
			WebUI.delay(3)
			action.Click(searchbtn)
		}
		catch(Exception e) {
			Assert.fail("Add New Size failed due to "+ e)
		}
	}


	@Keyword
	public void DeletSize() {
		String newsize = action.GenerateRandomNumericString(7)
		try{
			action.Click(addnewsizebtn)
			WebUI.delay(3)
			action.Type(sizenametextbox, newsize)
			WebUI.delay(3)
			action.Click(insertbtn)
			WebUI.delay(3)
			action.Type(searchsizetextbox, newsize)
			WebUI.delay(3)
			action.Click(searchbtn)
			WebUI.delay(3)
			String firstsize = action.GetText(firstsizename)
			println ("First Color name is -----------"+ firstsize)
			Assert.assertEquals(firstsize, newsize)

			action.Click(removebtn)
			action.AcceptAlert()

			action.TypeAndClear(searchsizetextbox, newsize)
			WebUI.delay(3)
			action.Click(searchbtn)
			String msg = action.GetText(norecordsfoundmsg)
			Assert.assertEquals(msg, "No records to display.")
		}
		catch(Exception e) {
			Assert.fail("Delete Size failed due to "+ e)
		}
	}
}
