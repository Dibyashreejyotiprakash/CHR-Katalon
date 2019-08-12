package com.designtracker

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

import internal.GlobalVariable
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.testng.Assert
import org.openqa.selenium.Alert
import org.openqa.selenium.By
import com.utilities.Interaction
import com.kms.katalon.core.webui.driver.DriverFactory

public class JobActivityTracking {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()


	By txtJobID = By.xpath("//*[@id='txtJobId']")
	By btnViewReport = By.xpath("//*[@id='btnSubmit']")
	By DivisionReport = By.xpath("//*[@class='Ad4f47955be9d4a669b1f713acaca6e6567']/tbody")
	By headerJobActivityTracking = By.xpath("//*[text()='Job Activity Tracking']")
	By colDesignID = By.xpath("//*[text()='Design ID']")
	By colActivity = By.xpath("//*[text()='Activity']")
	By colDateOccured = By.xpath("//*[text()='Date Occurred']")
	By colAgentName = By.xpath("//*[text()='Agent Name']")
	By reportColumns = By.xpath("//*[@class='A871a6f9c976a49079b0041b71197852067']/tbody/tr[2]/td/div")



	@Keyword
	public void EnterJobID(String jobid) {

		try {
			action.WaitVisible(txtJobID)
			action.Type(txtJobID,jobid)
			println ("Job Id is "+jobid )
		}
		catch(Exception e) {
			println ("EnterJobID method failed due to :"+ e)
		}
	}


	@Keyword//Clicking on View report button
	public void ClickOnViewReportBtn() {
		try{
			action.WaitVisible(btnViewReport)
			action.Click(btnViewReport)
			action.WaitForPageToLoad()
			//action.WaitVisible(DivisionReport)
			WebUI.delay(10)
		}
		catch(Exception e){
			println("ClickOnViewReportBtn method failed due to :" + e)
		}
	}

	@Keyword//Verifying view report button
	public void VerifyViewReportBtn(){
		try{
			if(action.IsElementDisplayed(btnViewReport)) {
				boolean statusEnable = action.IsElementEnabled(btnViewReport)
				Assert.assertTrue(statusEnable)
			}
		}
		catch(Exception e){
			println("VerifyViewReportBtn method failed due to :" + e)
		}
	}




	@Keyword //Verifying job activity tracking page
	public boolean VerifyJobActivityTrackingPage(){

		try{

			String expectedPageHeader = "Job Activity Tracking"
			WebUI.delay(10)
			String actualheader = action.GetText(headerJobActivityTracking)
			Assert.assertEquals(expectedPageHeader, actualheader)
		}
		catch(Exception e){
			println("VerifyJobActivityTrackingPage method failed due to :" + e)
		}
	}

	@Keyword //Verifying Reports columns
	public void VerifyJobActivityTrackingReportColumns(){
		try{

			String ExpectedFirstCol = "Design ID"
			String ExpectedSecondCol = "Activity"
			String ExpectedThirdCol = "Date Occurred"
			String ExpectedFourthCol = "Agent Name"

			String designCol = action.GetText(colDesignID)
			String activityCol = action.GetText(colActivity)
			String dateOccuredCol = action.GetText(colDateOccured)
			String agentNameCol = action.GetText(colAgentName)

			Assert.assertEquals(ExpectedFirstCol, designCol)
			println("First Column Name----->"+ designCol)
			Assert.assertEquals(ExpectedSecondCol, activityCol)
			println("Second Column Name----->"+ activityCol)
			Assert.assertEquals(ExpectedThirdCol, dateOccuredCol)
			println("Third Column Name----->"+ dateOccuredCol)
			Assert.assertEquals(ExpectedFourthCol, agentNameCol)
			println("First Column Name----->"+ agentNameCol)





		}
		catch(Exception e){
			println("VerifyJobActivityTrackingReportColumns method failed due to :" + e)
		}
	}

	//Search job id and enter
	public String SearchAndEnterJobID(){
		try{

		}
		catch(Exception e){
			println("SearchAndEnterJobID method failed due to:" + e)

		}
	}














	@Keyword
	public void CloseAllBrowser() {
		action.CloseAllBrowser()
	}
}
