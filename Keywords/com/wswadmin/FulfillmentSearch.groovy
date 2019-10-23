package com.wswadmin

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
//import internal.GlobalVariable
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions
import org.apache.poi.hssf.util.HSSFColor.SKY_BLUE
import org.openqa.selenium.By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.testng.Assert

public class FulfillmentSearch {


	WebDriver driver = DriverFactory.getWebDriver()
	Interaction action = new Interaction()



	By FulfillmentMenu = By.xpath("(//*[text()='Fulfillment'])[1]")
	By FulfillmentSearchSubMenu = By.xpath("(//*[text()='Fulfillment Search'])[1]")
	By FulfillmentSearchHeader = By.xpath("(//*[text()='Fulfillment - Fulfillment Search'])[1]")
	By corptextbox = By.xpath("//*[@id='ctl00_cphMain_rcbCorp_Input']")
	By corpoddnarrow = By.xpath("//*[@id='ctl00_cphMain_rcbCorp_Arrow']")
	By corpddnvalue = By.xpath("//*[@id='ctl00_cphMain_rcbCorp_DropDown']//li[text()='300 - Instant Impact 4.0 Demo Corp (Dist.)']")
	By SkuTextField = By.xpath("//*[@id='ctl00_cphMain_txtSku']")
	By ProductName = By.xpath("//*[@id='ctl00_cphMain_txtProductName']")
	By ItemWithoutAProductCheckBox = By.xpath("//*[@id='cphMain_chkWithoutProductUnit']")
	By StatusDropDown = By.xpath("//*[@id='ctl00_cphMain_ddlStatus']")
	By ActiveOption = By.xpath("//*[text()='Active']")
	By InactiveOption = By.xpath("//*[text()='Inactive']")
	By StoreDropDown = By.xpath("//*[@id='ctl00_cphMain_rcbFulfillmentStore']")
	By StoreDropDownValues = By.xpath("//*[@id='ctl00_cphMain_rcbFulfillmentStore_DropDown']/div/ul/li")
	By FulfillmentTypeDropDown = By.xpath("//*[@id='ctl00_cphMain_rcbFulfillmentType_Input']")
	By FulfillmentTypeOptions = By.xpath("//*[@id='ctl00_cphMain_rcbFulfillmentType_DropDown']/div/ul/li")
	By SearchButton = By.xpath("//*[@id='cphMain_btnSearch']")
	By ClearSearch = By.xpath("//*[@id='cphMain_btnClearSearch']")

	By skusearchallcorporation = By.xpath("//*[@id='ctl00_cphMain_radGrdFulfillmentSearch_ctl00']/tbody//tr//td[4]")
	By skusearchallskus = By.xpath("//*[@id='ctl00_cphMain_radGrdFulfillmentSearch_ctl00']/tbody//tr//td[5]")
	By firstsku = By.xpath("//*[@id='ctl00_cphMain_radGrdFulfillmentSearch_ctl00']/tbody//tr[1]//td[5]")

	By firstproductdesc = By.xpath("//*[@id='ctl00_cphMain_radGrdFulfillmentSearch_ctl00']/tbody//tr[1]//td[3]")
	By allproductdesc = By.xpath("//*[@id='ctl00_cphMain_radGrdFulfillmentSearch_ctl00']/tbody//tr//td[3]")

	By firsteditlink = By.xpath("//*[@id='ctl00_cphMain_radGrdFulfillmentSearch_ctl00']/tbody//tr[1]//td[2]")



