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
import org.eclipse.persistence.internal.jpa.parsing.jpql.antlr.JPQLParser.orderByClause_scope
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
	By allsuppliersnameingrid = By.xpath("//*[@id='ctl00_MainContent_rgItemSearch_ctl00']//tr//td[4]")
	By brandfilter = By.xpath("//*[@id='ctl00_MainContent_rpbSearch_i1_i0_rlbBrands_i2']")
	By allbrandsnameingrid = By.xpath("//*[@id='ctl00_MainContent_rgItemSearch_ctl00']//tr//td[5]")
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

	By SalesDivisionDivision = By.xpath("//*[@id='ctl00_MainContent_rpbSearch']/ul/li[5]/a/span/span[1]")
	//By firstSalesdivisionCheckbox = By.xpath("//*[text()='BBN Beer Off Premise']/preceding-sibling::input")
	By firstSalesdivisionCheckbox = By.xpath("//*[text()='ADS - On Premise']/preceding-sibling::input")
	By SuplierAccordian = By.xpath("//*[@id='ctl00_MainContent_rpbSearch']/ul/li[1]/a/span/span[1]")
	By BrandAccordian = By.xpath("//*[@id='ctl00_MainContent_rpbSearch']/ul/li[2]/a/span/span[1]")

	By salesDivisionNV= By.xpath("//*[@id='ctl00_MainContent_rpbSearch_i5_i0_rlbSalesDivision']/div/ul/li[1]/label/input")

	By OrderPlusIcon = By.xpath("//*[@id='ctl00_MainContent_rgItemSearch_ctl00_ctl04_imgOrder']")
	By UpdateQuantityBtn = By.xpath("//*[text()='Update Quantities']")
	By NewOrder = By.xpath("(//*[text()='New Order'])[2]")
	By ClickHeretogotothisorderlink= By.xpath("//*[text()='Click here to go to this order.']")
	//By AddCustomer = By.xpath("//*[text()='Add Customer']")
	By customerSearchTxtField = By.xpath("//*[@id='ctl00_MainContent_dockCustomerInformation_C_rsbCustomers_Input']")
	By cutomerFirstOption = By.xpath("(//*[@id='rsbCustomerName'])[1]")
	By ShipMethodDropdwon= By.xpath("//*[@id='ctl00_MainContent_dockShippingInformation_C_ddlShippingMethod_Arrow']")
	By FirstShipOption = By.xpath("(//*[@id='ctl00_MainContent_dockShippingInformation_C_ddlShippingMethod_DropDown'])/div/ul/li[1]")
	By SubmitOrderBtn = By.xpath("(//*[@id='ctl00_MainContent_btnSubmitOrder'])")
	By HeaderItemSearchPage = By.xpath("//*[@id='ctl00_MainContent_rmItemCommands']")

	By SelectSalesDivEM = By.xpath("//*[text()='Sales Division']")
	By FirstSalesDivOptionEM = By.xpath("//*[@id='ctl00_MainContent_rpbSearch_i6_i0_rlbWarehouseSalesDivision_i0']/label/input")


	By otherFiltersExpandBtn = By.xpath("//*[@id='ctl00_MainContent_rpbSearch']/ul/li[9]/a/span/span[1]")
	By availableToOrderCheckBox = By.xpath("//*[@id='ctl00_MainContent_rpbSearch_i10_i0_rlbOtherFilters_i0']/label/input")
	By ApprovalRequiredCheckBox = By.xpath("//*[@id='ctl00_MainContent_rpbSearch_i10_i0_rlbOtherFilters_i1']/label/input")
	By clearSelectionLink = By.xpath("//*[text()='Clear Selection']")
	By clearAllFilters = By.xpath("//*[text()='Clear All Filters']")


	By plusIcon = By.xpath("(//*[@id='ctl00_MainContent_rgItemSearch_ctl00_ctl04_imgOrder'])[1]")
	By addBtn = By.xpath("(//*[text()='Add'])[1]")
	By addCustomer = By.xpath("//*[@id='ctl00_MainContent_dockCustomerInformation_C_btnModifyCustomer']")
	By addanItemLink = By.xpath("(//*[text()='Add an Item'])[1]")

	By firstItem = By.xpath("(//*[@id='ctl00_MainContent_rgItemSearch_ctl00_ctl04_lblItemName'])[1]")
	By itemName = By.xpath("//*[@id='ctl00_MainContent_ucItemOverView_radListItemProperties_ctrl0_ItemName']")
	By deleteItemLink = By.xpath("//*[@id='MainContent_btnDeleteItem']")
	By DeleteItemBtn  = By.xpath("//*[@id='ctl00_MainContent_rwDeleteItemSettings_C_btnDeleteItemAndResetQuantities_input']")
	By deleteCheckBox = By.xpath("//*[@id='ctl00_MainContent_rpbSearch_i10_i0_rlbOtherFilters_i2']/label/input")
	By itemNameColValiue = By.xpath("//*[@id='ctl00_MainContent_rgItemSearch_ctl00']/tbody/tr/td[3]")
	By approverColVal = By.xpath("//*[@id='ctl00_MainContent_rgItemSearch_ctl00__0']/td[7]")
	By adsLabelName = By.xpath("//*[@id='ctl00_MainContent_rpbSearch_i6_i0_rlbWarehouseSalesDivision_i0']/label")
	By salesDivLebelOnEditItemPage = By.xpath("//*[@id='ctl00_MainContent_ucItemOverView_radListItemProperties_ctrl0_lblSalesDivisions']")
	By imageLoader = By.xpath("//*[@id='MainContent_Image2']")



	@Keyword
	public void SelectFirstItem()
	{
		try
		{
			action.Click(firstItem)
			action.WindowHandle()
			WebUI.delay(15)


		}
		catch(Exception e)
		{
			Assert.fail("SelectFirstItem failed due to :" + e)
		}
	}
	@Keyword
	public String GetAdsSalesDivName()
	{
		try
		{
			String SalesDivName = action.GetText(adsLabelName)
			return SalesDivName
		}
		catch(Exception e)
		{
			Assert.fail("GetAdsSalesDivName failed due to :" + e)
		}
	}

	@Keyword
	public boolean VerifySalesDiv(String SalesDivName)
	{
		try
		{
			boolean IsSalesDivVerified = false
			String SalesDivNameOnItemPage = action.GetText(salesDivLebelOnEditItemPage)

			println ("----------->" + SalesDivNameOnItemPage)

			if(SalesDivName.equalsIgnoreCase(SalesDivNameOnItemPage))
			{

				println("Sales Div verified successfully")
				return IsSalesDivVerified = true
			}
		}
		catch(Exception e)
		{
			Assert.fail("VerifySalesDiv failed due to :" + e)
		}
	}





	@Keyword
	public void VerifyApproverCol(String ApproverNameExpected)
	{
		try
		{
			String ApproverNameActual = action.GetText(approverColVal)
			println "***********" + ApproverNameActual
			if(ApproverNameActual.equalsIgnoreCase(ApproverNameExpected))
			{
				println "Approver transfer successfully"
			}

		}
		catch(Exception e)
		{
			Assert.fail("VerifyApproverCol failed due to :" + e)
		}
	}
	@Keyword
	public String DeleteFirstItem()
	{
		try
		{
			action.WindowHandle()
			String itemName = action.GetText(itemName)
			action.ScrollToBottomOfPage()
			action.Click(deleteItemLink)
			WebUI.delay(5)
			action.AcceptAlert()
			WebUI.delay(3)
			action.ScrollToTopOgPage()
			action.Click(DeleteItemBtn)
			WebUI.delay(3)

			return 	itemName

		}
		catch(Exception e)
		{
			Assert.fail("DeleteItem failed due to :" + e)
		}
	}


	@Keyword
	public void ClickOnFirstItemName()
	{
		try
		{
			action.Click(firstItem)
			WebUI.delay(7)

		}
		catch(Exception e)
		{
			Assert.fail("ClickOnFirstItemName failed due to :" + e)
		}
	}

	@Keyword
	public void SelectSalesDivisionForEmpireMerchant()
	{
		try
		{
			action.Click(SuplierAccordian)
			//WebUI.delay(2)
			action.Click(BrandAccordian)
			//WebUI.delay(2)
			//action.ScrollToViewelement(SalesDivisionDivision)
			action.Click(SelectSalesDivEM)
			//WebUI.delay(2)
			action.Click(FirstSalesDivOptionEM)
			WebUI.delay(5)


		}
		catch(Exception e)
		{
			Assert.fail("SelectSalesDivision failed due to :" + e)
		}
	}



	@Keyword
	public void SelectSalesDivisionForNV()
	{
		try
		{
			action.Click(SuplierAccordian)
			//WebUI.delay(2)
			action.Click(BrandAccordian)
			//WebUI.delay(2)
			//action.ScrollToViewelement(SalesDivisionDivision)
			action.Click(SelectSalesDivEM)
			//WebUI.delay(2)
			action.Click(salesDivisionNV)
			//WebUI.delay(5)


		}
		catch(Exception e)
		{
			Assert.fail("SelectSalesDivision failed due to :" + e)
		}
	}










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
				//boolean statusofdemographicfilter= action.IsElementEnabled(linkDemographic)
				boolean statusofpremisetypefilter= action.IsElementEnabled(linkPremiseType)
				boolean statusofproducttypefilter= action.IsElementEnabled(linkProductType)
				boolean statusofsalesdivisionfilter= action.IsElementEnabled(linkSalesDivision)
				boolean statusofseasonaltypefilter= action.IsElementEnabled(linkSeasonalType)
				boolean statusofwarehousefilter= action.IsElementEnabled(linkWarehouse)
				boolean statusofwarehouselocationfilter= action.IsElementEnabled(linkWarehouseLocation)
				boolean statusofotherfilter= action.IsElementEnabled(linkOtherFilters)

				if(statusofsupplierfilter== true  && statusofbrandfilter == true && statusofpremisetypefilter == true && statusofproducttypefilter == true && statusofsalesdivisionfilter == true && statusofseasonaltypefilter == true
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
			//WebUI.delay(20)
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
			//WebUI.delay(10)
			action.Click(supplierfilter)
			action.WaitTillNotVisible(imageLoader, 0)
			//WebUI.delay(20)
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
			//WebUI.delay(10)
			action.Click(brandfilter)
			action.WaitTillNotVisible(imageLoader, 0)
			//WebUI.delay(20)
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
		String expectedUATUrl = "https://csg.v5qa.brandmuscle.net/Warehouse/Admin/UserTransfer.aspx";
		String expectedSTAGEUrl ="https://csg.v5stgae.brandmuscle.net/Warehouse/Admin/UserTransfer.aspx"

		try{
			action.VerifyCurrentPage("WarehouseItemInventory.aspx")
		}
		catch(Exception e) {
			Assert.fail("VerifyItemSearchPage failed due to "+ e)
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
					//WebUI.delay(10)
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
					//WebUI.delay(10)
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
					//WebUI.delay(10)
					action.Click(deletethisitembtn)
					//WebUI.delay(10)
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

	@Keyword
	public void SelectSalesDivision()
	{
		try
		{
			action.Click(SuplierAccordian)
			//WebUI.delay(2)
			action.Click(BrandAccordian)
			//WebUI.delay(2)
			//action.ScrollToViewelement(SalesDivisionDivision)
			action.Click(SalesDivisionDivision)
			//WebUI.delay(2)
			action.Click(firstSalesdivisionCheckbox)
			//WebUI.delay(5)


		}
		catch(Exception e)
		{
			Assert.fail("SelectSalesDivision failed due to :" + e)
		}
	}


	@Keyword
	public void SearchSpecificItem(String itemName)
	{
		try
		{
			action.WaitVisible(itemsearchtextbox)
			action.Type(itemsearchtextbox, itemName)
			action.Click(itemsearchbtn)
			WebUI.delay(5)

		}
		catch(Exception e)
		{
			Assert.fail("SearchSpecificItem failed due to :" + e)
		}
	}

	@Keyword

	public void AddToCart()
	{
		try
		{
			action.Click(OrderPlusIcon)
			//WebUI.delay(3)
			action.Click(UpdateQuantityBtn)
			//WebUI.delay(3)
			action.Click(NewOrder)
			//WebUI.delay(5)
			action.Click(ClickHeretogotothisorderlink)
			WebUI.delay(10)


		}
		catch(Exception e)
		{
			Assert.fail("AddToCart failed due to :" + e)
		}
	}

	@Keyword
	public void AddCustomer()
	{
		try
		{
			//action.WaitVisible(AddCustomer)
			action.Click(addCustomer)
			WebUI.delay(2)
			action.Type(customerSearchTxtField, "st")
			WebUI.delay(2)
			action.Click(cutomerFirstOption)
			WebUI.delay(3)

		}
		catch(Exception e)
		{
			Assert.fail("AddCustomer failed due to :" + e)
		}
	}


	@Keyword
	public void SelectShipMethod()
	{
		try
		{
			//action.WaitVisible(ShipMethodDropdwon)
			//action.ScrollToViewelement(ShipMethodDropdwon)
			action.ScrollToBottomOfPage()
			action.Click(ShipMethodDropdwon)
			WebUI.delay(3)
			action.Click(FirstShipOption)
			WebUI.delay(5)

		}
		catch(Exception e)
		{
			Assert.fail("SelectShipMethod failed due to :" + e)
		}
	}

	@Keyword
	public void ClickOnSubmitOrderBtn()
	{
		try
		{
			action.WaitVisible(SubmitOrderBtn)
			action.Click(SubmitOrderBtn)
			WebUI.delay(5)
			action.ScrollToTopOgPage()


		}
		catch(Exception e)
		{
			Assert.fail("ClickOnSubmitOrderBtn failed due to :" + e)
		}
	}

	@Keyword
	public void VerifyItemSearchPageHeader()
	{
		boolean headerStatus = null
		try
		{
			action.WaitVisible(HeaderItemSearchPage)
			headerStatus = action.IsElementDisplayed(HeaderItemSearchPage)
			Assert.assertTrue(headerStatus)
			println "+++++++++++ Header is visible before scrolling down" + headerStatus
			//WebUI.delay(5)
			action.ScrollToBottomOfPage()
			//WebUI.delay(5)
			headerStatus = action.IsElementDisplayed(HeaderItemSearchPage)
			Assert.assertTrue(headerStatus)
			println "+++++++++++ Header is visible after scrolling down" + headerStatus

		}
		catch(Exception e)
		{
			Assert.fail("VerifyItemSearchPageHeader failed due to :" + e)
		}
	}

	@Keyword
	public void ClickOnSupplierAndBrandFilters()
	{
		try
		{
			action.Click(SuplierAccordian)
			WebUI.delay(2)
			action.Click(BrandAccordian)
			WebUI.delay(2)

		}
		catch(Exception e)
		{
			Assert.fail("ClickOnSupplierAndBrandFilters failed due to :" + e)
		}
	}

	@Keyword
	public void ClickOnOtherFiltersExpandButton()
	{
		try
		{
			action.Click(otherFiltersExpandBtn)
			//WebUI.delay(3)

		}
		catch(Exception e)
		{
			Assert.fail("ClickOnSupplierAndBrandFilters failed due to :" + e)
		}
	}

	@Keyword
	public boolean  VerifyAvailableToOrderChecked()
	{
		boolean IsChacked = false
		try
		{
			IsChacked = action.IsElementSelected(availableToOrderCheckBox)
			Assert.assertTrue(IsChacked)
			println ("Available to order fillter is checked")
			return IsChacked

		}
		catch(Exception e)
		{
			Assert.fail("VerifyAvailableToOrderChecked failed due to :" + e)
		}
	}

	@Keyword
	public void OtherFilterSecondOption()
	{
		try
		{
			action.Click(ApprovalRequiredCheckBox)
			//WebUI.delay(10)

		}
		catch(Exception e)
		{
			Assert.fail("OtherFilterSecondOption failed due to :" + e)
		}
	}

	@Keyword
	public void OtherFilterDeleteOption()
	{
		try
		{
			action.Click(deleteCheckBox)
			WebUI.delay(10)

		}
		catch(Exception e)
		{
			Assert.fail("OtherFilterSecondOption failed due to :" + e)
		}
	}

	@Keyword
	public void ClickOnClearSelctionLink()
	{
		try
		{
			action.Click(clearSelectionLink)
			//WebUI.delay(10)

		}
		catch(Exception e)
		{
			Assert.fail("ClickOnClearSelctionLink failed due to :" + e)
		}
	}

	@Keyword
	public void ClickOnClearAllFiltersLink()
	{
		try
		{
			action.Click(clearAllFilters)
			//WebUI.delay(10)

		}
		catch(Exception e)
		{
			Assert.fail("ClickOnClearAllFiltersLink failed due to :" + e)
		}
	}


	@Keyword
	public void VerifyDeletedItem(String itemName)
	{
		try
		{
			List<WebElement> allitemnames = action.GetElements(itemNameColValiue)
			if(allitemnames.size()>0)
			{
				for(int i=0;i< allitemnames.size();i++)
				{
					String appeareditemname = allitemnames.get(i).getText()
					if(appeareditemname.contains(itemName))
						println "******** Item Verified Successfully**************"
				}
			}

		}
		catch(Exception e)
		{
			Assert.fail("VerifyDeletedItem failed due to :" + e)
		}
	}

	/*@Keyword
	 public void ClickOnAddanItemIcon()
	 {
	 try
	 {
	 action.Click(plusIcon)
	 //WebUI.delay(10)
	 }
	 catch(Exception e)
	 {
	 Assert.fail("ClickOnAddanItemLink method failed due to :" + e)
	 }
	 }
	 @Keyword
	 public void ClickOnAddanItemLink()
	 {
	 try
	 {
	 action.Click(addanItemLink)
	 //WebUI.delay(10)
	 }
	 catch(Exception e)
	 {
	 Assert.fail("ClickOnAddanItemLink method failed due to :" + e)
	 }
	 }
	 @Keyword
	 public void ClickOnAddLink()
	 {
	 try
	 {
	 action.Click(addBtn)
	 //WebUI.delay(10)
	 }
	 catch(Exception e)
	 {
	 Assert.fail("ClickOnAddLink method failed due to :" + e)
	 }
	 }*/

































}
