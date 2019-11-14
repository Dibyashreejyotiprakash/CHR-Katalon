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
import com.utilities.Interaction
import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.testng.Assert
import org.openqa.selenium.Alert
import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable

public class ResourceMessage {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By resoucemessagelable = By.xpath("(//*[text()='Resource Message'])[2]")
	By corporationddn = By.xpath("//*[@id='ctl00_cphMain_rcbCorpId_Arrow']")
	By corpddntextbox = By.xpath("//*[@id='ctl00_cphMain_rcbCorpId_Input']")
	By corporationddnvalue = By.xpath("//*[@id='ctl00_cphMain_rcbCorpId_DropDown']//li[280]")


	By distributorddn = By.xpath("//*[@id='ctl00_cphMain_rcbDistId_Arrow']")
	By distributortxtbox = By.xpath("//*[@id='ctl00_cphMain_rcbDistId_Input']")
	By distributorvalue = By.xpath("//*[@id='ctl00_cphMain_rcbDistId_DropDown']//li[text()='Demo Dist. Market #1 (QA)']")

	By resourcemessagetable = By.xpath("//*[@id='ctl00_cphMain_RadGridResource']")
	By allglobalresourcetext = By.xpath("//*[@id='ctl00_cphMain_RadGridResource']//tr[1]/td[9]")
	By firsteditlink = By.xpath("//*[@id='ctl00_cphMain_RadGridResource']//tr[1]/td[1]/a")

	By acccountresorcespopup = By.xpath("//*[@id='ctl00_cphMain_RadGridResource_ctl00_ctl05_ctl00']")
	By addressbookresourcespopup = By.xpath("//*[@id='ctl00_cphMain_RadGridResource_ctl00_ctl07_ctl00']")
	By addresslistresourcespopup = By.xpath("//*[@id='ctl00_cphMain_RadGridResource_ctl00_ctl09_ctl00']")
	By logolockerresourcespopup = By.xpath("//*[@id='ctl00_cphMain_RadGridResource_ctl00_ctl11_ctl00']")
	By profileresourcespopup = By.id("ctl00_cphMain_RadGridResource_ctl00_ctl13_ctl00")
	By projectsresourcespopup = By.id("ctl00_cphMain_RadGridResource_ctl00_ctl15_ctl00")
	By reportsresourcespopup = By.id("ctl00_cphMain_RadGridResource_ctl00_ctl17_ctl00")

	By accountoverridetextbox = By.xpath("//*[@id='ctl00_cphMain_RadGridResource_ctl00_ctl05_radOverrideResource']")
	By addressbookoverridetextbox = By.xpath("//*[@id='ctl00_cphMain_RadGridResource_ctl00_ctl07_radOverrideResource']")
	By addresslistoverridetextbox = By.xpath("//*[@id='ctl00_cphMain_RadGridResource_ctl00_ctl09_radOverrideResource']")
	By logolockeroverridetextbox = By.xpath("//*[@id='ctl00_cphMain_RadGridResource_ctl00_ctl11_radOverrideResource']")
	By profileoverridetextbox = By.xpath("//*[@id='ctl00_cphMain_RadGridResource_ctl00_ctl13_radOverrideResource']")
	By projectsoverridetextbox = By.xpath("//*[@id='ctl00_cphMain_RadGridResource_ctl00_ctl15_radOverrideResource']")
	By reportsoverridetextbox = By.xpath("//*[@id='ctl00_cphMain_RadGridResource_ctl00_ctl17_radOverrideResource']")




	By popupdescription = By.xpath("//*[text()='Description:']")
	By popupdescoverride = By.xpath("//*[text()='Description Override:']")
	By popupaccountdescoverridetextbox = By.cssSelector("[name='ctl00\$cphMain\$RadGridResource\$ctl00\$ctl05\$radOverrideResource']")
	By popupaddressbookdescoverridetextbox = By.cssSelector("[name='ctl00\$cphMain\$RadGridResource\$ctl00\$ctl07\$radOverrideResource']")


