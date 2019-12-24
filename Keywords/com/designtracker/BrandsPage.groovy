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
import internal.GlobalVariable

import org.openqa.selenium.WebDriver
import org.testng.Assert
import org.openqa.selenium.Alert
import org.openqa.selenium.By
import com.kms.katalon.core.webui.driver.DriverFactory
import java.util.Date
import java.time.LocalDateTime
import java.util.Calendar

public class BrandsPage {


	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By brandsheader = By.xpath("//*[text()='Brands']")

	By corpddn = By.id("ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlCorporation")
	By marketddn = By.id("ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlMarket")
	By supplierddn = By.id("ctl00_ctl00_cphMain_cphMain_ddlAllSuppliers")
	By brandname= By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvAddNewBrand_txtNewBrandName']")
	By searchbtn = By.id("ctl00_ctl00_cphMain_cphMain_btnFindBrands")
	By newbrand = By.id("ctl00_ctl00_cphMain_cphMain_lbtnCreateNewBrand")
	By brandchargebackrate = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvAddNewBrand_txtNewBrandChargeBackRate']")
	By clientbrandid = By.id("ctl00_ctl00_cphMain_cphMain_fvAddNewBrand_txtnewBrandClientBrandID")
	By corprequiredmssg = By.xpath("//span[contains(text(),'Corporation Required')]")
	By supplierrequiredmssg = By.xpath("//span[contains(text(),'Supplier Required')]")
	By marketrequiredmssg = By.xpath("//span[contains(text(),'Market Required')]")
	By brandnamerequiredmssg = By.xpath("//span[contains(text(),'Brand Name Required')]")
	By chargebackrequiredmssg = By.xpath("//span[contains(text(),'Brand Charge Back Rate Required')]")
	By brandidrequiredmssg = By.xpath("//span[contains(text(),'Client Brand ID Required')]")
	By addbrandbtn = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvAddNewBrand_btnAddNewBrand']")
	By successmssg = By.xpath("//ul[@class = 'JobMessageListWrapper']/li")
	By postupdate = By.id("ctl00_ctl00_cphMain_cphMain_lvBrandAdmin_lbtnReviewOrPostUpdates")
	By updateexistingbrand = By.id("ctl00_ctl00_cphMain_cphMain_lbtnUpdateExistingBrand")
	By setchargebackbysupplier = By.id("ctl00_ctl00_cphMain_cphMain_lbtnChargeBackBySupplier")
	By marketbrandreport = By.id("ctl00_ctl00_cphMain_cphMain_HyperLink1")
	By postupdatecorpddn = By.id("ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlCorporation")
	By postupdatemarketddn = By.id("ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlMarket")
	By postupdatereleasetoprodbtn = By.id("ctl00_ctl00_cphMain_cphMain_btnReleaseToProduction")
	By showretiredbrandchkbox = By.id("ctl00_ctl00_cphMain_cphMain_ckRetired")
	By searchresult = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_lbxBrandSearchResults']")
	By editselectedbrand = By.id("ctl00_ctl00_cphMain_cphMain_btnEditBrands")
	By updatebrandbtn = By.id("ctl00_ctl00_cphMain_cphMain_rptUpdateBrands_ctl02_btnUpdateBrands")
	By updatechargebackrate = By.id("ctl00_ctl00_cphMain_cphMain_rptUpdateBrands_ctl01_txtChargeBackRate")
	By updatebrandnamefield = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_txtBrandSearchText']")
	By chargeBackBySupplier = By.xpath("//a[@id='ctl00_ctl00_cphMain_cphMain_lbtnChargeBackBySupplier']")
	By progressIndicator = By.xpath("//div[@id='ctl00_ctl00_cphProgressIndicator_pnlProgressIndicator']/div[2]")
	By retiredCheckbox = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_rptUpdateBrands_ctl01_ckRetired']")
	By brandupdatemessage = By.xpath("//li[contains(text(),'Brands have been updated')]")
	By chargebackapplybtn = By.xpath(".//*[@id='ctl00_ctl00_cphMain_cphMain_fvChargeBackBySupplier_btnChargeBackBySupplier']")
	By showretiredcheckbox = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_ckRetired']")


