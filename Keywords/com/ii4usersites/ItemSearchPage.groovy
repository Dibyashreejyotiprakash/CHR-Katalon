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
import com.utilities.Interaction
import internal.GlobalVariable
import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.testng.Assert

import com.kms.katalon.core.webui.driver.DriverFactory

class ItemSearchPage {

	By Back = By.xpath("//*[@id='Body_lnkBack']")
	By SearchButton = By.xpath("//*[@id='ctl00_Body_btnSearch']")
	By Postemplate = By.xpath("//*[(@target='_self') and contains(text(),'POS Templates')]")
	By btnBack = By.xpath("//a[@id='Body_lnkBack']")
	By txbSearch = By.xpath("//input[@id='Body_txtSearch']")
	By btnSearch = By.xpath("//*[@id='ctl00_Body_btnSearch']")
	By imgLoading = By.xpath("//img[@src='/Content/Images/loading.gif']")
	By lblSearchResultCount = By.xpath("//span[@id='Body_lblItemCount']")
	By lblTempName = By.xpath("//div[@id='ctl00_Body_ctl00_Body_rlvSearchResultsPanel']//div/a")
	By lblTemplateID = By.xpath("//span[@id='Body_lblDesignNumber']/p")
	By lstMenu = By.xpath("//div[@id='ctl00_RadMenu1']/ul/li")
	By btnCreateYourDesign = By.xpath("//input[@id='Body_btnProductDesign']")
	By tabPosTemplate = By.xpath("//*[(@target='_self') and contains(text(),'POS Templates')]")
	//  By btnCreateYourDesign = By.xpath("//input[@id='Body_btnProductDesign']"
	By imgCorporationLogo = By.xpath("//img[@id='imgCorporationLogo']")
	By divHeadline = By.xpath("//div[@id='Body_txtQMHeadline___livespell_proxy']")
	By ddlHeadLine = By.xpath("//select[@id='Body_ddlHeadline']")
	//   By imgLoading = By.xpath("//img[@src='/Content/Images/loading.gif']"
	By ddlChooseFont = By.xpath("//select [@id='Body_ddlChooseFont']")
	By ddlChooseColor = By.xpath("//select[@id='Body_ddlChooseColor']")
	By divPrice = By.xpath("//div[@id='Body_txtQTPrice___livespell_proxy']")
	By btnNextStep = By.xpath("//input[@id='btnNextStep']")
	By divMessage = By.xpath("//div[@id='Body_txtQMMessage___livespell_proxy']")
	By divAccount = By.xpath("//div[@id='Body_txtQMAccount___livespell_proxy']")
	By lnkViewProof = By.xpath("//div[@id='Body_divViewProof']")
	By lnkSaveDesign = By.xpath("(//div[@class='icProofButton'])[2]")
	By divViewProject = By.xpath("//div[@id='Body_projectsDiv']/div/a")
	By lnkAccount = By.xpath("//a[@href='/Account/MyAccountPage.aspx']")
	By colDesignName = By.xpath("//table[@id='ctl00_Body_RadGridTemplate_ctl00']/tbody/tr/td[5]")
	By btnNextPage = By.xpath(".//*[@id='ctl00_Body_RadGridTemplate_ctl00']/tfoot/tr/td/div/div[3]/button[1]")
	By btnPreviewChanges = By.xpath("//input[@id='btnRepaintImage']")
	By ddlChooseLayout = By.xpath("//select[@id='Body_ddlChooseLayout']")
	By ddlAccount = By.xpath("//select[@id='Body_ddlAccount']")
	By txbCreateDesign = By.xpath("//input[@id='Body_txtQTText']")
	By txbDesignName = By.xpath("//input[@id='ctl00_Body_rwSaveDesignModal_C_txtDesignName']")
	By btnSave = By.xpath("//input[@id='ctl00_Body_rwSaveDesignModal_C_btnDesignSave']")
	By btnNext = By.xpath("//input[@id='btnNextStep']")
	By btnYes = By.xpath("//*[@class='btn GenericRedButton']/span/span[text()='Yes']")
	By btnDownload = By.xpath("//button[@id='download']")
	By btnAddToCart = By.xpath("//input[@id='Body_btnAddToCart']")
	By btnNo = By.xpath("//*[@class='btn GenericRedButton']/span/span[text()='No']")
	By btnCancel = By.xpath("//a[@id='Body_CancelButton']")
	By btnZoom = By.xpath("//a[@id='ZoomSelector_Arrow']")
	By imgPicProperty = By.xpath("//img[@id='imgProof']")
	// By lnkPostemplate = (By.xpath("//*[(@target='_self') and contains(text(),'POS Templates')]")
	By lnkPostemplate = By.xpath("//a[@href='/Search/ItemSearch.aspx?tid=1']")
	//html/body/div[2]/form/div[4]/div[2]/div[2]/div[1]/div[1]/a
	By ddlItemType = By.xpath("//*[@id='ctl00_Body_rcbSearchItemTypes_Arrow']")
	By ddlSortBy = By.xpath("//*[@id='ctl00_Body_rcbSort_Arrow']")
	By txbPage = By.xpath("//*[@id='ctl00_Body_rntbPage']")
	//MetaTag
	By txtBandName = By.xpath("//*[@id='ctl00_Body_rptFilterGroups_ctrl0_lblFilterDescription']")
	By chkbxCaremelRoad = By.xpath("//*[@id='ctl00_Body_rptFilterGroups_ctrl0_cblFilterList_0']")
	By chkbx2018 = By.xpath("//*[@id='ctl00_Body_rptFilterGroups_ctrl1_cblFilterList_0']")
	By chkbxSummerEdition = By.xpath("//*[@id='ctl00_Body_rptFilterGroups_ctrl2_cblFilterList_0")
	By txtSalesProdctLine = By.xpath("//*[@id='ctl00_Body_rptFilterGroups_ctrl3_lblFilterDescription']")
	By txtProgram = By.xpath("//*[@id='ctl00_Body_rptFilterGroups_ctrl2_lblFilterDescription']")
	By txtInMarketingTime = By.xpath("//*[@id='ctl00_Body_rptFilterGroups_ctrl1_lblFilterDescription']")
	By chbxCaseCard = By.xpath("//*[@id='ctl00_Body_rptFilterGroups_ctrl3_cblFilterList_0']")
	By chkbxStatic = By.xpath("//*[@id='ctl00_Body_rptFilterGroups_ctrl4_cblFilterList_0']")
	By btnRemoveFilter = By.xpath("//*[@id='ctl00_Body_rptFilter_ctrl0_btnRemoveFilter_input']")
	By btnRemoveFilterAll = By.xpath("//*[@id='ctl00_Body_btnRemoveAllFilters_input']")
	By txbPagination = By.xpath("//*[@id='ctl00_Body_rntbPage']")
	By txtResultsPerPage = By.xpath("//div[@class='pull-rigt']")
	By btnTemplate = By.xpath("//a[@href='/POS/ItemDetails.aspx?tid=130725]")
	By inputSortBy = By.id("ctl00_Body_rcbSort_Input")
	By chkbxVariabletype = By.id("ctl00_Body_rptFilterGroups_ctrl4_cblFilterList_1")

