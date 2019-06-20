package com.wswadmin

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
import com.utilities.Interactions

import internal.GlobalVariable

import org.openqa.selenium.WebDriver
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory




public class HomePage {

	WebDriver driver = DriverFactory.getWebDriver()
	Interactions action = new Interactions()


	By instantimpact = By.xpath("//*[text()='Instant Impact']")
	By metatagingitemmaintenance = By.xpath("//*[text()='Meta Tagging Category/Item Maintenance']")
	By itemsearchtagging = By.xpath("//*[text()='Item Search Tagging']")

	@Keyword
	def NavigateToItemSearchPage() {

		Actions act = new Actions(driver);

		act.moveToElement(instantimpact).perform();
		act.moveToElement(metatagingitemmaintenance).perform();
		act.moveToElement(itemsearchtagging).click().perform();
		action.WaitForPageToLoad()
	}
}