	@Keyword
	public void VerifyBrandsPage() {
		try {
			action.VerifyCurrentPage("Brands.aspx")
		}
		catch(Exception e) {
			Assert.fail("Verify Brand Page Failed")
		}
	}

	@Keyword
	public void AddNewBrand() {
		try {
			LocalDateTime dateTime = LocalDateTime.now()

			action.WaitVisible(newbrand)
			action.Click(newbrand)
			action.WaitVisible(corpddn)
			action.SelectByText(corpddn, "Instant Impact 4.0 Demo Corp (Dist.)")
			WebUI.delay(2)
			action.SelectByText(marketddn, "Chicago Beverage Systems")
			WebUI.delay(2)
			action.SelectByText(supplierddn, "MILLER COORS BREWING COMPANY")
			WebUI.delay(2)
			String brand_name = "Brand"+dateTime
			action.Type(brandname,brand_name)
			WebUI.delay(2)
			action.Type(brandchargebackrate, "4.56")

			String brand_id = "23"+ dateTime

			action.Type(clientbrandid, brand_id)
			action.Click(addbrandbtn)
			action.WaitVisible(successmssg)
			ValidateNewAddedBrand(brand_name)
		}
		catch(Exception e) {
			println ("AddNewBrand Failed due to "+ e)
			Assert.fail("AddNewBrand Failed")
		}
	}


	@Keyword
	public void ValidatePostUpdate() {
		try {
			action.IsElementDisplayed(postupdatecorpddn)
			action.IsElementDisplayed(postupdatemarketddn)
		}
		catch(Exception e) {
			println ("ValidatePostUpdate Failed due to "+ e)
			Assert.fail("ValidatePostUpdate Failed")
		}
	}


	@Keyword
	public void PostUpdate() {
		try {
			action.IsElementDisplayed(postupdatecorpddn)
			action.SelectByText(postupdatecorpddn, "Instant Impact 4.0 Demo Corp (Dist.)")
			WebUI.delay(2)
			action.SelectByText(postupdatemarketddn, "Chicago Beverage Systems")
			action.WaitVisible(postupdatereleasetoprodbtn)
			action.Click(postupdatereleasetoprodbtn)
		}
		catch(Exception e) {
			println ("ValidatePostUpdate Failed due to "+ e)
			Assert.fail("ValidatePostUpdate Failed")
		}
	}

	@Keyword
	public void ValidateUpdateExistingBrand() {
		try {

			action.IsDisplayed(updateexistingbrand)
			action.Click(updateexistingbrand)
			WebUI.delay(8)
			action.IsElementDisplayed(corpddn)
			action.IsElementDisplayed(marketddn)
			action.IsElementDisplayed(supplierddn)
			action.IsElementDisplayed(brandname)
			action.IsElementDisplayed(searchbtn)
			action.IsElementDisplayed(showretiredbrandchkbox)
		}
		catch(Exception e) {
			println ("ValidateUpdateExistingBrand Failed due to "+ e)
			Assert.fail("ValidateUpdateExistingBrand Failed")
		}
	}


	@Keyword
	public void ValidateNewAddedBrand(String name) {
		try {

			action.IsDisplayed(updateexistingbrand)
			action.Click(updateexistingbrand)

			action.IsElementDisplayed(corpddn)
			action.SelectByText(corpddn, "Instant Impact 4.0 Demo Corp (Dist.)")
			WebUI.delay(2)
			action.IsElementDisplayed(marketddn)
			action.SelectByText(marketddn, "Chicago Beverage Systems")
			WebUI.delay(2)
			action.SelectByText(supplierddn, "MILLER COORS BREWING COMPANY")
			WebUI.delay(2)
			action.Type(brandname, name)
			action.Click(searchbtn)
			action.WaitVisible(searchresult)
		}
		catch(Exception e) {
			println ("ValidateNewAddedBrand Failed due to "+ e)
			Assert.fail("ValidateNewAddedBrand Failed")
		}
	}

	@Keyword

