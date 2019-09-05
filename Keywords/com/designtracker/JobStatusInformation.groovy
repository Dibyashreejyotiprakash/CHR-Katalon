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

public class JobStatusInformation {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()


	By txtJobID = By.xpath("//*[@id='txtJobId']")
	By btnViewReport = By.xpath("//*[@id='btnSubmit']")
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
			//action.WaitVisible(headerJobStatus)
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



	@Keyword //Verifying job status page
	public boolean VerifyJobStatusPage(){

		try{

			String expectedPageURL = "https://designtracker.brandmuscle.net/Reports/JobStatusInformation.aspx"
			WebUI.delay(10)
			String actualPageURL = action.GetCurrentURL();
			println("------------------>>>>>>>>>>>>>>>" + actualPageURL)
			//String actualheader = action.GetText(headerJobActivityTracking)
			Assert.assertEquals(actualPageURL,expectedPageURL)
		}
		catch(Exception e){
			println("VerifyJobStatusPage method failed due to :" + e)
		}
	}

	@Keyword //Verifying Reports columns
	public void VerifyJobStatusReportFields(){
		try{

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
		catch(Exception e)
		{
			println("VerifyJobStatusReportFields method failed due to :" + e)
		}
	}


	@Keyword
	public void VerifyJobStatusAllCoulmns(){
		try
		{
			String firstCol = "Status Name"
			String secondCol = "Date Submitted"
			String thirdCol = "Job Line Name"
			String fourthCol = "Part #"
			String fifthCol = "Qty"
			String sixthCol = "SO #"
			String seventhCol = "PO #"
			String eightCol = "Web ID"
			String ninthCol = "Print Location"
			String tenthCol = "OverPack ID"
			String eleventhCol = "Comments"
			String twelfthCol = "Ship Status"
			String thirteenCol = "Ship Date"
			String fourteenCol = "Tracking Number"
			String fifteenCol = "Addr Line 1"
			String sistheenCol = "Addr Line 2"
			String seventeenCol = "Addr Line 3"
			String eighteenCol = "City"
			String ninteenCol = "State"
			String twentyCol = "Zip"



			String statusName = action.GetText(statusName)
			String datesubmitted = action.GetText(dateSubmitted)
			String jobLineName = action.GetText(colJobLineName)
			String part = action.GetText(colPart)

			String qty = action.GetText(colQTY)
			String so = action.GetText(colSO)
			String po = action.GetText(colPO)
			String webID = action.GetText(colWebID)
			String printlocation = action.GetText(colPrintLocation)
			String overpackid = action.GetText(colOverPackID)
			String comments = action.GetText(colComments)
			String shipstatus = action.GetText(colShipStatus)
			String shipdate = action.GetText(colShipDate)
			String trackingNumber = action.GetText(colTrackingNumber)
			String addrLine1 = action.GetText(colAddrLine1)
			String addrLine2 = action.GetText(colAddrLine2)
			String addrLine3 = action.GetText(colAddrLine3)
			String city = action.GetText(colCity)
			String state = action.GetText(colState)
			String zip = action.GetText(colZip)



			Assert.assertEquals(firstCol, statusName)
			println("First Column Name----->"+ statusName)

			Assert.assertEquals(secondCol, datesubmitted)
			println("First Column Name----->"+ datesubmitted)

			Assert.assertEquals(thirdCol, jobLineName)
			println("Third Column Name----->"+ jobLineName)

			Assert.assertEquals(fourthCol, part)
			println("Fourth Column Name----->"+ part)

			Assert.assertEquals(fifthCol, qty)
			println("Fifth Column Name----->"+ qty)

			Assert.assertEquals(sixthCol, so)
			println("Sixth Column Name----->"+ so)

			Assert.assertEquals(seventhCol, po)
			println("Seventh Column Name----->"+ po)

			Assert.assertEquals(eightCol, webID)
			println("Eighth Column Name----->"+ webID)

			Assert.assertEquals(ninthCol, printlocation)
			println("Ninth Column Name----->"+ printlocation)

			Assert.assertEquals(tenthCol, overpackid)
			println("Tenth Column Name----->"+ overpackid)

			Assert.assertEquals(eleventhCol, comments)
			println("Eleventh Column Name----->"+ comments)

			Assert.assertEquals(twelfthCol, shipstatus)
			println("Twelfth Column Name----->"+ shipstatus)

			Assert.assertEquals(thirteenCol, shipdate)
			println("Thirteen Column Name----->"+ shipdate)

			Assert.assertEquals(fourteenCol, trackingNumber)
			println("Fourteen Column Name----->"+ trackingNumber)

			Assert.assertEquals(fifteenCol, addrLine1)
			println("Fifteen Column Name----->"+ addrLine1)

			Assert.assertEquals(sistheenCol, addrLine2)
			println("Sistheen Column Name----->"+ addrLine2)

			Assert.assertEquals(seventeenCol, addrLine3)
			println("Seventeen Column Name----->"+ addrLine3)

			Assert.assertEquals(eighteenCol, city)
			println("Eighteen Column Name----->"+ city)

			Assert.assertEquals(ninteenCol, state)
			println("Ninteen Column Name----->"+ state)

			Assert.assertEquals(twentyCol, zip)
			println("Twenty Column Name----->"+ zip)









		}
		catch(Exception e)
		{
			println("VerifyJobStatusAllCoulmns method failed due to :" + e)
		}
	}

























}
