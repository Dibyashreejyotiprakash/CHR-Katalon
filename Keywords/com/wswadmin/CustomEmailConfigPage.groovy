package com.wswadmin

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.utilities.Interaction
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory
import org.testng.Assert
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

public class CustomEmailConfigPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By corptextbox = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_rcbCorp_Input']")
	By distributortextbox = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_RadComboDistributor_Input']")
	By optiontextbox = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_RadComboOption_Input']")
	By mailsection = By.xpath("//*[@id='cphMain_cphMain_pnlEmailConfig']")
	By cancelbtn = By.xpath("//*[@id='cphMain_cphMain_btnCancel']")
	By updatebtn = By.xpath("//*[@id='cphMain_cphMain_btnUpdate']")

	@Keyword
	public void VerifyCustomEmailConfigPage(){
		try{
			action.VerifyCurrentPage("CustomEmailConfig.aspx")
		}catch(Exception e) {
			Assert.fail("Verify Custom Email Config Page failed due to " + e)
		}
	}

	@Keyword
	public void VerifyMailForCreatedStatus() {
		try{
			boolean statusofcorptextbox = action.IsElementDisplayed(corptextbox)
			Assert.assertTrue(statusofcorptextbox)

			boolean statusofdistrtextbox = action.IsElementDisplayed(distributortextbox)
			Assert.assertTrue(statusofdistrtextbox)

			action.Type(corptextbox, "Demo Distributor (QA)")
			action.Enter(corptextbox)

			action.Type(distributortextbox, "Demo Dist. Market #1 (QA)")
			action.Enter(distributortextbox)

			action.Type(optiontextbox, "Job Created E-mail")
			action.Enter(optiontextbox)

			boolean statusofmailgrid = action.IsElementDisplayed(mailsection)
			Assert.assertTrue(statusofdistrtextbox)

			boolean statusofupdatebtn = action.IsElementEnabled(updatebtn)
			Assert.assertTrue(statusofupdatebtn)

			boolean statusofcancelbtn = action.IsElementEnabled(cancelbtn)
			Assert.assertTrue(statusofcancelbtn)
		}catch(Exception e){
			Assert.fail("Verify mail for created status")
		}
	}

	@Keyword
	public void VerifyMailForPostedStatus() {
		try{
			boolean statusofcorptextbox = action.IsElementDisplayed(corptextbox)
			Assert.assertTrue(statusofcorptextbox)

			boolean statusofdistrtextbox = action.IsElementDisplayed(distributortextbox)
			Assert.assertTrue(statusofdistrtextbox)

			action.Type(corptextbox, "Demo Distributor (QA)")
			action.Enter(corptextbox)

			action.Type(distributortextbox, "Demo Dist. Market #1 (QA)")
			action.Enter(distributortextbox)

			action.Type(optiontextbox, "Job Posted E-mail")
			action.Enter(optiontextbox)

			boolean statusofmailgrid = action.IsElementDisplayed(mailsection)
			Assert.assertTrue(statusofdistrtextbox)

			boolean statusofupdatebtn = action.IsElementEnabled(updatebtn)
			Assert.assertTrue(statusofupdatebtn)

			boolean statusofcancelbtn = action.IsElementEnabled(cancelbtn)
			Assert.assertTrue(statusofcancelbtn)
		}catch(Exception e){
			Assert.fail("Verify mail for posted status")
		}
	}
}


