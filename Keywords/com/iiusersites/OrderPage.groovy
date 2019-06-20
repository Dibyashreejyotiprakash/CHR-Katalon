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

 class OrderPage {
	
	 WebDriver driver = DriverFactory.getWebDriver();
	 Interaction action = new Interaction();


	
	  By lnkOrderForm = By.xpath("//*[@href='OnlineOrderForm/default.aspx']")
	  By imgNewCustomOrder = By.xpath("//input[@id='Body_NewOrderButton']")
	  By txbNewAccountNo = By.xpath("//input[@id='ctl00_Body_rtbNewAcsize()Name']")
	  By divJobtittle = By.xpath("//tr[@class='rcbReadOnly']")
	  By txbJobTittle = By.xpath("//tr[@class='rcbReadOnly']/td[1]/input")
	  By lstJobTittle = By.xpath("//div[@id='ctl00_Body_rcbJobType_DropDown']/div/ul/li")
	  By imgLoading = By.xpath("//img[@src='/Content/Images/loading.gif']")
	  By txbBillingNotes = By.xpath("//textarea [@id='ctl00_Body_rtbBillingNotes']")
	  By btnContinueToItem = By.xpath("//span[@id='ctl00_Body_btnContinue']")
	  By rushDate = By.xpath("//span[@style='color:red']")
	  By standardDate = By.xpath("//span[@style='color:green']")
	  By btnNextForMonth = By.xpath("//a[@id='ctl00_Body_rdcJobCalendar_NN']")
	  By imgSmallFormatPrint = By.xpath("//a[@href='Print/PrintDetails1.aspx?type=1']/img")
	  By lblSuccessOrderMsg = By.xpath("//div[@id='Body_pnlSuccess']/div/div/h3/strong")
	  By imgPoster1Side = By.xpath("//input[@id='ctl00_Body_RadListView1_ctrl1_ImageButton1']")
	  By txbOrderLineName = By.xpath("//input[@id='ctl00_Body_txtJobLineName']")
	  By ddlSize = By.xpath("//*[@id='ctl00_Body_ddlSize']/table/tbody/tr/td[1]")
	  By ddlPaper = By.xpath("//input[@id='ctl00_Body_ddlMedia_Input']")
	  By ddlLamination = By.xpath("//input[@id='ctl00_Body_ddlLamination_Input']")
	  By lstLamination = By.xpath("//div[@id='ctl00_Body_ddlLamination_DropDown']/div/ul/li")
	  By lstSize = By.xpath("//div[@id='ctl00_Body_ddlSize_DropDown']/div/ul/li")
	  By lstPaper = By.xpath("//div[@id='ctl00_Body_ddlMedia_DropDown']/div/ul/li")
	  By ddlMounting = By.xpath("//input[@id='ctl00_Body_ddlMounting_Input']")
	  By lstMounting = By.xpath("//div[@id='ctl00_Body_ddlMounting_DropDown']/div/ul/li")
	  By ddlAccessory = By.xpath("//input[@id='ctl00_Body_ddlAccessory_Input']")
	  By lstAccessory = By.xpath("//div[@id='ctl00_Body_ddlAccessory_DropDown']/div/ul/li")
	  By btnNextForOrderDetails = By.xpath("//*[@id='ctl00_Body_btnNext']")
	  By lblDueDate = By.xpath("//span[@id='Body_CurrentOrderInfo_lblDueDate']")
	  By imgAddNewNote = By.xpath("//input[@id='ctl00_Body_JobLineNotes1_grdNotes_ctl00_ctl02_ctl00_AddNewRecordButton']")
	  By textDivAddNewNote = By.xpath("//div[@id='ctl00_Body_JobLineNotes1_grdNotes_ctl00_ctl02_ctl02_txtNotes']")
	  By btnNoBrand = By.xpath("//span[@id='ctl00_Body_btnNoBrands']/span")
	  By txbAddNewNote = By.xpath("//textarea[@id='ctl00_Body_JobLineNotes1_grdNotes_ctl00_ctl02_ctl02_txtNotesTextArea']")
	  By btnCompleteOrder = By.xpath("//span[@id='ctl00_Body_btnContinueTwo']/span")
	  
	  By btnSaveForAddNewNote = By.xpath("//input[@id='ctl00_Body_JobLineNotes1_grdNotes_ctl00_ctl02_ctl02_btnUpdate_input']")
	  
	  By btnContinueToOrderSummary = By.xpath("//span[@id='ctl00_Body_btnContinue']/span")
	  
	  By lblOrderNumber = By.xpath("//div[@id='Body_pnlSuccess']/div/h4/strong")
	  
	  //By LblOrderNumber = By.xpath("//*[@id='Body_lblDtNumber']")
	  //By LblOrderNumber = By.xpath("//*[@id='Body_lblDtNumber']")
	  
	  
	  public void SelectOrderForm()
	  {
		  
		    if (action.IsElementDisplayed(lnkOrderForm))
			  {
				  action.Click(lnkOrderForm);
				  action.WaitForPageToLoad();
			  }
			  else
			  {
				  homepage.SelectMenuType("Oreder form");
			  }

		  
		  
	  }

	  //Select rush date
	  public void SelectRushDate()
	  {
		 
			  if (action.IsElementDisplayed(rushDate))
			  {
				  List<WebElement> lstRushDate = action.GetElements(rushDate);
				  for (int i = 0; i < lstRushDate.size(); i++)
				  {
					  lstRushDate.get(1).click()
					  break;
				  }
			  }


	  }

	  //select Satandard date
	  public void SelectStandardDate()
	  {
		  
		  
			  if (action.IsElementDisplayed(standardDate))
			  {
				  List<WebElement> lstStandardDate = action.GetElements(standardDate);
				  for (int j = 0; j < lstStandardDate.size(); j++)
				  {
					  lstStandardDate.get(1).click()
					  break;
				  }
			  }

		  
		 
	  }

	  public void SelectJobDueDate(String typeOfDueDate)
	  {
		 
			  while (true)
			  {
				  if (typeOfDueDate.ToUpper().Equals("RUSH DATE"))
				  {
					  if (action.IsElementDisplayed(rushDate))
					  {
						  SelectRushDate();
						  break;
					  }

				  }

				  else if (typeOfDueDate.ToUpper().Equals("STANDARD DATE"))
				  {
					  if (action.IsElementDisplayed(standardDate))
					  {
						  SelectStandardDate();
						  break;

					  }
					  else
					  {
						  //click on next calender button
						  action.Click(btnNextForMonth);

					  }
				  }

			  }
		 

	  }

	  

	  //select small format print
	  public void SelectSmallFormatPrint()
	  {
		  
		  try
		  {
			  action.WaitVisible(imgSmallFormatPrint);
			  action.ScrollToViewElement(imgSmallFormatPrint);
			  action.Click(imgSmallFormatPrint);
			  action.WaitTillNotVisible(imgLoading);
		  }
		  catch (Exception e)
		  {
			  println("Small print format selection failed Error :" + e);
			  throw e;
		  }
	  }

	  //selct width/Height
	  public void SelectWidth_Height()
	  {
		  
		  try
		  {
			  action.Click(ddlSize);
			  action.WaitTime(2);
			  List<WebElement> lstWidth = action.GetElements(lstSize);
			  for (int i = 0; i < lstWidth.size(); i++)
			  {
				  if (lstWidth.size() >= 2)
				  {
					  lstWidth[2].Click();
					  action.WaitTillNotVisible(imgLoading);
					  action.WaitTime(1);
					  break;
				  }
				  else
				  {
					  lstWidth[1].Click();
					  action.WaitTillNotVisible(imgLoading);
				  }
			  }
		  }
		  catch (Exception e)
		  {
			  println("Width/Height Selection failed Error : " + e);
			  throw e;
		  }
	  }

	  //select Paper
	  public void SelectPaperOption()
	  {
		  
		  try
		  {
			  action.Click(ddlPaper);
			  action.WaitTime(2);
			  List<WebElement> lstPaperOption = action.GetElements(lstPaper);
			  for (int i = 0; i < lstPaperOption.size(); i++)
			  {
				  if (lstPaperOption.size() >= 2)
				  {
					  lstPaperOption.get(2).click()
					  action.WaitTillNotVisible(imgLoading);
					  break;
				  }
				  else
				  {
					  lstPaperOption.get(1).click()
					  action.WaitTillNotVisible(imgLoading);
				  }
			  }
		  }
		  catch (Exception e)
		  {
			  println("Paper selection failed : " + e);
			  throw e;
		  }
	  }

	  //select Lamination
	  public void SelectLamination()
	  {
		  
		  try
		  {
			  action.Click(ddlLamination);
			  action.WaitTime(2);
			  List<WebElement> lstLaminations = action.GetElements(lstLamination);
			  for (int i = 0; i < lstLaminations.size(); i++)
			  {
				  if (lstLaminations.size() >= 2)
				  {
					  lstLaminations.get(2).click()
					  action.WaitTillNotVisible(imgLoading);
					  break;
				  }
				  else
				  {
					  lstLaminations.get(1).click()
					  action.WaitTillNotVisible(imgLoading);
				  }
			  }
		  }
		  catch (Exception e)
		  {
			  println("Select Lamination failed due to " + e);
			  throw e;
		  }
	  }

	  //select Mounting option
	  public void SelectMountingOption()
	  {
		  
		  try
		  {
			  action.Click(ddlMounting);
			  action.WaitTime(2);
			  List<WebElement> lstMount = action.GetElements(lstMounting);
			  for (int i = 0; i < lstMount.size(); i++)
			  {
				  if (lstMount.size() >= 2)
				  {
					  lstMount.get(1).click()
					  action.WaitTillNotVisible(imgLoading);
					  break;
				  }
				  else
				  {
					  lstMount.get(1).click()
					  action.WaitTillNotVisible(imgLoading);
				  }

			  }

		  }
		  catch (Exception e)
		  {
			  println("Select Mounting Option failed due to " + e);
			  throw e;
		  }
	  }

	  //select accessory
	  public void SelectAccessory()
	  {
		  
		  try
		  {
			  action.Click(ddlAccessory);
			  action.WaitTime(1);
			  if (action.IsElementDisplayed(lstAccessory))
			  {
				  List<WebElement> lstAccessorys = action.GetElements(lstAccessory);
				  for (int i = 0; i < lstAccessorys.size(); i++)
				  {
					  if (lstAccessorys.size() >= 2)
					  {
						  lstAccessorys.get(1).click();
						  action.WaitTillNotVisible(imgLoading);
						  break;
					  }
					  else
					  {
						  lstAccessorys.get(2).click();
						  action.WaitTillNotVisible(imgLoading);
					  }
				  }
			  }
		  }
		  catch (Exception e)
		  {
			  println("Select Accessory failed due to " + e);
			  throw e;
		  }
	  }

	  //fill orderItemFields
	  public void FillOnlineOrderItemsFields()
	  {
		  
		  try
		  {
			  //Select print format for item
			  SelectSmallFormatPrint();
			  action.WaitTillNotVisible(imgLoading);
			  action.WaitForPageToLoad();
			  action.ScrollToViewElement(imgPoster1Side);
			  action.Click(imgPoster1Side);
			  action.WaitTillNotVisible(imgLoading);
			  action.WaitForPageToLoad();
			  action.ScrollToViewElement(txbOrderLineName);
			  if (action.IsElementDisplayed(txbOrderLineName))
			  {
				  action.Type(txbOrderLineName, "testOrderLine");
			  }
			  if (action.IsElementDisplayed(ddlSize))
			  {
				  action.ScrollToViewElement(ddlSize);
				  SelectWidth_Height();
			  }
			  if (action.IsElementDisplayed(ddlPaper))
			  {
				  action.ScrollToViewElement(ddlPaper);
				  SelectPaperOption();
			  }
			  
			  if (action.IsElementDisplayed(ddlLamination))
			  {
				  action.ScrollToViewElement(ddlLamination);
				  SelectLamination();
			  }
			  if (action.IsElementDisplayed(ddlMounting))
			  {
				  action.ScrollToViewElement(ddlMounting);
				  SelectMountingOption();
			  }
			  if (action.IsElementDisplayed(ddlAccessory))
			  {
				  action.ScrollToViewElement(ddlAccessory);
				  SelectAccessory();
			  }
		  }
		  catch (Exception e)
		  {
			  println("Fill order items");
			  throw e;
		  }
	  }

	  //click on next button
	  public void ClickOnNextButton()
	  {
		  
		  try
		  {
			  action.ScrollToBottomOfPage();
			  // action.ScrollToViewElement(obj_InstantImpact.btnNextForOrderDetails);
			  action.WaitTime(5);
			  action.WaitVisible(btnNextForOrderDetails);
			  action.Click(btnNextForOrderDetails);
			  action.WaitTillNotVisible(imgLoading);
			  action.WaitForPageToLoad();
			  // action.WaitVisible(obj_InstantImpact.lblDueDate);
		  }
		  catch (Exception e)
		  {
			  println("Click On Next Button failed due to " + e);
			  throw e;
		  }
	  }

	  //Add new notes
	  public void AddNewNote()
	  {
		  
		  try
		  {
			  if (action.IsElementDisplayed(imgAddNewNote))
			  {
				  // action.ScrollToViewelement(obj_InstantImpact.imgAddNewNote);
				  action.ScrollToBottomOfPage();
				  action.Click(imgAddNewNote);
				  action.WaitTillNotVisible(imgLoading);
				  action.WaitVisible(textDivAddNewNote);
				  action.Type(txbAddNewNote, "TestNote");
				  action.ScrollToViewElement(btnSaveForAddNewNote);
				  action.Click(btnSaveForAddNewNote);
				  action.WaitTillNotVisible(imgLoading);
				  action.Click(btnNextForOrderDetails);
				  action.WaitTillNotVisible(imgLoading);
				  action.WaitForPageToLoad();
			  }
		  }
		  catch (Exception e)
		  {
			  println("Add New Note failed due to " + e);
			  throw e;
		  }
	  }

	  //select no brandmentions
	  public void SelectNoBrand()
	  {
		  
		  try
		  {
			  action.ScrollToBottomOfPage();
			  action.Click(btnNoBrand);
			  action.WaitTillNotVisible(imgLoading);
			  action.WaitForPageToLoad();

		  }
		  catch (Exception e)
		  {
			  println("Select No Brand failed due to " + e);
			  throw e;
		  }
	  }

	  //select continue to order summary
	  public void ContinueToOrderSummary()
	  {
		  
		  try
		  {
			  action.ScrollToViewElement(btnContinueToOrderSummary);
			  action.Click(btnContinueToOrderSummary);
			  action.WaitTillNotVisible(imgLoading);
			  action.WaitVisible(btnCompleteOrder);
		  }
		  catch (Exception e)
		  {
			  println("Continue To Order Summary failed due to " + e);
			  throw e;
		  }
	  }

	  //select complete order
	  public void ClickOnCompleteOrder()
	  {
		  
		  try
		  {
			  action.Click(btnCompleteOrder);
			  action.WaitForPageToLoad();
			  // action.WaitVisible(obj_InstantImpact.divOrderSubmit);
		  }
		  catch (Exception e)
		  {
			  println("Click On Complete Order failed due to " + e);
			  throw e;
		  }

	  }

	  //Get success order message
	  public String GetSuccessOrderMsg()
	  {
		  
		  try
		  {
			  action.WaitVisible(lblSuccessOrderMsg);
			  String OrderSuccessMsg = action.GetText(lblSuccessOrderMsg);
			  // String OrderNumber = action.GetText(obj_InstantImpact.lblOrderNumber);
			  //println(OrderSuccessMsg);
			  //println(OrderNumber);
			  return OrderSuccessMsg
		  }
		  catch (Exception e)
		  {
			  println("Get SuccessOrder Msg failed due to " + e);
			  throw e;
		  }

	  }



	  //Create a New custom order form
	  public void CreateNewCustomOrder()
	  {
		  
		  try
		  {
			  //select Order Form
			  SelectOrderForm();
			  //fill job details
			  FillOrderInformation();
			  //fill order details
			  FillOnlineOrderItemsFields();
			  //click on next butto
			  ClickOnNextButton();
			  //add new notes
			  AddNewNote();
			  //select No Brand
			  SelectNoBrand();
			  //clcik on next button
			  ClickOnNextButton();
			  //select continue to order summary
			  ContinueToOrderSummary();
			  //click on complete order
			  ClickOnCompleteOrder();
			  //Get order success msg
			  GetSuccessOrderMsg();
		  }
		  catch (Exception e)
		  {
			  println("Create a new custom method failed Error:-" + e);
			  throw e;
		  }
	  }

	  //verify success order
	  public void IsOrderSuccess()
	  {
		  
		  try
		  {
			  boolean statusofordernumber = action.IsElementDisplayed(LblOrderNumber);
			  if (statusofordernumber == true)
			  {
				  String ordernumber = action.GetText(LblOrderNumber);
				  println("Order Successfully placed with order Number is " + ordernumber);
			  }
			  else
			  {
				  println("Order process failed.");
			  }

		  }
		  catch (Exception e)
		  {
			  println("IsOrderSuccess failed due to " + e);
			  throw e;
		  }

	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