	By hideenlabel = By.xpath("//*[@id='ctl00_cphMain_RadGridResource_ctl00_ctl05_ctl00']//*[text()='Hidden:']")
	By trueradiobtn = By.xpath("//*[text()='True']/preceding-sibling::input")
	By falseradiobtn = By.xpath("//*[text()='False']/preceding-sibling::input")
	By updatebtn = By.xpath("//*[@id='ctl00_cphMain_RadGridResource_ctl00_ctl05_btnSave_input']")
	By cancelbtn = By.xpath("//*[@id='ctl00_cphMain_RadGridResource_ctl00_ctl05_btnCancel_input']")

	By resourcegridresourcetext = By.xpath("//*[@id='ctl00_cphMain_RadGridResource_ctl00']//tr/td[9]")


	By accountseditlink = By.xpath("//*[@id='ctl00_cphMain_RadGridResource_ctl00']//tr/td[text()='Account']/..//a[text()='Edit']")
	By addressbookeditlink = By.xpath("//*[@id='ctl00_cphMain_RadGridResource_ctl00']//tr/td[text()='Address Book']/..//a[text()='Edit']")
	By addresslisteditlink = By.xpath("//*[@id='ctl00_cphMain_RadGridResource_ctl00']//tr/td[text()='Address Lists']/..//a[text()='Edit']")
	By logolockereditlink = By.xpath("//*[@id='ctl00_cphMain_RadGridResource_ctl00']//tr/td[text()='Logo Locker']/..//a[text()='Edit']")
	By profileeditlink = By.xpath("//*[@id='ctl00_cphMain_RadGridResource_ctl00']//tr/td[text()='Profile']/..//a[text()='Edit']")
	By projectseditlink = By.xpath("//*[@id='ctl00_cphMain_RadGridResource_ctl00']//tr/td[text()='Projects']/..//a[text()='Edit']")
	By reportseditlink = By.xpath("//*[@id='ctl00_cphMain_RadGridResource_ctl00']//tr/td[text()='Reports']/..//a[text()='Edit']")


	By accountsdeletelink = By.xpath("//*[@id='ctl00_cphMain_RadGridResource_ctl00']//tr/td[text()='Account']/..//a[text()=' Delete']")
	By addressbookdeletelink = By.xpath("//*[@id='ctl00_cphMain_RadGridResource_ctl00']//tr/td[text()='Address Book']/..//a[text()=' Delete']")
	By addresslistdeletelink = By.xpath("//*[@id='ctl00_cphMain_RadGridResource_ctl00']//tr/td[text()='Address Lists']/..//a[text()=' Delete']")
	By logolockerdeletelink = By.xpath("//*[@id='ctl00_cphMain_RadGridResource_ctl00']//tr/td[text()='Logo Locker']/..//a[text()=' Delete']")
	By profiledeletelink = By.xpath("//*[@id='ctl00_cphMain_RadGridResource_ctl00']//tr/td[text()='Profile']/..//a[text()=' Delete']")
	By projectsdeletelink = By.xpath("//*[@id='ctl00_cphMain_RadGridResource_ctl00']//tr/td[text()='Projects']/..//a[text()=' Delete']")
	By reportsdeletelink = By.xpath("//*[@id='ctl00_cphMain_RadGridResource_ctl00']//tr/td[text()='Reports']/..//a[text()=' Delete']")



	By accountupdatebtn = By.xpath("//*[@id='ctl00_cphMain_RadGridResource_ctl00_ctl05_btnSave_input']")
	By addressbookupdatebtn = By.id("ctl00_cphMain_RadGridResource_ctl00_ctl07_btnSave_input")
	By addresslistupdatebtn = By.xpath("//*[@id='ctl00_cphMain_RadGridResource_ctl00_ctl09_btnSave_input']")
	By logolockerupdatebtn = By.xpath("//*[@id='ctl00_cphMain_RadGridResource_ctl00_ctl11_btnSave_input']")
	By profileupdatebtn = By.id("ctl00_cphMain_RadGridResource_ctl00_ctl13_btnSave_input")
	By projectsupdatebtn = By.id("ctl00_cphMain_RadGridResource_ctl00_ctl15_btnSave_input")
	By reportsupdatebtn = By.id("ctl00_cphMain_RadGridResource_ctl00_ctl17_btnSave_input")




