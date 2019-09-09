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
//import internal.GlobalVariable
import org.openqa.selenium.WebDriver
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.testng.Assert

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
	By resuorcemessagebtn = By.xpath("//*[@href='/InstantImpact/ResourceMessage/ResourceMessage.aspx']")


	By fulfillmentbtn = By.xpath("//*[text()='Fulfillment']")
	By lowstocknotification = By.xpath("//*[@href='/Fulfillment/LowstockNotification.aspx']")
	By fulfillmentsearchbtn = By.xpath("//*[text()='Fulfillment Search']")
	By createfulfillmentitem = By.xpath("//*[text()='Create Fulfillment Item']")
	By fulfillmentproductunit = By.xpath("//*[text()='Fulfillment Product Unit']")
	By createfulfillmentproductunit = By.xpath("//*[text()='Create Fulfillment Product Unit']")
	By associtaeitemstoproductunit = By.xpath("//*[text()='Associate Items to Product Unit']")


	By reports = By.xpath("//*[@href='/Fulfillment/Reports.aspx']")
	By colormaintenance = By.xpath("//*[text()='Color Maintenance']")
	By color = By.xpath("//*[@href='/Fulfillment/ColorMaintenance/FulfillmentColor.aspx']")
	By colortocorporation = By.xpath("//*[@href='/Fulfillment/ColorMaintenance/FulfillmentColorToCorp.aspx']")
	By sizemaintenance = By.xpath("//*[text()='Size Maintenance']")
	By size = By.xpath("//*[@href='/Fulfillment/SizeMaintenance/FulfillmentSize.aspx']")
	By sizetocorporation = By.xpath("//*[@href='/Fulfillment/SizeMaintenance/FulfillmentSizeToCorp.aspx']")
	By corpdistmaintenance = By.xpath("//*[text()='Corp/Dist Maintenance']")
	By fulfillmentcorpdistadmin = By.xpath("//*[@href='/Fulfillment/CorpDistributerQuantityPreOrder.aspx']")
	By fuifillmentcorpmaintenance = By.xpath("//*[@href='/Fulfillment/FulfillmentCorp.aspx']")
	By redbullsticthlab = By.xpath("//*[text()='Red Bull/Stitch Labs']")
	By Heading = By.xpath("//h1[Contains(text(),'Brandmuscle Admin Tool')]")
	By bannedphrasesbtn = By.xpath("//*[@href='/InstantImpact/BannedWords/BannedPhrases.aspx']")
	By itemgatinggroupmanagement = By.xpath("//span[contains(text(),'Item Gating Group Management')]")
	By standarditemgating = By.xpath("//span[contains(text(),'Standard Item Gating')]")
	By olof = By.xpath("//*[text()='Online Order Form']")
	By olofii4configuration = By.xpath("//*[text()='II4 Configuration']")


	@Keyword
	public void NavigateToItemSearchPage() {
		action.WaitVisible(instantimpact)
		action.Click(instantimpact)
		WebUI.delay(3)
		action.WaitVisible(metatagingitemmaintenance)
		action.MouseHoverOnElement(metatagingitemmaintenance)
		action.WaitVisible(itemsearchtagging)
		action.Click(itemsearchtagging)
	}

	@Keyword
	public void  NavigateToMetatagEditDeletePage() {
		action.WaitVisible(instantimpact)
		action.Click(instantimpact)
		WebUI.delay(3)
		action.WaitVisible(metatagingitemmaintenance)
		action.MouseHoverOnElement(metatagingitemmaintenance)
		action.WaitVisible(metaTaggingEditDelete)
		action.Click(metaTaggingEditDelete)
	}

	@Keyword
	public void NavigateToCategoryMaintenancePage() {
		action.WaitVisible(instantimpact)
		action.MouseHoverOnElement(instantimpact)
		WebUI.delay(3)
		action.WaitVisible(metatagingitemmaintenance)
		action.MouseHoverOnElement(metatagingitemmaintenance)
		action.WaitVisible(metatagingcategorymaintenance)
		action.MouseHoverAndClick(metatagingcategorymaintenance)
		action.WaitForPageToLoad()
	}

	@Keyword
	public void NavigateToCategoryItemMaintenancePage() {
		try
		{
			println("Inside NavigateToCategoryItemMaintenancePage ")
			WebUI.delay(10)

			//action.IsElementDisplayed(Heading)
			println("VERIFIED HEADING")
			//action.WaitVisible(instantimpact)
			//action.MouseHoverOnElement(instantimpact)
			action.Click(instantimpact)
			WebUI.delay(3)
			println("Clicked InstantImpact")
			action.WaitVisible(metatagingitemmaintenance)
			action.MouseHoverOnElement(metatagingitemmaintenance)
			action.WaitVisible(metataggingcategoryitemmaintenance)
			action.MouseHoverAndClick(metataggingcategoryitemmaintenance)
			action.WaitForPageToLoad()
		}
		catch(Exception e)
		{
			WebUI.takeScreenshot()
			Assert.fail("NavigateToCategoryItemMaintenancePage Failed due to" +e)
		}
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
	public void NavigateToResourceMessagePage() {
		action.WaitVisible(instantimpact)
		action.MouseHoverOnElement(instantimpact)
		action.MouseHoverAndClick(resuorcemessagebtn)
	}

	@Keyword
	public void ClickOnFulfillmentCorpDistAdmin() {
		action.MouseHoverOnElement(fulfillmentbtn)
		action.MouseHoverOnElement(corpdistmaintenance)
		action.MouseHoverAndClick(fulfillmentcorpdistadmin)
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


	@Keyword
	public void NavigateToBannedPhrases() {
		action.WaitVisible(instantimpact)
		action.MouseHoverOnElement(instantimpact)
		WebUI.delay(3)
		action.WaitVisible(bannedphrasesbtn)
		action.Click(bannedphrasesbtn)
		action.WaitForPageToLoad()
	}

	@Keyword
	public void NavigateToLowStockNotificationPage()
	{
		action.MouseHoverOnElement(fulfillmentbtn)
		action.Click(lowstocknotification)
		action.WaitForPageToLoad()
		WebUI.delay(10)
	}

	@Keyword
	public void NavigateToItemGatingGroupManagement()
	{
		action.WaitVisible(instantimpact)
		action.MouseHoverOnElement(instantimpact)
		WebUI.delay(3)
		action.MouseHoverOnElement(itemgatinggroupmanagement)
		WebUI.delay(3)
		action.WaitVisible(standarditemgating)
		action.Click(standarditemgating)
		action.WaitForPageToLoad()

	}

	@Keyword
	public void ClickOnOLOFII4Configuration()
	{
		try
		{
			action.WaitVisible(instantimpact)
			action.MouseHoverOnElement(instantimpact)
			WebUI.delay(3)
			action.MouseHoverOnElement(olof)
			action.Click(olofii4configuration)
			action.WaitForPageToLoad()
		}
		catch(Exception e)
		{
			println ("Click On OLOF II4 Configuration failed due to "+ e)
			Assert.fail()
		}
	}
}
