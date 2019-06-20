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
import org.testng.Assert

import com.kms.katalon.core.webui.driver.DriverFactory

 class ProjectsPage {
	
	
	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	
	 By lnkProjects = By.xpath("//a [@href='/Account/MyProjectsPage.aspx']")
	 By lnkSelectAll = By.xpath("//a [@onclick='SelectAll_Clicked()']")
	 By lnkSelectNone = By.xpath("//a [@onclick='SelectNone_Clicked()']")
	 By btnSend = By.xpath("//*[@id='Body_btnShare']")
	 By lnkDeleteSelected = By.xpath("//a[@id='Body_btnDeleteSelected']")
	 By lnkPreview = By.xpath("//a[@id='ctl00_Body_RadGridTemplate_ctl00_ctl04_lnkPreviewImageEnabled']")
	 By lnkEdit = By.xpath("//a[@id='ctl00_Body_RadGridTemplate_ctl00_ctl04_lnkEdit']")
	 By lnkShare = By.xpath("//a[@id='ctl00_Body_RadGridTemplate_ctl00_ctl04_lnkShare']") //
	 By lnkDelete = By.xpath("//a[@id='ctl00_Body_RadGridTemplate_ctl00_ctl04_lnkDeleteDesignEnabled']")
	 By chbSelect = By.xpath("//input[@id='ctl00_Body_RadGridTemplate_ctl00_ctl04_ClientSelectColumnSelectCheckBox']")
	 By btnDeleteProjectYes = By.xpath("(//a[@class='btn GenericRedButton'])[1]")
	 By btnDeleteProjectNo = By.xpath("(//a[@class='btn GenericRedButton'])[2]")
	 By imgLoading = By.xpath("//img[@src='/Content/Images/loading.gif']")
	 By btnPreviewChanges = By.xpath("//input[@id='btnRepaintImage']")
	 By btnYesDelete = By.xpath("(//span[@class='outerspan'])[1]")
	 By btnNoDelete = By.xpath("(//span[@class='outerspan'])[2]")
	 By lblDeleteConfirmationMsg = By.xpath("//span[@id='ctl00_Body_ucMB_ucRadNotification_C_radNotifyText']")
	 By txbSearch = By.xpath("//input[@id='Body_TxtSearch']")//
	 By btnSearch = By.xpath("//input[@id='ctl00_Body_btnSearch']")
	 By tblSearchResult = By.xpath("//div[@id='ctl00_Body_RadGridTemplate']")
	 By pageCount = By.xpath("//input[@id='ctl00_Body_RadGridTemplate_ctl00_ctl03_ctl01_PageSizeComboBox_Input']")
	 By lstPageSize = By.xpath("//ul[@class='rcbList']/li")
	 By btnPageSize = By.xpath("//button[@class='rcbActionButton']")
	 By currentPage = By.xpath("//a[@class='rgCurrentPage']")
	 By btnNext = By.xpath("//button[@class='t-button rgActionButton rgPageNext']")
	 By btnPrevious = By.xpath("//button[@class='t-button rgActionButton rgPagePrev']")
	 By colDesignName = By.xpath("//table[@id='ctl00_Body_RadGridTemplate_ctl00']/tbody/tr/td[5]")
	 By colTemplateName = By.xpath("//table[@id='ctl00_Body_RadGridTemplate_ctl00']/tbody/tr/td[7]")
	 By colTemplateId = By.xpath("//table[@id='ctl00_Body_RadGridTemplate_ctl00']/tbody/tr/td[6]")
	 By lblNorecordFound = By.xpath("//*[@class='rgNoRecords']")
	 By countPerPage = By.xpath("//*[@class='rgWrap rgInfoPart']/strong[2]")
	 By colCheckBox = By.xpath("//table[@id='ctl00_Body_RadGridTemplate_ctl00']/tbody/tr/td[1]/input")
	 By btnAscending = By.xpath("//button[@class='t-button rgActionButton rgSortAsc']")
	 By btnDescending = By.xpath("//button[@class='t-button rgActionButton rgSortDesc']")
	 By colLblDesignName = By.xpath("(//th[@class='rgHeader'])[4]/a")
	 By colLblTemplateID = By.xpath("(//th[@class='rgHeader'])[5]/a")
	 By colLblTemplateName = By.xpath("(//th[@class='rgHeader'])[6]/a")
	 
	 
	 
	 
	 //click on project link
	 public void ClickOnProject()
	 {
		 try
		 {
			 action.WaitVisible(lnkProjects);
			 action.Click(lnkProjects);
			 action.WaitForPageToLoad();
			 action.WaitVisible(lnkSelectAll);

		 }
		 catch (Exception e)
		 {
			 println("ClickOnProject method failed due to :" + e);
			 throw e;
		 }
	 }

	 //verify my project page
	 public boolean VerifyMyProject()
	 {
		 try
		 {
			 boolean IsMyProjectPageVerified = false;
			 String expectedUrl = "Account/MyProjectsPage.aspx";
			 String actualUrl = driver.getCurrentUrl()
			 if (actualUrl.contains(expectedUrl))
			 {
				 return IsMyProjectPageVerified = true;
			 }
			 return IsMyProjectPageVerified;

		 }
		 catch (Exception e)
		 {
			 println("VerifyMyProject method failed due to :" + e);
			 throw e;
		 }
	 }
	 //clcick on preview link
	 public void ClickOnPreviewLink()
	 {
		 try
		 {
			 action.WaitVisible(lnkPreview);
			 if (action.IsElementEnabled(lnkPreview))
			 {
				 action.Click(lnkPreview);
				 action.WaitForPageToLoad();
			 }

		 }
		 catch (Exception e)
		 {
			 println("ClickOnPreviewLink method failed due to : " + e);
			 throw e;
		 }
	 }
	 //verify preview link
	 public boolean VerifyPreviewLink()
	 {
		 try
		 {
			 boolean IsPreviewLnkPresent = false;
			 if (action.IsElementDisplayed(lnkPreview))
			 {
				 ClickOnPreviewLink();
				 return IsPreviewLnkPresent = true;
			 }
			 return IsPreviewLnkPresent;
		 }
		 catch (Exception e)
		 {
			 println("VerifyPreviewLink method failed due to: " + e);
			 throw e;
		 }
	 }
	 //verify preview page
	 public boolean VerifyPreviewPage()
	 {
		 try
		 {
			 boolean IsPreviewPageVerified = false;
			 String expectedUrl = "POS/GenerateWaterMark.aspx?Proof";
			 String actualUrl = driver.getCurrentUrl()
			 if (actualUrl.contains(expectedUrl))
			 {
				 return IsPreviewPageVerified = true;
			 }
			 return IsPreviewPageVerified;
		 }
		 catch (Exception e)
		 {
			 println("VerifyPreviewPage method failed due to :" + e);
			 throw e;
		 }
	 }
	 //click on edit link
	 public void ClickOnEditLink()
	 {
		 try
		 {
			 action.WaitVisible(lnkEdit);
			 if (action.IsElementEnabled(lnkEdit))
			 {
				 action.Click(lnkEdit);
				 action.WaitForPageToLoad();
				 action.WaitTillNotVisible(imgLoading);
				 action.WaitVisible(btnPreviewChanges);
			 }

		 }
		 catch (Exception e)
		 {
			 println("ClickOnEditLink method failed due to :" + e);
		 }
	 }
	 //verify edit link
	 public boolean VerifyEditLink()
	 {
		 try
		 {
			 boolean IsEditLnkEnable = false;
			 if (action.IsElementDisplayed(lnkEdit))
			 {
				 ClickOnEditLink();
				 return IsEditLnkEnable = true;
			 }
			 return IsEditLnkEnable;
		 }
		 catch (Exception e)
		 {
			 println("VerifyEditLink method failed due to :" + e);
			 throw e;
		 }
	 }
	 //click on share link
	 public void ClickOnShareLink()
	 {
		 try
		 {
			 action.WaitVisible(lnkShare);
			 if (action.IsElementEnabled(lnkShare))
			 {
				 action.Click(lnkShare);
				 action.WaitTillNotVisible(imgLoading);
				 action.WaitVisible(btnSend);
			 }

		 }
		 catch (Exception e)
		 {
			 println("ClickOnShareLink method failed due to :" + e);
			 throw e;
		 }
	 }
	 //verify share link
	 public boolean ClickAndVerifyShareLnk()
	 {
		 try
		 {
			 boolean IsShareLnkEnable = false;
			 action.WaitVisible(lnkShare);
			 if (action.IsElementDisplayed(lnkShare))
			 {
				 ClickOnShareLink();
				 return IsShareLnkEnable = true;
			 }
			 return IsShareLnkEnable;
		 }
		 catch (Exception e)
		 {
			 println("ClickAndVerifyShareLnk method failed due to :" + e);
			 throw e;
		 }
	 }
	 //click on delete link
	 public void ClickOnDeleteLink()
	 {
		 try
		 {
			 action.WaitVisible(lnkDelete);
			 if (action.IsElementEnabled(lnkDelete))
			 {
				 action.Click(lnkDelete);
				 action.WaitVisible(btnYesDelete);
				 action.Click(btnYesDelete);
				 action.WaitTillNotVisible(imgLoading);
				 action.WaitVisible(btnSearch);


			 }


		 }
		 catch (Exception e)
		 {
			 println("ClickOnDeleteLink method failed due to " + e);
			 throw e;
		 }
	 }
	 //verify delete link
	 public boolean VerifyDeleteLink()
	 {
		 try
		 {
			 boolean IsDeleteLnkPresent = false;
			 action.WaitVisible(lnkDelete);
			 if (action.IsElementDisplayed(lnkDelete))
			 {
				 println("Delete link is enabled and verified");
				 return IsDeleteLnkPresent = true;
			 }
			 return IsDeleteLnkPresent;
		 }
		 catch (Exception e)
		 {
			 println("VerifyDeleteLink method failed due to" + e);
			 throw e;
		 }
	 }
	 //verify delete confirmation mesg
	 public boolean VerifyDeleteConfirmationMsg()
	 {
		 try
		 {
			 boolean IsItemDeleted = false;
			 String expectedMsg = "Test21-Dec-18125857PM has been deleted.";
			 String actualMsg = action.GetText(lblDeleteConfirmationMsg);
			 if (actualMsg.contains(expectedMsg))
			 {
				 println(actualMsg);
				 return IsItemDeleted = true;
			 }
			 return IsItemDeleted;
		 }
		 catch (Exception e)
		 {
			 println("VerifyDeleteConfirmationMsg method failed due to :" + e);
			 throw e;
		 }
	 }
	 //search template
	 public void SearchTemplate(String templateName)
	 {
		 try
		 {
			 action.WaitVisible(btnSearch);
			 action.TypeClear(txbSearch, templateName);
			 action.Click(btnSearch);
			 action.WaitTillNotVisible(imgLoading);
			 action.WaitTime(2);


		 }
		 catch (Exception e)
		 {
			 println("SearchTemplate method failed due to :" + e);
			 throw e;
		 }
	 }
	 //search template
	 public void PerformSearchIteration(List<String> templateName)
	 {
		 try
		 {

			 for (int i = 0; i < templateName.size(); i++)
			 {
				 action.WaitVisible(btnSearch);
				 action.TypeClear(txbSearch, templateName[i]);
				 action.Click(btnSearch);
				 action.WaitTillNotVisible(imgLoading);
				 action.WaitTime(2);
				 Assert.assertTrue(action.IsElementDisplayed(lblNorecordFound))
			 }



		 }
		 catch (Exception e)
		 {
			 println("PerformSearchIteration method failed due to :" + e);
			 throw e;
		 }
	 }
	 //verify page limit
	 public boolean VerifyPageLimit()
	 {
		 try
		 {
			 action.ScrollToBottomOfPage();
			 boolean IsPageLimitVerified = false;
			 WebElement element = driver.findElement(By.xpath("//input[@id='ctl00_Body_RadGridTemplate_ctl00_ctl03_ctl01_PageSizeComboBox_Input']"));

			 String pageCount = element.getAttribute("value");
			 int totalPageCount = Integer.parseInt(pageCount);
			 if (totalPageCount <= 10)
			 {
				 println("Page limit verified successfully , Total count is :" + totalPageCount);
				 return IsPageLimitVerified = true;
			 }
			 return IsPageLimitVerified;
		 }
		 catch (Exception e)
		 {
			 println("VerifyPageLimit method failed due to :" + e);
			 throw e;
		 }

	 }
	 // click on paze size btn
	 public void ClickOnPageSizeBtn()
	 {
		 try
		 {
			 action.ScrollToBottomOfPage();
			 action.Click(btnPageSize);
			 action.WaitVisible(lstPageSize);

		 }
		 catch (Exception e)
		 {
			 println("ClickOnPageSizeBtn method failed due to :" + e);
			 throw e;
		 }
	 }
	

	 //get current page
	 public String GetCurrentPage()
	 {
		 try
		 {
			 action.ScrollToBottomOfPage();
			 String currentpage = action.GetText(currentPage);
			 println(currentpage);
			 return currentpage;

		 }
		 catch (Exception e)
		 {
			 println("GetCurrentPage method failed due to :" + e);
			 throw e;
		 }

	 }
	
	
	 

	 //verify delete template
	 public void DeleteTemplate()
	 {
		 try
		 {
			 action.WaitVisible(lnkDelete);
			 action.Click(lnkDelete);
			 action.WaitVisible(btnYesDelete);
			 action.Click(btnYesDelete);
			 action.WaitTillNotVisible(imgLoading);
			 action.WaitVisible(btnSearch);

		 }
		 catch (Exception e)
		 {
			 println("DeleteTemplate method failed due to " + e);
			 throw e;
		 }
	 }
	 //verify delete template
	 public boolean VerifyDeleteTemplate()
	 {
		 try
		 {
			 boolean IsTemplateDeleted = false;
			 String expectedConfirmationMsg = "No Projects Found";
			 String actualConfirmationMsg = action.GetText(lblNorecordFound);
			 if (actualConfirmationMsg.equals(expectedConfirmationMsg))
			 {
				 println("Template is deleted successfully and confirmation message =:" + actualConfirmationMsg);
				 return IsTemplateDeleted = true;
			 }
			 return IsTemplateDeleted;


		 }
		 catch (Exception e)
		 {
			 println("VerifyDeleteTemplate method failed due to : " + e);
			 throw e;
		 }
	 }

	
	
	 
	
	

	
	 //select all template
	 public void SelectAll()
	 {
		 try
		 {
			 List<WebElement> designNameCol = action.GetElements(colDesignName);
			 if (designNameCol.size() > 1)
			 {
				 action.WaitVisible(lnkSelectAll);
				 action.Click(lnkSelectAll);

			 }
			 else
			 {
				 println("Only one item is present ");
			 }
			 

		 }
		 catch (Exception e)
		 {
			 println("SelectAll method failed due to :" + e);
			 throw e;
		 }
	 }
	 //verify select all
	 public boolean VerifySelectAllLink()
	 {
		 try
		 {
			 boolean IsBtnPresent = false;
			 action.WaitVisible(lnkSelectAll);
			 if (action.IsElementDisplayed(lnkSelectAll))
			 {
				 println("Select All Btn is enabled/Present");
				 return IsBtnPresent = true;
			 }
			 return IsBtnPresent;

		 }
		 catch (Exception e)
		 {
			 println("VerifySelectAllLink method failed due to: "+ e);
			 throw e;
		 }
	 }
	 //verify selected template
	 public void VerifySelectedTemplate()
	 {
		 try
		 {
			 List<WebElement> lstCheckbox = action.GetElements(colCheckBox);
			 for (int i = 0; i< lstCheckbox.Count;i++)
			 {
				 boolean check = lstCheckbox.get(i).isSelected()
				 Assert.assertTrue(check);
				 println("CheckBox is selected");

			 }


		 }
		 catch (Exception e)
		 {
			 println("VerifySelectedTemplate method failed due to :"+ e);
			 throw e;
		 }
	 }
	 //click on select none link
	 public void ClickOnSelectNoneLink()
	 {
		 try
		 {
			 action.WaitVisible(lnkSelectNone);
			 if (action.IsElementEnabled(lnkSelectNone))
			 {
				 action.Click(lnkSelectNone);
				 println("Select None link is enable");
			 }
		 }
		 catch (Exception e)
		 {
			 println("ClickOnSelectNoneLink method failed due to :"+ e);
			 throw e;
		 }
	 }
	 //verify select none link
	 public boolean VerifySelectNoneLink()
	 {
		 try
		 {
			 boolean IsLinkPresent = false;
			 action.WaitVisible(lnkSelectNone);
			 if (action.IsElementDisplayed(lnkSelectNone))
			 {
				 println("Select None link is present");
				 return IsLinkPresent = true;
			 }
			 return IsLinkPresent;
		 }
		 catch (Exception e)
		 {
			 println("VerifySelectNoneLink method failed due to :"+ e);
			 throw e;
		 }
	 }
	 //verify deselected template
	 public void VerifyDeselectedTemplate()
	 {
		 try
		 {
			 List<WebElement> lstCheckbox = action.GetElements(colCheckBox);
			 for (int i = 0; i < lstCheckbox.Count;i++)
			 {
				 boolean check = lstCheckbox.ElementAt(i).Selected;
				 println("Checkbox is unchecked.");
			 }

		 }
		 catch (Exception e)
		 {
			 println("VerifyDeselectedTemplate method failed due to :"+ e);
			 throw e;
		 }
	 }
	 //deselect all
	 public void DeleteSelected()
	 {
		 try
		 {
			 List<WebElement> designNameCol = action.GetElements(colDesignName);
			 if (designNameCol.Count > 0)
			 {
				 action.WaitVisible(lnkDeleteSelected);
				 action.Click(lnkDeleteSelected);
				 action.WaitVisible(btnYesDelete);
				 action.Click(btnYesDelete);
				 action.WaitTillNotVisible(imgLoading);
				 action.WaitVisible(lnkSelectAll);
			 }
			 else
			 {
				 println("No template are available on work center page  to select");
			 }


		 }
		 catch (Exception e)
		 {
			 println("DeleteSelected method failed due to :" + e);
			 throw e;
		 }
	 }

	 

	 //click on designnameascending btn
	 public void ClickOnDesignNameAscendingBtn()
	 {
		 try
		 {
			 action.WaitTime(2);
			 action.Click(colLblDesignName);
			 action.WaitTillNotVisible(imgLoading);
			 action.WaitVisible(btnAscending);
			 action.WaitTillNotVisible(imgLoading);

		 }
		 catch (Exception e)
		 {
			 println("ClickOnDesignNameAscendingBtn method failed due to :"+ e);
			 throw e;
		 }
	 }
	 //click on designnameascending btn
	 public void ClickOnTemplateIdAscendingBtn()
	 {
		 try
		 {
			 action.WaitTime(2);
			 action.WaitVisible(colLblTemplateID);
			 action.Click(colLblTemplateID);
			 action.WaitTillNotVisible(imgLoading);
			 action.WaitVisible(btnAscending);
			 // action.Click(btnAscending);
			 action.WaitTillNotVisible(imgLoading);

		 }
		 catch (Exception e)
		 {
			 println("ClickOnDesignNameAscendingBtn method failed due to :" + e);
			 throw e;
		 }
	 }
	 //click on decending btn
	 public void ClickOnDesignNameDecendingBtn()
	 {
		 try
		 {
			 // action.WaitVisible(btnDescending);
			 action.WaitTime(2);
			 action.Click(btnAscending);
			 action.WaitTillNotVisible(imgLoading);

		 }
		 catch (Exception e)
		 {
			 println("ClickOnDesignNameDecendingBtn method failed due to :" + e);
			 throw e;
		 }

	 }

	 //click on decending btn
	 public void ClickOnTemplateIDecendingBtn()
	 {
		 try
		 {
			 // action.WaitVisible(btnDescending);
			 action.WaitTime(2);
			 action.Click(btnAscending);
			 action.WaitTillNotVisible(imgLoading);

		 }
		 catch (Exception e)
		 {
			 println("ClickOnDesignNameDecendingBtn method failed due to :" + e);
			 throw e;
		 }

	 }

	 //click on decending btn
	 public void ClickOnTemplateNameDecendingBtn()
	 {
		 try
		 {
			 // action.WaitVisible(btnDescending);
			 action.WaitTime(2);
			 action.WaitTillNotVisible(imgLoading);
			 action.Click(btnAscending);
			 action.WaitTillNotVisible(imgLoading);

		 }
		 catch (Exception e)
		 {
			 println("ClickOnDesignNameDecendingBtn method failed due to :" + e);
			 throw e;
		 }

	 }
	 //click on decending btn
	 public void ClickOnTemplateNameAscendingBtn()
	 {
		 try
		 {
			 // action.WaitVisible(btnDescending);
			 action.WaitTime(2);
			 action.Click(colLblTemplateName);
			 action.WaitWhileNotVisible(imgLoading);

		 }
		 catch (Exception e)
		 {
			 println("ClickOnDesignNameDecendingBtn method failed due to :" + e);
			 throw e;
		 }

	 }



	

}
