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
import com.kms.katalon.core.webui.driver.DriverFactory

public class JobSearchPage {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By jobsearchheader = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_SectionHeader1_lblSectionHeader']")
	By searchtxtbox = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_txtJobKey']")
	By searchbtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_btnSearch']")
	By displayedjobid = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_gvSingleSearchResults_ctl00__0']/td[4]")
	By selectjoblink = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_gvSearchResults_ctl00__0']//a")
	By confirmationradiobtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_rbtnlCriteria_1']")
	By jobIds = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_gvSearchResults_ctl00']//following-sibling::tbody/tr/td[5]")
	By corporationddn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlCorporation']")
	By ddlMarcket = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlMarket']")

	@Keyword
	public void VerifyJobSearchPage() {
		action.WaitVisible(jobsearchheader)
		boolean statusofjobsearchheader = action.IsElementDisplayed(jobsearchheader)
		Assert.assertTrue(statusofjobsearchheader, "Job Search Header is present")
	}

	@Keyword
	public void VerifyJobSearch() {
		try{
			action.SelectByText(corporationddn, "Instant Impact 4.0 Demo Corp (Dist.)")
			action.SelectByText(ddlMarcket, "Chicago Beverage Systems")
			action.ScrollToBottomOfPage()
			action.Click(searchbtn)
			String getjobid = null;
			List<WebElement> lst =	action.GetElements(jobIds)

			for(int i=0; i<=lst.size();i++){
				String jobID = lst[i].getText()
				println("-------------------->>>>>>>>" +jobID)
				getjobid = jobID;
				break;
				action.Type(searchtxtbox, jobID)
				action.Enter(searchtxtbox)
			}
		}
		catch(Exception e){
			println("SelectFirstJobID failed due to :"+ e)
		}
	}

	@Keyword
	public void ClickOnSelectJobLink() {
		try{
			action.ScrollToViewElement(selectjoblink)
			action.WaitVisible(selectjoblink)
			action.Click(selectjoblink)
			action.WaitForPageToLoad()
		}
		catch(Exception e){
			Assert.fail("Click On Select Job Link failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyCreatedJobInDTSearchPage(String jobcreatedinusersite) {
		try{
			action.Click(confirmationradiobtn)
			action.Type(searchtxtbox, jobcreatedinusersite)
			action.ScrollToBottomOfPage()
			WebUI.delay(10)
			action.WaitForPageToLoad()
			action.WaitVisible(selectjoblink)
			action.Click(searchbtn)
			WebUI.delay(10)
			action.WaitForPageToLoad()
			action.WaitVisible(selectjoblink)
		}
		catch(Exception e) {
			println ("Verify Created Job In DT Search Page")
			Assert.fail()
		}
	}
}
