package com.iiadmin

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

import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable

public class HomePage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();


	By systemsetupandmaintenance = By.xpath("//*[text()='System Setup and Maintenance']")
	By addcorporation = By.xpath("//*[text()='Add Corporation']")
	By editcorporation = By.xpath("//*[text()='Edit Corporation']")
	By othercontacts = By.xpath("//*[text()='Other Contacts']")
	By templateidsearch = By.xpath("//*[text()='Template ID Search']")

	By distribuotrsetup = By.xpath("//*[text()='Distributor Setup']")
	By adddistributor = By.xpath("//*[text()='Add Distributor']")
	By editdistributor = By.xpath("//*[text()='Edit Distributor']")

	By retailersetup = By.xpath("//*[text()='Retailer Setup']")
	By addretailer = By.xpath("//*[text()='Add Retailer']")
	By editretailersetup = By.xpath("//*[text()='Edit Retailer']")


	By storesetting = By.xpath("//*[text()='Store Settings']")
	By agencypricebreak = By.xpath("//*[text()='Agency Price Break']")
	By budget = By.xpath("//*[text()='Budgets']")
	By helpmenu = By.xpath("//*[text()='Help Menu']")
	By receipe = By.xpath("//*[text()='Recipes']")
	By aamlist = By.xpath("//*[text()='AAM List']")
	By designerlist = By.xpath("//*[text()='Designer List']")

	By couponadmin = By.xpath("//*[text()='Coupon Admin']")
	By maintaincoupon = By.xpath("//*[text()='Maintain Coupons']")


	By operations = By.xpath("//*[text()='Operations']")
	By shippingagents = By.xpath("//*[text()='Shipping Agents']")
	By useraccessandcontrol = By.xpath("//*[text()='User Access and Control']")
	By users = By.xpath("//*[text()='Users']")
	By editusers = By.xpath("//*[text()='Edit User']")
	By systemsetup = By.xpath("//a[contains(text(),'System Setup and Maintenance')]")
	By corpsetup = By.xpath("//a[contains(text(),'Corporation Setup')]")
	By editcorp = By.xpath("//a[contains(text(),'Edit Corporation')]")
	By corpdropdown = By.xpath("//select[@id='ctl00_Body_ddlCorps']")

	By graphicsmaintenace = By.xpath("//*[text()='Graphic Maintenance']")
	By corplist = By.xpath("//*[text()='Corporation List']")
	By catalogcategorysetup = By.xpath("//*[text()='Catalog Category Setup']")
	By generatebarcode = By.xpath("//*[text()='Generate Barcode']")



	@Keyword
	public void ClickOnShippinAgents() {
		try{
			action.MouseHoverOnElement(systemsetupandmaintenance)
			WebUI.delay(10)
			action.MouseHoverOnElement(operations)
			WebUI.delay(10)
			action.Click(shippingagents)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			Assert.fail("Click on Shipping agents failed due to "+ e)
		}
	}

	@Keyword
	public void CLickOnEditUser() {
		try{
			action.MouseHoverOnElement(useraccessandcontrol)
			action.MouseHoverOnElement(users)
			action.Click(editusers)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			Assert.fail("CLick On Edit User failed due to "+ e)
		}
	}




	@Keyword
	public void  NavigateToCorpListpage() {
		try{
			action.MouseHoverOnElement(graphicsmaintenace)
			WebUI.delay(3)
			action.Click(corplist)
			WebUI.delay(10)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			Assert.fail("Navigate To Corp List page failed due to "+ e)
		}
	}



	@Keyword
	public void  NavigateToCatalogCategorySetupPage() {
		try{
			action.MouseHoverOnElement(graphicsmaintenace)
			WebUI.delay(3)
			action.Click(catalogcategorysetup)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			Assert.fail("Navigate To Catalog Category Set Up Page failed due to "+ e)
		}
	}


	@Keyword
	public void  NavigateToGenerateBarCodePage() {
		try{
			action.MouseHoverOnElement(graphicsmaintenace)
			WebUI.delay(3)
			action.Click(generatebarcode)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			Assert.fail("Navigate To Generate Bar Code Page failed due to "+ e)
		}
	}

	@Keyword
	public void NavigateToAddNewCorpPage() {
		try{
			action.MouseHoverOnElement(systemsetupandmaintenance)
			WebUI.delay(3)
			action.MouseHoverOnElement(corpsetup)
			WebUI.delay(3)
			action.Click(addcorporation)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			Assert.fail("Navigate To Add New Corp Page failed due to "+ e)
		}
	}


	@Keyword
	public void NavigateToEditCorpPage() {
		try{
			action.MouseHoverOnElement(systemsetupandmaintenance)
			WebUI.delay(3)
			action.MouseHoverOnElement(corpsetup)
			WebUI.delay(3)
			action.Click(editcorporation)
			action.WaitForPageToLoad()
			action.VerifyCurrentPage("NewAccountSetup.aspx?Mode=Edit")
		}
		catch(Exception e) {
			Assert.fail("Navigate To Edit Corp Page failed due to "+ e)
		}
	}


	@Keyword
	public void NavigateToAddDistributorPage() {
		try{
			action.MouseHoverOnElement(systemsetupandmaintenance)
			WebUI.delay(3)
			action.MouseHoverOnElement(distribuotrsetup)
			WebUI.delay(3)
			action.Click(adddistributor)
			action.WaitForPageToLoad()
			action.VerifyCurrentPage("Distributors.aspx?Mode=Add")
		}
		catch(Exception e) {
			Assert.fail("Navigate To Add Distr. Page failed due to "+ e)
		}
	}


	@Keyword
	public void NavigateToEditDistributorPage() {
		try{
			action.MouseHoverOnElement(systemsetupandmaintenance)
			WebUI.delay(3)
			action.MouseHoverOnElement(distribuotrsetup)
			WebUI.delay(3)
			action.Click(editdistributor)
			action.WaitForPageToLoad()
			action.VerifyCurrentPage("Distributors.aspx?Mode=Edit")
		}
		catch(Exception e) {
			Assert.fail("Navigate To Add Distr. Page failed due to "+ e)
		}
	}


	@Keyword
	public void NavigateToAddRetailerPage() {
		try{
			action.MouseHoverOnElement(systemsetupandmaintenance)
			WebUI.delay(3)
			action.MouseHoverOnElement(retailersetup)
			WebUI.delay(3)
			action.Click(addretailer)
			action.WaitForPageToLoad()
			action.VerifyCurrentPage("Retailers.aspx?Mode=Add")
		}
		catch(Exception e) {
			Assert.fail("Navigate To Add Retailer Page failed due to "+ e)
		}
	}


	@Keyword
	public void NavigateToEditRetailerPage() {
		try{
			action.MouseHoverOnElement(systemsetupandmaintenance)
			WebUI.delay(3)
			action.MouseHoverOnElement(retailersetup)
			WebUI.delay(3)
			action.Click(editretailersetup)
			action.WaitForPageToLoad()
			action.VerifyCurrentPage("Retailers.aspx?Mode=Edit")
		}
		catch(Exception e) {
			Assert.fail("Navigate To Edit Retailer Page failed due to "+ e)
		}
	}


	@Keyword
	public void NavigateToMainTainCouponPage() {
		try{
			action.MouseHoverOnElement(systemsetupandmaintenance)
			WebUI.delay(3)
			action.MouseHoverOnElement(couponadmin)
			WebUI.delay(3)
			action.Click(maintaincoupon)
			action.WaitForPageToLoad()
			action.VerifyCurrentPage("Coupons/Coupons.aspx")
		}
		catch(Exception e) {
			Assert.fail("Navigate To Maintain Coupon Page failed due to "+ e)
		}
	}

	@Keyword
	public void NavigateToAgencyPriceBreakPage() {
		try{
			action.MouseHoverOnElement(systemsetupandmaintenance)
			WebUI.delay(3)
			action.MouseHoverOnElement(storesetting)
			WebUI.delay(3)
			action.Click(agencypricebreak)
			action.WaitForPageToLoad()
			action.VerifyCurrentPage("AgencyPriceBreak.aspx")
		}
		catch(Exception e) {
			Assert.fail("Navigate To Agaency Price Break Page failed due to "+ e)
		}
	}


	@Keyword
	public void NavigateToBudgetsPage() {
		try{
			action.MouseHoverOnElement(systemsetupandmaintenance)
			WebUI.delay(3)
			action.MouseHoverOnElement(storesetting)
			WebUI.delay(3)
			action.Click(budget)
			action.WaitForPageToLoad()
			action.VerifyCurrentPage("Budgets.aspx")
		}
		catch(Exception e) {
			Assert.fail("Navigate To Budget Page failed due to "+ e)
		}
	}

	@Keyword
	public void NavigateToHelpMenuPage() {
		try{
			action.MouseHoverOnElement(systemsetupandmaintenance)
			WebUI.delay(3)
			action.MouseHoverOnElement(storesetting)
			WebUI.delay(3)
			action.Click(helpmenu)
			action.WaitForPageToLoad()
			action.VerifyCurrentPage("HelpMenu.aspx")
		}
		catch(Exception e) {
			Assert.fail("Navigate To Help Menu Page failed due to "+ e)
		}
	}


	@Keyword
	public void NavigateToReceipePage() {
		try{
			action.MouseHoverOnElement(systemsetupandmaintenance)
			WebUI.delay(3)
			action.MouseHoverOnElement(storesetting)
			WebUI.delay(3)
			action.Click(receipe)
			action.WaitForPageToLoad()
			action.VerifyCurrentPage("RecipeMaintenance.aspx")
		}
		catch(Exception e) {
			Assert.fail("Navigate To Receipe Page failed due to "+ e)
		}
	}

	@Keyword
	public void NavigateToAAMListPage() {
		try{
			action.MouseHoverOnElement(systemsetupandmaintenance)
			WebUI.delay(3)
			action.MouseHoverOnElement(storesetting)
			WebUI.delay(3)
			action.Click(aamlist)
			action.WaitForPageToLoad()
			action.VerifyCurrentPage("AAMList.aspx")
		}
		catch(Exception e) {
			Assert.fail("Navigate To AAM List Page failed due to "+ e)
		}
	}


	@Keyword
	public void NavigateToDesignerListPage() {
		try{
			action.MouseHoverOnElement(systemsetupandmaintenance)
			WebUI.delay(3)
			action.MouseHoverOnElement(storesetting)
			WebUI.delay(3)
			action.Click(designerlist)
			action.WaitForPageToLoad()
			action.VerifyCurrentPage("DesignerList.aspx")
		}
		catch(Exception e) {
			Assert.fail("Navigate To Designer List Page failed due to "+ e)
		}
	}
}
