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
	By metaggingbulkimport = By.xpath("//*[text()='Meta Tagging Bulk Import Tool']")
	By metaTaggingEditDelete  = By.xpath("(//span[contains(text(),'Meta Tagging Edit/Delete')])[1]")
	By metataggingcategoryitemmaintenance = By.xpath("//*[text()='Meta Tagging Category/Item Maintenance']")
	By metatagingcategorymaintenance = By.xpath("//*[text()='Meta Tagging Category Maintenance']")
	By metataggingcategoryitemmaintenancesubmenu = By.xpath("//*[text()='Meta Tagging Category Item Maintenance']")
	By globalmetataggingpage = By.xpath("(//span[contains(text(),'Global Meta Tagging Maintenance')])[1]")
	By globalmetataggingmaintenance = By.xpath("//*[text()='Global Meta Tagging Maintenance']")
	By itempartquantitymaintenance = By.xpath("(//span[contains(text(),'Item/Part Quantity Maintenance')])[1]")
	By resuorcemessagebtn = By.xpath("//*[@href='/InstantImpact/ResourceMessage/ResourceMessage.aspx']")
	By trainingresourcesbtn = By.xpath("//*[text()='Training Resources']")

	By fulfillmentbtn = By.xpath("//*[text()='Fulfillment']")
	By lowstocknotification = By.xpath("//*[@href='/Fulfillment/LowstockNotification.aspx']")
	By fulfillmentsearchbtn = By.xpath("//*[text()='Fulfillment Search']")
	By createfulfillmentitem = By.xpath("//*[text()='Create Fulfillment Item']")
	By fulfillmentproductunit = By.xpath("//*[text()='Fulfillment Product Unit']")
	By createfulfillmentproductunit = By.xpath("//*[text()='Create Fulfillment Product Unit']")
	By associtaeitemstoproductunit = By.xpath("//*[text()='Associate Items to Product Unit']")
	By fulfillmentcorpdistadmin = By.xpath("//*[text()='Fulfillment Corp/Distributor Admin']")
	By fulfillmentcorpmaintenance = By.xpath("//*[text()='Fulfillment Corp Maintenance']")


	By reports = By.xpath("//*[@href='/Fulfillment/Reports.aspx']")
	By colormaintenance = By.xpath("//*[text()='Color Maintenance']")
	By color = By.xpath("//*[@href='/Fulfillment/ColorMaintenance/FulfillmentColor.aspx']")
	By colortocorporation = By.xpath("//*[@href='/Fulfillment/ColorMaintenance/FulfillmentColorToCorp.aspx']")
	By sizemaintenance = By.xpath("//*[text()='Size Maintenance']")
	By size = By.xpath("//*[@href='/Fulfillment/SizeMaintenance/FulfillmentSize.aspx']")
	By sizetocorporation = By.xpath("//*[@href='/Fulfillment/SizeMaintenance/FulfillmentSizeToCorp.aspx']")
	By corpdistmaintenance = By.xpath("//*[text()='Corp/Dist Maintenance']")
	By fuifillmentcorpmaintenance = By.xpath("//*[@href='/Fulfillment/FulfillmentCorp.aspx']")
	By redbullsticthlab = By.xpath("//*[text()='Red Bull/Stitch Labs']")
	By Heading = By.xpath("//h1[Contains(text(),'Brandmuscle Admin Tool')]")
	By bannedphrasesbtn = By.xpath("//*[@href='/InstantImpact/BannedWords/BannedPhrases.aspx']")
	By itemgatinggroupmanagement = By.xpath("//span[contains(text(),'Item Gating Group Management')]")
	By standarditemgating = By.xpath("//span[contains(text(),'Standard Item Gating')]")
	By ii4crosscorp = By.xpath("//*[text()='ii4 Cross Corp']")
	By ii4crosscorpadmin = By.xpath("//*[text()='ii4 Cross Corp Admin']")
	By ii4crosscorpassociation = By.xpath("//*[text()='Cross Corp Associations']")
	By olof = By.xpath("//*[text()='Online Order Form']")
	By olofii4configuration = By.xpath("//*[text()='II4 Configuration']")
	By requestnewquotebtn = By.xpath("//*[text()='Request New Quote']")
	By quoteitemsearchbtn = By.xpath("//*[text()='Quote Item Search']")
	By estimatorassignment = By.xpath("//*[text()='Estimator Assignment']")
	By vendorprinteradmin = By.xpath("//*[text()='Vendor/Printer Admin']")
	By itemlistoptionsadmin = By.xpath("//*[text()='Item List Options Admin']")
	By productshots = By.xpath("//*[text()='Product Shots']")
	By productshotremovaltool = By.xpath("//*[text()='Product Shot Removal Tool']")
	By importproductshots = By.xpath("//*[text()='Product Shots Import Utility']")
	By quotetrackerbtn = By.xpath("//*[text()='QuoteTracker']")
	By requestnewquote = By.xpath("//*[text()='Request New Quote']")
	By stichlabbtn = By.xpath("//*[text()='Stitch Labs']")
	By stichlablookup = By.xpath("//*[text()='Stitch Labs Order Look-Up']")
	By fraudriskorders = By.xpath("//*[text()='Fraud Risk Orders']")
	By shippingerrors = By.xpath("//*[text()='Shipping Errors']")
	By invalidqtyorder = By.xpath("//*[text()='Invalid Quantity Orders']")
	By manuallycloseorders = By.xpath("//*[text()='Manually Close Orders']")
	By orderswithouttracking = By.xpath("//*[text()='Orders Without Tracking']")
	By createnewskus = By.xpath("//*[text()='Create New SKUs']")
	By proofgallery = By.xpath("//*[text()='Proof Gallery']")
	By assigncorpmarketsupplier = By.xpath("//*[text()='Assign Corporations / Markets / Suppliers']")
	By brandmuscleMenu = By.xpath("(//*[text()='Brandmuscle'])[1]")
	By reportsSubMenu = By.xpath("(//*[text()='Reports'])[1]")
	By invoiceSubMenu = By.xpath("(//*[text()='Invoice'])[1]")
	By invoiceLineItem = By.xpath("//*[text()='Invoice Line Items']")
	By ItemGatingGroupManagementSubMenu = By.xpath("//*[text()='Item Gating Group Management']")
	By administrativeItemTaggingSubMenu = By.xpath("//*[text()='Administrative Item Gating']")


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
		action.MouseHoverOnElement(instantimpact)
		action.MouseHoverOnElement(metataggingcategoryitemmaintenance)
		action.Click(metaTaggingEditDelete)
		action.WaitForPageToLoad()
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
			//WebUI.delay(3)
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
	
	
	@Keyword
	public void NavigateToII4CrossCorpAssociation()
	{
		try
		{
			
		
		 action.WaitVisible(instantimpact)
		 action.MouseHoverOnElement(instantimpact)
		 WebUI.delay(3)
		 action.WaitVisible(ii4crosscorp)
		 action.MouseHoverOnElement(ii4crosscorp)
		 WebUI.delay(2)
		 action.WaitVisible(ii4crosscorpadmin)
		 action.WaitVisible(ii4crosscorpassociation)
		 action.Click(ii4crosscorpassociation)
		 action.WaitForPageToLoad()
		 
		}
		catch(Exception e)
		{
			Assert.fail("NavigateToII4CrossCorpAssociation failed due to "+ e)
		}

	}


	@Keyword
	public void NavigateToItemGatingGroupManagementAdministrativeItemGating()
	{
		try
		{
			action.WaitVisible(instantimpact)
			action.MouseHoverOnElement(instantimpact)
			WebUI.delay(3)
			action.MouseHoverOnElement(ItemGatingGroupManagementSubMenu)
			WebUI.delay(2)
			//action.WaitVisible(ii4crosscorpadmin)
			action.Click(administrativeItemTaggingSubMenu)
			action.WaitForPageToLoad()

		}
		catch(Exception e)
		{
			Assert.fail("NavigateToItemGatingGroupManagementAdministrativeItemGating method failed due to "+ e)
		}
	}

	@Keyword
	public void NavigateToFulfillmentSearchPage()
	{
		try{
			action.MouseHoverOnElement(fulfillmentbtn)
			WebUI.delay(5)
			action.Click(fulfillmentsearchbtn)
		}
		catch(Exception e)
		{
			Assert.fail("Navigate To Fulfillment Search Page failed due to "+ e)
		}
	}

	@Keyword
	public void NavigateToTrainingResourcePage()
	{
		try{
			action.MouseHoverOnElement(instantimpact)
			WebUI.delay(3)
			action.Click(trainingresourcesbtn)
			action.WaitForPageToLoad()
		}
		catch(Exception e)
		{
			Assert.fail("Navigate To Training Resources Page failed due to "+ e)
		}
	}

	@Keyword
	public void NavigateToFufillmentPorductUnitPage()
	{
		try{
			action.MouseHoverOnElement(fulfillmentbtn)
			WebUI.delay(3)
			action.MouseHoverOnElement(fulfillmentproductunit)
			WebUI.delay(3)
			action.Click(createfulfillmentproductunit)
			action.WaitForPageToLoad()
		}
		catch(Exception e)
		{
			Assert.fail("Navigate To Fufillment PorductUnit Page failed due to "+ e)
		}
	}


	@Keyword
	public void NavigateToAssociateFulfillmentItemsPage()
	{
		try{
			action.MouseHoverOnElement(fulfillmentbtn)
			WebUI.delay(3)
			action.MouseHoverOnElement(fulfillmentproductunit)
			WebUI.delay(3)
			action.Click(associtaeitemstoproductunit)
			action.WaitForPageToLoad()
		}
		catch(Exception e)
		{
			Assert.fail("Navigate To Fufillment PorductUnit Page failed due to "+ e)
		}
	}

	@Keyword
	public void NavigateToFulfillmentColorPage()
	{
		try{
			action.MouseHoverOnElement(fulfillmentbtn)
			WebUI.delay(3)
			action.MouseHoverOnElement(colormaintenance)
			WebUI.delay(3)
			action.Click(color)
		}
		catch(Exception e)
		{
			Assert.fail("Navigate To Fulfillment Color Page failed due to "+ e)
		}
	}


	@Keyword
	public void NavigateToFulfillmentColorToCorp()
	{
		try{
			action.MouseHoverOnElement(fulfillmentbtn)
			WebUI.delay(3)
			action.MouseHoverOnElement(colormaintenance)
			WebUI.delay(3)
			action.Click(colortocorporation)
			action.WaitForPageToLoad()
		}
		catch(Exception e)
		{
			Assert.fail("Navigate To Fulfillment Color Page failed due to "+ e)
		}
	}


	@Keyword
	public void NavigateToFulfillmentSizePage()
	{
		try{
			action.MouseHoverOnElement(fulfillmentbtn)
			WebUI.delay(3)
			action.MouseHoverOnElement(sizemaintenance)
			WebUI.delay(3)
			action.Click(size)
			action.WaitForPageToLoad()
		}
		catch(Exception e)
		{
			Assert.fail("Navigate To Fulfillment Color Page failed due to "+ e)
		}
	}

	@Keyword
	public void NavigateToFulfillmentSizeToCorpPage()
	{
		try{
			action.MouseHoverOnElement(fulfillmentbtn)
			WebUI.delay(3)
			action.MouseHoverOnElement(sizemaintenance)
			WebUI.delay(3)
			action.Click(sizetocorporation)
			action.WaitForPageToLoad()
		}
		catch(Exception e)
		{
			Assert.fail("Navigate To Fulfillment Color Page failed due to "+ e)
		}
	}

	@Keyword
	public void NavigateToFulfillmentCorpDistrAdminPage()
	{
		try{
			action.MouseHoverOnElement(fulfillmentbtn)
			WebUI.delay(3)
			action.MouseHoverOnElement(corpdistmaintenance)
			WebUI.delay(3)
			action.Click(fulfillmentcorpdistadmin)
			action.WaitForPageToLoad()
		}
		catch(Exception e)
		{
			Assert.fail("Navigate To Fulfillment Corp Distr Admin Page failed due to "+ e)
		}
	}


	@Keyword
	public void NavigateToFulfillmentCormaintenancePage()
	{
		try{
			action.MouseHoverOnElement(fulfillmentbtn)
			WebUI.delay(3)
			action.MouseHoverOnElement(corpdistmaintenance)
			WebUI.delay(3)
			action.Click(fulfillmentcorpmaintenance)
			action.WaitForPageToLoad()
		}
		catch(Exception e)
		{
			Assert.fail("Navigate To Fulfillment Cormaintenance Page failed due to "+ e)
		}
	}


	@Keyword
	public void NavigateToFulfillmentReportsPage()
	{
		try{
			action.MouseHoverOnElement(fulfillmentbtn)
			WebUI.delay(3)
			action.MouseHoverOnElement(fulfillmentproductunit)
			WebUI.delay(3)
			action.Click(reports)
			action.WaitForPageToLoad()
		}
		catch(Exception e)
		{
			Assert.fail("Navigate To Fulfillment Reports Page failed due to "+ e)
		}
	}

	/**********************************************************05-11-2019 Meta Tag Automation*********************************************************************/

	/*TemplateFulfillment.aspx*/
	public void NavigateToItemSearchTaggingPage()
	{
		try{
			action.MouseHoverOnElement(instantimpact)
			action.MouseHoverOnElement(metataggingcategoryitemmaintenance)
			action.Click(itemsearchtagging)
			action.WaitForPageToLoad()
		}
		catch(Exception e)
		{
			Assert.fail("Navigate To Item Search Tagging Page failed due to "+ e)
		}
	}

	/*MetatagBulkImport.aspx*/
	public void NavigateToMetataggingBulkImportToolPage()
	{
		try{
			action.MouseHoverOnElement(instantimpact)
			action.MouseHoverOnElement(metataggingcategoryitemmaintenance)
			action.Click(metaggingbulkimport)
			action.WaitForPageToLoad()
		}
		catch(Exception e)
		{
			Assert.fail("Navigate To Metatagging Bulk Import Tool Page failed due to "+ e)
		}
	}

	/*CategoriesMaintenance.aspx*/
	public void NavigateToMetaTaggingCategoryMaintenancePage()
	{
		try{
			action.MouseHoverOnElement(instantimpact)
			action.MouseHoverOnElement(metataggingcategoryitemmaintenance)
			action.Click(metatagingcategorymaintenance)
			action.WaitForPageToLoad()
		}
		catch(Exception e)
		{
			Assert.fail("Navigate To Meta Tagging Category Maintenance Page failed due to "+ e)
		}
	}


	/*CategoryItemMaintenance.aspx*/
	public void NavigateToMetaTaggingCategoryItemMaintenancePage()
	{
		try{
			action.MouseHoverOnElement(instantimpact)
			action.MouseHoverOnElement(metataggingcategoryitemmaintenance)
			action.Click(metataggingcategoryitemmaintenancesubmenu)
			action.WaitForPageToLoad()
		}
		catch(Exception e)
		{
			Assert.fail("Navigate To MetaTagging Category Item Maintenance Page failed due to "+ e)
		}
	}


	/*CategoryItemEditDelete.aspx*/
	public void NavigateToMetaTaggingEditDeletePage()
	{
		try{
			action.MouseHoverOnElement(instantimpact)
			action.MouseHoverOnElement(metataggingcategoryitemmaintenance)
			action.Click(metaTaggingEditDelete)
			action.WaitForPageToLoad()
		}
		catch(Exception e)
		{
			Assert.fail("Navigate To Meta Tagging Edit Delete Page failed due to "+ e)
		}

	}


	/*GlobalMetaTaggingMaintenance.aspx*/
	public void NavigateToGlobalMetaTaggingMaintenancePage()
	{
		try{
			action.MouseHoverOnElement(instantimpact)
			action.MouseHoverOnElement(metataggingcategoryitemmaintenance)
			action.Click(globalmetataggingmaintenance)
			action.WaitForPageToLoad()
		}
		catch(Exception e)
		{
			Assert.fail("Navigate To Global Meta Tagging Maintenance Page failed due to "+ e)
		}
	}


	@Keyword
	public void NavigateToStitchLabsOrderLookUpPage()
	{
		try{
			action.MouseHoverOnElement(fulfillmentbtn)
			action.MouseHoverOnElement(stichlabbtn)
			action.Click(stichlablookup)
			action.WaitForPageToLoad()
		}
		catch(Exception e){
			Assert.fail("Navigate To Stitch Labs Order Look Up Page failed due to "+ e)
		}
	}


	@Keyword
	public void NavigateToFraudRiskOrdersPage()
	{
		try{
			action.MouseHoverOnElement(fulfillmentbtn)
			action.MouseHoverOnElement(stichlabbtn)
			action.Click(fraudriskorders)
			action.WaitForPageToLoad()
		}
		catch(Exception e){
			Assert.fail("Navigate To Fraud Risk Orders Page failed due to "+ e)
		}
	}


	@Keyword
	public void NavigateToShippingErrorsPage()
	{
		try{
			action.MouseHoverOnElement(fulfillmentbtn)
			action.MouseHoverOnElement(stichlabbtn)
			action.Click(shippingerrors)
			action.WaitForPageToLoad()
		}
		catch(Exception e){
			Assert.fail("Navigate To Shipping Errors Page failed due to "+ e)
		}
	}


	@Keyword
	public void NavigateToInvalidQtyOrdersPage()
	{
		try{
			action.MouseHoverOnElement(fulfillmentbtn)
			action.MouseHoverOnElement(stichlabbtn)
			action.Click(invalidqtyorder)
			action.WaitForPageToLoad()
		}
		catch(Exception e){
			Assert.fail("Navigate To Invalid Qty Orders Page failed due to "+ e)
		}
	}


	@Keyword
	public void NavigateToManuallyCloseOrdersPage()
	{
		try{
			action.MouseHoverOnElement(fulfillmentbtn)
			action.MouseHoverOnElement(stichlabbtn)
			action.Click(manuallycloseorders)
			action.WaitForPageToLoad()
		}
		catch(Exception e){
			Assert.fail("Navigate To Manually Close Orders Page failed due to "+ e)
		}
	}


	@Keyword
	public void NavigateToAddTrackingPage()
	{
		try{
			action.MouseHoverOnElement(fulfillmentbtn)
			action.MouseHoverOnElement(stichlabbtn)
			action.Click(orderswithouttracking)
			action.WaitForPageToLoad()
		}
		catch(Exception e){
			Assert.fail("Navigate To Add Tracking Page failed due to "+ e)
		}
	}


	@Keyword
	public void NavigateToCreateNewSKUsPage()
	{
		try{
			action.MouseHoverOnElement(fulfillmentbtn)
			action.MouseHoverOnElement(stichlabbtn)
			action.Click(createnewskus)
			action.WaitForPageToLoad()
		}
		catch(Exception e){
			Assert.fail("Navigate To CreateNewSKUs Page failed due to "+ e)
		}
	}


	@Keyword
	public void NavigateToImportProductShotsPage()
	{
		try{
			action.MouseHoverOnElement(instantimpact)
			action.MouseHoverOnElement(productshots)
			action.Click(importproductshots)
			action.WaitForPageToLoad()
		}
		catch(Exception e){
			Assert.fail("Navigate To Import Product Shots Page failed due to "+ e)
		}
	}


	@Keyword
	public void NavigateRemoveProductShotsRemovalPage()
	{
		try{
			action.MouseHoverOnElement(instantimpact)
			action.MouseHoverOnElement(productshots)
			action.Click(productshotremovaltool)
			action.WaitForPageToLoad()
		}
		catch(Exception e){
			Assert.fail("Navigate Remove Product Shots Removal Page failed due to "+ e)
		}
	}

	@Keyword
	public void NavigateAssignCorpSupplierMarketPage()
	{
		try{
			action.MouseHoverOnElement(proofgallery)
			action.Click(assigncorpmarketsupplier)
			action.WaitForPageToLoad()
		}
		catch(Exception e){
			Assert.fail("Navigate Assign Corp Supplier Market Page failed due to "+ e)
		}
	}
}