	By template = By.xpath("(//*[@href='/POS/ItemDetails.aspx?tid=130722'])[1]")
	By variabletemplate = By.xpath("(//*[@href='/POS/ItemDetails.aspx?tid=130719'])[1]")
	By ordernowbtn = By.xpath("//*[@id='Body_btnOrderNow']")
	By createdesignbtn = By.xpath("//*[@id='Body_btnProductDesign']")

	By newlycreatedmetatagcheckbox = By.xpath("ctl00_Body_rptFilterGroups_ctrl0_cblFilterList_0")
	By metatagsearchtemplate = By.xpath("(//*[@href='/POS/ItemDetails.aspx?tid=130722'])[2]")
	
	By testtemplate = By.xpath("(//*[@href='/POS/ItemDetails.aspx?tid=132933'])[1]")


	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();



	@Keyword
	public void ClickOnTemplate(){
		try
		{
			action.WaitVisible(template)
			action.Click(template)
			action.WaitForPageToLoad()
		}
		catch(Exception e)
		{
			println ("Click On Template failed due to "+ e)
		}
	}


	@Keyword
	public void ClickOnVariableTemplate(){
		try
		{

			action.WaitVisible(variabletemplate)
			action.Click(variabletemplate)
			action.WaitForPageToLoad()
		}
		catch(Exception e)
		{
			println ("ClickOnVariableTemplate failed due to "+ e)
		}
	}
	
	@Keyword
	public void ClickOnTestTemplate(String testtemplateid)
	{
		try{
			action.Type(txbSearch, testtemplateid)
			action.Click(btnSearch)
			WebUI.delay(10)
			action.ScrollToBottomOfPage()
			action.Click(testtemplate)
			action.WaitForPageToLoad()
		}
		catch(Exception e){
			Assert.fail("Click On TestTemplate failed due to "+ e)
		}
	}

	@Keyword
	public void ClickOnCreateYourOwnDesignAndNavigateToCreateDesignPage()
	{
		try{
			action.ScrollToBottomOfPage()
			action.Click(createdesignbtn)
			action.WaitForPageToLoad()
			action.VerifyCurrentPage("ItemConfiguration.aspx")
		}
		catch(Exception e)
		{
			Assert.fail("Click On Create Your Own Design And Navigate To Create Design Page")
		}
	}



	@Keyword
	public void ClickOnOrderNowButton(){
		try
		{

			action.Click(ordernowbtn)
			action.WaitForPageToLoad()
		}
		catch(Exception e)
		{
			println ("ClickOnVariableTemplate failed due to "+ e)
		}
	}

	@Keyword
	public void ClickOnNewlyCreatedMetatagAndVerify()
	{
		try{
			action.Click(newlycreatedmetatagcheckbox)
			boolean statusoftemplatesearch = action.IsElementDisplayed(metatagsearchtemplate)
			Assert.assertTrue(statusoftemplatesearch)
		}
		catch(Exception e){
			Assert.fail("Click On Newly Created Metatag failed due to "+ e)
		}

	}





}
