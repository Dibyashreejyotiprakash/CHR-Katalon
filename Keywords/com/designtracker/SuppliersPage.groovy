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
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable
import org.testng.Assert
public class SuppliersPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();


	By suppliersheader = By.xpath("//*[text()='Market Supplier']")
	By corpddn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlCorporation']")
	By marketddn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlMarket']")
	By suppliernametextbox = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_txtSupplier']")
	By showallsupliercheckbox = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_ckShowAllSuppliers']")
	By addnewsuppliercheckbox = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_ckAddNewSupplier']")

	By nexsuppliernametextbox = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_fvSupplier_txtSupplierName']")
	By address1 = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_fvSupplier_txtAddress1']")
	By address2 = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_fvSupplier_txtAddress2']")
	By city = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_fvSupplier_txtCity']")
	By state = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_fvSupplier_txtState']")
	By zip = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_fvSupplier_txtZip']")
	By phone = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_fvSupplier_txtPhone']")
	By clientsupplierid = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_fvSupplier_txtClientSupplierID']")
	By insertbutton = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_fvSupplier_InsertButton']")
	By supplieraddedmsg = By.xpath("//*[contains(text(),'New Supplier Added.')]")
	By suppliernameddn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_ddlAllSuppliers']")


	@Keyword
	public void VerifySuppliersPage() {
		try {
			String currenturl = action.GetCurrentURL();
			if(currenturl.contains("MarketSupplier.aspx")) {
				println ("Suppliers page is verified");
				boolean statusofsupplierheader = action.IsElementDisplayed(suppliersheader)
				Assert.assertTrue(statusofsupplierheader)
			}
		}
		catch(Exception e) {
			println ("Verify Suppliers Page failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void VerifySuppliersPageFieldsOnLoading() {
		try {
			boolean statusofcorpddn = action.IsElementDisplayed(corpddn)
			Assert.assertTrue(statusofcorpddn)

			boolean statusofmarketddn = action.IsElementDisplayed(marketddn)
			Assert.assertTrue(statusofmarketddn)
		}
		catch(Exception e) {
			println ("Verify Suppliers Page Fields On Loading failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void VerifySupplierNameShowAllSuppliersAndAddNewSuppliersCheckBox() {
		try {

			action.SelectByText(corpddn, "Instant Impact 4.0 Demo Corp (Dist.)")
			action.SelectByText(marketddn, "Chicago Beverage Systems")

			boolean statusofsuppliertextbox = action.IsElementDisplayed(suppliernametextbox)
			Assert.assertTrue(statusofsuppliertextbox)

			boolean statusofshowallsupplierscheckbox = action.IsElementDisplayed(showallsupliercheckbox)
			Assert.assertTrue(statusofshowallsupplierscheckbox)

			boolean statusofaddnewsuppliercheckbox = action.IsElementDisplayed(addnewsuppliercheckbox)
			Assert.assertTrue(statusofaddnewsuppliercheckbox)
		}
		catch(Exception e) {
			println ("Verify Supplier Name Show All Suppliers And Add New Suppliers CheckBox failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public String AddNewSuppliers() {
		String newsuppliername = null;
		try {
			action.SelectByText(corpddn, "Instant Impact 4.0 Demo Corp (Dist.)")
			action.SelectByText(marketddn, "Chicago Beverage Systems")
			action.Click(addnewsuppliercheckbox)
			newsuppliername = action.GenerateRandomAplphabaticString(6)
			String newclientsupplierid = action.GenerateRandomAplphabaNeumericString(5)
			action.Type(nexsuppliernametextbox, newsuppliername)
			action.Type(address1, "Lane-1")
			action.Type(address2, "Lane-2")
			action.Type(city, "AL")
			action.Type(state, "AL")
			action.Type(zip, "12345")
			action.Type(phone, "111-111-1111")
			action.Type(clientsupplierid, newclientsupplierid)
			action.Click(insertbutton)
			return newsuppliername;
		}
		catch(Exception e) {
			Assert.fail("Add New Suppliers failed due to "+ e)
		}
	}


	@Keyword
	public void VerifyNewlyAddedSupplier() {
		String newsuppliername = null;
		try {
			action.SelectByText(corpddn, "Instant Impact 4.0 Demo Corp (Dist.)")
			action.SelectByText(marketddn, "Chicago Beverage Systems")
			action.Click(addnewsuppliercheckbox)
			newsuppliername = action.GenerateRandomAplphabaticString(6)
			String newclientsupplierid = action.GenerateRandomAplphabaNeumericString(5)
			action.Type(nexsuppliernametextbox, newsuppliername)
			action.Type(address1, "Lane-1")
			action.Type(address2, "Lane-2")
			action.Type(city, "AL")
			action.Type(state, "AL")
			action.Type(zip, "12345")
			action.Type(phone, "111-111-1111")
			action.Type(clientsupplierid, newclientsupplierid)
			action.Click(insertbutton)
			action.Click(showallsupliercheckbox)
			action.SelectByText(suppliernameddn, newsuppliername)
		}
		catch(Exception e) {
			println ("Verify Newly Added Supplier failed due to "+ e)
			Assert.fail()
		}
	}
}
