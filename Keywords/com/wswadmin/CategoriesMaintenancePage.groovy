package com.wswadmin

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
import java.time.LocalTime
//import internal.GlobalVariable
import java.security.Timestamp
import com.utilities.Interaction
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.testng.Assert

import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.Keys

public class CategoriesMaintenancePage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By createexternalitemtype = By.xpath("//*[text()='Create External Item Type']")
	By createexternalitemcorpseting = By.xpath("//*[text()='Create External Item Corp Settings']")
	By descriptiontxtbx = By.xpath("//*[@id='ctl00_cphMain_rtbDescription']")
	By savebtn = By.xpath("//*[@id='cphMain_btnSave']")
	By clearbtn = By.xpath("//*[@id='cphMain_btnClear']")

	By corporationddn = By.xpath("//*[@id='ctl00_cphMain_radCorpIDBox_Arrow']")
	By corporationddnvalue = By.xpath("//*[@id='ctl00_cphMain_radCorpIDBox_DropDown']//li[242]")
	By corporationtxtbx = By.xpath("//*[@id='ctl00_cphMain_radCorpIDBox_Input']")
	By clearallfilters = By.xpath("//*[@id='ctl00_cphMain_btnClearFilters_input']")


	By addnewcorporatesetting = By.xpath("//*[@id='ctl00_cphMain_RadCategorySetting_ctl00_ctl02_ctl00_AddNewRecordButton']")
	By externalitemtypeddn = By.xpath("//input[@id='ctl00_cphMain_RadCategorySetting_ctl00_ctl02_ctl04_radExternalItemID_Input']")
	By desriptionoveride = By.xpath("//*[@id='ctl00_cphMain_RadCategorySetting_ctl00_ctl02_ctl04_radDescription']")
	By exteritemtypeddnvalue = By.xpath("(//*[text()='Accolades'])[1]")
	By distributorddn = By.xpath("//*[@id='ctl00_cphMain_RadCategorySetting_ctl00_ctl02_ctl04_radDistributerID_Input']")
	By distribuotrddnvalue = By.xpath("//*[@id='ctl00_cphMain_RadCategorySetting_ctl00_ctl02_ctl04_radDistributerID_DropDown']//li[text()='Chicago Beverage Systems']")
	By trueradiobtn = By.xpath("//*[text()='True']/preceding-sibling::input")
	By falseradiobtn = By.xpath("//*[text()='False']/preceding-sibling::input")

	By insertbtn = By.xpath("//*[@id='ctl00_cphMain_RadCategorySetting_ctl00_ctl02_ctl04_btnSave_input']")
	By cancelbtn = By.xpath("//*[@id='ctl00_cphMain_RadCategorySetting_ctl00_ctl02_ctl04_btnCancel_input']")

	By firsteditlink = By.xpath("//*[@id='ctl00_cphMain_RadCategorySetting_ctl00__0']//a[text()='Edit']")
	By firstdeletelink = By.xpath("//*[@id='ctl00_cphMain_RadCategorySetting_ctl00__0']//a[text()='Delete']")

	By categorymaintenaceheader = By.xpath("//*[@id='cphMain_ctl00_lblSectionHeader']")

	By corposettingpopup = By.xpath("//*[@id='ctl00_cphMain_RadCategorySetting_ctl00__ctl00_cphMain_RadCategorySetting_ctl00_ctl00___PEF']")

	By  newacategoryaddedmsg = By.xpath("//*[text()='You successfully entered a category!']")

	By createexternaltypesuccssmsg = By.xpath("//*[@id='cphMain_lblMessage']")

	By categorymaintenancelable = By.xpath("//*[@id='cphMain_ctl00_lblSectionHeader']")
	By externalitemtypetextbox = By.xpath("//*[@id='ctl00_cphMain_RadCategorySetting_ctl00_ctl02_ctl04_radExternalItemID_Input']")
	By popupheader = By.xpath("//*[@id='ctl00_cphMain_RadCategorySetting_ctl00__ctl00_cphMain_RadCategorySetting_ctl00_ctl00___PEF']")
	By descriptionoverridetextbox = By.xpath("//*[@id='ctl00_cphMain_RadCategorySetting_ctl00_ctl02_ctl04_radDescription']")
	By distributortextbox = By.xpath("//*[@id='ctl00_cphMain_RadCategorySetting_ctl00_ctl02_ctl04_radDistributerID_Input']")

	By descriptionsearchtextbox = By.xpath("//*[@id='ctl00_cphMain_RadCategorySetting_ctl00_ctl02_ctl03_FilterTextBox_Description']")
	By firstsearchresultsdescription = By.xpath("//*[@id='ctl00_cphMain_RadCategorySetting_ctl00__0']/td[6]")

	By firstdelete = By.xpath("//*[@id='ctl00_cphMain_RadCategorySetting_ctl00__0']/td[2]/a")
	By norecordsmsg = By.xpath("//*[text()='No records to display.']")
	By overridedescriptionsearchtextbox = By.xpath("//*[@id='ctl00_cphMain_RadCategorySetting_ctl00_ctl02_ctl03_FilterTextBox_DescriptionOverride']")


	@Keyword
	public void VerifyCreateNewCategory() {
		action.Click(createexternalitemtype)
		action.WaitForPageToLoad()

		LocalTime currenttime = LocalTime.now();
		String newcategoryname = "Test "+ currenttime

		action.Type(descriptiontxtbx, newcategoryname)
		action.Click(savebtn)

		boolean statusofnewcategorysuccessmsf = action.IsElementDisplayed(newacategoryaddedmsg)
		Assert.assertTrue(statusofnewcategorysuccessmsf)

		action.Click(createexternalitemcorpseting)
		SelectCorporation()
		action.Click(addnewcorporatesetting)

		action.WaitVisible(externalitemtypeddn)
		action.Type(externalitemtypeddn, newcategoryname)
		//WebUI.delay(3)
	}

	@Keyword
	public void CreateNewExternalItemCorpSetting() {
		action.Click(externalitemtypeddn)
		action.Click(externalitemtypeddn)
		//WebUI.delay(4)
		action.Click(exteritemtypeddnvalue)
		//WebUI.delay(4)
		action.Type(desriptionoveride, "test")
		action.Click(distributorddn)
		//WebUI.delay(4)
		action.Click(distribuotrddnvalue)
		//WebUI.delay(4)
		action.Click(insertbtn)
	}


	@Keyword
	public void VerifyInstantImpactCategoryMaintenancePage() {
		boolean statusofvosibilityofheader = action.IsElementDisplayed(categorymaintenaceheader)
		Assert.assertTrue(statusofvosibilityofheader, "Header is present")
	}

	@Keyword
	public void ClickOnCreateExternalItemCorpSettting() {
		action.Click(createexternalitemcorpseting)
		action.WaitForPageToLoad()
	}

	@Keyword
	public void VerifyCreateExternalItemCorpSetting() {
		action.WaitVisible(corporationddn)
		boolean statusofvisibilityofcorporationddn = action.IsElementDisplayed(corporationddn)
		Assert.assertTrue(statusofvisibilityofcorporationddn)
	}

	@Keyword
	public void VerifyAddNewCorpSettingBtn() {
		action.WaitVisible(corporationddn)
		SelectCorporation()
		//WebUI.delay(5)
		boolean statusofvisibilityofaddnewcorpsettingbtn = action.IsElementEnabled(addnewcorporatesetting)
		Assert.assertTrue(statusofvisibilityofaddnewcorpsettingbtn)
	}


	public void SelectCorporation() {
		action.Click(corporationddn)
		action.Type(corporationtxtbx, "300")
		//WebUI.delay(5)
		action.Click(corporationddnvalue)
		//WebUI.delay(5)
	}

	@Keyword
	public void VerifyExternalCorpSettingPopup() {
		action.WaitVisible(addnewcorporatesetting)
		action.Click(addnewcorporatesetting)
		//WebUI.delay(3)

		boolean statusofexternalitemtypeddn = action.IsElementDisplayed(externalitemtypeddn)
		Assert.assertTrue(statusofexternalitemtypeddn)

		boolean statusofdescriptionoverridetxtbox = action.IsElementDisplayed(desriptionoveride)
		Assert.assertTrue(statusofdescriptionoverridetxtbox)
	}

	@Keyword
	public void VerifyCancelBtnForPopup() {
		action.WaitVisible(addnewcorporatesetting)
		action.Click(addnewcorporatesetting)
		//WebUI.delay(3)

		action.WaitVisible(cancelbtn)
		boolean statusofcancelbtn = action.IsElementEnabled(cancelbtn)
		Assert.assertTrue(statusofcancelbtn)
		if(statusofcancelbtn == true) {
			action.Click(cancelbtn)
		}
	}


	@Keyword
	public void VerifyInsertbtnForPopup() {
		action.WaitVisible(addnewcorporatesetting)
		action.Click(addnewcorporatesetting)
		//WebUI.delay(3)

		action.WaitVisible(insertbtn)
		boolean statusofinsertbtn = action.IsElementEnabled(insertbtn)
		Assert.assertTrue(statusofinsertbtn)
	}

	@Keyword
	public void AddNewCorpoateSetting() {
		action.Click(addnewcorporatesetting)
		//WebUI.delay(5)
		action.Click(externalitemtypeddn)
		action.Click(exteritemtypeddnvalue)
		action.Type(desriptionoveride, "test")
		action.Click(insertbtn)
	}

	@Keyword
	public void VerifyEditLink() {
		action.WaitVisible(addnewcorporatesetting)
		boolean statusoffirsteditlink = action.IsElementDisplayed(firsteditlink)
		if(statusoffirsteditlink == true) {
			action.WaitUntilElementClickable(firsteditlink)
			action.Click(firsteditlink)
		}
	}

	@Keyword
	public void VerifyDeleteLink() {
		action.WaitVisible(addnewcorporatesetting)
		boolean statusoffirstdeletelink = action.IsElementDisplayed(firstdeletelink)
		if(statusoffirstdeletelink == true) {
			action.WaitUntilElementClickable(firstdeletelink)
			action.Click(firstdeletelink)
		}
		action.DismissAlert()
	}

	@Keyword
	public void ClickOnCreateExternalItemType() {
		action.Click(createexternalitemtype)
		action.WaitForPageToLoad()
	}

	public void GenerateRandomString() {
	}

	@Keyword
	public void VerifyClearBtnOnCreateExternalItemType() {
		boolean statusofclearbtn = action.IsElementEnabled(clearbtn)
		Assert.assertTrue(statusofclearbtn)

		if(statusofclearbtn == true) {
			action.Type(descriptiontxtbx, "Test")
			action.Click(clearbtn)
		}
	}



	/********************************************************************************************************************************/

	@Keyword
	public void VerifyCategoriesMaintenancePage()
	{
		try{
			action.VerifyCurrentPage("CategoriesMaintenance.aspx")
		}
		catch(Exception e)
		{
			Assert.fail("Verify Categories Maintenance Page failed due "+ e)
		}
	}




	@Keyword
	public String CreateNewExternalItemType()
	{
		String externaltype = null
		try{
			externaltype = "11-A-Test External Item Type - "+action.GenerateRandomAplphabaticString(9)
			action.Type(descriptiontxtbx, externaltype)
			action.Click(savebtn)
			boolean statusofcreatenewexternaltypesuccessmsg = action.IsElementDisplayed(createexternaltypesuccssmsg)
			Assert.assertTrue(statusofcreatenewexternaltypesuccessmsg)
			return externaltype
		}catch(Exception e)
		{
			Assert.fail("Delete Meta tag failed due "+ e)
		}
	}


	@Keyword
	public String AssociateExternalTypeWithCorp(String newlycreatedexternalitemtype)
	{
		String externalitemname =newlycreatedexternalitemtype
		println ("External Item --------"+ externalitemname)
		try{
			action.Click(createexternalitemcorpseting)
			action.Type(corporationtxtbx, "339 - Demo Distributor (QA)")
			action.Click(categorymaintenaceheader)
			action.Click(addnewcorporatesetting)
			action.Type(externalitemtypetextbox, newlycreatedexternalitemtype)
			action.Enter(externalitemtypetextbox)
			action.Type(distributortextbox, "Demo Dist. Market #1 (QA)")
			action.Click(insertbtn)
			//Search and Verify newly associated extrnal item type
			action.Type(descriptionsearchtextbox, newlycreatedexternalitemtype)
			action.Enter(descriptionsearchtextbox)

			String firstdescription = action.GetText(firstsearchresultsdescription)
			if(firstdescription.equals(newlycreatedexternalitemtype)){
				println ("Newly created external item is verified")
			}
			return externalitemname

		}catch(Exception e)
		{
			Assert.fail("Associate External Type With Corp failed due "+ e)
		}
	}


	@Keyword
	public String OverrideExternalType(String newlycreatedexternalitem)
	{
		String overrideexternamitem = null;
		try{
			action.Click(createexternalitemcorpseting)
			action.Type(corporationtxtbx, "339 - Demo Distributor (QA)")
			action.Click(categorymaintenaceheader)
			action.Click(addnewcorporatesetting)
			action.Type(externalitemtypetextbox, newlycreatedexternalitem)
			action.Enter(externalitemtypetextbox)
			overrideexternamitem = "Override Externalitem"+ action.GenerateRandomAplphabaticString(9)
			action.Type(descriptionoverridetextbox, overrideexternamitem)
			action.Type(distributortextbox, "Demo Dist. Market #2 (QA)")
			action.Enter(distributortextbox)
			action.Click(insertbtn)
			action.Type(overridedescriptionsearchtextbox, overrideexternamitem)
			action.Enter(overridedescriptionsearchtextbox)

			//Search and Verify newly overrided extrnal item type

			String firstdescription = action.GetText(firstsearchresultsdescription)
			if(firstdescription.equals(overrideexternamitem)){
				println ("Newly created external item is verified")
			}


			return overrideexternamitem
		}catch(Exception e)
		{
			Assert.fail("Override External Type failed due "+ e)
		}
	}

	@Keyword
	public void DeleteNewlyCreatedExternalItemType(String newlycreatedextenalitem)
	{
		try{
			action.Click(firstdelete)
			action.AcceptAlert()

			action.Type(descriptionsearchtextbox, newlycreatedextenalitem)
			action.Enter(descriptionsearchtextbox)

			try{
				boolean statusofdeletedmsg = action.IsElementDisplayed(norecordsmsg)
				Assert.assertTrue(statusofdeletedmsg)
			}catch(Exception e1)
			{
				println ("Record is not delered")
				throw e1
			}


		}
		catch(Exception e)
		{
			Assert.fail("Delete Newly Created External Item Type failed due "+ e)
		}
	}

	@Keyword
	public void DeleteExistingExternalItem()
	{
		try{
			action.Type(corporationtxtbx, "339 - Demo Distributor (QA)")
			action.Click(categorymaintenaceheader)
			//WebUI.delay(3)
			action.Click(firstdelete)
			action.AcceptAlert()
		}
		catch(Exception e)
		{
			Assert.fail("Delete Existing External Item failed due "+ e)
		}
	}
}
