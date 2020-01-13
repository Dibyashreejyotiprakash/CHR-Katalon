package com.wswadmin

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.testng.Assert

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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebElement

//import internal.GlobalVariable

public class ItemSearchpage {

	WebDriver driver = DriverFactory.getWebDriver()
	Interaction action = new Interaction()


	By corporationtextbox = By.xpath("//input[@value = 'Choose a Corporation']")
	By itemtypetextbox = By.xpath("//input[@value = 'Please select an Item Type']")
	By selectcorp = By.xpath("//em[contains(text(),'300')]")
	By selectitemtemplate = By.xpath("//li[contains(text(),'Template')]")
	By statusdropdown = By.xpath("//div[@id='ctl00_ctl00_cphMain_cphMain_rcbStatus']/span/button")
	By firstselectdata = By.xpath("(//a[text() = 'Select Data'])[1]")
	By corporationname = By.xpath("//span[@id='cphMain_cphMain_lblCorporateInfo']")
	By brandnamecategory = By.xpath("//span[contains(text(),'Brand Name')]")
	By brandnamemetatagcount = By.xpath("//div[@id='10']")
	By selectcorp1 = By.xpath("//em[contains(text(),'276')]")
	By suppliercategory = By.xpath("(//span[contains(text(),'Supplier')])[3]")
	By suppliermetatagcount = By.xpath("//input[@id='65']")
	By corporationddnvalue = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_rcbCorp_DropDown']//li[279]")
	By expandedmetatagsearch = By.xpath("//input[@id='mdlTxtFilter_10']")
	By noresultfoundtxt = By.xpath("//div[@id='programlistContent']/div[1]")
	By expandedmetatagcross = By.xpath("(//img[@alt = 'X'])[2]")
	By completestatus = By.xpath("//li[contains(text(),'Complete')]")
	By alphaW = By.xpath("//a[@id='aAlpha_W']")
	By checkboxlist = By.xpath("//div[@id = 'programlistContent']//span[@class = 'check']")
	By applyselection = By.xpath("//button[@id='btnUpdate']")
	By selectmetatag = By.xpath("//label[contains(text(),'Wakefield')]")
	By savebtn = By.xpath("//input[@id='cphMain_cphMain_btnSave']")





















	@Keyword
	public void openTemplateConfigurationPage(){

		action.Click(corporationtextbox)
		action.Type(corporationtextbox, "300")
		action.Click(selectcorp)
		//WebUI.delay(15)
		action.Click(itemtypetextbox)
		//WebUI.delay(2)
		action.Click(selectitemtemplate)
		//WebUI.delay(2)
		action.Click(firstselectdata)
		action.WaitVisible(corporationname)
	}