	@Keyword
	public void VerifyFulfillmentSearchPage()
	{
		try{
			action.VerifyCurrentPage("FulfillmentSearch.aspx")
		}
		catch(Exception e)
		{
			Assert.fail("Verify Fulfillment Search Page failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyMandatoryFields()
	{
		try{
			boolean statusofcorpddn = action.IsElementDisplayed(corptextbox)
			Assert.assertTrue(statusofcorpddn)

			boolean statusofskutextbox = action.IsElementDisplayed(SkuTextField)
			Assert.assertTrue(statusofskutextbox)

			boolean statusofproductnametextbox = action.IsElementDisplayed(ProductName)
			Assert.assertTrue(statusofproductnametextbox)

			boolean statusofsearchbtn = action.IsElementDisplayed(SearchButton)
			Assert.assertTrue(statusofsearchbtn)

			boolean statusofclearsearchbtn = action.IsElementDisplayed(ClearSearch)
			Assert.assertTrue(statusofclearsearchbtn)
		}
		catch(Exception e)
		{
			Assert.fail("Verify Mandatory Fields failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyFufillmentSearchByCorporation()
	{
		try{
			action.Click(corpoddnarrow)
			WebUI.delay(3)
			action.Type(corptextbox, "300 - Instant Impact 4.0 Demo Corp (Dist.)")
			action.Click(SkuTextField)
			action.Click(SearchButton)
			List<WebElement> allcorporation = action.GetElements(skusearchallcorporation)
			for(int i=0;i< allcorporation.size();i++)
			{
				String corpname = allcorporation.get(i).getText()
				if(corpname.contains("Instant Impact"))
				{
					println ("Search results verified..")
				}
				else{
					throw new Exception("Search By Corporation results not matched")
				}
			}
		}
		catch(Exception e)
		{
			Assert.fail("Verify Fufillment Search By Corp. failed due to "+ e)
		}
	}



	@Keyword
	public void VerifyFufillmentSearchBySKU()
	{
		String skuname = null
		try{
			action.Click(corpoddnarrow)
			WebUI.delay(3)
			action.Type(corptextbox, "300 - Instant Impact 4.0 Demo Corp (Dist.)")
			action.Click(SkuTextField)
			WebUI.delay(3)
			action.Click(SearchButton)
			WebUI.delay(3)
			skuname = action.GetText(firstsku)
			WebUI.delay(3)
			action.Type(SkuTextField, skuname)
			WebUI.delay(3)
			action.Click(SearchButton)
			List<WebElement> allskus = action.GetElements(skusearchallskus)
			for(int i=0;i< allskus.size();i++)
			{
				String skunameappeared = allskus.get(i).getText()
				if(skuname.contains(skunameappeared))
				{
					println ("Search By SKU results verified..")
				}
				else{
					throw new Exception("Search results not matched")
				}
			}
		}
		catch(Exception e)
		{
			Assert.fail("Verify Fufillment Search by SKU failed due to "+ e)
		}
	}


	@Keyword
	public void VerifyFufillmentSearchByProductName()
	{
		String firstproductname = null
		try{
			action.Click(corpoddnarrow)
			WebUI.delay(3)
			action.Type(corptextbox, "300 - Instant Impact 4.0 Demo Corp (Dist.)")
			WebUI.delay(3)
			action.Click(SkuTextField)
			WebUI.delay(3)
			action.Click(SearchButton)
			firstproductname = action.GetText(firstproductdesc)
			action.Type(ProductName, firstproductname)
			action.Click(SearchButton)
			List<WebElement> allproductdescription = action.GetElements(allproductdesc)
			for(int i=0;i< allproductdescription.size();i++)
			{
				String productdescription = allproductdescription.get(i).getText()
				println ("Product Description is-------------- "+ productdescription)
				if(firstproductname.contains(productdescription))
				{
					println ("Search By Description results verified..")
				}
				else{
					throw new Exception("Search results not matched")
				}

			}
		}
		catch(Exception e)
		{
			Assert.fail("Verify Fufillment Search by Desc. failed due to "+ e)
		}
	}

	@Keyword
	public void EditFufillmentItem()
	{
		try{
			action.Click(corpoddnarrow)
			WebUI.delay(3)
			action.Type(corptextbox, "300 - Instant Impact 4.0 Demo Corp (Dist.)")
			action.Click(SkuTextField)
			action.Click(SearchButton)
			action.Click(firsteditlink)
			action.WaitForPageToLoad()
		}
		catch(Exception e)
		{
			Assert.fail("Edit Fufillment Item failed due to "+ e)
		}
	}

































































































}
