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
import org.testng.Assert
import org.openqa.selenium.Alert
import org.openqa.selenium.By
import com.kms.katalon.core.webui.driver.DriverFactory

public class JobSearchPage {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By jobsearchheader = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_SectionHeader1_lblSectionHeader']")
	By searchtxtbox = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_txtJobKey']")
	By searchbtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_btnSearch']")
	By displayedjobid = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_gvSingleSearchResults_ctl00__0']/td[4]")
	By selectjoblink = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_gvSingleSearchResults_ctl00__0']/td[1]/a")
	By confirmationradiobtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_rbtnlCriteria_1']")

	@Keyword
	public void VerifyJobSearchPage() {
		action.WaitVisible(jobsearchheader)
		boolean statusofjobsearchheader = action.IsElementDisplayed(jobsearchheader)
		Assert.assertTrue(statusofjobsearchheader, "Job Search Header is present")
	}

	@Keyword
	public void VerifyJobSearch() {
		action.WaitVisible(searchtxtbox)
		action.Type(searchtxtbox, "2342567")
		action.ScrollToBottomOfPage()
		action.WaitVisible(searchbtn)
		action.Click(searchbtn)
		WebUI.delay(3)
		action.WaitVisible(displayedjobid)
		boolean statusofjobid = action.IsElementDisplayed(displayedjobid)
		Assert.assertTrue(statusofjobid)
		println (action.GetText(displayedjobid))
	}

	@Keyword
	public void ClickOnSelectJobLink() {

		action.ScrollToTopOgPage()
		action.WaitVisible(selectjoblink)
		action.Click(selectjoblink)
		action.WaitForPageToLoad()
	}

	@Keyword
	public void VerifyCreatedJobInDTSearchPage(String jobcreatedinusersite) {
		try{
			action.Click(confirmationradiobtn)
			action.Type(searchtxtbox, jobcreatedinusersite)
			action.ScrollToBottomOfPage()
			action.Click(searchbtn)
		}
		catch(Exception e) {
			println ("Verify Created Job In DT Search Page")
			Assert.fail()
		}
	}
}
