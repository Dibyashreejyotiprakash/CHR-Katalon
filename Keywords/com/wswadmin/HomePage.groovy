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
import com.utilities.Interaction
import internal.GlobalVariable
import org.openqa.selenium.WebDriver
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

public class HomePage {

	WebDriver driver = DriverFactory.getWebDriver()
	Interaction action = new Interaction()


	By instantimpact = By.xpath("//*[text()='Instant Impact']")
	By metatagingitemmaintenance = By.xpath("//*[text()='Meta Tagging Category/Item Maintenance']")
	By itemsearchtagging = By.xpath("//*[text()='Item Search Tagging']")
	By metaTaggingEditDelete  = By.xpath("(//span[contains(text(),'Meta Tagging Edit/Delete')])[1]")

	By metataggingcategoryitemmaintenance = By.xpath("//*[text()='Meta Tagging Category Item Maintenance']")
	By metatagingcategorymaintenance = By.xpath("//*[text()='Meta Tagging Category Maintenance']")
	By globalmetataggingpage = By.xpath("(//span[contains(text(),'Global Meta Tagging Maintenance')])[1]")
	By itempartquantitymaintenance = By.xpath("(//span[contains(text(),'Item/Part Quantity Maintenance')])[1]")




	@Keyword
	def NavigateToItemSearchPage() {
		action.WaitVisible(instantimpact)
		action.Click(instantimpact)
		action.WaitVisible(metatagingitemmaintenance)
		action.MouseHoverOnElement(metatagingitemmaintenance)
		action.WaitVisible(itemsearchtagging)
		action.Click(itemsearchtagging)
	}


	@Keyword
	def NavigateToMetatagEditDeletePage() {
		action.WaitVisible(instantimpact)
		action.Click(instantimpact)
		action.WaitVisible(metatagingitemmaintenance)
		action.MouseHoverOnElement(metatagingitemmaintenance)
		action.WaitVisible(metaTaggingEditDelete)
		action.Click(metaTaggingEditDelete)
	}

	@Keyword
	public void NavigateToCategoryMaintenancePage() {
		action.WaitVisible(instantimpact)
		action.MouseHoverOnElement(instantimpact)
		action.WaitVisible(metatagingitemmaintenance)
		action.MouseHoverOnElement(metatagingitemmaintenance)
		action.WaitVisible(metatagingcategorymaintenance)
		action.MouseHoverAndClick(metatagingcategorymaintenance)
		action.WaitForPageToLoad()
	}

	@Keyword
	public void NavigateToCategoryItemMaintenancePage() {
		action.WaitVisible(instantimpact)
		action.MouseHoverOnElement(instantimpact)
		action.WaitVisible(metatagingitemmaintenance)
		action.MouseHoverOnElement(metatagingitemmaintenance)
		action.WaitVisible(metataggingcategoryitemmaintenance)
		action.MouseHoverAndClick(metataggingcategoryitemmaintenance)
		action.WaitForPageToLoad()
	}

	@Keyword
	public void NavigateToGlobalMetaTaggigPage() {
		action.WaitVisible(instantimpact)
		action.MouseHoverOnElement(instantimpact)
		action.WaitVisible(metatagingitemmaintenance)
		action.MouseHoverOnElement(metatagingitemmaintenance)
		action.WaitVisible(globalmetataggingpage)
		action.MouseHoverAndClick(globalmetataggingpage)
		action.WaitForPageToLoad()
	}


	@Keyword
	public void NavigateToItemPartQntyMaintenance() {
		action.WaitVisible(instantimpact)
		action.MouseHoverOnElement(instantimpact)
		WebUI.delay(3)
		action.WaitVisible(itempartquantitymaintenance)
		action.Click(itempartquantitymaintenance)
		action.WaitForPageToLoad()
	}
}
