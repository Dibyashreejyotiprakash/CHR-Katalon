package com.ii4usersites

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

import internal.GlobalVariable


import com.utilities.Interaction

import org.openqa.selenium.By

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.testng.Assert

import com.kms.katalon.core.webui.driver.DriverFactory



class ProductionSelectionPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By Back=  By.xpath("//*[@id='Body_lnkBtnCancel']")
	By Yes = By.xpath("//*[@class='boxes']/a[1]")
	By NoBtn= By.xpath("//*[@id='Body_btnNo1']")
	By AddToCart = By.xpath("//*[@id='Body_btnAddToCart']")
	By YesBtn= By.xpath("//*[@id='Body_btnYes1']")
	By txbItemType = By.xpath("//div[@id='Body_itemTypeContainer1']/span")
	By divItemType = By.xpath("//div[@id='ctl00_Body_ItemTypeDropDownList1']")
	By lstItemType1 = By.xpath("//input[@id='ctl00_Body_ItemTypeDropDownList1_Input']")
	By lstDivision = By.xpath("//div[@class='rcbScroll rcbWidth']/ul")
	By lstItemType = By.xpath("//ul[@class='rcbList']/li")
	By imgLoading = By.xpath("//img[@src='/Content/Images/loading.gif']")
	By txbDimensions = By.xpath("//div[@id='Body_dimensionContainer1']/span")
	By divDimension = By.xpath("//input[@id='ctl00_Body_ddlDimension1_Input']")
	By lstDimension = By.xpath("//div[@id='ctl00_Body_ddlDimension1_DropDown']/div/ul/li")
	By txbLamination = By.xpath("//div[@id='Body_laminationContainer1']/span")
	By txbMounting = By.xpath("//div[@id='Body_accessoriesContainer1']/span")
	By divMediaType = By.xpath("//div[@id='ctl00_Body_ddlLamination1']")
	By lstMediaType = By.xpath("//ul[@class='rcbList']/li")
	By divMounting = By.xpath("//input[@id='ctl00_Body_ddlAccessories1_Input']")
	By txbQuantity = By.xpath("//input[@id='ctl00_Body_qtyText1']")
	By btnnO = By.xpath("//input[@id='Body_btnNo1']")
	By btnAddToCart = By.xpath("//input[@id='Body_btnAddToCart']")
	By tblPriceBreak = By.xpath("//table[@id='ctl00_Body_priceBreak1_gvPriceBreak']")
	By lnkPriceBreak = By.xpath("//a[@id='priceBreakA1']")
	By lnkDeleteThisItem = By.xpath("//a[@id='Body_btnRemove1']")
	By divAddProduct = By.xpath("//div[@id='Body_mainLinkDevMain2']")
	By btnContinueToCheckout = (By.xpath("//input[@id='ctl00_Body_sideContToCheckOutBtn']"))
	By btnPreviewChanges = By.xpath("//input[@id='btnRepaintImage']")

	By nobtn = By.xpath("//*[@id='Body_btnNo1']")
	By acconutlink = By.xpath("//*[text()='Account']")
	By popupyesbtn = By.xpath("//*[@id='confirm1570783968458_content']//div[2]/a/span/span[text()='Yes']")
	By popupnobtn = By.xpath("//*[@id='confirm1570783968458_content']//div[2]/a/span/span[text()='No']")




	@Keyword
	public void SetQuantity() {
		try {
			action.WaitVisible(txbQuantity)
			action.Type(txbQuantity, "12")
		}
		catch(Exception e) {
			println ("Set Quantity failed due to "+ e)
		}
	}



	@Keyword
	//Click on No in Select Product Details Page
	public void ClickOnNo()
	{
		try
		{
			action.WaitVisible(NoBtn);
			action.ScrollToViewElement(NoBtn);
			action.Click(NoBtn);
			action.WaitTime(5);
		}
		catch (Exception e)
		{
			println("Click on NoS failed due to : " + e);
		}
	}


	@Keyword
	//Click on AddToCart
	public void ClickOnAddToKart()
	{
		try
		{
			action.WaitVisible(AddToCart);
			action.ScrollToViewElement(AddToCart);
			action.Click(AddToCart);
			action.WaitTillNotVisible(imgLoading);
			action.WaitForPageToLoad()
		}
		catch (Exception e)
		{
			println("Click on yes from back failed due to : " + e);
		}
	}

	@Keyword
	public void NavigateToOtherPageFromProductSelectionPage()
	{
		try{
			action.Click(acconutlink)
			driver.switchTo().frame("confirm1570783968458")
			action.Click(popupnobtn)
			WebUI.delay(5)
			action.Click(acconutlink)
			driver.switchTo().frame("confirm1570783968458")
			action.Click(popupyesbtn)
			action.WaitForPageToLoad()
			action.VerifyCurrentPage("MyAccountPage.aspx")
		}
		catch(Exception e)
		{
			Assert.fail("Navigate To Other Page From Product Selection Page failed due to "+ e)
		}
	}



}
