package com.ii4usersites

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
import org.testng.Assert
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.testng.Assert

import com.kms.katalon.core.webui.driver.DriverFactory

class ShoppingCartPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();




	By btnContinueToCheckout =By.xpath("//input[@id='ctl00_Body_bottomContToCheckOutBtn']")
	By ddlShippingAdd = By.xpath("//div[@id='ctl00_Body_shopCartItemsListView_ctrl0_shipAddressPanel']/div")
	By ddlicon = By.id("ctl00_Body_shopCartItemsListView_ctrl0_addComboBox_Arrow")
	By ddlValue = By.xpath("//ul[@class='rcbList']/li")
	By lnkAddMoreProducts = By.xpath("//a[@id='ctl00_Body_shopCartItemsListView_ctrl0_editAddProdLink']")
	By btnAddToCart = By.xpath("//input[@id='Body_btnAddToCart']")
	By lnkShowPriceBreak = By.xpath("//button[@id='ctl00_Body_shopCartItemsListView_ctrl0_showPriceBreakToggle_0']")
	By tblPriceBreak = By.xpath("//table[@id='ctl00_Body_shopCartItemsListView_ctrl0_ucPB_gvPriceBreak']")
	By lnkEditDesign = By.xpath("(//a[@id='ctl00_Body_shopCartItemsListView_ctrl0_editItemDesignLink'])[1]")
	By btnPreviewChanges = By.xpath("//input[@id='btnRepaintImage']")
	By lnkUseAnotherAdd = By.xpath("//*[@id='ctl00_Body_shopCartItemsListView_ctrl0_anotherAddLink']")
	By imgLoading = By.xpath("//img[@src='/Content/Images/loading.gif']")
	By  txbCompanyName =By.xpath("//*[@id='ctl00_Body_shopCartItemsListView_ctrl0_ucAB_addBookCompName']")
	By txbFirstName =By.xpath("//*[@id='ctl00_Body_shopCartItemsListView_ctrl0_ucAB_addBookFirstName']")
	By txbLastName =By.xpath("//*[@id='ctl00_Body_shopCartItemsListView_ctrl0_ucAB_addBookLastName']")
	By txbCity =By.xpath("//*[@id='ctl00_Body_shopCartItemsListView_ctrl0_ucAB_addBookCity']")
	By txbAddress1 =By.xpath("//*[@id='ctl00_Body_shopCartItemsListView_ctrl0_ucAB_addBookStrAdd']")
	By txbAddress2 =By.xpath("//*[@id='ctl00_Body_shopCartItemsListView_ctrl0_ucAB_addBookStrAdd2']")
	By States =By.xpath("//*[@id='ctl00_Body_shopCartItemsListView_ctrl0_ucAB_ddlState_Arrow']")
	By Country =By.xpath("//*[@id='ctl00_Body_shopCartItemsListView_ctrl0_ucAB_ddlCountry_Arrow']")
	By SelectCountry =By.xpath("//*[@class='rcbList']/li[text()='United States']")
	By txbPostalCode =By.xpath("//*[@id='ctl00_Body_shopCartItemsListView_ctrl0_ucAB_addBookZip']")
	By SelectStates =By.xpath("//*[@class='rcbList']/li[contains(text(),'*International')]")
	By btnUseThisAddress =By.xpath("//*[@id='ctl00_Body_shopCartItemsListView_ctrl0_ucAB_addBookSaveAdd']")
	By txbPhoneNo =By.xpath("//input[@id='ctl00_Body_shopCartItemsListView_ctrl0_ucAB_addBookPhNumb']")
	By txbEmail =By.xpath("//input[@id='ctl00_Body_shopCartItemsListView_ctrl0_ucAB_addBookEmail']")
	By chbSaveToAddBook =By.xpath("//input[@id='ctl00_Body_shopCartItemsListView_ctrl0_ucAB_addToAddListCheckBox']")
	By lblFedEXGround = By.xpath("//label[@for='ctl00_Body_shipMethodList_ctl00_twoDayShipRadioButton']")
	By lblFedExExpress = By.xpath("//label[@for='ctl00_Body_shipMethodList_ctl01_twoDayShipRadioButton']")
	By lblFedExOvernight = By.xpath("//label[@for='ctl00_Body_shipMethodList_ctl02_twoDayShipRadioButton']")
	By lblToatalPrice = By.xpath("//span[@id='Body_bottomTotalLabel']")
	By lblPaymentMethod = By.xpath("//div[@id='paymentMethodContainer']")
	By btnCheckout = By.xpath("//input[@id='ctl00_Body_bottomContToCheckOutBtn']")
	By lnkClearShoppingCart = By.xpath("//a[@id='Body_lnkDeleteAll2']")
	By btnYes =By.xpath("//*[@class='btn GenericRedButton']/span/span[text()='Yes']")
	By btnSearchItems = By.xpath("//span[@id='ctl00_Body_emptyCartCancelBtn']")
	By lblClearCartConfirmationMsg = By.xpath("//div[@id='Body_emptyShopCartContainer']/h4")
	By iconCrossBtn = By.xpath("//a[@id='ctl00_Body_shopCartItemsListView_ctrl0_delLineItemBtn']")

	By firstitemeditlink = By.xpath("//*[@id='ctl00_Body_shopCartItemsListView_ctrl0_editItemDesignLink']")

	@Keyword
	public void VerifyShoppingCartPage() {
		try{
			action.VerifyCurrentPage("ShoppingCart.aspx")
		}
		catch(Exception e) {
			Assert.fail("Verify Shopping Cart Page failed due to ----"+ e)
		}
	}

	@Keyword
	public void ClickOnEditLinkForFirstItem() {
		try{
			action.Click(firstitemeditlink)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			Assert.fail("Click On Edit Link For First Item failed due to ----"+ e)
		}
	}

	@Keyword
	public boolean VerifyShippingAddDropdown() {
		try {
			boolean IsShippingAddPresent = false;
			action.WaitVisible(ddlShippingAdd);
			if (action.IsElementDisplayed(ddlShippingAdd)) {
				return IsShippingAddPresent = true;
			}
			return IsShippingAddPresent;
		}
		catch (Exception e) {
			println("VerifyShippingAddDropdown method failed due to :"+ e);
			throw e;
		}
	}





	//click on add more product
	public void ClickOnAddMoreProducts()
	{
		try
		{
			action.WaitVisible(lnkAddMoreProducts);
			action.Click(lnkAddMoreProducts);
			action.WaitForPageToLoad();
			action.WaitVisible(btnAddToCart);
		}
		catch (Exception e)
		{
			println("ClickOnAddMoreProducts method failed due to :"+ e);
			throw e;
		}
	}

	//verify add  more product link
	public boolean VerifyAddMoreProductLink()
	{
		try
		{
			boolean IsAddProductLinkEnable = false;
			action.WaitVisible(lnkAddMoreProducts);
			if (action.IsElementDisplayed(lnkAddMoreProducts))
			{
				if (action.IsElementEnabled(lnkAddMoreProducts))
				{
					ClickOnAddMoreProducts();
					return IsAddProductLinkEnable = true;
				}
			}
			return IsAddProductLinkEnable;
		}
		catch (Exception e)
		{
			println("VerifyAddMoreProductLink method failed due to :"+ e);
			throw e;
		}
	}
	//click on show price break
	public void ClickOnShowPriceBreak()
	{
		try
		{
			action.WaitVisible(lnkShowPriceBreak);
			action.Click(lnkShowPriceBreak);
			action.WaitVisible(tblPriceBreak);
		}
		catch (Exception e)
		{
			println("ClickOnShowPriceBreak method failed due to :"+ e);
			throw e;
		}
	}
	//verify price break link
	public boolean VerifyShowPriceBreakLink()
	{
		try
		{
			boolean IsPriceBreakLnkEnable = true;
			if (action.IsElementDisplayed(lnkShowPriceBreak))
			{
				if (action.IsElementEnabled(lnkShowPriceBreak))
				{
					return IsPriceBreakLnkEnable = true;
				}
			}
			return IsPriceBreakLnkEnable;
		}
		catch (Exception e)
		{
			println("VerifyShowPriceBreakLink method failed due to :"+ e);
			throw e;
		}
	}
	//verify pricebreak table
	public boolean VerifyPriceBreakTable()
	{
		try
		{
			boolean IsPriceBreakTblPresent = false;
			ClickOnShowPriceBreak();
			if (action.IsElementDisplayed(tblPriceBreak))
			{
				return IsPriceBreakTblPresent = true;
			}
			return IsPriceBreakTblPresent;

		}
		catch (Exception e)
		{
			println("VerifyPriceBreakTable method failed due to :"+ e);
			throw e;
		}
	}
	//clcik on edit design link
	public void ClickOnEditDesign()
	{
		try
		{
			action.WaitVisible(lnkEditDesign);
			action.Click(lnkEditDesign);
			action.WaitForPageToLoad();
			action.WaitVisible(btnPreviewChanges);
		}
		catch (Exception e)
		{
			println("ClickOnEditDesign method failed due to :"+ e);
			throw e;
		}
	}
	//verify edit design
	public boolean VerifyEditDesignLink()
	{
		try
		{
			boolean IsEditDesignLnkEnable = false;
			if (action.IsElementDisplayed(lnkEditDesign))
			{
				if (action.IsElementEnabled(lnkEditDesign))
				{
					ClickOnEditDesign();
					return IsEditDesignLnkEnable = true;
				}
			}
			return IsEditDesignLnkEnable;

		}
		catch (Exception e)
		{
			println("VerifyEditDesignLink method failed due to :"+ e);
			throw e;
		}
	}
	//Click on Another Address
	public void ClickOnUseAnotherAddress()
	{
		try
		{
			action.WaitVisible(lnkUseAnotherAdd);
			action.ScrollToViewElement(lnkUseAnotherAdd);
			action.Click(lnkUseAnotherAdd);
			action.WaitTillNotVisible(imgLoading);
			action.WaitVisible(txbCompanyName);
		}
		catch (Exception e)
		{
			println("Click on Use Another Address failed due to " + e);
			throw e;
		}
	}
	//verify Use anothe add
	public boolean VerifyUseAnotherAdd()
	{
		try
		{
			boolean IsUseAnotherAddEnable = false;
			action.WaitVisible(lnkUseAnotherAdd);
			if (action.IsElementDisplayed(lnkUseAnotherAdd))
			{
				if (action.IsElementEnabled(lnkUseAnotherAdd))
				{
					ClickOnUseAnotherAddress();
					return IsUseAnotherAddEnable = true;
				}
			}
			return IsUseAnotherAddEnable;

		}
		catch (Exception e)
		{
			println("VerifyUseAnotherAdd method failed due to :"+ e);
			throw e;
		}
	}

	//Add new shipping add
	public String AddNewShippingAddress()
	{
		try
		{
			//Give Company Name
			action.WaitVisible(txbCompanyName);
			action.ScrollToViewElement(txbCompanyName);
			action.TypeClear(txbCompanyName, "Brandmuscle");

			action.WaitVisible(txbFirstName);
			action.ScrollToViewElement(txbFirstName);
			//String uniqueShiipingAdd = UniqueShiipingAdd("Test");
			//action.Type(txbFirstName, uniqueShiipingAdd);
			//Give First Name
			//action.WaitVisible(txbFirstName);
			//action.ScrollToViewElement(txbFirstName);
			//action.TypeClear(txbFirstName, "Chandan");

			//Give Last Name
			action.WaitVisible(txbLastName);
			action.ScrollToViewElement(txbLastName);
			action.TypeClear(txbLastName, "Kumar");
			//Give Address1
			action.WaitVisible(txbAddress1);
			action.ScrollToViewElement(txbAddress1);
			action.TypeClear(txbAddress1, "Bangalore");

			//Give Address2
			action.WaitVisible(txbAddress2);
			action.ScrollToViewElement(txbAddress2);
			action.TypeClear(txbAddress2, "Karnataka");


			//Give City Name
			action.WaitVisible(txbCity);
			action.ScrollToViewElement(txbCity);
			action.TypeClear(txbCity, "Bangalore");

			//Give Postal Code
			action.WaitVisible(txbPostalCode);
			action.ScrollToViewElement(txbPostalCode);
			action.TypeClear(txbPostalCode, "44144");
			//enter phone
			action.WaitVisible(txbPhoneNo);
			action.ScrollToViewElement(txbPhoneNo);
			action.TypeClear(txbPhoneNo, "111-222-3333");
			//enter email
			action.WaitVisible(txbEmail);
			action.ScrollToViewElement(txbEmail);
			action.TypeClear(txbEmail, "chandan.kumar@brandmuscle.com");
			//select check box
			action.WaitVisible(chbSaveToAddBook);
			action.ScrollToViewElement(chbSaveToAddBook);
			action.Click(chbSaveToAddBook);
			ClickOnUseThisAddress();
			action.WaitForPageToLoad();
			action.WaitTillNotVisible(imgLoading);
			return uniqueShiipingAdd;

		}
		catch (Exception e)
		{
			println("Verify Max Inputs To Text Fields failed due to " + e);
			throw e;
		}
	}

	//Click on Use This Address
	public void ClickOnUseThisAddress()
	{
		try
		{
			action.WaitVisible(btnUseThisAddress);
			action.Click(btnUseThisAddress);
			action.WaitVisible(imgLoading);
		}
		catch (Exception e)
		{
			println("Click on Use this address failed due to " + e);
			throw e;
		}
	}

	//verify fedex ground method
	public boolean VerifyFedEx_Ground()
	{
		try
		{
			boolean IsShippingMethodEnable = false;
			action.WaitVisible(lblFedEXGround);
			action.ScrollToViewElement(lblFedEXGround);
			if (action.IsElementEnabled(lblFedEXGround))
			{
				//SelectFedEx_Ground();
				return IsShippingMethodEnable = true;
			}
			return IsShippingMethodEnable;
		}
		catch (Exception e)
		{
			println("VerifyFedEx_Ground method failed due to :"+ e);
			throw e;
		}
	}
	//select fedex express shippng method
	public void SelectFedEx_Express()
	{
		try
		{
			action.WaitVisible(lblFedExExpress);
			action.ScrollToViewElement(lblFedExExpress);
			action.Click(lblFedExExpress);
			//action.WaitVisible(btnContinueToCheckout);

		}
		catch (Exception e)
		{
			println("SelectFedEx_Ground method failed due to :" + e);
			throw e;
		}
	}
	//verify fedex ground method
	public boolean VerifyFedEx_Express()
	{
		try
		{
			boolean IsShippingMethodEnable = false;
			action.WaitVisible(lblFedExExpress);
			action.ScrollToViewElement(lblFedExExpress);
			if (action.IsElementEnabled(lblFedExExpress))
			{
				SelectFedEx_Express();
				return IsShippingMethodEnable = true;
			}
			return IsShippingMethodEnable;
		}
		catch (Exception e)
		{
			println("VerifyFedEx_Ground method failed due to :" + e);
			throw e;
		}
	}
	//select fedex overnight shippng method
	public void SelectFedEx_Overnight()
	{
		try
		{
			action.WaitVisible(lblFedExOvernight);
			action.ScrollToViewElement(lblFedExOvernight);
			action.Click(lblFedExOvernight);
			//action.WaitVisible(btnContinueToCheckout);

		}
		catch (Exception e)
		{
			println("SelectFedEx_Ground method failed due to :" + e);
			throw e;
		}
	}
	//verify fedex overnight method
	public boolean VerifyFedEx_Overnight()
	{
		try
		{
			boolean IsShippingMethodEnable = false;
			action.WaitVisible(lblFedExOvernight);
			action.ScrollToViewElement(lblFedExOvernight);
			if (action.IsElementEnabled(lblFedExOvernight))
			{
				SelectFedEx_Overnight();
				return IsShippingMethodEnable = true;
			}
			return IsShippingMethodEnable;
		}
		catch (Exception e)
		{
			println("VerifyFedEx_Ground method failed due to :" + e);
			throw e;
		}
	}

	//click on checkout btn
	public void ContinueToCheckout()
	{

		try
		{
			action.WaitVisible(lblFedEXGround, 300);
			action.ScrollToViewElement(lblFedEXGround);
			if (action.IsElementEnabled(btnCheckout))
			{
				action.WaitVisible(btnCheckout, 300);
				action.Click(btnCheckout);
				action.WaitTillNotVisible(imgLoading);
				action.WaitForPageToLoad();
				action.WaitVisible(lblPaymentMethod);
			}
			else
			{
				println("Checkout Button is not enable/present");
			}

		}
		catch (Exception e)
		{
			println("ContinueToCheckout failed due ");
			throw e;
		}

	}
	//verify continue to checkout btn
	public boolean VerifyContinueToCheckoutBtn()
	{
		try
		{
			boolean IsCheckoutBtnEnable = false;
			action.WaitVisible(lblFedEXGround, 300);
			action.ScrollToViewElement(lblFedEXGround);
			if (action.IsElementEnabled(btnCheckout))
			{
				ContinueToCheckout();
				return IsCheckoutBtnEnable = true;
			}
			return IsCheckoutBtnEnable;
		}
		catch (Exception e)
		{
			println("VerifyContinueToCheckoutBtn method failed due to :"+ e);
			throw e;
		}
	}
	//clear shopping cart
	public void ClickOnClearShoppingCart()
	{
		try
		{
			action.WaitVisible(lnkClearShoppingCart);
			action.ScrollToBottomOfPage();
			if (action.IsElementDisplayed(lnkClearShoppingCart))
			{
				action.Click(lnkClearShoppingCart);
				action.WaitVisible(btnYes);
				action.Click(btnYes);
				action.WaitWhileNotVisible(imgLoading);
				action.WaitVisible(btnSearchItems);
			}

		}
		catch (Exception e)
		{
			println("ClickOnClearShoppingCart method failed due to :"+ e);
			throw e;
		}
	}


	//click on CrossIcon
	public void ClickOnCrossIconToRemoveItem()
	{
		try
		{
			action.WaitVisible(iconCrossBtn);
			if (action.IsElementDisplayed(iconCrossBtn))
			{
				action.Click(iconCrossBtn);
				action.WaitVisible(btnYes);
				action.Click(btnYes);
				action.WaitVisible(btnSearchItems);
			}

		}
		catch (Exception e)
		{
			println("ClickOnCrossIconToRemoveItem method failed due to :"+ e);
			throw e;
		}
	}

	@Keyword
	public void ClickOnCheckOutBtn()
	{

		try
		{
			action.ScrollToBottomOfPage()
			action.WaitUntilElementClickable(btnContinueToCheckout)
			action.Click(btnContinueToCheckout)
			action.WaitForPageToLoad()
		}
		catch (Exception e)
		{
			println("Click On Check Out Btn failed due ");
			throw e;
		}

	}

	@Keyword
	public void ClickOnbottomCheckOutBtn()
	{

		try
		{
			WebUI.delay(3)
			action.ScrollToBottomOfPage()
			action.WaitVisible(btnContinueToCheckout)
			action.WaitUntilElementClickable(btnContinueToCheckout)
			action.Click(btnContinueToCheckout)
			action.WaitForPageToLoad()
		}
		catch (Exception e)
		{
			println("Click On Check Out Btn failed due ");
			throw e;
		}

	}

	@Keyword
	public void CheckoutDDitem()
	{
		try
		{
			WebUI.delay(5)
			action.ScrollToBottomOfPage()
			action.WaitVisible(btnContinueToCheckout)
			action.WaitUntilElementClickable(btnContinueToCheckout)
			action.Click(btnContinueToCheckout)
		}
		catch(Exception e)
		{
			Assert.fail("CheckoutDDitem failed due to "+e)
		}
	}

	@Keyword
	public void WaitForCheckoutBtn()
	{
		try
		{
			action.WaitVisible(btnContinueToCheckout)
		}
		catch(Exception e)
		{
			Assert.fail("WaitForCheckoutBtn failed due to "+e)
		}

	}


}
