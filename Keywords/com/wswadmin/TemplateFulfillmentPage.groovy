package com.wswadmin

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable

public class TemplateFulfillmentPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By instantimpacttemplatefufillmentheader = By.xpath("//*[@id='cphMain_cphMain_ctl00_lblSectionHeader']")
	By corpddntextbox = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_rcbCorp_Input']")
	By itemtypeddn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_rcbItemType_Arrow']")
	By itemtypeddnvaluetemplate = By.xpath("//*[text()='Template']")
	By itemtypeddnvaluefulfilleditem = By.xpath("//*[text()='FulfilledItem']")
	By statusddn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_rcbStatus_Arrow']")
	By statusddnvaluecomplete = By.xpath("//*[text()='Complete']")
	By statusddnvalueincomplete = By.xpath("//*[text()='Incomplete']")
	By templateidsearchtextbox = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_rntbTemplateId']")
	By descriptiontextbox = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_rtbDescription']")
	By searchbtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_rbSearch']")
	By templatefirstentry = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_rgTemplate_ctl00__0']")
	By templatefirstselectdatalink = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_rgTemplate_ctl00__0']/td[1]/a")
	By firsttemplateid = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_rgTemplate_ctl00__0']/td[2]")
	By firstdescription = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_rgTemplate_ctl00__0']/td[3]")
	By fulfilleditemfirstentry = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_rgFulfillment_ctl00__0']")
	By fulfilleditemselectdata = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_rgFulfillment_ctl00__0']//td[1]/a")

	@Keyword
	public void VerifyTemplateFulfillmentPage() {
		try{
			action.VerifyCurrentPage("TemplateFulfillment.aspx")
		}
		catch(Exception e) {
			Assert.fail("Verify Template Fulfillment Page failed due to "+ e)
		}
	}

	@Keyword
	public void SelectCompleteTemplate() {
		try{
			action.Type(corpddntextbox, "339 - Demo Distributor (QA)")
			action.Click(instantimpacttemplatefufillmentheader)
			action.Click(itemtypeddn)
			action.Click(itemtypeddnvaluetemplate)
			action.Click(statusddn)
			action.Click(statusddnvaluecomplete)
			action.Click(searchbtn)
			try{
				//Selected Demo Template-Do Not Touch
				action.Type(templateidsearchtextbox, "130722")
				WebUI.delay(10)
				action.Click(searchbtn)
				action.WaitVisible(templatefirstentry)
				boolean statusoffirstentry = action.IsElementDisplayed(templatefirstentry)
				if(statusoffirstentry == true) {
					action.Click(templatefirstselectdatalink)
					action.WaitForPageToLoad()
					action.VerifyCurrentPage("MetatagConfiguration.aspx")
				}
			}
			catch(Exception e1) {
				throw new Exception ("No records found")
			}
		}
		catch(Exception e) {
			Assert.fail("Select Complete Template failed due to "+ e)
		}
	}

	@Keyword
	public void SelectInCompleteTemplate() {
		try{
			action.Type(corpddntextbox, "300 - Instant Impact 4.0 Demo Corp (Dist.)")
			action.Click(instantimpacttemplatefufillmentheader)
			action.Click(itemtypeddn)
			action.Click(itemtypeddnvaluetemplate)
			action.Click(statusddn)
			action.Click(statusddnvalueincomplete)
			action.Click(searchbtn)
			try{
				action.WaitVisible(templatefirstentry)
				boolean statusoffirstentry = action.IsElementDisplayed(templatefirstentry)
				if(statusoffirstentry == true) {
					action.Type(templateidsearchtextbox, "130722")
					WebUI.delay(10)
					action.Click(searchbtn)
					action.Click(templatefirstselectdatalink)
					action.WaitForPageToLoad()
					action.VerifyCurrentPage("MetatagConfiguration.aspx")
				}
			}
			catch(Exception e1) {
				throw new Exception ("No records found")
			}
		}
		catch(Exception e) {
			Assert.fail("Select Complete Template failed due to "+ e)
		}
	}


	@Keyword
	public void SelectCompleteFulfilledItem() {
		try{
			action.Type(corpddntextbox, "300 - Instant Impact 4.0 Demo Corp (Dist.)")
			action.Click(instantimpacttemplatefufillmentheader)
			action.Click(itemtypeddn)
			action.Click(itemtypeddnvaluefulfilleditem)
			action.WaitVisible(statusddn)
			action.Click(statusddn)
			action.Click(statusddnvaluecomplete)
			action.Click(searchbtn)
			try{
				action.WaitVisible(fulfilleditemfirstentry)
				boolean statusoffirstentry = action.IsElementDisplayed(fulfilleditemfirstentry)
				println ("Status of Fulfilled Item First entry ----------"+ statusoffirstentry)
				if(statusoffirstentry == true) {
					action.Click(fulfilleditemselectdata)
					action.WaitForPageToLoad()
					action.VerifyCurrentPage("MetatagConfiguration.aspx")
				}
			}
			catch(Exception e1) {
				throw new Exception ("No records found")
			}
		}
		catch(Exception e) {
			Assert.fail("Select Complete Fulfilled Item failed due to "+ e)
		}
	}

	@Keyword
	public void SelectInCompleteFulfilledItem() {
		try{
			action.Type(corpddntextbox, "300 - Instant Impact 4.0 Demo Corp (Dist.)")
			action.Click(instantimpacttemplatefufillmentheader)
			action.Click(itemtypeddn)
			action.Click(itemtypeddnvaluefulfilleditem)
			action.WaitVisible(statusddn)
			action.Click(statusddn)
			action.Click(statusddnvalueincomplete)
			action.Click(searchbtn)
			try{
				action.WaitVisible(fulfilleditemfirstentry)
				boolean statusoffirstentry = action.IsElementDisplayed(fulfilleditemfirstentry)
				println ("Status of Fulfilled Item First entry ----------"+ statusoffirstentry)
				if(statusoffirstentry == true) {
					action.Click(fulfilleditemselectdata)
					action.WaitForPageToLoad()
					action.VerifyCurrentPage("MetatagConfiguration.aspx")
				}
			}
			catch(Exception e1) {
				throw new Exception ("No records found")
			}
		}
		catch(Exception e) {
			Assert.fail("Select InComplete Fulfilled Item failed due to "+ e)
		}
	}
}