	By accountcancelbtn = By.xpath("//*[@id='ctl00_cphMain_RadGridResource_ctl00_ctl05_btnCancel_input']")
	By updateresourcesuccessmsg = By.xpath("//*[text()='Resource Message has been Updated !!']")



	@Keyword
	public void VerifyResourceMessagePage() {
		boolean statusofresoucelabel = action.IsElementDisplayed(resoucemessagelable)
		Assert.assertTrue(statusofresoucelabel)
	}

	@Keyword
	public void VerifyAllFieldsForResourceMessagePage() {
		boolean statusofcorpddn = action.IsElementDisplayed(corporationddn)
		Assert.assertTrue(statusofcorpddn)


		boolean statusofdistddn = action.IsElementDisplayed(distributorddn)
		Assert.assertTrue(statusofdistddn)
	}



	@Keyword
	public void VerifyAllFiledsInPopupMessage() {
		boolean statusofdesclbl = action.IsElementDisplayed(popupdescription)
		Assert.assertTrue(statusofdesclbl)

		boolean statusofdescoverridelbl = action.IsElementDisplayed(popupdescoverride)
		Assert.assertTrue(statusofdescoverridelbl)

		boolean statusofhidenlbl = action.IsElementDisplayed(hideenlabel)
		Assert.assertTrue(statusofhidenlbl)

		boolean statusoftrueradiobtnlbl = action.IsElementDisplayed(trueradiobtn)
		Assert.assertTrue(statusoftrueradiobtnlbl)

		boolean statusoffalseradiobtnlbl = action.IsElementDisplayed(falseradiobtn)
		Assert.assertTrue(statusoffalseradiobtnlbl)

		boolean statusofupdatebtn = action.IsElementDisplayed(updatebtn)
		Assert.assertTrue(statusofupdatebtn)

		boolean statusofcancelbtn = action.IsElementDisplayed(cancelbtn)
		Assert.assertTrue(statusofcancelbtn)
	}

	@Keyword
	public void VerifyResourceMessagePopupForAccount() {
		action.Click(corporationddn)
		action.Type(corpddntextbox, "339")
		action.Click(corporationddnvalue)
		action.WaitVisible(distributorddn)
		action.WaitUntilElementClickable(distributorddn)
		//WebUI.delay(10)
		action.Click(distributorddn)
		action.Click(distributorvalue)
		if(action.IsElementEnabled(accountseditlink)) {
			action.Click(accountseditlink)
			//WebUI.delay(10)
			action.WaitVisible(acccountresorcespopup)
			if(action.IsElementDisplayed(acccountresorcespopup)) {
				println ("Resorce message pop up is verified for Account")
			}
			else {
			}
		}
		else {
			Assert.fail()
		}
	}

	@Keyword
	public void OverrideGlobalResourceTextForAccountsk() {

		action.WaitVisible(accountoverridetextbox)
		action.Clear(accountoverridetextbox)
		WebUI.delay(3)
		action.Type(accountoverridetextbox, GlobalVariable.resourcemsgaccount)
		action.WaitUntilElementClickable(accountupdatebtn)
		action.Click(accountupdatebtn)
		WebUI.delay(10)
	}

	@Keyword
	public void VerifyResourceMessagePopupForAddressBook() {
		action.Click(corporationddn)
		action.Type(corpddntextbox, "339")
		action.Click(corporationddnvalue)
		action.WaitVisible(distributorddn)
		action.WaitUntilElementClickable(distributorddn)
		WebUI.delay(10)
		action.Click(distributorddn)
		action.Click(distributorvalue)
		if(action.IsElementEnabled(addressbookeditlink)) {
			action.Click(addressbookeditlink)
			WebUI.delay(10)
			action.WaitVisible(addressbookresourcespopup)
			if(action.IsElementDisplayed(addressbookresourcespopup)) {
				println ("Resorce message pop up is verified for Address Book")
			}
			else {
			}
		}
		else {
			Assert.fail()
		}
	}

