package com.poswm

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
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
	By allsupliersfilter = By.xpath("")
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
	By clearallfilter = By.xpath("//*[text()='Clear All Filters']")
	By supplierfilter = By.xpath("//*[@id='ctl00_MainContent_rpbSearch_i0_i0_rlbSupplier_i2']")
	By allsuppliersnameingrid = By.xpath("//*[@id='ctl00_MainContent_rgItemSearch_ctl00']//tr//td[12]")
	By brandfilter = By.xpath("//*[@id='ctl00_MainContent_rpbSearch_i1_i0_rlbBrands_i2']")
	By allbrandsnameingrid = By.xpath("//*[@id='ctl00_MainContent_rgItemSearch_ctl00']//tr//td[13]")
	By allitemname = By.xpath("//*[@id='ctl00_MainContent_rgItemSearch_ctl00']//tr//td[11]/a")
	By itemsearchtextbox = By.xpath("//*[@id='ctl00_MainContent_rsbItemSearch_Input']")
	By itemsearchbtn = By.xpath("//*[@id='ctl00_MainContent_rsbItemSearch_Input']/following-sibling::button")
	By searchiteminventorybtn = By.xpath("//*[@id='MainContent_btnBackToSearch']")
	By additemtoorderbtn = By.xpath("//*[@id='MainContent_btnAddToOrder']")
	By editthisitembtn = By.xpath("//*[@id='MainContent_btnEditItemWizard']")
	By deletethisitembtn = By.xpath("//*[@id='MainContent_btnDeleteItem']")
	By deletebtn = By.xpath("//*[@id='ctl00_MainContent_rwDeleteItemSettings_C_btnDeleteItemAndResetQuantities_input']")
	By otherfilterddn = By.xpath("//*[text()='Other Filters']")
	By deletedcheckbox = By.xpath("//*[@id='ctl00_MainContent_rpbSearch_i10_i0_rlbOtherFilters_i2']//input")
	By clearallfilterbtn = By.xpath("//*[text()='Clear All Filters']")

	@Keyword
	public void VerifyWareHouseInventoryPage()
	{
		try{
			action.VerifyCurrentPage("WarehouseItemInventory.aspx")
		}
		catch(Exception e)
		{
			println ("Verify Ware House Inventory Page failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void VerifyAddNewItemAndDownloadLink() {
		try{
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
		catch(Exception e)
		{
			println ("Verify Add New Item And Download Link failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void VerifyAllFiltersLink() {
		try{
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
				else{
					throw new Exception("All filters are not enabled")
				}
			}
			else{
				throw new Exception("Verify All Filters Link failed")
			}

		}
		catch(Exception e)
		{
			println ("Verify All Filters Link failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public  void VerifyAndClickOnAddANewItem()
	{
		try{
			boolean statusofaddanewitembtn = action.IsElementEnabled(additemtoorderbtn)
			Assert.assertTrue(statusofaddanewitembtn)
			if(statusofaddanewitembtn == true)
			{
				action.Click(additemtoorderbtn)
				action.WaitForPageToLoad()
			}
			else{
				throw new Exception("Verify And Click On Add A New Item failed")
			}

		}
		catch(Exception e)
		{
			println ("Click On Add A New Item failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void VerifyClearAllFilterButton()
	{
		try{
			action.Click(supplierfilter)
			WebUI.delay(20)
			boolean statusofclearallfilterbtn = action.IsElementDisplayed(clearallfilterbtn)
			Assert.assertTrue(statusofclearallfilterbtn)
			action.Click(clearallfilterbtn)
		}
		catch(Exception e)
		{
			println ("Verify Clear All Filter Button failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void FilterBySuppliers()
	{
		try{
			//action.Click(linkSupplier)
			WebUI.delay(10)
			action.Click(supplierfilter)
			WebUI.delay(20)
			String suppliername = action.GetText(supplierfilter)
			List<WebElement> allsuppliersname = action.GetElements(allsuppliersnameingrid)
			if(allsuppliersname.size()>0)
			{
				for(int i=0;i< allsuppliersname.size();i++)
				{
					if(allsuppliersname.get(i).getText().equalsIgnoreCase(suppliername))
					{
						println ("Filter by supplier verified")
					}
					else{
						throw new Exception("Filter by supplier failed")
					}
				}
			}
			else{
				throw new Exception("No Suppliers found")
			}

		}
		catch(Exception e)
		{
			println ("Filter By Suppliers failed due to "+ e)
			Assert.fail()
		}
	}


	@Keyword
	public void FilterByBrands()
	{
		try{
			//action.Click(linkBrands)
			WebUI.delay(10)
			action.Click(brandfilter)
			WebUI.delay(20)
			String brandnamename = action.GetText(brandfilter)
			List<WebElement> allbrandsname = action.GetElements(allbrandsnameingrid)
			if(allbrandsname.size()>0)
			{
				for(int i=0;i< allbrandsname.size();i++)
				{
					if(allbrandsname.get(i).getText().contains(brandnamename))
					{
						println ("Filter by brand verified")
					}
					else{
						throw new Exception("Filter by brands failed")
					}
				}
			}
			else{
				throw new Exception("No brands found")
			}
		}
		catch(Exception e)
		{
			println ("Filter By Brands failed due to "+ e)
			Assert.fail()
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

	@Keyword
	public void SearchItem()
	{
		try{
			List<WebElement> allitemnames = action.GetElements(allitemname)
			if(allitemnames.size()>0)
			{
				for(int i=0;i<allitemnames.size();i++)
				{
					action.Type(itemsearchbtn, allitemnames.get(i).getText())
					WebUI.delay(10)
					action.Click(itemsearchbtn)
					break
				}
			}
			else{
				throw new Exception("No items found")
			}

		}
		catch(Exception e)
		{
			println ("Search Item failed due to "+ e)
		}
	}

	@Keyword
	public void SwichToWareHouseItemPageVerifyWareHouseItemDetails()
	{
		try{
			List<WebElement> allitemnames = action.GetElements(allitemname)
			int totalitems = allitemnames.size()
			println ("Number of ietms -----------"+ totalitems)
			if(totalitems>0)
			{
				for(int i=0;i< totalitems;i++)
				{
					allitemnames.get(i).click()
					break
				}
				Set<String> windowids = driver.getWindowHandles()
				Iterator<String> it = windowids.iterator()
				while(it.hasNext())
				{
					String parentwindowid = it.next()
					String childwindowid = it.next()
					driver.switchTo().window(childwindowid)
					WebUI.delay(10)
				}
			}

		}
		catch(Exception e)
		{
			println ("Verify Ware House Item Details failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void VerifyAllFieldsInWareHouseitemDetailsPage()
	{
		try{
			boolean statusofsearchiteminventory = action.IsElementDisplayed(searchiteminventorybtn)
			Assert.assertTrue(statusofsearchiteminventory)

			boolean statusadditemtoorderbtn = action.IsElementDisplayed(additemtoorderbtn)
			Assert.assertTrue(statusadditemtoorderbtn)

			boolean stayusofeditthisbtn = action.IsElementDisplayed(editthisitembtn)
			Assert.assertTrue(stayusofeditthisbtn)

			boolean statusofdeletebtn = action.IsElementDisplayed(deletethisitembtn)
			Assert.assertTrue(statusofdeletebtn)
		}
		catch(Exception e)
		{
			println ("Verify All Fields In Ware House item Details Page failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public String DeleteItem()
	{
		try{
			String selecteditemname = null

			List<WebElement> allitemnames = action.GetElements(allitemname)
			if(allitemnames.size()>0)
			{
				for(int i=0;i< allitemnames.size();i++)
				{
					selecteditemname = allitemnames.get(i).getText()
					allitemnames.get(i).click()
					break
				}
				Set<String> windowids = driver.getWindowHandles()
				Iterator<String> it = windowids.iterator()
				while(it.hasNext())
				{
					String parentwindowid = it.next()
					String childwindowid = it.next()
					driver.switchTo().window(childwindowid)
					WebUI.delay(10)
					action.Click(deletethisitembtn)
					WebUI.delay(10)
					action.AcceptAlert()
					action.Click(deletebtn)
					WebUI.closeBrowser()
					driver.switchTo().defaultContent()
				}
				return selecteditemname
			}
		}
		catch(Exception e)
		{
			println ("Delete Item failed due to "+ e)
			Assert.fail()
		}
	}
}
