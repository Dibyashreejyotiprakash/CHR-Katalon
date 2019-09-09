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

public class II4ConfigurationPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By corpddn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_ddlCorpId']")
	By corpddnvalue = By.xpath("//*[text()='Demo Distributor (QA)']")
	By marketddn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_ddlMarkets']")
	By marketddnvalue = By.xpath("//*[text()='Demo Dist. 1 QA (360)']")
	By welcomeconfiglabel = By.xpath("//*[text()='WELCOME SCREEN CONFIGURATIONS']")
	By createneworderyesbtn = By.xpath("//*[@id='collapseOne']/div/div[1]/div[2]//span[1]/span[1]")
	By cloneorderyesbtn = By.xpath("//*[@id='collapseOne']/div/div[2]/div[2]//span[1]/span[1]")
	By finishincompletebtn = By.xpath("//*[@id='collapseOne']/div/div[3]/div[2]//span[1]/span[1]")
	By savebtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_btnSave_input']")



	@Keyword
	public void VerifyII4ConfigurationPage() {
		try {
			String actualurl = action.GetCurrentURL()
			if(actualurl.contains("II4Configurations.aspx")) {
				println ("II4 Configuration page is verified")
			}
			else{
				throw new Exception("II4 Configuration page is not verified")
			}
		}
		catch(Exception e) {
			println ("Verify ii4 configuration page failed due to "+ e)
			Assert.fail()
		}
	}


	@Keyword
	public void SelectCorpAndMarkets() {
		try {
			action.Click(corpddn)
			WebUI.delay(20)
			//action.ScrollToViewelement(corpddnvalue)
			action.Click(corpddnvalue)
			WebUI.delay(20)
			action.Click(marketddn)
			WebUI.delay(20)
			action.Click(marketddnvalue)
			WebUI.delay(20)
		}
		catch(Exception e) {
			println ("Select Corp And Markets failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void VerifyAllFieldsOnOLOFII4ConfigurationPage() {
		try{
			boolean satusofcorpddn = action.IsElementDisplayed(corpddn)
			Assert.assertTrue(satusofcorpddn)

			boolean statusofdistddn = action.IsElementDisplayed(marketddn)
			Assert.assertTrue(statusofdistddn)
		}
		catch(Exception e) {
			println ("Verify All Fields On OLOF II4 Configuration Page failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void VerifyWelComeScreenConfigurationSelection() {
		try{
			boolean satusofwelcomeconfiglabel = action.IsElementDisplayed(welcomeconfiglabel)
			Assert.assertTrue(satusofwelcomeconfiglabel)
		}
		catch(Exception e) {
			println ("Verify WelCome Screen Configuration Selection failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void VerifyCreateNewOrderVisibility() {
		try {
			boolean statusofcreateneworder = action.IsElementSelected(createneworderyesbtn)
			println ("Status of createneworder failed due to ----------"+ statusofcreateneworder)
			if(statusofcreateneworder == true) {
				action.ScrollToBottomOfPage()
				WebUI.delay(10)
				action.Click(savebtn)
			}
			else{
				action.Click(createneworderyesbtn)
			}
		}
		catch(Exception e) {
			println ("Verify Create New Order Visibility failed due to "+ e)
			Assert.fail()
		}
	}
	
	
	@Keyword
	public void VerifyCloneVisibility() {
		try {
			boolean statusofcloneorderbtn = action.IsElementSelected(cloneorderyesbtn)
			println ("Status of createneworder failed due to ----------"+ statusofcloneorderbtn)
			if(statusofcloneorderbtn == true) {
				action.ScrollToBottomOfPage()
				WebUI.delay(10)
				action.Click(savebtn)
			}
			else{
				action.Click(cloneorderyesbtn)
				action.Click(savebtn)
			}
		}
		catch(Exception e) {
			println ("Verify Clone Order Visibility failed due to "+ e)
			Assert.fail()
		}
	}
	
	
	@Keyword
	public void VerifyFinishInCompleteVisibility() {
		try {
			boolean statusoffinishincompleteorderbtn = action.IsElementSelected(finishincompletebtn)
			println ("Status of createneworder failed due to ----------"+ statusoffinishincompleteorderbtn)
			if(statusoffinishincompleteorderbtn == true) {
				action.ScrollToBottomOfPage()
				WebUI.delay(10)
				action.Click(savebtn)
			}
			else{
				action.Click(finishincompletebtn)
				action.Click(savebtn)
			}
		}
		catch(Exception e) {
			println ("Verify Finish Incomplete Visibility failed due to "+ e)
			Assert.fail()
		}
	}
}
