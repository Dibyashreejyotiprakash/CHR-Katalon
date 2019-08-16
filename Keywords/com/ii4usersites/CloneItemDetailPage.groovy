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
import org.eclipse.persistence.internal.jpa.parsing.jpql.antlr.JPQLParser.deleteClause_scope
import org.openqa.selenium.Alert
import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable

public class CloneItemDetailPage {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By myitemslable = By.xpath("//*[@id='ctl00_Body_ItemsGrid']")
	By expandbtn = By.xpath("//*[@id='ctl00_Body_ItemsGrid_ctl00']//td[1]/button")
	By editlink = By.xpath("//*[@id='ctl00_Body_ItemsGrid_ctl00']//td[3]/a")
	By deletelink = By.xpath("//*[@id='ctl00_Body_ItemsGrid_ctl00']//td[4]/a")

	@Keyword
	public void VerifyEditLink() {
		boolean statusofvisibilityofeditlink = action.IsElementDisplayed(editlink)
		Assert.assertTrue(statusofvisibilityofeditlink)
		if(statusofvisibilityofeditlink == true) {
			boolean statusofenabilityofeditlink = action.IsElementDisplayed(editlink)
			Assert.assertTrue(statusofenabilityofeditlink)
			if(statusofenabilityofeditlink == true) {
				action.Click(editlink)
				action.WaitForPageToLoad()
			}
		}
	}


	@Keyword
	public void VerifyDeleteLink() {
		boolean statusofvisibilityofdeletelink = action.IsElementDisplayed(deletelink)
		Assert.assertTrue(statusofvisibilityofdeletelink)
		if(statusofvisibilityofdeletelink == true) {
			boolean statusofenabilityofdeletelink = action.IsElementDisplayed(deletelink)
			Assert.assertTrue(statusofenabilityofdeletelink)
			if(statusofenabilityofdeletelink == true) {
				action.Click(deletelink)
				WebUI.delay(5)
				action.AcceptAlert()
			}
		}
	}
}
