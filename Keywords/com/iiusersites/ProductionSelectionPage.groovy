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
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.driver.DriverFactory



class ProductionSelectionPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By Back=  By.xpath("//*[@id='Body_lnkBtnCancel']")
	By Yes = By.xpath("//*[@class='boxes']/a[1]")
	By NoBtn= By.xpath("//*[@id='Body_btnNo1']")
	By AddToCart = By.xpath("//*[@id='Body_btnAddToCart']")
	By YesBtn= By.xpath("//*[@id='Body_btnYes1']")
	By txbItemType = By.xpath("//div[@id='Body_itemTypeContainer1']/span")
	By divItemType = By.xpath("//div[@id='ctl00_Body_ItemTypeDropDownList1']")
	By lstItemType1 = By.xpath("//input[@id='ctl00_Body_ItemTypeDropDownList1_Input']")
	By lstDivision = By.xpath("//div[@class='rcbScroll rcbWidth']/ul")
	By lstItemType = By.xpath("//ul[@class='rcbList']/li")
	By imgLoading = By.xpath("//img[@src='/Content/Images/loading.gif']")
	By txbDimensions = By.xpath("//div[@id='Body_dimensionContainer1']/span")
	By divDimension = By.xpath("//input[@id='ctl00_Body_ddlDimension1_Input']")
	By lstDimension = By.xpath("//div[@id='ctl00_Body_ddlDimension1_DropDown']/div/ul/li")
	By txbLamination = By.xpath("//div[@id='Body_laminationContainer1']/span")
	By txbMounting = By.xpath("//div[@id='Body_accessoriesContainer1']/span")
	By divMediaType = By.xpath("//div[@id='ctl00_Body_ddlLamination1']")
	By lstMediaType = By.xpath("//ul[@class='rcbList']/li")
	By divMounting = By.xpath("//input[@id='ctl00_Body_ddlAccessories1_Input']")
	By txbQuantity = By.xpath("//input[@id='ctl00_Body_qtyText1']")
	By btnnO = By.xpath("//input[@id='Body_btnNo1']")
	By btnAddToCart = By.xpath("//input[@id='Body_btnAddToCart']")
	By tblPriceBreak = By.xpath("//table[@id='ctl00_Body_priceBreak1_gvPriceBreak']")
	By lnkPriceBreak = By.xpath("//a[@id='priceBreakA1']")
	By lnkDeleteThisItem = By.xpath("//a[@id='Body_btnRemove1']")
	By divAddProduct = By.xpath("//div[@id='Body_mainLinkDevMain2']")
	By btnContinueToCheckout = (By.xpath("//input[@id='ctl00_Body_sideContToCheckOutBtn']"))
	By btnPreviewChanges = By.xpath("//input[@id='btnRepaintImage']")











	//Click on No in Select Product Details Page
	public void ClickOnNo()
	{
		try
		{
			action.WaitVisible(NoBtn);
			action.ScrollToViewElement(NoBtn);
			action.Click(NoBtn);
			action.WaitTime(5);
		}
		catch (Exception e)
		{
			println("Click on NoS failed due to : " + e);
		}
	}

	//Click on Back
	public void ClickOnBack()
	{
		try
		{
			action.WaitVisible(Back);
			action.Click(Back);
		}
		catch (Exception e)
		{
			println("Click on back failed due to : " + e);
		}
	}

	//Click on Yes From Back
	public void ClickYesFromBack()
	{
		try
		{
			action.WaitVisible(Yes);
			action.Click(Yes);
		}
		catch (Exception e)
		{
			println("Click on yes from back failed due to : " + e);
		}
	}

	//Click on AddToCart
	public void ClickOnAddToKart()
	{
		try
		{
			action.WaitVisible(AddToCart);
			action.ScrollToViewElement(AddToCart);
			action.Click(AddToCart);
			action.WaitTillNotVisible(imgLoading);
			action.WaitVisible(btnContinueToCheckout);
		}
		catch (Exception e)
		{
			println("Click on yes from back failed due to : " + e);
		}
	}



	//select quantity
	public void SelectQuantity()
	{
		try
		{
			action.WaitVisible(txbQuantity);
			if (action.IsElementDisplayed(txbQuantity))
			{
				if (action.IsElementEnabled(txbQuantity))
				{
					action.ScrollToViewElement(txbQuantity);
					action.Type(txbQuantity, "1");
					action.Type(txbQuantity);
					action.WaitTillNotVisible(imgLoading);
					action.WaitVisible(btnAddToCart);

				}

			}

		}
		catch (Exception e)
		{
			println("SelectQuantity method failed due to : " + e);
			throw e;
		}
	}


	//Add to cart
	public void AddToCart1()
	{
		try
		{
			if (!action.IsElementDisplayed(txbItemType))
			{
				if (action.IsElementDisplayed(divItemType))
				{
					if (action.IsElementEnabled(lstItemType1))
					{
						action.WaitVisible(lstItemType1, 300);
						action.Click(lstItemType1);
						action.WaitVisible(lstDivision, 300);//Division of list
						action.WaitTime(2);
						List<WebElement> lstItemTypes = action.GetElements(lstItemType);
						for (int i = 0; i < lstItemTypes.size(); i++)
						{
							lstItemTypes.get(i).click();
							action.WaitTillNotVisible(imgLoading);
							action.WaitForPageToLoad();
							break;
						}
					}
				}
			}
			if (!action.IsElementDisplayed(txbDimensions))
			{
				if (action.IsElementDisplayed(divDimension))
				{
					if (action.IsElementEnabled(divDimension))
					{
						action.Click(divDimension);
						action.WaitVisible(lstDivision);
						action.WaitTime(2);
						List<WebElement> lstDimensions = action.GetElements(lstDimension);
						for (int i = 1; i < lstDimensions.size(); i++)
						{
							lstDimensions.get(i).click()
							action.WaitTillNotVisible(imgLoading);
							action.WaitForPageToLoad();
							break;
						}
					}
				}

			}
			if (!action.IsElementDisplayed(txbLamination))
			{
				if (action.IsElementDisplayed(divMediaType))
				{
					if (action.IsElementEnabled(divMediaType))
					{
						action.Click(divMediaType);
						action.WaitVisible(lstMediaType, 300);
						action.WaitTime(2);
						List<WebElement> lstMediaTypes = action.GetElements(lstMediaType);
						for (int i = 1; i < lstMediaTypes.size(); i++)
						{
							lstMediaTypes.get(i).click()
							// action.WaitUntilNotVisible(lstDivision);
							action.WaitTillNotVisible(imgLoading);
							action.WaitForPageToLoad();
							break;
						}
					}
				}
			}
			if (!action.IsElementDisplayed(txbMounting))
			{
				if (action.IsElementDisplayed(divMounting))
				{
					action.Click(divMounting);
					action.WaitVisible(lstDivision, 300);
					action.WaitTime(2);
					List<WebElement> lstMounting = action.GetElements(divMounting);
					for (int i = 1; i < lstMounting.size(); i++)
					{
						lstMounting.get(i).click()
						action.WaitTillNotVisible(imgLoading);
						action.WaitForPageToLoad();
						break;
					}
				}

			}
			if (action.IsElementDisplayed(txbQuantity))
			{
				action.WaitVisible(txbQuantity, 300);
				action.ScrollToViewElement(txbQuantity);
				action.Clear(txbQuantity);
				action.Type(txbQuantity, "10");
				action.Enter(txbQuantity);
				action.WaitTillNotVisible(imgLoading);
				action.WaitForPageToLoad();
			}
			if (action.IsElementEnabled(btnnO))
			{
				action.WaitVisible(btnnO, 300);
				action.ScrollToViewElement(btnnO);
				action.Click(btnnO);
				action.WaitTillNotVisible(imgLoading);
				action.WaitForPageToLoad();
			}
			if (action.IsElementDisplayed(btnAddToCart))
			{
				action.WaitVisible(btnAddToCart, 300);
				action.ScrollToViewElement(btnAddToCart);
				action.Click(btnAddToCart);
				action.WaitTillNotVisible(imgLoading);
				action.WaitForPageToLoad();
			}

		}
		catch (Exception e)
		{
			println("AddToCart1 failed due to " + e);
			throw e;
		}

	}


	//verify Quantity field
	public boolean VerifyQuantityTextField()
	{
		try
		{
			boolean IsQuantityTextFieldVerified = false;
			selectitemtype();
			action.WaitVisible(txbQuantity);
			if (action.IsElementDisplayed(txbQuantity))
			{
				if (action.IsElementEnabled(txbQuantity))
				{
					action.ScrollToViewElement(txbQuantity);
					action.Type(txbQuantity ,"1");
					action.Click(txbQuantity);
					return IsQuantityTextFieldVerified = true;

				}

			}
			return IsQuantityTextFieldVerified;
		}
		catch (Exception e)
		{
			println("VerifyQuantityTextField method failed due to :" + e);
			throw e;
		}
	}

	//select item type
	public void selectitemtype()
	{
		try
		{
			if (!action.IsElementDisplayed(txbItemType))
			{
				if (action.IsElementDisplayed(divItemType))
				{
					if (action.IsElementEnabled(lstItemType1))
					{
						action.WaitVisible(lstItemType1, 300);
						action.Click(lstItemType1);
						action.WaitVisible(lstDivision, 300);//Division of list
						action.WaitTime(2);
						List<WebElement> lstItemTypes = action.GetElements(lstItemType);
						for (int i = 0; i < lstItemTypes.size(); i++)
						{
							lstItemTypes.get(i).click()
							action.WaitTillNotVisible(imgLoading);
							action.WaitForPageToLoad();
							break;
						}
					}
				}
			}
		}
		catch (Exception e)
		{
			println("selectitemtype method failed due to : " +e);
			throw e;
		}
	}

	//click on price break
	public void ClickOnShowPriceBreak()
	{
		try
		{
			action.WaitVisible(lnkPriceBreak);
			action.ScrollToViewElement(lnkPriceBreak);
			action.IsElementEnabled(lnkPriceBreak);
			action.Click(lnkPriceBreak);

		}
		catch (Exception e)
		{
			println("ClickOnShowPriceBreak method failed due to : " +e);
			throw e;
		}
	}
	//verify show price break
	public boolean VerifyShowPriceBreak()
	{
		try
		{
			boolean IsShowPriceBreakVerified = false;
			ClickOnShowPriceBreak();
			action.WaitVisible(tblPriceBreak);
			if (action.IsElementDisplayed(tblPriceBreak))
			{
				return IsShowPriceBreakVerified = true;
			}
			return IsShowPriceBreakVerified;
		}
		catch (Exception e)
		{
			println("VerifyShowPriceBreak method failed due to :" +e);
			throw e;
		}
	}
	//click on delete thisitem
	public void ClickOnDeleteThisItemLink()
	{
		try
		{
			action.WaitVisible(lnkDeleteThisItem);
			action.ScrollToViewElement(lnkDeleteThisItem);
			action.Click(lnkDeleteThisItem);

		}
		catch (Exception e)
		{
			println("DeleteThisItem method failed due to : " +e);
			throw e;
		}
	}
	//verify delete this lnk
	public boolean VerifyDeleteThisItem()
	{
		try
		{
			boolean IsDeleteThisItemLinkPresent = false;
			if (action.IsElementDisplayed(lnkDeleteThisItem))
			{
				if (action.IsElementEnabled(lnkDeleteThisItem))
				{
					ClickOnDeleteThisItemLink();
					action.WaitVisible(imgLoading);
					return IsDeleteThisItemLinkPresent = true;
				}

			}
			return IsDeleteThisItemLinkPresent;
		}
		catch (Exception e)
		{
			println("VerifyDeleteThisItem method failed due to : " + e);
			throw e;
		}
	}

	//select button yes
	public void SelectYesBtn()
	{
		try
		{
			action.WaitVisible(YesBtn);
			action.ScrollToViewElement(YesBtn);
			if (action.IsElementEnabled(YesBtn))
			{
				action.Click(YesBtn);
				action.WaitVisible(imgLoading);
				action.WaitTillNotVisible(imgLoading);
				action.WaitVisible(btnAddToCart);
			}

		}
		catch (Exception e)
		{
			println("SelectYesBtn method failed due to : " +e);
			throw e;
		}
	}

	//verify yes btn
	public boolean VerifyYesBtn()
	{
		try
		{
			boolean IsYesBtnEnable = false;
			action.WaitVisible(YesBtn);
			action.ScrollToViewElement(YesBtn);
			if (action.IsElementEnabled(YesBtn))
			{
				return IsYesBtnEnable = true;
			}
			return IsYesBtnEnable;

		}
		catch (Exception e)
		{
			println("VerifyYesBtn method failed due to :" + e);
			throw e;
		}
	}

	//verify add another product
	public boolean VerifyAddAnotherProduct()
	{
		try
		{
			boolean IsAddProductPresent = false;
			action.WaitVisible(divAddProduct);
			if (action.IsElementDisplayed(divAddProduct))
			{
				return IsAddProductPresent = true;

			}
			return IsAddProductPresent;

		}
		catch (Exception e)
		{
			println("VerifyAddAnotherProduct method failed due to :" + e);
			throw e;
		}
	}
	//click on NO btn
	public void ClickOnNoBtn()
	{
		try
		{
			action.WaitVisible(NoBtn);
			action.ScrollToViewElement(NoBtn);
			action.Click(NoBtn);
			action.WaitTillNotVisible(imgLoading);
			action.WaitVisible(btnAddToCart);

		}
		catch (Exception e)
		{
			println("ClickOnNoBtn method failed due to :"+e);
			throw e;
		}
	}

	//verify NO btn
	public boolean VerifyNOBtn()
	{
		try
		{
			boolean IsNoBtnEnable = false;
			action.WaitVisible(NoBtn);
			action.ScrollToViewElement(NoBtn);
			if (action.IsElementDisplayed(NoBtn))
			{
				if (action.IsElementEnabled(NoBtn))
				{
					ClickOnNo();
					return IsNoBtnEnable = true;
				}

			}
			return IsNoBtnEnable;
		}
		catch (Exception e)
		{
			println("VerifyNOBtn method failed due to : " +e);
			throw e;
		}
	}

	//verify add to cart btn  ClickOnAddToKart
	public boolean VerifyAddToCartBtn()
	{
		try
		{
			boolean IsAddToCartBtnEnable = false;
			action.WaitVisible(btnAddToCart);
			if (action.IsElementEnabled(btnAddToCart))
			{
				action.ScrollToViewElement(btnAddToCart);
				ClickOnAddToKart();
				return IsAddToCartBtnEnable = true;
			}
			return IsAddToCartBtnEnable;

		}
		catch (Exception e)
		{
			println("VerifyAddToCartBtn failed due to :"+e);
			throw e;
		}
	}

	//clcik on back btn
	public void ClickOnBackBtn()
	{
		try
		{
			action.WaitVisible(Back);
			action.ScrollToViewElement(Back);
			action.Click(Back);
			action.Click(YesBtn);
			action.WaitForPageToLoad();
			action.WaitVisible(btnPreviewChanges);

		}
		catch (Exception e)
		{
			println("ClickOnBackBtn method failed due to :"+e);
			throw e;
		}
	}
	//verify back btn
	public boolean VerifyBackBtn()
	{
		try
		{
			boolean ISBackBtnEnable = false;
			action.WaitVisible(Back);
			action.ScrollToViewElement(Back);
			if (action.IsElementEnabled(Back))
			{
				action.Click(Back);
				action.WaitForPageToLoad();
				action.Click(Yes);
				action.WaitForPageToLoad();
				action.WaitVisible(btnPreviewChanges);
				return ISBackBtnEnable = true;
			}

			return ISBackBtnEnable;
		}
		catch (Exception e)
		{
			println("VerifyBackBtn method failed due to :" + e);
			throw e;
		}
	}




































}
