package com.ii4usersites

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

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
import com.kms.katalon.core.webui.driver.DriverFactory
import org.testng.Assert
import internal.GlobalVariable




public class MyDownloadsPage extends ConfirmationPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By ddSearch = By.xpath("(//input[@id='txtSearch'])[2]")
	By Searchbtn = By.xpath("//input[@id='ctl00_Body_btnSearch']")
	By ddrecord = By.xpath("(//label[contains(text(),'Pass Through')])[1]")
	By showunavailablechkbox = By.xpath("//span[@class = 'check .btn']")
	By imagecolumn = By.xpath("//th[contains(text(),'Image')]")
	By dtcolumn = By.xpath("//th[contains(text(),'DT')]")
	By jobnamecolumn = By.xpath("//th[contains(text(),'Job Name')]")
	By datecreated = By.xpath("//th[contains(text(),'Date Created')]")
	By statuscolumn = By.xpath("//th[contains(text(),'Status')]")
	By actioncolumn = By.xpath("//th[contains(text(),'Actions')]")
	By unavailablerecord = By.xpath("(//label[contains(text(),'Unavailable')])[1]")
	By mydownloadslink = By.xpath(".//*[@id='Body_divMyDownloadLink']/a")

	@Keyword
	public void ValidateOrder() {
		try {
			action.WaitVisible(mydownloadslink)
			String check_Order_num = GetConfNumAndValidateOrderOnMyDownloads()
			action.Click(mydownloadslink)
			action.WaitVisible(ddSearch)
			action.Type(ddSearch, check_Order_num)
			action.Click(Searchbtn)
			action.IsDisplayed(ddrecord)
		}
		catch(Exception e) {
			Assert.fail("ValidateOrder Failed Due to "+e)
		}
	}

	@Keyword
	public void ValidateMyDownloadsField() {
		try {
			action.IsElementDisplayed(showunavailablechkbox)
			action.IsElementDisplayed(imagecolumn)
			action.IsElementDisplayed(dtcolumn)
			action.IsElementDisplayed(jobnamecolumn)
			action.IsElementDisplayed(datecreated)
			action.IsElementDisplayed(statuscolumn)
			action.IsElementDisplayed(actioncolumn)
			//action.Click(showunavailablechkbox)
			//action.IsElementDisplayed(unavailablerecord)
		}
		catch(Exception e) {
			Assert.fail("ValidateMyDownloadsField Failed Due to "+e)
		}
	}
}
