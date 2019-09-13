package com.couponmaker

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
import internal.GlobalVariable
import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.testng.Assert

import com.kms.katalon.core.webui.driver.DriverFactory

class ItemSearchPage {


	By itemtypeddn = By.xpath("//*[@id='ctl00_Body_rcbSearchItemTypes_Input']")
	By coupontypetypeddnvalue = By.xpath("//*[text()='Coupon']")
	By templatetypeddnvalue = By.xpath("//*[text()='Template']")
	By searchtextbox = By.xpath("//*[@id='Body_txtSearch']")
	By searchbtn = By.xpath("//*[@id='ctl00_Body_btnSearch']")
	By templateaftersearch = By.xpath("//*[@id='ctl00_Body_rlvSearchResults_ctrl0_imgThumbnail']")
	By createdesignbtn = By.xpath("//*[@id='Body_btnProductDesign']")
	By noresultsfoundtext = By.xpath("//*[@id='Body_lblItemCount']")

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();


	@Keyword
	public void VerifyItemSearchPage() {
		try{
			action.VerifyCurrentPage("ItemSearch.aspx")
		}
		catch(Exception e) {
			println ("Verify Item Search page failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void SelectCouponType() {
		try{
			action.Click(itemtypeddn)
			WebUI.delay(10)
			action.Click(coupontypetypeddnvalue)
			WebUI.delay(10)
		}
		catch(Exception e) {
			println ("Select Coupon Type failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void VerifyCouponSearchResults() {
		try{
			action.ScrollToBottomOfPage()
			WebUI.delay(5)
			boolean statusofcoupontemplateaftersearch = action.IsElementDisplayed(templateaftersearch)
			Assert.assertTrue(statusofcoupontemplateaftersearch)
			action.Click(templateaftersearch)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Select Coupon Type failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void SearchCouponTemplate() {
		try{
			action.Type(searchtextbox, "125747")
			action.Click(searchbtn)
			WebUI.delay(10)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Search Coupon Template failed due to "+ e)
			Assert.fail()
		}
	}
	
	@Keyword
	public void SearchCouponTemplateAndNavigateToItemDetailsPage()
	{
		try{
			action.Type(searchtextbox, "125747")
			action.Click(searchbtn)
			WebUI.delay(10)
			action.ScrollToBottomOfPage()
			action.Click(templateaftersearch)
		}
		catch(Exception e) {
			println ("Search Coupon Template And Navigate To Item Details Page failed due to "+ e)
			Assert.fail()
		}
	}




	@Keyword
	public void VerifyCouponSearchResultsIncouponSection() {
		try{
			action.ScrollToBottomOfPage()
			WebUI.delay(5)
			boolean statusofcoupontemplateaftersearch = action.IsElementDisplayed(templateaftersearch)
			Assert.assertTrue(statusofcoupontemplateaftersearch)
		}
		catch(Exception e) {
			println ("Select Coupon Type failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void SelectTemplateType() {
		try{
			action.ScrollToTopOgPage()
			WebUI.delay(10)
			action.Click(itemtypeddn)
			WebUI.delay(10)
			action.Click(templatetypeddnvalue)
			WebUI.delay(10)
		}
		catch(Exception e) {
			println ("Select Template Type failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void SearchPosTemplate() {
		try{
			action.Clear(searchtextbox)
			action.Type(searchtextbox, "125747")
			action.Click(searchbtn)
			WebUI.delay(10)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Search Template failed due to "+ e)
			Assert.fail()
		}
	}


	@Keyword
	public void VerifyCouponSearchResultsInPosSection() {
		try{
			boolean statusofnoresultsfoundtext = action.IsElementDisplayed(noresultsfoundtext)
			Assert.assertTrue(statusofnoresultsfoundtext)
			if(statusofnoresultsfoundtext == true) {
				println ("Coupon template is not found in Pos section")
			}
			else{
				throw new Exception("Failed search")
			}
		}
		catch(Exception e) {
			println ("Verify Coupon Search Results In Pos Section failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void SearchTemplate() {
		try{
			action.Type(searchtextbox, "125747")
			action.Click(searchbtn)
			WebUI.delay(10)
			action.Click(templateaftersearch)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Search Template failed due to "+ e)
			Assert.fail()
		}
	}



	@Keyword
	public void ClickOnCreateDesignpage() {
		try{
			action.Click(createdesignbtn)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Click On CreateDesignpage failed due to "+ e)
			Assert.fail()
		}
	}
}
