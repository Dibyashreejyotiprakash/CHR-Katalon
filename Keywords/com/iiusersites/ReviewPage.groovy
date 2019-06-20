package com.iiusersites

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

import internal.GlobalVariable

import com.utilities.Interaction

import org.openqa.selenium.By

import org.openqa.selenium.WebDriver

import com.kms.katalon.core.webui.driver.DriverFactory

 class ReviewPage {
	
	 WebDriver driver = DriverFactory.getWebDriver();
	 Interaction action = new Interaction();

	
	 By lnkEditPaymentDetails = By.xpath("(//a[@class='GenericLink'])[1]")
	 By lnkEditShippingMethod = By.xpath("(//a[@class='GenericLink'])[2]")
	 By lnkEditShippingAdd = By.xpath("(//a[@class='GenericLink'])[3]")
	 By btnContinueToReview = By.xpath("//input[@id='ctl00_Body_bottomContToCheckOutBtn']")
	 By lnkReturnToCart = By.xpath("//a[@id='Body_lnkconfirmCancelCheckout']")
	 By btnYes = (By.xpath("//*[@class='btn GenericRedButton']/span/span[text()='Yes']"))
	 By btnCheckout = By.xpath("//input[@id='ctl00_Body_bottomContToCheckOutBtn']")
	 By btnPlaceOrder = By.xpath("//input[@id='Body_bottomContToCheckOutBtn']")
	 By lblPlacedOrder = By.xpath("//div[@id='ctl00_Body_radAjaxPanel']/div/h1")
	 By lblConfirmationNumber = By.xpath("//div[@id='ctl00_Body_radAjaxPanel']/div/h3[1]")
	 By imgLoading = By.xpath("//img[@src='/Content/Images/loading.gif']")
	 By btnReturnToHomePage = By.xpath("//div[@id='ctl00_Body_radAjaxPanel']/div/a[2]")
	 
	 
	 
	 
	 
	 
	 //click on place order btn
	 public void ClickOnPlaceOrderBtn()
	 {
		 try
		 {
			 action.WaitVisible(btnPlaceOrder);
			 if (action.IsElementEnabled(btnPlaceOrder))
			 {
				 
				 action.ScrollToViewElement(btnPlaceOrder);
				 //click on  place order btn
				 action.Click(btnPlaceOrder);
				 action.WaitVisible(btnReturnToHomePage);
				 action.WaitTillNotVisible(imgLoading);
				 action.WaitForPageToLoad();

			 }

		 }
		 catch (Exception e)
		 {
			 println("ClickOnPlaceOrderBtn method failed due to :"+ e);
			 throw e;
		 }
	 }
	 //verify place order btn
	 public boolean VerifyPlaceOrderBtn()
	 {
		 try
		 {
			 boolean IsPalceOrderBtnPresent = false;
			 if (action.IsElementDisplayed(btnPlaceOrder))
			 {
				 ClickOnPlaceOrderBtn();
				 return IsPalceOrderBtnPresent = true;
			 }
			 return IsPalceOrderBtnPresent;
		 }
		 catch (Exception e)
		 {
			 println("VerifyPlaceOrderBtn method failed due to : "+ e);
			 throw e;
		 }
	 }


	 //click on return to cart link
	 public void ClickOnReturnToCart()
	 {
		 try
		 {
			 action.WaitVisible(lnkReturnToCart);
			 action.ScrollToViewElement(lnkReturnToCart);
			 if (action.IsElementEnabled(lnkReturnToCart))
			 {
				 action.Click(lnkReturnToCart);
				 action.WaitVisible(btnYes);
				 action.Click(btnYes);
				 action.WaitVisible(btnCheckout);

			 }

		 }
		 catch (Exception e)
		 {
			 println("ClickOnReturnToCart method failed due to : "+ e);
			 throw e;
		 }
	 }
	 //verify return to cart btn
	public boolean verifyReturnToCartBtn()
	 {
		 try
		 {
			 boolean IsReturnToCartBtPresent = false;
			 action.WaitVisible(lnkReturnToCart);
			 if (action.IsElementDisplayed(lnkReturnToCart))
			 {
				 ClickOnReturnToCart();
				 return IsReturnToCartBtPresent = true;

			 }
			 return IsReturnToCartBtPresent;
		 }
		 catch (Exception e)
		 {
			 println("verifyReturnToCartBtn method failed due to :"+ e);
			 throw e;
		 }
	 }


	 //Verify review page
	 public boolean VerifyReviewPage()
	 {
		 try
		 {
			 boolean IsReviewPageVerified = false;
			 String expectedUrl = "ShoppingCart/Review.aspx";
			 String actualUrl = driver.getCurrentUrl()
			 if (actualUrl.contains(expectedUrl))
			 {
				 return IsReviewPageVerified = true;
			 }
			 return IsReviewPageVerified;
		 }
		 catch (Exception e)
		 {
			 println("Verify Review page failed due to : " + e);
			 throw e;
		 }
	 }

	 //click on PaymentDetailsEdit link
	 public void ClickOnPaymentDetailsEditLink()
	 {
		 try
		 {
			 action.WaitVisible(lnkEditPaymentDetails);
			 action.ScrollToViewElement(lnkEditPaymentDetails);
			 action.Click(lnkEditPaymentDetails);
			 action.WaitForPageToLoad();
			 action.WaitVisible(btnContinueToReview);
		 }
		 catch (Exception e)
		 {
			 println("ClickOnPaymentDetailsEditLink method failed due to :"+ e);
			 throw e;
		 }
	 }
	 //verify edit payment details link
	 public boolean VerifyPaymentDetailsEditLink()
	 {
		 try
		 {
			 boolean IsPaymentDetailsEditLinkEnable = false;
			 action.WaitVisible(lnkEditPaymentDetails);
			 if (action.IsElementEnabled(lnkEditPaymentDetails))
			 {
				 ClickOnPaymentDetailsEditLink();
				 return IsPaymentDetailsEditLinkEnable = true;

			 }
			 return IsPaymentDetailsEditLinkEnable;

		 }
		 catch (Exception e)
		 {
			 println("VerifyPaymentDetailsEditLink method failed due to :"+ e);
			 throw e;
		 }
	 }
	 //click on PaymentDetailsEdit link
	 public void ClickOnShippingMethodEditLink()
	 {
		 try
		 {
			 action.WaitVisible(lnkEditShippingMethod);
			 action.ScrollToViewElement(lnkEditShippingMethod);
			 action.Click(lnkEditShippingMethod);
			 action.WaitForPageToLoad();
			 action.WaitVisible(btnContinueToReview);
		 }
		 catch (Exception e)
		 {
			 println("ClickOnShippingMethodEditLink method failed due to :" + e);
			 throw e;
		 }
	 }
	 //verify edit payment details link
	 public boolean VerifyShippingMethodEditLink()
	 {
		 try
		 {
			 boolean IsShippingMethodEditLinkEnable = false;
			 action.WaitVisible(lnkEditShippingMethod);
			 if (action.IsElementEnabled(lnkEditShippingMethod))
			 {
				 ClickOnShippingMethodEditLink();
				 return IsShippingMethodEditLinkEnable = true;

			 }
			 return IsShippingMethodEditLinkEnable;

		 }
		 catch (Exception e)
		 {
			 println("VerifyShippingMethodEditLink method failed due to :" + e);
			 throw e;
		 }
	 }


	 //click on PaymentDetailsEdit link
	 public void ClickOnShippingAddEditLink()
	 {
		 try
		 {
			 action.WaitVisible(lnkEditShippingAdd);
			 action.ScrollToViewElement(lnkEditShippingAdd);
			 action.Click(lnkEditShippingAdd);
			 action.WaitForPageToLoad();
			 action.WaitVisible(btnContinueToReview);
		 }
		 catch (Exception e)
		 {
			 println("ClickOnShippingMethodEditLink method failed due to :" + e);
			 throw e;
		 }
	 }
	 //verify edit payment details link
	 public boolean VerifyShippingAddEditLink()
	 {
		 try
		 {
			 boolean IsShippingMethodEditLinkEnable = false;
			 action.WaitVisible(lnkEditShippingAdd);
			 if (action.IsElementEnabled(lnkEditShippingAdd))
			 {
				 ClickOnShippingAddEditLink();
				 return IsShippingMethodEditLinkEnable = true;

			 }
			 return IsShippingMethodEditLinkEnable;

		 }
		 catch (Exception e)
		 {
			 println("VerifyShippingMethodEditLink method failed due to :" + e);
			 throw e;
		 }
	 }
}
