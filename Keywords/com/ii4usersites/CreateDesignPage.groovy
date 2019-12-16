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
import org.testng.Assert
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory

class CreateDesignPage {

	By btnCreateYourDesign = By.xpath("//input[@id='Body_btnProductDesign']")
	By imgCorporationLogo = By.xpath("//img[@id='imgCorporationLogo']")
	By divHeadline = By.xpath("//*[@id='Body_ddlHeadline']")
	By ddlHeadLine = By.xpath("//select[@id='Body_ddlHeadline']")
	By imgLoading = By.xpath("//img[@src='/Content/Images/loading.gif']")
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
	By btnPreviewChanges = By.xpath("//input[@id='Body_repaintImageTopButton']")
	By ddlChooseLayout = By.xpath("//select[@id='Body_ddlChooseLayout']")
	By ddlAccount = By.xpath("//select[@id='Body_ddlAccount']")
	By txbCreateDesign = By.xpath("//input[@id='Body_txtQTText']")
	By txbDesignName = By.xpath("//input[@id='ctl00_Body_rwSaveDesignModal_C_txtDesignName']")
	By btnSave = By.xpath("//input[@id='ctl00_Body_rwSaveDesignModal_C_btnDesignSave']")
	By btnNext = By.xpath("//input[@id='btnNextStep']")
	By btnYes = By.xpath("//*[@class='btn GenericRedButton']/span/span[text()='Yes']")
	By cancelbtn = By.xpath("//*[@id='Body_CancelButton']")

	By btnNo = By.cssSelector("[valign] .boxes .GenericRedButton:nth-child(3)")

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	@Keyword
	public void VerifyCurrentPage() {
		try{
			action.VerifyCurrentPage("ItemConfiguration.aspx")
		}
		catch(Exception e) {
			Assert.fail("Verify Current page failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyNavigationFromCreateDesignPageWithoutPreview() {
		try{
			action.ScrollToBottomOfPage()
			action.Click(cancelbtn)
			action.WaitForPageToLoad()
			WebUI.delay(5)
			action.VerifyCurrentPage("ItemSearch.aspx")
		}
		catch(Exception e) {
			Assert.fail("Verify Navigation From CreateDesign Page failed due to "+ e)
		}
	}

	@Keyword
	public String SelectHeadLine() {
		String selectedHeadLine = null;
		try{
			action.SelectByIndex(divHeadline, 1)
			WebUI.delay(5)
			selectedHeadLine = action.GetselectedText(divHeadline)
			println ("Selected Head Line is----------- "+ selectedHeadLine)
			return selectedHeadLine
		}
		catch(Exception e) {
			Assert.fail("Select Head Line failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyHeadLineBackFromShoppingCartPag() {
		try{
			String dispalyedheadline = action.GetselectedText(divHeadline)
			String beforeselectedheadline = SelectHeadLine()
			Assert.assertEquals(dispalyedheadline, beforeselectedheadline)
		}
		catch(Exception e) {
			Assert.fail("Select Head Line failed due to "+ e)
		}
	}

	@Keyword
	public void ClickOnPreviewChangesButton() {
		try{
			action.Click(btnPreviewChanges)
			WebUI.delay(20)
		}
		catch(Exception e) {
			Assert.fail("Click on Preview Changes Button failed due to "+ e)
		}
	}

	@Keyword
	public void ClickOnNextStepBtnAndNavigateToProductSelectionPage() {
		try{
			action.ScrollToBottomOfPage()
			WebUI.delay(3)
			action.Click(btnNextStep)
			action.WaitUntilElementClickable(btnNo)
			action.Click(btnNo)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			Assert.fail("Click On Next Step Btn And Navigate To Product Selection Page failed due to "+ e)
		}
	}
}
