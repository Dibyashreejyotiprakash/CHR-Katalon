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

public class WarehouseItemInventory {


	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By linkAddNewItem = By.xpath("//*[@id='ctl00_MainContent_rmItemCommands']/ul/li[1]")
	By linkMicrosoftExcel = By.xpath("//*[@id='ctl00_MainContent_rmItemCommands']/ul/li[4]")
	By linkAdobeAcrobat = By.xpath("//*[@id='ctl00_MainContent_rmItemCommands']/ul/li[5]")
	By linkAdobeAcrobatFull = By.xpath("//*[@id='ctl00_MainContent_rmItemCommands']/ul/li[6]")
	By linkBrands = By.xpath("//*[text()='Brands']")
	By linkSupplier = By.xpath("//*[@id='ctl00_MainContent_rpbSearch']//li//a//span[text()='Supplier']")
	//By linkSupplier = By.xpath("//*[text()='Supplier']")
	By linkDemographic = By.xpath("//*[text()='Demographic']")
	By linkPremiseType = By.xpath("//*[text()='Premise Type']")
	By linkProductType = By.xpath("(//*[text()='Product Type'])[1]")
	By linkSalesDivision = By.xpath("//*[text()='Sales Division']")
	By linkSeasonalType = By.xpath("//*[text()='Seasonal Type']")
	By linkWarehouse = By.xpath("(//*[text()='Warehouse'])[3]")
	By linkWarehouseLocation = By.xpath("//*[text()='Warehouse Location']")
	By linkOtherFilters = By.xpath("//*[text()='Other Filters']")
	By supplierExpandUpBtn = By.xpath("//*[@id='ctl00_MainContent_rpbSearch']/ul[1]/li[1]/a/span/span[1]")
	By brandsExpandUpBtn = By.xpath("//*[@id='ctl00_MainContent_rpbSearch']/ul[1]/li[2]/a/span/span[1]")
	By filterDivision = By.xpath("//*[@id='ctl00_MainContent_rpbSearch']//ul")


	@Keyword
	public void VerifyAddNewItemAndDownloadLink() {
		boolean statusAddNewItem = action.IsElementEnabled(linkAddNewItem)
		Assert.assertTrue(statusAddNewItem)
		println ("Add New Item button is present/enable")

		boolean statusMicrosoftExcel = action.IsElementEnabled(linkMicrosoftExcel)
		Assert.assertTrue(statusMicrosoftExcel)
		println ("Microsoft Excel button is present/enable")

		boolean statusAdobeAcrobat = action.IsElementEnabled(linkAdobeAcrobat)
		Assert.assertTrue(statusAdobeAcrobat)
		println ("Adobe Acrobat button is present/enable")

		boolean statusAdobeAcrobatFull = action.IsElementEnabled(linkAdobeAcrobatFull)
		Assert.assertTrue(statusAdobeAcrobatFull)
		println ("Adobe Acrobat full button is present/enable")
	}

	@Keyword
	public void VerifyAllFiltersLink()
	{




		boolean statusFilterDiv = action.IsElementDisplayed(filterDivision)
		if(statusFilterDiv == true)
		{
			boolean statusofsupplierfilter= action.IsElementEnabled(linkSupplier)
			boolean statusofbrandfilter= action.IsElementEnabled(linkBrands)
			boolean statusofdemographicfilter= action.IsElementEnabled(linkDemographic)
			boolean statusofpremisetypefilter= action.IsElementEnabled(linkPremiseType)
			boolean statusofproducttypefilter= action.IsElementEnabled(linkProductType)
			boolean statusofsalesdivisionfilter= action.IsElementEnabled(linkSalesDivision)
			boolean statusofseasonaltypefilter= action.IsElementEnabled(linkSeasonalType)
			boolean statusofwarehousefilter= action.IsElementEnabled(linkWarehouse)
			boolean statusofwarehouselocationfilter= action.IsElementEnabled(linkWarehouseLocation)
			boolean statusofotherfilter= action.IsElementEnabled(linkOtherFilters)

			if(statusofsupplierfilter== true  && statusofbrandfilter == true && statusofdemographicfilter == true && statusofpremisetypefilter == true && statusofproducttypefilter == true && statusofsalesdivisionfilter == true && statusofseasonaltypefilter == true
			&& statusofwarehousefilter == true && statusofwarehouselocationfilter == true && statusofotherfilter == true)
			{
				println ("All link filters are present/enable")

			}


		}


	}

