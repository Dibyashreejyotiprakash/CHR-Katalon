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

public class JobEfficiency {




	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()







	By txtJobID = By.xpath("//*[@id='txtJobId']")
	By btnViewReport = By.xpath("//*[@id='btnSubmit']")
	By headerJobEfficiency = By.xpath("//*[text()='Job Efficiency']")

	By jobId = By.xpath("//*[text()='Job Id:']")
	By salesPerson = By.xpath("//*[text()='Sales Person:']")
	By accountName = By.xpath("//*[text()='Account Name:']")
	By dateCreated = By.xpath("//*[text()='Date Created:']")
	By dueDate = By.xpath("//*[text()='Due Date:']")
	By coordinator = By.xpath("//*[text()='Coordinator:']")
	By designer = By.xpath("//*[text()='Designer:']")











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
			action.WaitVisible(headerJobEfficiency)
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
	public boolean VerifyJobEfficiencyPage(){

		try{

			String expectedPageHeader = "Job Efficiency"
			WebUI.delay(10)
			String actualheader = action.GetText(headerJobEfficiency)
			Assert.assertEquals(expectedPageHeader, actualheader)
		}
		catch(Exception e){
			println("VerifyJobEfficiencyPage method failed due to :" + e)
		}
	}

	@Keyword //Verifying Reports columns
	public void VerifyJobEfficiencyReportFields(){
		try{

			String ExpectedFirstField = "Job Id:"
			String ExpectedSecondField = "Sales Person:"
			String ExpectedThirdField = "Account Name:"
			String ExpectedFourthField = "Date Created:"
			String ExpectedFifthField = "Due Date:"
			String ExpectedSixthField = "Coordinator:"
			String ExpectedSeventhField = "Designer:"

			String jobId = action.GetText(jobId)
			String salespersion = action.GetText(salesPerson)
			String accountname = action.GetText(accountName)
			String datecreated = action.GetText(dateCreated)
			String duedate = action.GetText(dueDate)
			String coordinator = action.GetText(coordinator)
			String designer = action.GetText(designer)

			Assert.assertEquals(ExpectedFirstField, jobId)
			println("First Field Name----->"+ jobId)

			Assert.assertEquals(ExpectedSecondField, salespersion)
			println("Second Field Name----->"+ salespersion)

			Assert.assertEquals(ExpectedThirdField, accountname)
			println("Third Field Name----->"+ accountname)

			Assert.assertEquals(ExpectedFourthField, datecreated)
			println("Fourth Field Name----->"+ datecreated)

			Assert.assertEquals(ExpectedFifthField, duedate)
			println("Fifth Field Name----->"+ duedate)

			Assert.assertEquals(ExpectedSixthField, coordinator)
			println("Sixth Field Name----->"+ coordinator)

			Assert.assertEquals(ExpectedSeventhField, designer)
			println("Seventh Field Name----->"+ designer)

		}
		catch(Exception e){
			println("VerifyJobActivityTrackingReportColumns method failed due to :" + e)
		}
	}

















}
