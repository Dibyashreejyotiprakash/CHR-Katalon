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
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.testng.Assert

import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable

public class II4ConfigurationPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By corpddn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_ddlCorpId']")
	By corpddnvalue = By.xpath("//*[text()='Demo Distributor (QA)']")
	By marketddn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_ddlMarkets']")
	By marketddnvalue = By.xpath("//*[text()='Demo Dist. 1 QA (360)']")
	By welcomeconfiglabel = By.xpath("//*[text()='WELCOME SCREEN CONFIGURATIONS']")
	By createneworderyesbtn = By.xpath("//*[@id='collapseOne']/div/div[1]/div[2]//span[1]/span[1]")
	By cloneorderyesbtn = By.xpath("//*[@id='collapseOne']/div/div[2]/div[2]//span[1]/span[1]")
	By finishincompletebtn = By.xpath("//*[@id='collapseOne']/div/div[3]/div[2]//span[1]/span[1]")
	By savebtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_btnSave_input']")
	By printdetailslabel = By.xpath("//*[text()='PRINT DETAILS']")
	By printdetailssection = By.xpath("//*[@id='collapseFour']")
	By ioyesbtn = By.xpath("//*[@id='collapseFour']/div/div[5]/div[2]/div/span[1]/span[1]")
	By ioberviagetext = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_rtbIoCodeLbl']")
	By glyesbtn = By.xpath("//*[@id='collapseFour']/div/div[6]/div[2]/div/span[1]/span[1]")
	By glberviagetext = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_rtbGLCodeLbl']")
	By poyesbtn = By.xpath("//*[@id='collapseFour']/div/div[7]/div[2]/div/span[1]/span[1]")
	By poberviagetext = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_rtbPONumberLbl']")
	By smallprintverbiage = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_rtbSmallPrintLbl']")
	By largeprintverbiage = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_rtbLargePrintLbl']")
	By booksverbiage = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_rtbBooksLbl']")
	By accessoriesverbiage = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_rtbAccessoriesLbl']")
	By itemdetailssection = By.xpath("//*[text()='ITEM DETAILS']")
	
	
	By IIDemoCOrpDist = By.xpath("//*[text()='Instant Impact 4.0 Demo Corp (Dist.)']")
	By ChicagoBeverageMarket = By.xpath("//*[text()='Chicago Beverage Systems (296)']")
	By priceDisclaimerYesCheckBox = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_rbPnlPriceDisclaimerTrue']/span[1]")
	By priceDisclaimerNoCheckBox = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_rbPnlPriceDisclaimerFalse']/span[1]")
	
	
	@Keyword
	public void SelectIICorpAndMarkets() {
		try {
			action.Click(corpddn)
			//WebUI.delay(10)
			//action.ScrollToViewelement(corpddnvalue)
			action.Click(IIDemoCOrpDist)
			//WebUI.delay(20)
			action.Click(marketddn)
			//WebUI.delay(10)
			action.Click(ChicagoBeverageMarket)
			//WebUI.delay(10)
		}
		catch(Exception e) {
			println ("SelectIICorpAndMarkets method failed due to "+ e)
			Assert.fail()
		}
	}
	
	@Keyword
	public String EnableAndDisablePriceDisclaimer(String Disclaimer)
	{
		try
		{
			if (Disclaimer.equalsIgnoreCase("Enable"))
			{
				action.ScrollToBottomOfPage()
				action.Click(priceDisclaimerYesCheckBox)
				action.Click(savebtn)
				WebUI.delay(5)
				return Disclaimer
				
			}
			else
			{
				action.ScrollToBottomOfPage()
				action.Click(priceDisclaimerNoCheckBox)
				action.Click(savebtn)
				WebUI.delay(5)
				return Disclaimer
			}
		}
		catch(Exception e)
		{
			Assert.fail("EnableAndDisablePriceDisclaimer failed due to :" + e)
		}
	}
	

	@Keyword
	public void VerifyII4ConfigurationPage() {
		try {
			String actualurl = action.GetCurrentURL()
			if(actualurl.contains("II4Configurations.aspx")) {
				println ("II4 Configuration page is verified")
			}
			else{
				throw new Exception("II4 Configuration page is not verified")
			}
		}
		catch(Exception e) {
			println ("Verify ii4 configuration page failed due to "+ e)
			Assert.fail()
		}
	}


	@Keyword
	public void SelectCorpAndMarkets() {
		try {
			action.Click(corpddn)
			//WebUI.delay(20)
			//action.ScrollToViewelement(corpddnvalue)
			action.Click(corpddnvalue)
			//WebUI.delay(20)
			action.Click(marketddn)
			//WebUI.delay(20)
			action.Click(marketddnvalue)
			//WebUI.delay(20)
		}
		catch(Exception e) {
			println ("Select Corp And Markets failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void VerifyAllFieldsOnOLOFII4ConfigurationPage() {
		try{
			boolean satusofcorpddn = action.IsElementDisplayed(corpddn)
			Assert.assertTrue(satusofcorpddn)

			boolean statusofdistddn = action.IsElementDisplayed(marketddn)
			Assert.assertTrue(statusofdistddn)
		}
		catch(Exception e) {
			println ("Verify All Fields On OLOF II4 Configuration Page failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void VerifyWelComeScreenConfigurationSelection() {
		try{
			boolean satusofwelcomeconfiglabel = action.IsElementDisplayed(welcomeconfiglabel)
			Assert.assertTrue(satusofwelcomeconfiglabel)
		}
		catch(Exception e) {
			println ("Verify WelCome Screen Configuration Selection failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void VerifyCreateNewOrderVisibility() {
		try {
			boolean statusofcreateneworder = action.IsElementSelected(createneworderyesbtn)
			println ("Status of createneworder failed due to ----------"+ statusofcreateneworder)
			if(statusofcreateneworder == true) {
				action.ScrollToBottomOfPage()
				WebUI.delay(10)
				action.Click(savebtn)
			}
			else{
				action.Click(createneworderyesbtn)
			}
		}
		catch(Exception e) {
			println ("Verify Create New Order Visibility failed due to "+ e)
			Assert.fail()
		}
	}


	@Keyword
	public void VerifyCloneVisibility() {
		try {
			boolean statusofcloneorderbtn = action.IsElementSelected(cloneorderyesbtn)
			println ("Status of createneworder failed due to ----------"+ statusofcloneorderbtn)
			if(statusofcloneorderbtn == true) {
				action.ScrollToBottomOfPage()
				WebUI.delay(10)
				action.ScrollToBottomOfPage()
				action.Click(savebtn)
			}
			else{
				action.Click(cloneorderyesbtn)
				action.ScrollToBottomOfPage()
				action.Click(savebtn)
			}
		}
		catch(Exception e) {
			println ("Verify Clone Order Visibility failed due to "+ e)
			Assert.fail()
		}
	}


	@Keyword
	public void VerifyFinishInCompleteVisibility() {
		try {
			boolean statusoffinishincompleteorderbtn = action.IsElementSelected(finishincompletebtn)
			println ("Status of createneworder failed due to ----------"+ statusoffinishincompleteorderbtn)
			if(statusoffinishincompleteorderbtn == true) {
				action.ScrollToBottomOfPage()
				WebUI.delay(10)
				action.ScrollToBottomOfPage()
				action.Click(savebtn)
			}
			else{
				action.Click(finishincompletebtn)
				action.ScrollToBottomOfPage()
				action.Click(savebtn)
			}
		}
		catch(Exception e) {
			println ("Verify Finish Incomplete Visibility failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void VerifyPrintDetailsSection() {
		try {
			boolean statusofprintdetailssection = action.IsElementDisplayed(printdetailssection)
			Assert.assertTrue(statusofprintdetailssection)
		}
		catch(Exception e) {
			println ("Verify Print Details Section failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void UpdateIOVisibilty() {
		try {
			boolean statusofioyesbtn = action.IsElementSelected(ioyesbtn)
			println ("Status of io button  due to ----------"+ statusofioyesbtn)
			if(statusofioyesbtn == true) {
				action.ScrollToBottomOfPage()
				WebUI.delay(10)
				action.ScrollToBottomOfPage()
				action.Click(savebtn)
			}
			else{
				action.Click(ioyesbtn)
				action.ScrollToBottomOfPage()
				action.Click(savebtn)
			}
		}
		catch(Exception e) {
			println ("Verify IO Visibilty failed due to "+ e)
			Assert.fail()
		}
	}


	@Keyword
	public void UpdateGLVisibilty() {
		try {
			boolean statusofglyesbtn = action.IsElementSelected(glyesbtn)
			println ("Status of gl failed due to ----------"+ statusofglyesbtn)
			if(statusofglyesbtn == true) {
				action.ScrollToBottomOfPage()
				WebUI.delay(10)
				action.ScrollToBottomOfPage()
				action.Click(savebtn)
			}
			else{
				action.Click(glyesbtn)
				action.ScrollToBottomOfPage()
				action.Click(savebtn)
			}
		}
		catch(Exception e) {
			println ("Verify GL Visibilty failed due to "+ e)
			Assert.fail()
		}
	}


	@Keyword
	public void UpdatePOVisibilty() {
		try {
			boolean statusofpoyesbtn = action.IsElementSelected(poyesbtn)
			println ("Status of gl failed due to ----------"+ statusofpoyesbtn)
			if(statusofpoyesbtn == true) {
				action.ScrollToBottomOfPage()
				WebUI.delay(10)
				action.ScrollToBottomOfPage()
				action.Click(savebtn)
			}
			else{
				action.Click(poyesbtn)
				action.ScrollToBottomOfPage()
				action.Click(savebtn)
			}
		}
		catch(Exception e) {
			println ("Verify PO Visibilty failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void UpdateIOBerviageText() {
		try{
			action.Type(ioberviagetext, "IO berviage updated for testing")
			action.ScrollToBottomOfPage()
			action.Click(savebtn)
		}
		catch(Exception e) {
			println ("Update IO Berviage Text failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void UpdateGLBerviageText() {
		try{
			action.Type(glberviagetext, "GL berviage updated for testing")
			action.ScrollToBottomOfPage()
			action.Click(savebtn)
		}
		catch(Exception e) {
			println ("Update GL Berviage Text failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void UpdatePOBerviageText() {
		try{
			action.Type(poberviagetext, "PO berviage updated for testing")
			action.ScrollToBottomOfPage()
			action.Click(savebtn)
		}
		catch(Exception e) {
			println ("Update PO Berviage Text failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void AddVerbiageTextForItemDetailsPage() {
		try{

			//action.ScrollToViewelement(itemdetailssection)
			action.ScrollToBottomOfPage()

			action.Clear(smallprintverbiage)
			action.Type(smallprintverbiage, "Small Text For Testing")

			action.Clear(largeprintverbiage)
			action.Type(largeprintverbiage, "Large Text For Testing")

			action.Clear(booksverbiage)
			action.Type(booksverbiage, "Books Text For Testing")

			action.Clear(accessoriesverbiage)
			action.Type(accessoriesverbiage, "Accessories Text For Testing")

			action.ScrollToBottomOfPage()

			WebUI.delay(10)
			action.Click(savebtn)
		}
		catch(Exception e) {
			Assert.fail("Add Verbiage Text for Item Details Page failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyItemDetailsSection() {
		try{
			boolean statusofitemdetailssection = action.IsElementDisplayed(itemdetailssection)
			Assert.assertTrue(statusofitemdetailssection)

			if(statusofitemdetailssection ==true) {
				println ("Item Details section verified")
			}
			else{
				throw new Exception ("Item Details section is not appearing")
			}
		}
		catch(Exception e) {
			Assert.fail("Verify Item Details Selection failed due to "+ e)
		}
	}
}
