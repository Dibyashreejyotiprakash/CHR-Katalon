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

public class JobDiagnostic {


	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()






	By txtJobID = By.xpath("//*[@id='txtJobId']")
	By btnViewReport = By.xpath("//*[@id='btnSubmit']")
	By headerJobDiagnostic = By.xpath("//*[text()='Job Diagnostic']")
	By colItem = By.xpath("//*[text()='Item']")
	By colValue = By.xpath("//*[text()='Value']")



	@Keyword
	public void EnterJobID(String jobid) {
		String currentenvironment = GlobalVariable.environment
		println ("Current env is ----------------------------"+ currentenvironment)
		ProfitLoss profitlosspage = new ProfitLoss()
		try {
			try{
				if(currentenvironment.equalsIgnoreCase("UAT")){
					driver.quit()
				}
				else if(currentenvironment.equalsIgnoreCase("STAGING")) {
					driver.quit()
				}
				else{
					action.VerifyCurrentPage("Reports/JobDiagnostic.aspx")
					WebUI.delay(1)
					action.Type(txtJobID, jobid)
					action.WaitVisible(btnViewReport)
					action.Click(btnViewReport)
					action.WaitForPageToLoad()
				}
			}catch(Exception e){
				throw new Exception("Excecution is terminated")
			}
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
	public boolean VerifyJobDiagnosticPage(){

		try{

			String expectedPageHeader = "Job Diagnostic"
			WebUI.delay(10)
			String actualheader = action.GetText(headerJobDiagnostic)
			Assert.assertEquals(expectedPageHeader, actualheader)
		}
		catch(Exception e){
			println("VerifyJobDiagnosticPage method failed due to :" + e)
		}
	}

	@Keyword //Verifying Reports columns
	public void VerifyJobDiagnosticReportColumns(){
		try{

			String ExpectedFirstCol = "Item"
			String ExpectedSecondCol = "Value"

			String itemCol = action.GetText(colItem)
			String valueCol = action.GetText(colValue)

			Assert.assertEquals(ExpectedFirstCol, itemCol)
			println("First Column Name----->"+ itemCol)
			Assert.assertEquals(ExpectedSecondCol, valueCol)
			println("Second Column Name----->"+ valueCol)

		}
		catch(Exception e){
			println("VerifyJobActivityTrackingReportColumns method failed due to :" + e)
		}
	}











}