	@Keyword
	public void OverrideGlobalResourceTextForAddressBook() {

		action.WaitVisible(addressbookoverridetextbox)
		action.Clear(addressbookoverridetextbox)
		WebUI.delay(3)
		action.Type(addressbookoverridetextbox, GlobalVariable.resourcemsgaddressbook)
		action.WaitUntilElementClickable(addressbookupdatebtn)
		action.Click(addressbookupdatebtn)
		WebUI.delay(10)
	}


	@Keyword
	public void VerifyResourceMessagePopupForAddressList() {
		action.Click(corporationddn)
		action.Type(corpddntextbox, "339")
		action.Click(corporationddnvalue)
		action.WaitVisible(distributorddn)
		action.WaitUntilElementClickable(distributorddn)
		WebUI.delay(10)
		action.Click(distributorddn)
		action.Click(distributorvalue)
		if(action.IsElementEnabled(addresslisteditlink)) {
			action.Click(addresslisteditlink)
			WebUI.delay(10)
			action.WaitVisible(addresslistresourcespopup)
			if(action.IsElementDisplayed(addresslistresourcespopup)) {
				println ("Resorce message pop up is verified for Address List")
			}
			else {
			}
		}
		else {
			Assert.fail()
		}
	}


	@Keyword
	public void OverrideGlobalResourceTextForAddressList() {

		action.WaitVisible(addresslistoverridetextbox)
		action.Clear(addresslistoverridetextbox)
		WebUI.delay(3)
		action.Type(addresslistoverridetextbox, GlobalVariable.resourcemsgaddressList)
		action.WaitUntilElementClickable(addresslistupdatebtn)
		action.Click(addresslistupdatebtn)
		WebUI.delay(10)
	}


	@Keyword
	public void VerifyResourceMessagePopupForLogoLocker() {
		action.Click(corporationddn)
		action.Type(corpddntextbox, "339")
		action.Click(corporationddnvalue)
		action.WaitVisible(distributorddn)
		action.WaitUntilElementClickable(distributorddn)
		WebUI.delay(10)
		action.Click(distributorddn)
		action.Click(distributorvalue)
		if(action.IsElementEnabled(logolockereditlink)) {
			action.Click(logolockereditlink)
			WebUI.delay(10)
			action.WaitVisible(logolockerresourcespopup)
			if(action.IsElementDisplayed(logolockerresourcespopup)) {
				println ("Resorce message pop up is verified for Logo Locker")
			}
			else {
			}
		}
		else {
			Assert.fail()
		}
	}

	@Keyword
	public void OverrideGlobalResourceTextForLogoLocker() {

		action.WaitVisible(logolockeroverridetextbox)
		action.Clear(logolockeroverridetextbox)
		WebUI.delay(3)
		action.Type(logolockeroverridetextbox, GlobalVariable.resourcemsglogolocker)
		action.WaitUntilElementClickable(logolockerupdatebtn)
		action.Click(logolockerupdatebtn)
		WebUI.delay(10)
	}



	@Keyword
	public void VerifyResourceMessagePopupForProfile() {
		action.Click(corporationddn)
		action.Type(corpddntextbox, "339")
		action.Click(corporationddnvalue)
		action.WaitVisible(distributorddn)
		action.WaitUntilElementClickable(distributorddn)
		WebUI.delay(10)
		action.Click(distributorddn)
		action.Click(distributorvalue)
		if(action.IsElementEnabled(profileeditlink)) {
			action.Click(profileeditlink)
			WebUI.delay(10)
			action.WaitVisible(profileresourcespopup)
			if(action.IsElementDisplayed(profileresourcespopup)) {
				println ("Resorce message pop up is verified for Profile")
			}
			else {
			}
		}
		else {
			Assert.fail()
		}
	}


	@Keyword
	public void OverrideGlobalResourceTextForProfile() {

		action.WaitVisible(profileoverridetextbox)
		action.Clear(profileoverridetextbox)
		WebUI.delay(3)
		action.Type(profileoverridetextbox, GlobalVariable.resorcemsgprofile)
		action.WaitUntilElementClickable(profileupdatebtn)
		action.Click(profileupdatebtn)
		WebUI.delay(10)
	}


