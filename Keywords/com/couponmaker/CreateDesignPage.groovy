package com.couponmaker

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.utilities.Interaction
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.testng.Assert

import com.kms.katalon.core.webui.driver.DriverFactory
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

public class CreateDesignPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By itemtyperadiobtn = By.xpath("//*[@id='Body_coupons_CouponType_userControl_rblCouponTypes_1']")
	By offerbtn = By.xpath("//*[@id='ctl00_Body_coupons_RadTabStripCustomize']/div/ul/li[text()='Offer']")
	By crossmerchandisebtn = By.xpath("//*[@id='ctl00_Body_coupons_RadTabStripCustomize']/div/ul/li[text()='Cross Merchandise']")
	By datesbtn = By.xpath("//*[@id='ctl00_Body_coupons_RadTabStripCustomize']/div/ul/li[text()='Dates']")
	By statesbtn = By.xpath("//*[@id='ctl00_Body_coupons_RadTabStripCustomize']/div/ul/li[text()='States']")
	By selectallcheckbox = By.xpath("//*[@id='cblSelectAll']")
	By reviewandorderbtn = By.xpath("//*[@id='ctl00_Body_coupons_RadTabStripCustomize']/div/ul/li[text()='Review and Order']")
	By startdatebtn = By.xpath("//*[@id='ctl00_Body_coupons_Dates_userControl_txtStartDate_popupButton']")
	By startdatevalue = By.xpath("//*[@id='ctl00_Body_coupons_Dates_userControl_txtStartDate_calendar_Top']//tr//td[text()='18']")
	By enddatebtn = By.xpath("//*[@id='ctl00_Body_coupons_Dates_userControl_txtExpirationDate_popupButton']")
	By enddatevalue = By.xpath("//*[@id='ctl00_Body_coupons_Dates_userControl_txtExpirationDate_calendar_Top']//tr//td[text()='18']")
	By previewchanges = By.xpath("//*[@id='Body_coupons_btnRender']")
	By buynowbtn = By.xpath("//*[@id='btnBuyNow']")
	By nobtn = By.xpath("//*[@class='btn GenericRedButton']/span[text()='No']")
	By yesbtn = By.xpath("//*[@class='btn GenericRedButton']//span[text()='Yes']")
	By savedesignnametextbox = By.xpath("//*[@id='ctl00_Body_coupons_rwSaveDesignModal_C_txtDesignName']")
	By savebutton = By.xpath("//*[@id='ctl00_Body_coupons_rwSaveDesignModal_C_btnDesignSave']")
	By cancelbtn = By.xpath("//*[@id='Body_coupons_btnCancel']")



	@Keyword
	public void VerifyCreateDesignPage() {
		try{
			action.VerifyCurrentPage("Coupons.aspx")
		}
		catch(Exception e) {
			println ("Verify Create Design page failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void VerifyAllFieldsInCreateDesignPage() {
		try{
			boolean statusofitemtyperadiobtn = action.IsElementEnabled(itemtyperadiobtn)
			Assert.assertTrue(statusofitemtyperadiobtn)

			if(statusofitemtyperadiobtn == true) {
				action.Click(itemtyperadiobtn)
				WebUI.delay(5)

				boolean statusofofferbtn = action.IsElementEnabled(offerbtn)
				Assert.assertTrue(statusofofferbtn)

				if(statusofofferbtn == true) {
					action.Click(offerbtn)
					WebUI.delay(5)

					boolean statusofdatesbtn = action.IsElementEnabled(datesbtn)
					Assert.assertTrue(statusofdatesbtn)

					if(statusofdatesbtn == true) {
						action.Click(datesbtn)
						WebUI.delay(5)

						boolean statusofstatesbtn = action.IsElementEnabled(statesbtn)
						Assert.assertTrue(statusofstatesbtn)

						if(statusofstatesbtn == true) {
							action.Click(statesbtn)
							WebUI.delay(5)

							boolean statusofreviewandorder = action.IsElementEnabled(reviewandorderbtn)
							Assert.assertTrue(statusofreviewandorder)

							action.Click(reviewandorderbtn)
							WebUI.delay(5)

							boolean statusofbuynowbtn = action.IsElementEnabled(buynowbtn)
							Assert.assertFalse(buynowbtn)

							if(statusofbuynowbtn == false) {
								action.Click(previewchanges)
								WebUI.delay(10)
								boolean statusofbuynowbtnafterpreview = action.IsElementEnabled(buynowbtn)
								Assert.assertTrue(buynowbtn)

								if(statusofbuynowbtnafterpreview == true) {
									println ("All fields are verified")
								}
								else{
									throw new Exception("Buy Now button is not enabled")
								}
							}
						}
					}
				}
			}
			else {
				throw new Exception("Item Type Button is not enabled")
			}
		}
		catch(Exception e) {
			println ("Verify All Fields In Create Design Page failed due to "+ e)
			Assert.fail()
		}
	}



	@Keyword
	public void EnterallvaliddataAndClickOnBuyNowBtn() {
		try {
			action.Click(offerbtn)
			action.Click(crossmerchandisebtn)
			action.Click(datesbtn)
			WebUI.delay(5)
			action.Click(startdatebtn)
			WebUI.delay(5)
			action.Click(startdatevalue)
			WebUI.click(20)
			action.Click(enddatebtn)
			WebUI.delay(5)
			action.Click(enddatevalue)
			WebUI.delay(5)
			action.Click(statesbtn)
			WebUI.delay(5)
			action.Click(reviewandorderbtn)
			WebUI.delay(5)
			action.Click(previewchanges)
			WebUI.delay(20)
			action.ScrollToBottomOfPage()
			WebUI.delay(5)
			action.Click(buynowbtn)
		}
		catch(Exception e) {
			println ("Verify Create Design page failed due to "+ e)
			Assert.fail()
		}
	}
	
	@Keyword
	public void VerifyPreviewAndCancelBtn()
	{
		try{
			boolean statusofperviewbtn = action.IsElementDisplayed(previewchanges)
			Assert.assertTrue(statusofperviewbtn)
			
			boolean statusofcancelbtn = action.IsElementDisplayed(cancelbtn)
			Assert.assertTrue(statusofcancelbtn)
		}
		catch(Exception e)
		{
			println ("Verify Preview And Cancel Btn failed due to "+ e)
			Assert.fail()
		}
	}
	
	@Keyword
	public void ClickOnCancelBtnAndVerifyShoppingCartPage()
	{
		try{
			boolean statusofcancelbtn = action.IsElementDisplayed(cancelbtn)
			Assert.assertTrue(statusofcancelbtn)
			
			if(statusofcancelbtn == true)
			{
				action.Click(cancelbtn)
				WebUI.delay(10)
				action.Click(nobtn)
				WebUI.delay(10)
				action.VerifyCurrentPage("ShoppingCart.aspx")
			}
			else{
				throw new Exception("Cancel Btn disabled")
			}
		}
		catch(Exception e)
		{
			println ("Click On Cancel Btn failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void ClickOnNoBtn() {
		try{
			action.Click(nobtn)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Click On No Btn failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public String ClickYesAndSaveCouponTemplate() {
		String couponname = null
		try{
			action.Click(yesbtn)
			WebUI.delay(10)
			couponname = action.GenerateRandomAplphabaNeumericString(7)
			action.Type(savebutton, couponname)
			return couponname
		}
		catch(Exception e) {
			println ("Click Yes And Save Coupon Template failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void ClickOnBuyNowBtn() {
		try{
			action.Click(buynowbtn)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Click On But now Btn failed due to "+ e)
			Assert.fail()
		}
	}
}
