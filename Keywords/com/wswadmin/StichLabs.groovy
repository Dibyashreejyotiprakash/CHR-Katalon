package com.wswadmin

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.utilities.Interaction
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory
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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class StichLabs {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	//StichLab Order Looup Page
	By stichlabsearchtextbox = By.xpath("//*[@id='ctl00_cphMain_txtStitch']")
	By searchbtn = By.xpath("//*[@id='cphMain_btnSearch']")
	By resetbtn = By.xpath("//*[@id='cphMain_btnReset']")

	@Keyword
	public void VerifyStitchLabsOrderLookUpPage(){
		try{
			action.VerifyCurrentPage("StitchLabsOrderLookUp.aspx")
		}
		catch(Exception e){
			Assert.fail("Verify Stitch Labs Order Look Up Page failed due to "+ e)
		}
	}

	@Keyword
	public void VerifySearchStichLabs()
	{
		try{
			action.Type(stichlabsearchtextbox, "To Be provided by Chicago Team")
			action.Click(searchbtn)
		}
		catch(Exception e){
			Assert.fail("Verify Search Stich Labs Page failed due to "+ e)
		}
	}
	//--------------------------------------------------------------------------------------

	@Keyword
	public void VerifyFraudRiskOrdersPage(){
		try{
			action.VerifyCurrentPage("FraudRiskOrders.aspx")
		}
		catch(Exception e)
		{
			Assert.fail("Verify Fraud Risk Orders Page failed due to "+ e)
		}
	}

	//----------------------------------------------------------------------------------------

	public void VerifyShippingErrorsPage(){
		try{
			action.VerifyCurrentPage("ShippingErrors.aspx")
		}
		catch(Exception e)
		{
			Assert.fail("Verify ShippingErrors page failed due to "+ e)
		}
	}

	//-------------------------------------------------------------------------------------------

	By corpddn = By.xpath("//*[@id='ctl00_cphMain_rcbCorporation_Input']")


	@Keyword
	public void VerifyInvalidQtyOrdersPage(){
		try{
			action.VerifyCurrentPage("InvalidQtyOrders.aspx")
		}
		catch(Exception e)
		{
			Assert.fail("Verify Invalid Qty Orders Page failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyFiledsInvalidQtyOrdersPage()
	{
		try{
			boolean statusofcorpddn = action.IsElementDisplayed(corpddn)
			Assert.assertTrue(statusofcorpddn)
		}
		catch(Exception e){
			Assert.fail("Verify Fileds Invalid Qty Orders Page failed due to "+ e)
		}
	}

	//--------------------------------------------------------------------------------------

	By corpddnManuallyCloseOrders = By.xpath("//*[@id='ctl00_cphMain_rcbCorporation_Input']")

	@Keyword
	public void VerifyManuallyCloseOrdersPage(){
		try{
			action.VerifyCurrentPage("ManuallyCloseOrders.aspx")
		}
		catch(Exception e){
			Assert.fail("Verify Manually Close Orders Page failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyFiledsManuallyCloseOrdersPage()
	{
		try{
			boolean statusofcorpddn = action.IsElementDisplayed(corpddn)
			Assert.assertTrue(statusofcorpddn)
		}
		catch(Exception e){
			Assert.fail("Verify Fileds Invalid Qty Orders Page failed due to "+ e)
		}
	}




	//------------------------------------------------------------------------------------------

	@Keyword
	public void VerifyAddTrackingPage(){
		try{
			action.VerifyCurrentPage("AddTracking.aspx")
		}
		catch(Exception e){
			Assert.fail("Verify Add Tracking Page failed due to "+ e)
		}
	}



	@Keyword
	public void VerifyImportProductShotsPage(){
		try{
			action.VerifyCurrentPage("ImportProductShots.aspx")
		}
		catch(Exception e){
			Assert.fail("Verify Import Product ShotsPage failed due to "+ e)
		}
	}


	@Keyword
	public void VerifyCreateNewSKUsPage(){
		try{
			action.VerifyCurrentPage("CreateNewSKUs.aspx")
		}
		catch(Exception e){
			Assert.fail("Verify Create New SKUs Page failed due to "+ e)
		}
	}



}
