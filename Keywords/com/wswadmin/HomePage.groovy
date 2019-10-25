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
	By quotetracker = By.xpath("//*[text()='QuoteTracker']")
	By quoteitemsearch = By.xpath("//*[text()='Quote Item Search']")
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
	By ii4crosscorp = By.xpath("//*[text()='ii4 Cross Corp']")
	By ii4crosscorpadmin = By.xpath("//*[text()='ii4 Cross Corp Admin']")
	By olof = By.xpath("//*[text()='Online Order Form']")
	By olofii4configuration = By.xpath("//*[text()='II4 Configuration']")


	By requestnewquotebtn = By.xpath("//*[text()='Request New Quote']")
	By quoteitemsearchbtn = By.xpath("//*[text()='Quote Item Search']")
	By estimatorassignment = By.xpath("//*[text()='Estimator Assignment']")
	By vendorprinteradmin = By.xpath("//*[text()='Vendor/Printer Admin']")
	By itemlistoptionsadmin = By.xpath("//*[text()='Item List Options Admin']")
	By productshots = By.xpath("//*[text()='Product Shots']")
	By productshotremovaltool = By.xpath("//*[text()='Product Shot Removal Tool']")
	By quotetrackerbtn = By.xpath("//*[text()='QuoteTracker']")
	By requestnewquote = By.xpath("//*[text()='Request New Quote']")




	By brandmuscleMenu = By.xpath("(//*[text()='Brandmuscle'])[1]")
	By reportsSubMenu = By.xpath("(//*[text()='Reports'])[1]")
	By invoiceSubMenu = By.xpath("(//*[text()='Invoice'])[1]")
	By invoiceLineItem = By.xpath("//*[text()='Invoice Line Items']")















	@Keyword
	public void NavigateToInvoicePage()
	{
		try
		{
			action.MouseHoverOnElement(brandmuscleMenu)
			WebUI.delay(5)
			action.MouseHoverOnElement(reportsSubMenu)
			WebUI.delay(5)
			action.Click(invoiceSubMenu)
			WebUI.delay(10)
			
		}
		catch(Exception e)
		{
			Assert.fail("NavigateToInvoice Failed due to" +e)
		}
	}

	@Keyword
	public boolean VerifyInvoicePage()
	{
		try
		{
			boolean isPageVerified = false
			String expectedUrl = "Invoices/InvoiceList.aspx"
			WebUI.delay(5)
			 String actualUrl = action.GetCurrentURL()
			 WebUI.delay(5)
			 
			if(actualUrl.contains(expectedUrl))
			{
				println ("************ Invoice Page Verified Successfully ***********" )
				isPageVerified = true
			}
			return isPageVerified
			
		}
		catch(Exception e)
		{
			Assert.fail("VerifyInvoicePage Failed due to" +e)
		}
	}



	@Keyword
	public void NavigateToInvoiceLineItemsPage()
	{
		try
		{
			action.MouseHoverOnElement(brandmuscleMenu)
			WebUI.delay(5)
			action.MouseHoverOnElement(reportsSubMenu)
			WebUI.delay(5)
			action.Click(invoiceLineItem)
			WebUI.delay(10)
			
		}
		catch(Exception e)
		{
			Assert.fail("NavigateToInvoiceLineItemsPage Failed due to" +e)
		}
	}

	@Keyword
	public boolean VerifyInvoiceLineItemsPage()
	{
		try
		{
			boolean isPageVerified = false
			String expectedUrl = "Invoices/LineItemShipping.aspx"
			WebUI.delay(5)
			 String actualUrl = action.GetCurrentURL()
			 WebUI.delay(5)
			 
			if(actualUrl.contains(expectedUrl))
			{
				println ("************ Invoice Line Items Page Verified Successfully ***********" )
				isPageVerified = true
			}
			return isPageVerified
			
		}
		catch(Exception e)
		{
			Assert.fail("VerifyInvoicePage Failed due to" +e)
		}
	}



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


	@Keyword
	public void NavigateToRequestNewQuote()
	{
		try{
			action.MouseHoverOnElement(quotetracker)
			action.Click(requestnewquotebtn)
			action.WaitForPageToLoad()
		}
		catch(Exception e)
		{
			Assert.fail("Navigate To Request New Quote failed due to "+ e)
		}
	}

	@Keyword
	public void NavigateToQuoteItemSearch()
	{
		try{
			action.MouseHoverOnElement(quotetracker)
			action.Click(quoteitemsearch)
			action.WaitForPageToLoad()
		}
		catch(Exception e)
		{
			Assert.fail("Navigate Quote Item Search failed due to "+ e)
		}
	}

	@Keyword
	public void NavigateToEstimatorAssignment()
	{
		try{
			action.MouseHoverOnElement(quotetracker)
			action.Click(estimatorassignment)
			action.WaitForPageToLoad()
		}
		catch(Exception e)
		{
			Assert.fail("Navigate To Estimator Assignment failed due to "+ e)
		}
	}


	@Keyword
	public void NavigateToVendorPrinterAdmin()
	{
		try{
			action.MouseHoverOnElement(quotetracker)
			action.Click(vendorprinteradmin)
			action.WaitForPageToLoad()
		}
		catch(Exception e)
		{
			Assert.fail("Navigate To Estimator Assignment failed due to "+ e)
		}
	}

	@Keyword
	public void NavigateToItemListOptionsAdmin()
	{
		try{
			action.MouseHoverOnElement(quotetracker)
			action.Click(itemlistoptionsadmin)
			action.WaitForPageToLoad()
		}
		catch(Exception e)
		{
			Assert.fail("Navigate To Estimator Assignment failed due to "+ e)
		}
	}

	@Keyword
	public void NavigateToII4CrossCorp()
	{
		action.WaitVisible(instantimpact)
		action.MouseHoverOnElement(instantimpact)
		WebUI.delay(3)
		action.WaitVisible(ii4crosscorp)
		action.MouseHoverOnElement(ii4crosscorp)
		WebUI.delay(2)
		action.WaitVisible(ii4crosscorpadmin)
		action.Click(ii4crosscorpadmin)
		action.WaitForPageToLoad()

	}

	@Keyword
	public void NavigateToProductShotRemovalToolPage()
	{
		try{
			action.MouseHoverOnElement(instantimpact)
			WebUI.delay(3)
			action.MouseHoverOnElement(productshots)
			WebUI.delay(3)
			action.Click(productshotremovaltool)
			action.WaitForPageToLoad()
		}
		catch(Exception e)
		{
			Assert.fail("Navigate To Product Shot Removal Tool Page failed due to "+ e)
		}
	}

}
