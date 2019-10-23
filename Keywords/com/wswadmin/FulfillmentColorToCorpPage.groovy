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

public class FulfillmentColorToCorpPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By corpddn = By.xpath("//*[@id='ctl00_cphMain_CorporationList_rcbCorporation_Arrow']")
	By corptextbox = By.xpath("//*[@id='ctl00_cphMain_CorporationList_rcbCorporation_Input']")
	By availablecolornamesearchbox = By.xpath("//*[@id='ctl00_cphMain_rgAvailableColors_ctl00_ctl02_ctl01_FilterTextBox_ColorName']")
	By searchbtn = By.xpath("//*[@id='ctl00_cphMain_rgAvailableColors_ctl00_ctl02_ctl01_Filter_ColorName']")
	By addbtn = By.xpath("//*[@id='ctl00_cphMain_rbtnAdd']")
	By removebtn = By.xpath("//*[@id='ctl00_cphMain_rbtnRemove']")
	By assignedcolortocorpcolorsearchfield = By.xpath("//*[@id='ctl00_cphMain_rgCorporationColors_ctl00_ctl02_ctl01_FilterTextBox_ColorName']")
	By firstavailablecolor = By.xpath("//*[@id='ctl00_cphMain_rgAvailableColors_ctl00__0']")
	By firstavailablecolorname = By.xpath("//*[@id='ctl00_cphMain_rgAvailableColors_ctl00__0']/td[2]")
	By fulfillmentcolortocorpheader = By.xpath("//*[@id='cphMain_ctl00_lblSectionHeader']")
	By newassignedcolorname = By.xpath("//*[@id='ctl00_cphMain_rgCorporationColors_ctl00__0']/td[2]")
	By firstassignedcolorname = By.xpath("//*[@id='ctl00_cphMain_rgCorporationColors_ctl00__0']")



	@Keyword
	public void VerifyFulfillmentColorToCorpPage() {
		try{
			action.VerifyCurrentPage("FulfillmentColorToCorp.aspx")
		}
		catch(Exception e) {
			Assert.fail("Verify Fulfillment Color To CorpPage failed due to "+ e)
		}
	}

	@Keyword
	public void AddColorToCorp() {
		try{
			action.Type(corptextbox, "300 - Instant Impact 4.0 Demo Corp (Dist.)")
			action.Click(fulfillmentcolortocorpheader)
			WebUI.delay(5)
			String firstavailablecolorname = action.GetText(firstavailablecolorname)
			action.Click(firstavailablecolor)
			WebUI.delay(5)
			action.Click(addbtn)
			WebUI.delay(5)
			action.Type(assignedcolortocorpcolorsearchfield, firstavailablecolorname)
			action.Click(searchbtn)
			WebUI.delay(5)
			String newassignedfirstcolor = action.GetText(newassignedcolorname)
			Assert.assertEquals(firstavailablecolorname, newassignedfirstcolor)
		}
		catch(Exception e) {
			Assert.fail("AddColorToCorp failed due to "+ e)
		}
	}

	@Keyword
	public void RemoveColor() {
		try{
			action.Type(corptextbox, "300 - Instant Impact 4.0 Demo Corp (Dist.)")
			action.Click(fulfillmentcolortocorpheader)
			WebUI.delay(5)
			String firstavailablecolorname = action.GetText(firstavailablecolorname)
			action.Click(firstavailablecolor)
			WebUI.delay(5)
			action.Click(addbtn)
			WebUI.delay(5)
			action.Type(assignedcolortocorpcolorsearchfield, firstavailablecolorname)
			action.Click(searchbtn)
			WebUI.delay(5)
			String newassignedfirstcolor = action.GetText(newassignedcolorname)
			Assert.assertEquals(firstavailablecolorname, newassignedfirstcolor)
			action.Click(firstassignedcolorname)
			action.Click(removebtn)
			WebUI.delay(5)
			action.Type(assignedcolortocorpcolorsearchfield, newassignedfirstcolor)
			action.Click(searchbtn)
			Assert.assertEquals(firstavailablecolorname, newassignedfirstcolor)
		}
		catch(Exception e) {
			Assert.fail("Remove Color failed due to "+ e)
		}
	}
}