	//verify item seach page
	@Keyword
	public void VeriyItemSearchPage()
	{
		try{

			String expectedUATUrl = "https://csg.v5qa.brandmuscle.net/Warehouse/Admin/UserTransfer.aspx";
			String expectedSTAGEUrl ="https://csg.v5stgae.brandmuscle.net/Warehouse/Admin/UserTransfer.aspx"

			action.WaitTime(5)
			String env = GlobalVariable.environment			
			action.WaitTime(5)
			println "environment is -------->"+ env
			String actualUrl = action.GetCurrentURL()
			action.WaitTime(5)
			println "environment is -------->"+ actualUrl

			if(env.equalsIgnoreCase("uat"))
			{
				Assert.assertEquals(expectedUATUrl, actualUrl)
			}
			else
				(env.equalsIgnoreCase("stage"))
			{
				Assert.assertEquals(expectedSTAGEUrl, actualUrl)
			}


		}
		catch(Exception e)
		{
			println("VeriyItemSearchPage method failed due to :" +e)
			Assert.fail()
		}
	}
	
	
	//search item and verify search result
	@Keyword
	public void SearchAndVerifySearchResult(){
		try{
			
		}
		catch(Exception e){
			print
			
		}
	}
	







	//
	//		action.WaitVisible(supplierExpandUpBtn)
	//		boolean status= action.IsElementDisplayed(linkSupplier)
	//		if(status== true) {
	//
	//			action.WaitVisible(supplierExpandUpBtn)
	//			WebUI.delay(3)
	//			//action.Click(supplierExpandUpBtn)
	//			//action.wait(2)
	//			action.ScrollToViewElement(linkSupplier)
	//			boolean statusSupplierLink = action.IsElementEnabled(linkSupplier)
	//			Assert.assertTrue(statusSupplierLink)
	//			println ("Supplier link is present/enable")
	//		}


	/*if(action.IsElementDisplayed(linkBrands)) {
	 action.wait(2)
	 action.WaitVisible(brandsExpandUpBtn)
	 action.wait(2)
	 action.Click(brandsExpandUpBtn)
	 action.wait(2)
	 action.ScrollToViewElement(linkBrands)
	 boolean statusBrandLink = action.IsElementEnabled(linkBrands)
	 Assert.assertTrue(statusBrandLink)
	 println ("Brand link is present/enable")
	 }
	 if(action.IsElementDisplayed(linkDemographic)) {
	 action.ScrollToViewElement(linkDemographic)
	 boolean statusDemographicLink = action.IsElementEnabled(linkDemographic)
	 Assert.assertTrue(statusDemographicLink)
	 println ("Demographic Link link is present/enable")
	 }
	 if(action.IsElementDisplayed(linkPremiseType)) {
	 action.ScrollToViewElement(linkPremiseType)
	 boolean statuslinkPremiseType = action.IsElementEnabled(linkPremiseType)
	 Assert.assertTrue(statuslinkPremiseType)
	 println ("PremiseType Link link is present/enable")
	 }
	 if(action.IsElementDisplayed(linkProductType)) {
	 action.ScrollToViewElement(linkProductType)
	 boolean statuslinkProducType = action.IsElementEnabled(linkProductType)
	 Assert.assertTrue(statuslinkProducType)
	 println ("ProducType Link link is present/enable")
	 }
	 if(action.IsElementDisplayed(linkSalesDivision)) {
	 action.ScrollToViewElement(linkSalesDivision)
	 boolean statuslinkSalesDivision = action.IsElementEnabled(linkSalesDivision)
	 Assert.assertTrue(statuslinkSalesDivision)
	 println ("Sales Division Link link is present/enable")
	 }
	 if(action.IsElementDisplayed(linkSeasonalType)) {
	 action.ScrollToViewElement(linkSeasonalType)
	 boolean statuslinkSeasonalType = action.IsElementEnabled(linkSeasonalType)
	 Assert.assertTrue(statuslinkSeasonalType)
	 println ("Seasonal Type  Link link is present/enable")
	 }
	 if(action.IsElementDisplayed(linkWarehouse)) {
	 action.ScrollToViewElement(linkWarehouse)
	 boolean statuslinkWarehouse = action.IsElementEnabled(linkWarehouse)
	 Assert.assertTrue(statuslinkWarehouse)
	 println ("Warehouse  Link link is present/enable")
	 }
	 if(action.IsElementDisplayed(linkWarehouse)) {
	 action.ScrollToViewElement(linkWarehouse)
	 boolean statuslinkWarehouse = action.IsElementEnabled(linkWarehouse)
	 Assert.assertTrue(statuslinkWarehouse)
	 println ("Warehouse  Link link is present/enable")
	 }
	 if(action.IsElementDisplayed(linkWarehouseLocation)) {
	 action.ScrollToViewElement(linkWarehouseLocation)
	 boolean statuslinkWarehouseLocation = action.IsElementEnabled(linkWarehouseLocation)
	 Assert.assertTrue(statuslinkWarehouseLocation)
	 println ("Warehouse Location  link is present/enable")
	 }
	 if(action.IsElementDisplayed(linkOtherFilters)) {
	 action.ScrollToViewElement(linkOtherFilters)
	 boolean statuslinkOtherFilters = action.IsElementEnabled(linkOtherFilters)
	 Assert.assertTrue(statuslinkOtherFilters)
	 println ("Other Filters Location  link is present/enable")
	 }*/
}
}
