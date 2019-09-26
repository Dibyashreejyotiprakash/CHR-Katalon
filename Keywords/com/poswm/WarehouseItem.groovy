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
	By salesDivisionSecondOption = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_radSalesDivision_DropDown']/div/ul/li[1]")
	By salesDivisionThirdOption = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_radSalesDivision_DropDown']/div/ul/li[2]")
	By salesDivisionFourthOption = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_radSalesDivision_DropDown']/div/ul/li[3]")
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
	//By txbDescription = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_radLongDescription']")
	//By txbNotes = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_radNotes']")
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
	By txbDescription = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_radLongDescription']")
	By txbNotes = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_radNotes']")
	By selectWarehouseDropDown = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i3_i0_ucItemTransactions_radItemWarehouse_Input']")
	By warehouseFirstValue = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i3_i0_ucItemTransactions_radItemWarehouse_DropDown']/div/ul/li[1]")
	By selectBinDropDown = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i3_i0_ucItemTransactions_radItemBin_Input']")
	By selectWarehouseFirstValue = By.xpath("(//*[@id='ctl00_MainContent_radWizardBar_i3_i0_ucItemTransactions_radItemWarehouse_DropDown']/div/ul/li)[1]")
	By selectBinFirstValue = By.xpath("(//*[@id='ctl00_MainContent_radWizardBar_i3_i0_ucItemTransactions_radItemBin_DropDown']/div/ul/li)[1]")
	By QtyTextField = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i3_i0_ucItemTransactions_radItemQuantity']")
	By SaveBtn = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i3_i0_ucItemTransactions_btnSaveItemBin_input']")
	By CloseEditModeBtn = By.xpath("//*[@id='MainContent_btnCloseWizard']")
























	@Keyword
	public String FillItemInformationSection()
	{
		try
		{
			String itemname = null
			if(action.IsDisplayed(txbName))
			{
				itemname = EnterUniqueItemName()
			}
			else{

			}
			if(action.IsDisplayed(ApproverDropDown))
			{
				SelectApprover()
			}
			if(action.IsDisplayed(productType))
			{
				SelectProductType()
			}
			if(action.IsDisplayed(supplierDropDown))
			{
				SelectSuplier()
			}
			if(action.IsDisplayed(PremiseTypeDropDown))
			{
				SelectPremiseType()
			}
			if(action.IsDisplayed(salesDivisionDropDown))
			{
				SelectSalesDivision()
			}
			if(action.IsDisplayed(seasonalType))
			{
				SelectSeasonalType()
			}

			if(action.IsDisplayed(txbDescription))
			{
				EnterDecription()
			}
			if(action.IsDisplayed(txbNotes))
			{
				EnterNotes()
			}
			if(action.IsDisplayed(txbUnitCost))
			{
				EnterUnitCost()
			}
			if(action.IsDisplayed(txbUnitOfMeasure))
			{
				EnterUnitOfMeasure()
			}
			else{
				throw new Exception("Fill Item Information Section   is falied")
			}

			return itemname
		}
		catch(Exception e)
		{
			println("FillItemInformationSection method failed due to :"+ e)
		}

	}








	@Keyword
	public String EnterUniqueItemName(){
		String itemName = null;
		try{
			if(action.IsElementDisplayed(txbName))
			{
				WebUI.delay(3)
				itemName = action.GenerateRandomAplphabaNeumericString(5)
				action.Type(txbName, itemName)
				WebUI.delay(3)
			}
			else
			{
				throw new Exception("Item name text box is not present")
			}

			return itemName
		}
		catch(Exception e){
			println("EnterUniqueItemName method failed due to :"+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void SelectApprover()
	{
		try
		{
			if(action.IsElementDisplayed(ApproverDropDown))
			{
				WebUI.delay(3)
				action.Click(ApproverDropDown)
				//action.WaitVisible(approverListDivision)
				action.WaitTime(3)
				action.Click(approverFirst)
				action.WaitTime(3)
			}
			else
			{
				throw new Exception("Approver drop down is not present")
			}
		}
		catch(Exception e)
		{
			println("SelectApprover method failed due to : "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void SelectProductType()
	{
		try
		{
			if(action.IsElementDisplayed(productType))
			{
				WebUI.delay(3)
				action.Click(productType)
				action.WaitVisible(divProductType)
				action.WaitTime(3)
				action.Click(firstProductType)
				action.WaitTime(3)
			}
			else
			{
				throw new Exception("Product Type Drop Down is not present")
			}
		}
		catch(Exception e)
		{
			println("SelectProductType method failed due to : "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void SelectSuplier()
	{
		try
		{
			if(action.IsElementDisplayed(supplierDropDown))
			{
				WebUI.delay(3)
				action.Click(supplierDropDown)
				action.WaitVisible(supplierListDivision)
				action.WaitTime(3)
				action.Click(supplierFirstOption)
				action.WaitTime(5)
			}
			else
			{
				throw new Exception("Suplier Drop Down is not present")
			}
		}
		catch(Exception e)
		{
			println("SelectSuplier method failed due to : "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void SelectPremiseType()
	{
		try
		{
			if(action.IsElementDisplayed(PremiseTypeDropDown))
			{
				WebUI.delay(3)
				action.Click(PremiseTypeDropDown)
				action.WaitVisible(PremiseTypeListDiv)
				action.WaitTime(3)
				action.Click(PremiseTypeListDiv)
				action.WaitTime(3)
			}
			else
			{
				throw new Exception("Premise Type Drop Down is not present")
			}
		}
		catch(Exception e)
		{
			println("SelectPremiseType method failed due to : "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void SelectMultipleSalesDivision()
	{
		try
		{
			if(action.IsElementDisplayed(salesDivisionDropDown))
			{
				WebUI.delay(3)
				action.Click(salesDivisionDropDown)
				//action.WaitVisible(salesDivisionListDiv)
				action.WaitTime(3)
				action.Click(salesDivisionSecondOption)
				action.WaitTime(2)
				action.Click(salesDivisionThirdOption)
				action.WaitTime(2)
				action.Click(salesDivisionFourthOption)
				action.WaitTime(2)
			}
			else
			{
				throw new Exception("Sales Division  Drop Down is not present")
			}
		}
		catch(Exception e)
		{
			println("SelectMultipleSalesDivision method failed due to : "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void SelectSalesDivision()
	{
		try
		{
			if(action.IsElementDisplayed(salesDivisionDropDown))
			{
				WebUI.delay(3)
				action.Click(salesDivisionDropDown)
				//action.WaitVisible(salesDivisionListDiv)
				action.WaitTime(3)
				action.Click(salesDivisionSecondOption)
			}
			else
			{
				throw new Exception("Sales Division  Drop Down is not present")
			}
		}
		catch(Exception e)
		{
			println("SelectMultipleSalesDivision method failed due to : "+ e)
			Assert.fail()
		}
	}




	@Keyword
	public void SelectSeasonalType()
	{
		try
		{
			if(action.IsElementDisplayed(seasonalType))
			{
				WebUI.delay(3)
				action.Click(seasonalType)
				//action.WaitVisible(seasonalTypeDiv)
				action.WaitTime(3)
				action.Click(seasonalTypeFisrOption)
				action.WaitTime(3)

			}
			else
			{
				throw new Exception("Seasonal Type Drop Down is not present")
			}
		}
		catch(Exception e)
		{
			println("SelectSeasonalType method failed due to : "+ e)
			Assert.fail()
		}
	}
	@Keyword
	public void SelectDemographicType()
	{
		try
		{
			if(action.IsElementDisplayed(demographicsDropDown))
			{
				WebUI.delay(5)
				action.Click(demographicsDropDown)
				action.WaitVisible(demographicsDiv)
				action.WaitTime(3)
				action.Click(demographic2ndOption)
				action.WaitTime(5)

			}
			else
			{
				throw new Exception("Demographi Type Drop Down is not present")
			}
		}
		catch(Exception e)
		{
			println("SelectDemographicType method failed due to : "+ e)
			//Assert.fail()
		}
	}

	@Keyword
	public void EnterDecription()
	{
		try
		{
			if(action.IsElementDisplayed(txbDescription))
			{
				WebUI.delay(3)
				action.Type(txbDescription, "TestDesc")

			}
			else
			{
				throw new Exception("Description text field is not present")
			}
		}
		catch(Exception e)
		{
			println("EnterDecription method failed due to : "+ e)
			Assert.fail()
		}
	}
	@Keyword
	public void EnterNotes()
	{
		try
		{
			if(action.IsElementDisplayed(txbNotes))
			{
				WebUI.delay(3)
				action.Type(txbNotes, "TestNotes")

			}
			else
			{
				throw new Exception("Notes text field is not present")
			}
		}
		catch(Exception e)
		{
			println("EnterNotes method failed due to : "+ e)
			Assert.fail()
		}
	}
	@Keyword
	public void EnterUnitCost()
	{
		try
		{
			if(action.IsElementDisplayed(txbUnitCost))
			{
				WebUI.delay(3)
				action.Type(txbUnitCost, "10")

			}
			else
			{
				throw new Exception("UnitCost text field is not present")
			}
		}
		catch(Exception e)
		{
			println("EnterUnitCost method failed due to : "+ e)
			Assert.fail()
		}
	}
	@Keyword
	public void EnterUnitOfMeasure()
	{
		try
		{
			if(action.IsElementDisplayed(txbUnitOfMeasure))
			{

				action.Type(txbUnitOfMeasure, "EACH")
				WebUI.delay(3)

			}
			else
			{
				throw new Exception("Unit Of Measure text field is not present")
			}
		}
		catch(Exception e)
		{
			println("EnterUnitOfMeasure method failed due to : "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void ClickOnItemInfoSaveIcon()
	{
		try
		{

			//action.WaitUntilElementClickable(saveIconItemInfo)
			action.ScrollToBottomOfPage()
			//WebUI.delay(3)
			action.Click(saveIconItemInfo)
			action.WaitTime(15)
			//action.WaitTillNotVisible(itemInformationConfirmationMsg, 300)
			//action.ScrollToViewElement(nextButton)
			action.Click(nextButton)
			action.WaitTime(5)
			//action.WaitVisible(divisionImage)
			//action.WaitTime(5)


		}
		catch(Exception e)
		{
			println("ClickOnSaveIcon method failed due to : "+ e)
			Assert.fail()
		}
	}




	@Keyword
	public void FillImageSection()
	{

		try{
			action.ScrollToViewElement(saveIconImage)
			action.Click(saveIconImage)
			action.WaitTime(2)
			action.Click(imageNextBtn)
			action.WaitTime(5)
			//action.WaitVisible(divBrands)
		}
		catch(Exception e){
			println("FillImageSection method failed due to :" + e)
			Assert.fail()
		}



	}
	@Keyword
	public void FillBrandSection()
	{
		try{

			if(action.IsElementDisplayed(brandFirstValue))
			{
				action.Click(brandFirstValue)
				action.Click(transeferRightBtn)
				action.ScrollToViewElement(brandSaveBtn)
				action.Click(brandSaveBtn)
				action.WaitTime(15)
				action.Click(brandNextBtn)
				action.WaitTime(3)

			}
			else
			{
				throw new Exception("Brand values are not present in grid")

			}



		}
		catch(Exception e){
			println("FillBrandSection method failed due to :" + e)
			Assert.fail()

		}


	}

	@Keyword
	public void FillTransactionsSection()
	{
		try
		{
			if(action.IsElementDisplayed(selectWarehouseDropDown))
			{
				action.Click(selectWarehouseDropDown)
				action.WaitTime(2)
				action.Click(selectWarehouseFirstValue)
				action.WaitTime(5)
			}
			else
			{
				println ("Selelct warehouse drop down not present/failed")
			}

			if(action.IsElementDisplayed(selectBinDropDown))
			{
				action.Click(selectBinDropDown)
				action.WaitTime(3)
				action.Click(selectBinFirstValue)
				action.WaitTime(3)
				action.Type(QtyTextField, "5")
			}
			else
			{
				println ("Selelct Bin drop down not present/failed")
			}
			if(action.IsElementEnabled(SaveBtn)){
				action.Click(SaveBtn)
				action.WaitTime(10)

			}
			else{
				println ("Save button not present/failed")
			}

		}
		catch(Exception e)
		{
			println("FillTransactionsSection method failed due to :" + e)
			Assert.fail()

		}
	}

	@Keyword
	public void ClickOnCloseEditMode(){
		try{
			action.ScrollToTopOgPage()
			if(action.IsElementDisplayed(CloseEditModeBtn)){
				action.Click(CloseEditModeBtn)
				action.WaitForPageToLoad()
				action.WaitTime(10)
			}
			else{
				println ("Close Edit Mode button not present/failed")
			}

		}
		catch(Exception e){
			println("ClickOnCloseEditMode method failed due to :" + e)
			Assert.fail()
		}

	}














}