	@Keyword
	public void ValidateRetainSelection()
	{
		try{
			String corpddnvalue = driver.findElement(By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_rcbCorp_Input']")).getAttribute("value")
			println ("Selection is _________________"+ corpddnvalue)
			if(corpddnvalue.contains("339 - Demo Distributor (QA)"))
			{
				println ("Selected values are retained")
			}
			else{
				throw new Exception ("Selected values are not retained")
			}
		}
		catch(Exception e)
		{
			Assert.fail("Validate Retain Selection failed due to "+ e)
		}
	}

	@Keyword
	public void validateBrandnameCategory(){
		action.WaitVisible(brandnamecategory)
		//WebUI.delay(5)
		action.ScrollToViewElement(brandnamemetatagcount)
		action.WaitVisible(brandnamemetatagcount)
		boolean status=action.IsElementDisplayed(brandnamemetatagcount)
		Assert.assertTrue(status, "true")
	}


	@Keyword
	public void openTemplateConfigurationPage1(){

		action.Click(corporationtextbox)
		action.Type(corporationtextbox, "276")
		action.Click(selectcorp1)
		//WebUI.delay(10)
		action.Click(itemtypetextbox)
		action.Click(selectitemtemplate)
		action.Click(firstselectdata)
		action.WaitVisible(corporationname)
	}

	@Keyword
	public void validateSupplierCategory(){
		action.WaitVisible(suppliercategory)
		action.IsElementDisplayed(suppliercategory)
	}

	@Keyword
	public void NavigateToTemplateConfigurationPage() {
		try {
			action.Click(corporationtextbox)
			action.Type(corporationtextbox, "339")
			action.Click(corporationddnvalue)
			//WebUI.delay(2)
			action.Click(itemtypetextbox)
			action.Click(selectitemtemplate)
			action.Click(firstselectdata)
			action.WaitVisible(corporationname)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Navigate To Template Configuration Page failed due to "+ e)
			Assert.fail("Navigate To Template Configuration Page failed due to "+ e)
		}
	}


	@Keyword
	public void SelectCompleteTemplate() {
		try {
			action.Click(corporationtextbox)
			action.Type(corporationtextbox, "300")
			action.Click(selectcorp)
			//WebUI.delay(5)
			action.Click(itemtypetextbox)
			action.Click(selectitemtemplate)
			action.Click(statusdropdown)
			action.Click(completestatus)
			action.Click(firstselectdata)
			action.WaitVisible(corporationname)
		}
		catch(Exception e) {
			Assert.fail("SelectCompleteTemplate failed due to "+ e)
		}
	}


	@Keyword
	public void OpenBrandNameExpandedWindow() {
		try {
			action.WaitVisible(brandnamecategory)
			//WebUI.delay(5)
			action.ScrollToViewElement(brandnamemetatagcount)
			action.WaitVisible(brandnamemetatagcount)
			action.Click(brandnamemetatagcount)
			action.WaitVisible(expandedmetatagcross)
		}
		catch(Exception e) {
			Assert.fail("OpenBrandNameExpandedWindow failed due to "+ e)
		}
	}

	@Keyword
	public void ValidateSpecialCharacterMetatag() {
		try {
			action.Click(expandedmetatagsearch)
			action.Type(expandedmetatagsearch, "?")
			action.WaitVisible(noresultfoundtxt)
			action.Click(expandedmetatagcross)
			action.WaitVisible(corporationname)
			action.ScrollToViewElement(corporationname)
		}
		catch(Exception e) {
			Assert.fail("ValidateSpecialCharacterMetatag failed due to "+ e)
		}
	}

	@Keyword
	public void ValidateMetatagUnselectionOnExpandedScreen()
	{
		try
		{
			action.WaitVisible(brandnamemetatagcount)
			action.ScrollToViewElement(brandnamemetatagcount)
			//WebUI.delay(3)
			action.Click(brandnamemetatagcount)
			//WebUI.delay(3)
			List<WebElement> e = action.GetElements(checkboxlist)

			if(e.size()>0)
			{
				for(int i=0;i< 3; i++)
				{
					e[i].click()

				}

				action.Click(applyselection)
				action.WaitVisible(savebtn)
			}
			else
			{
				action.Click(alphaW)
				action.WaitVisible(selectmetatag)
				action.Click(selectmetatag)
				action.Click(applyselection)
				action.WaitVisible(brandnamecategory)
				action.WaitVisible(brandnamemetatagcount)
				action.Click(brandnamemetatagcount)
				action.WaitVisible(expandedmetatagcross)
				action.Click(alphaW)
				action.Click(selectmetatag)
				action.Click(applyselection)
				action.WaitVisible(savebtn)
				action.Click(savebtn)
			}

		}
		catch(Exception e)
		{
			Assert.fail("ValidateMetatagUnselectionOnExpandedScreen failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyCorporationDdnIsMandatory()
	{
		try{
			boolean statusofitemtypeddn = action.IsElementEnabled(itemtypetextbox)
			println ("Status of Item Type before corporation selection----"+ statusofitemtypeddn)
			Assert.assertFalse(statusofitemtypeddn)
		}
		catch(Exception e)
		{
			Assert.fail("Verify Corporation Ddn Is Mandatory failed due to "+ e)
		}
	}


}




