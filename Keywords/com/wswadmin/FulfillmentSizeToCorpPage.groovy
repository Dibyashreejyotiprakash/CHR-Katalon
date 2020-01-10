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
import com.utilities.Interaction
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.testng.Assert

import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable

public class FulfillmentSizeToCorpPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By corptextbox = By.xpath("//*[@id='ctl00_cphMain_CorporationList_rcbCorporation_Input']")
	By addbtn = By.xpath("//*[@id='ctl00_cphMain_rbtnAddSize']")
	By removebtn = By.xpath("//*[@id='ctl00_cphMain_rbtnRemoveSize']")
	By sizenamesearchtextbox = By.xpath("//*[@id='ctl00_cphMain_rgAvailSizes_ctl00_ctl02_ctl02_FilterTextBox_SizeName']")
	By availablesizesearchbtn = By.xpath("//*[@id='ctl00_cphMain_rgAvailSizes_ctl00_ctl02_ctl02_Filter_SizeName']")
	By firstavailablesizename = By.xpath("//*[@id='ctl00_cphMain_rgAvailSizes_ctl00__0']/td[2]")
	By firstsizebar = By.xpath("//*[@id='ctl00_cphMain_rgAvailSizes_ctl00__0']")
	By assignedsizetextbox = By.xpath("//*[@id='ctl00_cphMain_rgAssignedSizes_ctl00_ctl02_ctl02_FilterTextBox_SizeName']")
	By assignedsizesearchbtn = By.xpath("//*[@id='ctl00_cphMain_rgAssignedSizes_ctl00_ctl02_ctl02_Filter_SizeName']")
	By firstasignedsizename = By.xpath("//*[@id='ctl00_cphMain_rgAssignedSizes_ctl00__0']/td[2]")

	By header = By.xpath("//*[@id='cphMain_ctl00_lblSectionHeader']")

	@Keyword
	public void VerifyFulfillmentSizeToCorpPage() {
		try{
			action.VerifyCurrentPage("FulfillmentSizeToCorp.aspx")
		}
		catch(Exception e) {
			Assert.fail("Verify Fulfillment Size To Corp Page failed due to "+ e)
		}
	}



	@Keyword
	public void AddSizeToCorp() {
		try{
			action.Type(corptextbox, "300 - Instant Impact 4.0 Demo Corp (Dist.)")
			action.Click(header)
			//WebUI.delay(5)
			String firstavailablesize_name = action.GetText(firstavailablesizename)
			action.Click(firstsizebar)
			//WebUI.delay(5)
			action.Click(addbtn)
			//WebUI.delay(5)
			action.Type(assignedsizetextbox, firstavailablesize_name)
			action.Click(availablesizesearchbtn)
			//WebUI.delay(5)
			/*String newassignedfirstsize = action.GetText(firstasignedsizename)
			 Assert.assertEquals(firstavailablesize_name, newassignedfirstsize)*/
		}
		catch(Exception e) {
			Assert.fail("Add Size To Corp failed due to "+ e)
		}
	}


	@Keyword
	public void RemoveSize() {
		try{
			action.Type(corptextbox, "300 - Instant Impact 4.0 Demo Corp (Dist.)")
			action.Click(header)
			//WebUI.delay(5)
			String firstavailablesize_name = action.GetText(firstavailablesizename)
			action.Click(firstsizebar)
			//WebUI.delay(5)
			action.Click(addbtn)
			//WebUI.delay(5)
			action.Type(assignedsizetextbox, firstavailablesize_name)
			action.Click(availablesizesearchbtn)
			//WebUI.delay(5)
			/*String newassignedfirstsize = action.GetText(firstasignedsizename)
			 Assert.assertEquals(firstavailablesize_name, newassignedfirstsize)*/


			action.Click(firstasignedsizename)
			action.Click(removebtn)
			//WebUI.delay(5)
		}
		catch(Exception e) {
			Assert.fail("Remove Color failed due to "+ e)
		}
	}
}