	public void EditExistingBrand() {
		try {
			LocalDateTime dateTime = LocalDateTime.now()

			action.WaitVisible(newbrand)
			action.Click(newbrand)
			//action.WaitVisible(progressIndicator)
			WebUI.delay(20)
			action.WaitVisible(corpddn)
			action.SelectByText(corpddn, "Instant Impact 4.0 Demo Corp (Dist.)")
			//action.WaitVisible(progressIndicator)
			WebUI.delay(3)
			action.SelectByText(marketddn, "Chicago Beverage Systems")
			//action.WaitVisible(progressIndicator)
			WebUI.delay(20)
			action.SelectByText(supplierddn, "MILLER COORS BREWING COMPANY")
			//action.WaitVisible(progressIndicator)
			WebUI.delay(4)
			String brand_name = "Brand"+dateTime
			action.Type(brandname,brand_name)
			WebUI.delay(3)
			action.Type(brandchargebackrate, "4.56")

			String brand_id = "23"+ dateTime

			action.Type(clientbrandid, brand_id)
			action.Click(addbrandbtn)
			action.WaitVisible(successmssg)

			action.Click(postupdate)
			WebUI.delay(2)
			action.SelectByText(postupdatecorpddn,"Instant Impact 4.0 Demo Corp (Dist.)")
			WebUI.delay(2)
			action.SelectByText(postupdatemarketddn, "Chicago Beverage Systems")
			WebUI.delay(2)
			action.WaitVisible(postupdatereleasetoprodbtn)
			action.Click(postupdatereleasetoprodbtn)
			WebUI.delay(2)

			action.IsDisplayed(updateexistingbrand)
			action.Click(updateexistingbrand)
			WebUI.delay(3)
			action.IsElementDisplayed(corpddn)
			action.SelectByText(corpddn, "Instant Impact 4.0 Demo Corp (Dist.)")
			WebUI.delay(2)
			action.IsElementDisplayed(marketddn)
			action.SelectByText(marketddn, "Chicago Beverage Systems")
			WebUI.delay(2)
			action.SelectByText(supplierddn, "MILLER COORS BREWING COMPANY")
			WebUI.delay(2)
			action.Type(updatebrandnamefield,brand_name)
			action.Click(searchbtn)
			action.WaitVisible(searchresult)
			action.SelectByText(searchresult, brand_name)
			action.Click(editselectedbrand)
			action.WaitVisible(updatebrandbtn)
		}
		catch(Exception e) {
			println ("EditExistingBrand Failed due to "+ e)
			Assert.fail("EditExistingBrand Failed")
		}
	}

	@Keyword
	public void CheckPostUpdate() {
		try {
			LocalDateTime dateTime = LocalDateTime.now()

			action.WaitVisible(newbrand)
			action.Click(newbrand)
			WebUI.delay(3)
			action.WaitVisible(corpddn)
			action.SelectByText(corpddn, "Instant Impact 4.0 Demo Corp (Dist.)")
			WebUI.delay(2)
			action.SelectByText(marketddn, "Chicago Beverage Systems")
			WebUI.delay(4)
			action.SelectByText(supplierddn, "MILLER COORS BREWING COMPANY")
			WebUI.delay(3)
			String brand_name = "Brand"+dateTime
			action.Type(brandname,brand_name)
			WebUI.delay(3)
			action.Type(brandchargebackrate, "4.56")

			String brand_id = "23"+ dateTime

			action.Type(clientbrandid, brand_id)
			action.Click(addbrandbtn)
			action.WaitVisible(successmssg)

			action.Click(postupdate)
			WebUI.delay(2)
			action.SelectByText(postupdatecorpddn,"Instant Impact 4.0 Demo Corp (Dist.)")
			WebUI.delay(2)
			action.SelectByText(postupdatemarketddn, "Chicago Beverage Systems")
			WebUI.delay(2)
			action.WaitVisible(postupdatereleasetoprodbtn)
			action.Click(postupdatereleasetoprodbtn)
			WebUI.delay(4)
		}
		catch(Exception e) {
			Assert.fail("ValidatePostUpdate failed due to "+e)
		}
	}

