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


public class WarehouseOrderInventoryPage {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By addnewitembtn = By.cssSelector(".RadMenu_Office2010Silver .rmFirst .rmText")
	By supplierfiletr = By.xpath("")
	By menuWarehouse = By.xpath("//*[@id='mainMenu']/div/ul/li[2]/a/span")
	By subMenuNewItem = By.xpath("//*[text()='New Item']")
	By itemInformationDivision = By.xpath("//*[@id='ctl00_MainContent_radWizardBar']")
	By subMenuItemSearch = By.xpath("//*[text()='Item Search']")
	By subMenuNewOrder = By.xpath("//*[text()='New Order']")
	//By subMenuOrderSearch = By.xpath("//*[text()='Order Search']")
	By subMenuOrderSearch = By.xpath("//*[text()='Order Search']")
	By subMenuAdministration = By.xpath("//*[text()='Administration']")
	By subMenuReports = By.xpath("//*[text()='Reports']")
	By werehouseSubMenuList = By.xpath("//*[@class='rmVertical rmGroup rmLevel1 menu']")
	By divAddNewItem = By.xpath("//*[@id='ctl00_MainContent_rmItemCommands']")
	By linkAddNewItem = By.xpath("//*[@id='ctl00_MainContent_rmItemCommands']/ul/li[1]")
	By linkMicrosoftExcel = By.xpath("//*[@id='ctl00_MainContent_rmItemCommands']/ul/li[4]")
	By linkAdobeAcrobat = By.xpath("//*[@id='ctl00_MainContent_rmItemCommands']/ul/li[5]")
	By linkAdobeAcrobatFull = By.xpath("//*[@id='ctl00_MainContent_rmItemCommands']/ul/li[6]")
	By linkBrands = By.xpath("//*[text()='Brands']")
	By linkSupplier = By.xpath("//*[text()='Supplier']")
	By linkDemographic = By.xpath("//*[text()='Demographic']")
	By linkPremiseType = By.xpath("//*[text()='Premise Type']")
	By linkProductType = By.xpath("(//*[text()='Product Type'])[1]")
	By linkSalesDivision = By.xpath("//*[text()='Sales Division']")
	By linkSeasonalType = By.xpath("//*[text()='Seasonal Type']")
	By linkWarehouse = By.xpath("(//*[text()='Warehouse'])[3]")
	By linkWarehouseLocation = By.xpath("//*[text()='Warehouse Location']")
	By linkOtherFilters = By.xpath("//*[text()='Other Filters']")

	By ordersearchtextbox = By.xpath("//*[@id='ctl00_MainContent_rsbOrderSearch_Input']")
	By ordersearchbtn = By.xpath("//*[@id='ctl00_MainContent_rsbOrderSearch_Input']")
	By clearbtn = By.xpath("//*[@id='ctl00_MainContent_btnClearSearchBox']")

	By allordersearchresults = By.xpath("//*[@id='ctl00_MainContent_rgOrderSearch_GridData']//tr//td[2]/a")


	@Keyword
	public void VerifyOrderInventoryPage() {

		try{
			action.VerifyCurrentPage("WarehouseOrderInventory.aspx")
			action.WaitVisible(addnewitembtn)
			boolean statusofaddnewitembtn = action.IsElementDisplayed(addnewitembtn)
			Assert.assertTrue(statusofaddnewitembtn)
			boolean statusofenablecreateneworderbtn = action.IsElementEnabled(addnewitembtn)
			Assert.assertTrue(statusofenablecreateneworderbtn)
		}
		catch(Exception e)
		{
			Assert.fail("Verify Order Inventory Page fail due to "+ e)
		}

	}

	@Keyword
	public void OrderSearchPageFields()
	{
		try{
			boolean statusofordersearchbox = action.IsElementDisplayed(ordersearchtextbox)
			Assert.assertTrue(statusofordersearchbox)

			boolean statusofordersearchbtn = action.IsElementDisplayed(ordersearchbtn)
			Assert.assertTrue(statusofordersearchbtn)

			boolean statusofclearbtn = action.IsElementDisplayed(clearbtn)
			Assert.assertTrue(statusofclearbtn)
		}
		catch(Exception e)
		{
			Assert.fail("Order Search Page Fields failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyOrderSearch(String orderid)
	{
		try{
			action.Type(ordersearchtextbox, orderid)
			action.Click(ordersearchbtn)
			WebUI.delay(30)
			List<WebElement> ordersearchresults = action.GetElements(allordersearchresults)
			int totalordercount = ordersearchresults.size()
			if(totalordercount != 0)
			{
				for(int i=0;i< totalordercount;i++ )
				{
					String actualorderid =ordersearchresults.get(i).getText()
					println ("Actual odrer id --------"+ actualorderid)
					WebUI.delay(10)
					if(actualorderid.equals(orderid))
					{
						println ("Order id found ")
					}
					else{
						throw new Exception("Order id not found")
					}
				}
			}
			else{
				throw new Exception("Orders are not available")
			}
		}
		catch(Exception e)
		{
			Assert.fail("Verify Order Search failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyExistingOrderSearch()
	{
		String orderidbeforesearch =null
		try{
			List<WebElement> ordersearchresultsbeforesearch = action.GetElements(allordersearchresults)
			int totalordercount = ordersearchresultsbeforesearch.size()
			if(totalordercount != 0)
			{
				orderidbeforesearch =ordersearchresultsbeforesearch.get(i).getText()
				action.Type(ordersearchtextbox, orderidbeforesearch)
				action.Click(ordersearchbtn)
				List<WebElement> ordersearchresultsaftersearch= action.GetElements(allordersearchresults)
				int totalordercountaftersearch = ordersearchresultsaftersearch.size()
				if(totalordercount != 0)
				{
					for(int i=0;i< totalordercount;i++ )
					{
						String orderidaftersearch=ordersearchresultsaftersearch.get(i).getText()
						if(orderidaftersearch.equals(orderidbeforesearch))
						{
							println ("Order id found ")
						}
						else{
							throw new Exception("Order id not found")
						}
					}
				}
			}
			else{
				throw new Exception("No Order found")
			}
		}
		catch(Exception e)
		{
			Assert.fail("Verify Existing Order Search failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyOrderSearchPage()
	{
		try{
			action.VerifyCurrentPage("WarehouseOrderInventory.aspx")
		}
		catch(Exception e) {
			Assert.fail("VerifyOrderSearchPage failed due to "+ e)
		}

	}

}
