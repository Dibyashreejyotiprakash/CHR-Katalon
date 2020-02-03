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


	By headerJobStatus = By.xpath("//*[@class='Ac1c35776da844c27ac1063e328ca73e83']")
	By salesPerson = By.xpath("//*[text()='Sales Person:']")
	By accountName = By.xpath("//*[text()='Account Name:']")
	By dateCreated = By.xpath("//*[text()='Date Created:']")
	By dueDate = By.xpath("//*[text()='Due Date:']")
	By jobName = By.xpath("//*[text()='Job Name:']")
	By designer = By.xpath("//*[text()='Designer:']")
	By createdFor = By.xpath("//*[text()='Created For:']")
	By statusName = By.xpath("//*[text()='Status Name']")
	By dateSubmitted = By.xpath("//*[text()='Date Submitted']")
	By colValueCreated = By.xpath("//*[text()='Created']")
	By statusColValues = By.xpath("//*[@class='Aece577693d56479f87115d8f29045b4790']/tbody/tr/td[1]")
	By colJobLineName = By.xpath("//*[text()='Job Line Name']")
	By colPart = By.xpath("//*[text()='Part #']")
	By colQTY = By.xpath("//*[text()='Qty']")
	By colSO = By.xpath("//*[text()='SO #']")
	By colPO = By.xpath("//*[text()='PO #']")
	By colWebID = By.xpath("//*[text()='Web ID']")
	By colPrintLocation = By.xpath("//*[text()='Print Location']")
	By colOverPackID = By.xpath("//*[text()='OverPack ID']")
	By colComments = By.xpath("//*[text()='Comments']")
	By colShipStatus = By.xpath("//*[text()='Ship Status']")
	By colShipDate = By.xpath("//*[text()='Ship Date']")
	By colTrackingNumber = By.xpath("//*[text()='Tracking Number']")
	By colAddrLine1 = By.xpath("//*[text()='Addr Line 1']")
	By colAddrLine2 = By.xpath("//*[text()='Addr Line 2']")
	By colAddrLine3 = By.xpath("//*[text()='Addr Line 3']")
	By colCity = By.xpath("//*[text()='City']")
	By colState = By.xpath("//*[text()='State']")
	By colZip = By.xpath("//*[text()='Zip']")




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
					//WebUI.delay(1)
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

	@Keyword //Verifying Reports columns
	public void VerifyJobStatusReportFields(){
		String currentenvironment = GlobalVariable.environment
		try{
			try{
				if(currentenvironment.equals("UAT")){
					driver.quit()
				}
				else if(currentenvironment.equals("STAGE"))
				{
					driver.quit()
				}
				else{
					String ExpectedFirstField = "Job Name:"
					String ExpectedSecondField = "Sales Person:"
					String ExpectedThirdField = "Account Name:"
					String ExpectedFourthField = "Date Created:"
					String ExpectedFifthField = "Due Date:"
					String ExpectedSixthField = "Created For:"
					String ExpectedSeventhField = "Designer:"

					String jobName = action.GetText(jobName)
					String salespersion = action.GetText(salesPerson)
					String accountname = action.GetText(accountName)
					String datecreated = action.GetText(dateCreated)
					String duedate = action.GetText(dueDate)
					String createdFor = action.GetText(createdFor)
					String designer = action.GetText(designer)

					Assert.assertEquals(ExpectedFirstField, jobName)
					println("First Field Name----->"+ jobName)

					Assert.assertEquals(ExpectedSecondField, salespersion)
					println("Second Field Name----->"+ salespersion)

					Assert.assertEquals(ExpectedThirdField, accountname)
					println("Third Field Name----->"+ accountname)

					Assert.assertEquals(ExpectedFourthField, datecreated)
					println("Fourth Field Name----->"+ datecreated)

					Assert.assertEquals(ExpectedFifthField, duedate)
					println("Fifth Field Name----->"+ duedate)

					Assert.assertEquals(ExpectedSixthField, createdFor)
					println("Sixth Field Name----->"+ createdFor)

					Assert.assertEquals(ExpectedSeventhField, designer)
					println("Seventh Field Name----->"+ designer)
				}
			}
			catch(Exception e){
				throw new Exception("Execution Terminated")

			}
		}
		catch(Exception e)
		{
			println("VerifyJobStatusReportFields method failed due to :" + e)
		}
	}


	@Keyword
	public void ClickOnViewReportBtn() {
		String currentenvironment = GlobalVariable.environment
		try{
			try{
				if(currentenvironment.equals("UAT")){
					driver.quit()
				}
				else if(currentenvironment.equals("STAGE")) {
					driver.quit()
				}
				else{
					action.WaitVisible(btnViewReport)
					action.Click(btnViewReport)
					action.WaitForPageToLoad()
					VerifyJobActivityTrackingReportColumns()
				}
			}catch(Exception e){
				throw new Exception("Excecution is terminated")
			}
		}
		catch(Exception e){
			Assert.fail("Click On View Report Btn failed due to "+ e)
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
			//WebUI.delay(10)
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




	@Keyword
	public void CloseAllBrowser() {
		action.CloseAllBrowser()
	}
}