	@Keyword
	public void ValidateChargeBack() {
		try {
			action.Click(chargeBackBySupplier)
			WebUI.delay(3)
			action.Click(corpddn)
			action.SelectByText(corpddn, "Instant Impact 4.0 Demo Corp (Dist.)")
			action.WaitVisible(progressIndicator)
			WebUI.delay(1)
			action.SelectByText(marketddn, "Chicago Beverage Systems")
			action.WaitVisible(progressIndicator)
			WebUI.delay(1)
			action.SelectByText(supplierddn, "MILLER COORS BREWING COMPANY")
			action.WaitVisible(progressIndicator)
			WebUI.delay(1)
		}
		catch(Exception e) {
			Assert.fail("ValidateChargeBack failed due to "+e)
		}
	}

	@Keyword
	public void ValidateRetireBrand() {
		try {
			EditExistingBrand()
			action.WaitVisible(retiredCheckbox)
			action.Click(retiredCheckbox)
			action.Click(updatebrandbtn)
			action.WaitVisible(brandupdatemessage)
		}
		catch(Exception e) {
			Assert.fail("ValidateRetireBrand failed due to "+e)
		}
	}

	@Keyword
	public void ValidateAddBrandMandatoryField() {
		try {
			action.WaitVisible(newbrand)
			action.Click(newbrand)
			action.WaitVisible(progressIndicator)
			WebUI.delay(20)
			action.WaitVisible(addbrandbtn)
			action.Click(addbrandbtn)
			action.IsElementDisplayed(corprequiredmssg)
			action.IsElementDisplayed(supplierrequiredmssg)
			action.IsElementDisplayed(marketrequiredmssg)
			action.IsElementDisplayed(brandnamerequiredmssg)
			action.IsDisplayed(chargebackrequiredmssg)
			action.IsDisplayed(brandidrequiredmssg)
		}
		catch(Exception e) {
			Assert.fail("ValidateAddBrandMandatoryField failed due to "+e)
		}
	}

	@Keyword
	public void ValidateUpdateExistingMandatoryField() {
		try {
			action.WaitVisible(newbrand)
			action.WaitVisible(updateexistingbrand)
			action.WaitVisible(searchbtn)
			action.Click(searchbtn)
			action.IsElementDisplayed(corprequiredmssg)
			action.IsElementDisplayed(marketrequiredmssg)
		}
		catch(Exception e) {
			Assert.fail("ValidateAddBrandMandatoryField failed due to "+e)
		}
	}

	@Keyword
	public void ValidateChargeBackBySupplierMandatoryField() {
		try {
			action.WaitVisible(newbrand)
			action.WaitVisible(setchargebackbysupplier)
			action.Click(setchargebackbysupplier)
			action.WaitVisible(chargebackapplybtn)
			action.Click(chargebackapplybtn)
			action.IsElementDisplayed(corprequiredmssg)
			action.IsElementDisplayed(marketrequiredmssg)
			action.IsDisplayed(supplierrequiredmssg)
			action.IsDisplayed(chargebackrequiredmssg)
		}
		catch(Exception e) {
			Assert.fail("ValidateAddBrandMandatoryField failed due to "+e)
		}
	}

	@Keyword
	public void ValidateShowRetireBrands() {
		try {
			action.IsDisplayed(updateexistingbrand)
			// action.Click(updateexistingbrand)

			action.IsElementDisplayed(corpddn)
			action.SelectByText(corpddn, "Instant Impact 4.0 Demo Corp (Dist.)")
			action.WaitVisible(progressIndicator)
			WebUI.delay(10)
			action.IsElementDisplayed(marketddn)
			action.SelectByText(marketddn, "Chicago Beverage Systems")
			action.WaitVisible(progressIndicator)
			WebUI.delay(1)
			action.SelectByText(supplierddn, "MILLER COORS BREWING COMPANY")
			action.WaitVisible(progressIndicator)
			WebUI.delay(2)
			action.Type(updatebrandnamefield, "Brand")
			action.Click(showretiredcheckbox)
			WebUI.delay(1)
			action.Click(searchbtn)
			//action.WaitVisible(searchresult)
		}
		catch(Exception e) {
			Assert.fail("ValidateShowRetireBrands failed due to "+e)
		}
	}
}
