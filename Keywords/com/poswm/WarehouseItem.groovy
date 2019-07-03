package com.poswm

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

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

import com.utilities.Interaction
import internal.GlobalVariable
import org.openqa.selenium.WebDriver
import org.testng.Assert
import org.openqa.selenium.Alert
import org.openqa.selenium.By
import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable

public class WarehouseItem {


	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By itemInformationDivision = By.xpath("//*[@id='ctl00_MainContent_radWizardBar']")
	By txbName = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_radShortDescription']")
	By ApproverDropDown = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_radApprover_Input']")
	By approverListDivision = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_radApprover_DropDown']")
	By approverFirst = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_radApprover_DropDown']/div/ul/li[3]")
	By productType = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_radProductType_Input']")
	By divProductType = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_radProductType_DropDown']")
	By firstProductType = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_radProductType_DropDown']/div/ul/li[2]")
	By supplierDropDown = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_radSupplier_Input']")
	By supplierListDivision = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_radSupplier_DropDown']")
	By supplierFirstOption = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_radSupplier_DropDown']/div/ul/li[2]")
	By PremiseTypeDropDown = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_radPremiseType_Input']")
	By  PremiseTypeListDiv = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_radPremiseType_DropDown']")
	By premiseFirstOption = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_radPremiseType_DropDown']/div/ul/li[2]")
	By salesDivisionDropDown = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_radSalesDivision_Input']")
	By salesDivisionListDiv = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_radSalesDivision_DropDown']")
	By salesDivisionSecondOption = By.xpath("//*[text()='Big Apple']/input")
	//By salesDivisionSecondOption =By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_radSalesDivision_DropDown']/div//following-sibling::ul/li[2]")
	By seasonalType = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_radSeasonalType_Input']")
	By seasonalTypeDiv = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_radSeasonalType_DropDown']/ul")
	By seasonalTypeFisrOption = By.xpath("//*[text()='Halloween']")
	//By seasonalTypeFisrOption = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_radSeasonalType_DropDown']/div/ul/li[3]")
	By demographicsDropDown = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_radDemographic_Input']")
	By demographicsDiv = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_radDemographic_DropDown']")
	By demographic2ndOption = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_radDemographic_DropDown']/div/div//following-sibling::ul/li[2]")
	By txbSupplierItemCode = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_radSupplierItemCode']")
	By txbUnitCost = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_radUnitCost']")
	By txbUnitOfMeasure =By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_radUnitOfMeasurement']")
	By txbDescription = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_radLongDescription']")
	By txbNotes = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_radNotes']")
	//By saveIcon = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_btnCreate']")
	By saveIconItemInfo = By.xpath("//input[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_btnCreate']")

	//By nextButton = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_btnNext']")
	By nextButton = By.xpath("//input[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_btnNext']")
	By divisionImage = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i1_i0_ucItemImage_pnlItemImage']")
	//By btnSelect = By.xpath("//*[@value='Select']")
	//By btnSelect = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i1_i0_ucItemImage_radImageUploadfakeInput0']")

	//By btnSelect = By.xpath("//*[@class='ruFileWrap ruStyled']//following-sibling::input[@class='ruButton ruBrowse']")

	By btnSelect = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i1_i0_ucItemImage_radImageUploadfakeInput0']/following-sibling::input[1]")
	By itemInformationConfirmationMsg = By.xpath("ctl00_MainContent_radNotifyMessage_simpleContentDiv")
	By saveIconImage = By.xpath("//input[@id='ctl00_MainContent_radWizardBar_i1_i0_ucItemImage_btnSaveImage']")
	By imageNextBtn = By.xpath("//input[@id='ctl00_MainContent_radWizardBar_i1_i0_ucItemImage_btnNext']")
	By divBrands = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i2_i0_ucItemBrands_rlbBrands']")
	By brandFirstValue = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i2_i0_ucItemBrands_rlbBrands']/div[2]/ul[1]/li[1]")
	By transeferRightBtn = By.xpath("//*[@class='rlbButtonIcon rlbIconTransferRight']")
	By brandSaveBtn = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i2_i0_ucItemBrands_btnUpdate']")
	By brandNextBtn = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i2_i0_ucItemBrands_btnNext']")





	@Keyword
	public void FillItemInformationSection(){
		action.WaitVisible(txbName)
		action.Type(txbName, "test")

		action.Click(ApproverDropDown)
		action.WaitVisible(approverListDivision)
		action.WaitTime(3)
		action.Click(approverFirst)
		action.WaitTime(5)

		action.Click(productType)
		action.WaitVisible(divProductType)
		action.WaitTime(3)
		action.Click(firstProductType)
		action.WaitTime(3)

		action.Click(supplierDropDown)
		action.WaitVisible(supplierListDivision)
		action.WaitTime(3)
		action.Click(supplierFirstOption)
		action.WaitTime(3)

		action.Click(PremiseTypeDropDown)
		action.WaitVisible(PremiseTypeListDiv)
		action.WaitTime(3)
		action.Click(premiseFirstOption)
		action.WaitTime(3)

		action.Click(salesDivisionDropDown)
		action.WaitVisible(salesDivisionListDiv)
		action.WaitTime(3)
		action.Click(salesDivisionSecondOption)
		action.WaitTime(2)

		//action.Click(seasonalType)
		//action.WaitVisible(seasonalTypeDiv)
		//action.WaitTime(3)
		//action.Click(seasonalTypeFisrOption)
		//action.WaitTime(2)

		action.Click(demographicsDropDown)
		action.WaitVisible(demographicsDiv)
		action.WaitTime(3)
		action.Click(demographic2ndOption)
		action.WaitTime(2)

		action.Type(txbSupplierItemCode, "testSupp")
		action.Type(txbUnitCost, "10")
		action.Type(txbUnitOfMeasure, "10")

		action.Type(txbDescription, "testDesc")
		action.Type(txbNotes, "testNotes")
		action.WaitTime(15)


		action.ScrollToViewElement(saveIconItemInfo)
		action.Click(saveIconItemInfo)
		action.WaitTime(10)
		//action.WaitTillNotVisible(itemInformationConfirmationMsg, 300)
		action.ScrollToViewElement(nextButton)
		action.Click(nextButton)
		action.WaitTime(5)
		action.WaitVisible(divisionImage)
		action.WaitTime(5)

	}

	@Keyword
	public void FillImageSection(){


		action.ScrollToViewElement(saveIconImage)
		action.Click(saveIconImage)
		action.Click(imageNextBtn)
		action.WaitVisible(divBrands)

	}
	@Keyword
	public void FillBrandSection()
	{
		action.Click(brandFirstValue)
		action.Click(transeferRightBtn)
		action.ScrollToViewElement(brandSaveBtn)
		action.Click(brandNextBtn)

	}















}
