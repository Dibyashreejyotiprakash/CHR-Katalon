package com.ii4usersites

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
import org.openqa.selenium.Alert
import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable

public class CloneJobSearchPage {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By searchbydtnumber = By.xpath("//*[@id='ctl00_Body_txtDtNumber']")
	By keywordsearch = By.xpath("//*[@id='ctl00_Body_txtKeywordSearch']")
	By accountname = By.xpath("//*[@id='Body_txtAccount']")
	By accountnumber = By.xpath("//*[@id='ctl00_Body_txtAccountNumber']")
	By clearbtn = By.xpath("//*[@id='ctl00_Body_btnClearSelection_input']")
	By nextbtn = By.xpath("//*[@id='ctl00_Body_btnContinue']")
	By dtnoincloneserchresultspage = By.xpath("//*[@id='ctl00_Body_rdgrdSearchResults_ctl00__0']//td[2]")

	By backtosearchbtn = By.xpath("//*[@id='ctl00_Body_btnBack']")
	By addselecteditems = By.xpath("//*[@id='ctl00_Body_btnContinue']")
	By expandbtn = By.xpath("//*[@id='ctl00_Body_rdgrdSearchResults_ctl00_ctl04_GECBtnExpandColumn']")
	By selectcheckbox = By.xpath("//*[@id='ctl00_Body_rdgrdSearchResults_ctl00_ctl06_Detail10']//td/input")

	By withoutselectionitemerrormsg =By.xpath("//*[@id='Body_lblError']")


	@Keyword
	public void VerifyJobSearchPage() {
		boolean statusofdtserachtxtbox = action.IsElementDisplayed(searchbydtnumber)
		Assert.assertTrue(statusofdtserachtxtbox)

		action.ScrollToBottomOfPage()
		boolean statusofnexttbox = action.IsElementDisplayed(nextbtn)
		Assert.assertTrue(statusofnexttbox)
	}

	@Keyword
	public void VerifyDtJobSearch(String dtjobid) {
		boolean statusofaddselectedItesms = action.IsElementEnabled(addselecteditems)
		Assert.assertTrue(statusofaddselectedItesms)
		action.Type(searchbydtnumber, dtjobid)
		action.ScrollToBottomOfPage()
		action.Click(nextbtn)
		action.WaitForPageToLoad()
		action.WaitVisible(dtnoincloneserchresultspage)
		boolean statusofdtjob = action.IsElementDisplayed(dtnoincloneserchresultspage)
		println ("Status of dt job ************"+ statusofdtjob)
	}

	@Keyword
	public void SelectItemAndAddSelectedItem() {
		boolean statusofexpandbtn = action.IsElementEnabled(expandbtn)
		if(statusofexpandbtn == true) {
			action.Click(expandbtn)
			WebUI.delay(10)
			action.Click(selectcheckbox)
			WebUI.delay(10)
			action.Click(addselecteditems)
		}
	}

	@Keyword
	public void WithoutSelectItemAndAddSelectedItem() {
		boolean statusofexpandbtn = action.IsElementEnabled(expandbtn)
		if(statusofexpandbtn == true) {
			action.Click(expandbtn)
			WebUI.delay(10)
			action.Click(addselecteditems)
			WebUI.delay(10)
			boolean statusoferrormsg = action.IsElementDisplayed(withoutselectionitemerrormsg)
			if(statusoferrormsg == true) {
				println ("Error message is appearing")
			}
			else {
				Assert.fail()
			}
		}
	}
}
