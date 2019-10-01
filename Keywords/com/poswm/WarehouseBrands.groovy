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

public class WarehouseBrands {


	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()




	By SearchBrandAField = By.xpath("//*[@id='ctl00_MainContent_txtSearch']")
	By SearchBtn = By.xpath("//*[@id='ctl00_MainContent_btnSearch_input']")
	By ClearBtn = By.xpath("//*[@id='ctl00_MainContent_btnClear_input']")
	By AddNewBrand = By.xpath("//*[text()='Add New Brand']")
	//By AddNewBrand = By.xpath("//*[@id='ctl00_MainContent_rgWarehouseBrands_ctl00_ctl02_ctl00_AddNewRecordButton']")
	//By AddNewBrand = By.xpath("//*[@id='ctl00_MainContent_rgWarehouseBrands_ctl00']/thead/tr[1]/td/table/tbody/tr/td[1]/input")
	By RefreshBtn = By.xpath("//*[@id='ctl00_MainContent_rgWarehouseBrands_ctl00_ctl02_ctl00_RebindGridButton']")
	By EditFirstBtn = By.xpath("(//*[@id='ctl00_MainContent_rgWarehouseBrands_ctl00_ctl04_EditButton'])[1]")
	By DeleteBtn = By.xpath("(//*[text()='Delete'])[1]")
	By LastPageBtn = By.xpath("//*[@class='rgPageLast']")
	By NextBtn = By.xpath("//*[@class='rgPageNext']")
	By PreviousBtn = By.xpath("//*[@class='rgPagePrev']")
	By FirstPageBtn = By.xpath("//*[@class='rgPageFirst']")
	By BrandNameTextField = By.xpath("//*[@id='ctl00_MainContent_rgWarehouseBrands_ctl00_ctl02_ctl03_txtBrandName']")
	By InsertBtn = By.xpath("//*[@id='ctl00_MainContent_rgWarehouseBrands_ctl00_ctl02_ctl03_btnUpdate']")
	By BrandAddedConfirmationMsg = By.xpath("//*[text()='Brand added successfully.']")
	By BrandNameColumn = By.xpath("//*[@id='ctl00_MainContent_rgWarehouseBrands_ctl00']/tbody/tr[1]/td[3]")
	By SuplierDropDown = By.xpath("//*[@id='ctl00_MainContent_rgWarehouseBrands_ctl00_ctl05_ddlSupplier']")
	By UpdateBtn = By.xpath("//*[@id='ctl00_MainContent_rgWarehouseBrands_ctl00_ctl05_btnUpdate']")
	By DeleteLink = By.xpath("//*[text()='Delete']")
	By NoRecordtoDisplay = By.xpath("//*[text()='No records to display.']")
	By DeleteConfirmationMsg = By.xpath("//*[text()='Brand deleted successfully.']")





	@Keyword
	public void VerifyMenuLinkBrandPage() {

		String expectedUATUrl = "https://csg.v5qa.brandmuscle.net/Warehouse/Admin/WarehouseBrands.aspx";
		String expectedSTAGEUrl ="https://csg.v5stage.brandmuscle.net/Warehouse/Admin/WarehouseBrands.aspx"
		String expectedPRODUrl = "https://csg.brandmuscle.net/Warehouse/Admin/WarehouseBrands.aspx";


		try{
			action.VerifyCurrentPage("WarehouseBrands.aspx")
		}
		catch(Exception e) {
			println ("Verify Menu Link Brand Page failed due to "+ e)
			Assert.fail()
		}
	}


	@Keyword
	public String AddNewBrand()
	{
		try
		{
			action.Click(AddNewBrand)

			String BrandName = action.GenerateRandomAplphabaticString(5)
			println BrandName
			action.Type(BrandNameTextField, BrandName)
			action.Click(InsertBtn)
			action.WaitVisible(BrandAddedConfirmationMsg)
			action.GetText(BrandAddedConfirmationMsg)
			println "********"+BrandAddedConfirmationMsg +"************"
			return BrandName

		}
		catch(Exception e)
		{
			println ("AddNewBrand method failed due to :" + e)
			Assert.fail()
		}
	}


	@Keyword
	public void SearchAndVerifyBrand(String brandNameExp){
		try{

			action.Type(SearchBrandAField, brandNameExp)
			action.Click(SearchBtn)
			//WebUI.delay(3)
			String brnadNameActual  = action.GetText(BrandNameColumn)
			println "======"+brnadNameActual
			Assert.assertEquals(brandNameExp, brnadNameActual, )


		}
		catch(Exception e){

			Assert.fail("SearchBrand method failed due to :" + e)
		}
	}

	@Keyword
	 public void ClickOnEditBtn(){
	 try{
	 action.WaitVisible(EditFirstBtn)
	 action.Click(EditFirstBtn)
	 }
	 catch(Exception e ){
	 Assert.fail("ClickOnEditBtn method failed due to :" + e)
	 }
	 }

	@Keyword
	public void VerifyEditBrand()
	{
		try{
			action.WaitVisible(EditFirstBtn)
			action.Click(EditFirstBtn)
			action.WaitVisible(SuplierDropDown)
			String supplierValueBeforeEdit = action.GetselectedText(SuplierDropDown)
			println "++++++"+ supplierValueBeforeEdit
			
			action.Click(SuplierDropDown)
			WebUI.delay(3)
			action.SelectByIndex(SuplierDropDown, 1)
			WebUI.delay(3)
			
			String supplierValueAfterEdit = action.GetselectedText(SuplierDropDown)
			println "++++++"+ supplierValueAfterEdit
			WebUI.delay(2)
			action.Click(UpdateBtn)
			
			Assert.assertNotEquals(supplierValueBeforeEdit, supplierValueAfterEdit)
			

		}
		catch(Exception e){
			Assert.fail("VerifyEditBrand method failed due to :" + e)
		}
	}


	@Keyword
	public void SearchSpecificBrand(String brandNameExp){
		try{

			WebUI.delay(3)
			action.Type(SearchBrandAField, brandNameExp)
			action.Click(SearchBtn)


		}
		catch(Exception e){

			Assert.fail("SearchBrand method failed due to :" + e)
		}
	}

	@Keyword
	public void ClickOnDeleteLink()
	{
		try
		{
			action.Click(DeleteLink)
			WebUI.delay(2)
			action.AcceptAlert()
			WebUI.delay(5)
			
			
		}
		catch(Exception e)
		{
			Assert.fail("ClickOnDeleteLink method failed due to :" + e)
		}
	}


	@Keyword
	public void SearchAndVerifyBrandAfterDelete(String brandNameExp){
		try{

			String expectedConfirmationMsg = "Brand deleted successfully."
			String ExpectedSearchMsg = "No records to display."
			
			String ActualConfirmationMsg = action.GetText(DeleteConfirmationMsg) 
			WebUI.delay(2)
			println "*********"+ ActualConfirmationMsg
			
			String ActualSearchMsg = action.GetText(NoRecordtoDisplay)
			WebUI.delay(2)
			println "*********"+ ExpectedSearchMsg
			
			action.TypeClear(SearchBrandAField, brandNameExp)
			action.Click(SearchBtn)
			WebUI.delay(2)
			Assert.assertEquals(expectedConfirmationMsg, ActualConfirmationMsg)
			WebUI.delay(2)
			Assert.assertEquals(ExpectedSearchMsg, ActualSearchMsg)


		}
		catch(Exception e){

			Assert.fail("SearchBrand method failed due to :" + e)
		}
	}

























































































}