	@Keyword
	public void VerifyResourceMessagePopupForProjects() {
		action.Click(corporationddn)
		action.Type(corpddntextbox, "339")
		action.Click(corporationddnvalue)
		action.WaitVisible(distributorddn)
		action.WaitUntilElementClickable(distributorddn)
		WebUI.delay(10)
		action.Click(distributorddn)
		action.Click(distributorvalue)
		if(action.IsElementEnabled(projectseditlink)) {
			action.Click(projectseditlink)
			WebUI.delay(10)
			action.WaitVisible(projectsresourcespopup)
			if(action.IsElementDisplayed(projectsresourcespopup)) {
				println ("Resorce message pop up is verified for Projects")
			}
			else {
			}
		}
		else {
			Assert.fail()
		}
	}


	@Keyword
	public void OverrideGlobalResourceTextForProjects() {

		action.WaitVisible(projectsoverridetextbox)
		action.Clear(projectsoverridetextbox)
		WebUI.delay(3)
		action.Type(projectsoverridetextbox, GlobalVariable.resourcemsgprojects)
		action.WaitUntilElementClickable(projectsupdatebtn)
		action.Click(projectsupdatebtn)
		WebUI.delay(10)
	}


	@Keyword
	public void VerifyResourceMessagePopupForReports() {
		action.Click(corporationddn)
		action.Type(corpddntextbox, "339")
		action.Click(corporationddnvalue)
		action.WaitVisible(distributorddn)
		action.WaitUntilElementClickable(distributorddn)
		WebUI.delay(10)
		action.Click(distributorddn)
		action.Click(distributorvalue)
		if(action.IsElementEnabled(reportseditlink)) {
			action.Click(reportseditlink)
			WebUI.delay(10)
			action.WaitVisible(reportsresourcespopup)
			if(action.IsElementDisplayed(reportsresourcespopup)) {
				println ("Resorce message pop up is verified for Reports")
			}
			else {
			}
		}
		else {
			Assert.fail()
		}
	}


	@Keyword
	public void OverrideGlobalResourceTextForReports() {

		action.WaitVisible(reportsoverridetextbox)
		action.Clear(reportsoverridetextbox)
		WebUI.delay(3)
		action.Type(reportsoverridetextbox, GlobalVariable.resourcemsgreports)
		action.WaitUntilElementClickable(reportsupdatebtn)
		action.Click(reportsupdatebtn)
		WebUI.delay(10)
	}



	@Keyword
	public void VerifyDeleteResourceMessageProfile() {


		if(action.IsElementEnabled(profiledeletelink)) {
			action.Click(profiledeletelink)
			WebUI.delay(10)
			action.AcceptAlert()
			WebUI.delay(10)
		}
	}

	@Keyword
	public void VerifyDeleteResourceMessageReports() {


		if(action.IsElementEnabled(reportsdeletelink)) {
			action.Click(reportsdeletelink)
			WebUI.delay(10)
			action.AcceptAlert()
			WebUI.delay(10)
		}
	}


	@Keyword
	public void VerifyDeleteResourceMessageLogoLocker() {


		if(action.IsElementEnabled(logolockerdeletelink)) {
			action.Click(logolockerdeletelink)
			WebUI.delay(10)
			action.AcceptAlert()
			WebUI.delay(10)
		}
	}

	@Keyword
	public void VerifyDeleteResourceMessageProjects() {


		if(action.IsElementEnabled(projectsdeletelink)) {
			action.Click(projectsdeletelink)
			WebUI.delay(10)
			action.AcceptAlert()
			WebUI.delay(10)
		}
	}

	@Keyword
	public void VerifyDeleteResourceMessageAddressBook() {


		if(action.IsElementEnabled(addressbookdeletelink)) {
			action.Click(addressbookdeletelink)
			WebUI.delay(10)
			action.AcceptAlert()
			WebUI.delay(10)
		}
	}

	@Keyword
	public void VerifyDeleteResourceMessageAddressList() {


		if(action.IsElementEnabled(addresslistdeletelink)) {
			action.Click(addresslistdeletelink)
			WebUI.delay(10)
			action.AcceptAlert()
			WebUI.delay(10)
		}
	}
}
