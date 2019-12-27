package com.iiadmin

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

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.testng.Assert
import org.openqa.selenium.Alert
import org.openqa.selenium.By
import com.kms.katalon.core.webui.driver.DriverFactory
import java.util.Date
import java.time.LocalDateTime
import java.util.Calendar
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.*;




public class EditItemsPage {
	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By brandsheader = By.xpath("//*[text()='Brands']")
	By logotab = By.xpath("//a[contains(text(),'Logos')]")
	By addnewlogo = By.xpath("//a[contains(text(),'Add New Logo')]")
	By logoname = By.xpath("//input[@id='ctl00_Body_fvLogos_descriptTextBox']")
	By distributor = By.xpath("//select[@id='ctl00_Body_fvLogos_SelectionBoxDistributor_lstAvailable']")
	By leftmovebtn = By.xpath("//input[@id='btnAdd']")
	By browsefilebtn = By.xpath("//input[@id='ctl00_Body_fvLogos_fupImage']")
	By insertbtn = By.xpath("//input[@id='ctl00_Body_fvLogos_InsertButton']")
	By logolistbtn = By.xpath("//input[@id='ctl00_Body_fvLogos_btnListLogos']")
	By addlogosuccessmssg = By.xpath("//span[contains(text(),'New Record Created')]")
	By pagetobeclicked = By.xpath("(//a[text() = '1'])[1]")
	By logodeletebtn = By.xpath("//td[contains(text(),'00000')]//following-sibling::td[5]/a")
	By deletesuccessmssg = By.xpath("//span[contains(text(),'Record Deleted')]")
	By alldistributorchkbox = By.xpath("//input[@id='ctl00_Body_fvLogos_chkAllDistr']")
	By editbtn = By.xpath("//input[@id='ctl00_Body_fvLogos_EditButton']")
	By selectedcorpbox = By.xpath("//select[@id = 'ctl00_Body_fvLogos_SelectionBoxDistributor_lstSelected']")
	By userdropdown = By.xpath("//input[@id='btnCust']")
	By updatebtn = By.xpath("//input[@id='ctl00_Body_fvLogos_UpdateButton']")
	By updatesuccessmssg = By.xpath("//span[@id='ctl00_spnMsg']")
	By deletebtn= By.xpath("//input[@id='ctl00_Body_fvLogos_DeleteButton']")
	By firsteditlink = By.xpath("//*[@id='ctl00_Body_gvItems']//tr[3]/td[7]/a")
	By firstogoeditlink = By.xpath("//*[@id='ctl00_Body_gvLogos']//tr[3]//td[5]/a")
	By finishedgoodstab= By.xpath("//a[contains(text(),'Finished Goods')]")
	By edittemplate = By.xpath("//td[contains(text(),'108477')]//following-sibling::td[6]/a")
	By savebtn = By.xpath("//input[@id='ctl00_Body_btnFinGoods']")
	By ddpartinRHSbox = By.xpath(".//*[@id='ctl00_Body_SelectionBoxFinGoods_lstSelected']/option[contains(text(),'ET11')]")
	By ddpartinLHSbox = By.xpath(".//*[@id='ctl00_Body_SelectionBoxFinGoods_lstAvailable']/option[contains(text(),'ET11')]")
	By rightarrow = By.xpath("//input[@id='btnAdd']")
	By updatesuccess = By.xpath("//span[contains(text(),'Update Succeeded!')]")
	By templatesavebtn = By.xpath("//input[@id='ctl00_Body_fvItems_Button1']")
	By staticcouponchkbox = By.xpath("//input[@id='ctl00_Body_fvItems_chkStaticCoupon']")
	By updatetempsuccessmssg = By.xpath("//span[contains(text(),'Update Succeeded')]")

	@Keyword
	public void NavigateToCorp300() {
		try {

			String  s =  GlobalVariable.iiadmincorpurl
			WebUI.navigateToUrl(s)
			action.WaitVisible(logotab)
		}
		catch(Exception e) {
			Assert.fail("NavigateToCorp300 failed "+e)
		}
	}

	@Keyword
	public void AddLogoForDistributor() {
		try {
			action.Click(logotab)
			action.Click(addnewlogo)
			action.Click(browsefilebtn)
			WebUI.delay(2)
			uploadfile()
			action.Click(logoname)
			action.Type(logoname,"00000")
			action.SelectByText(distributor,"Chicago Beverage Systems")
			action.Click(leftmovebtn)
			action.Click(insertbtn)
			action.WaitVisible(addlogosuccessmssg)
			action.Click(logolistbtn)
			WebUI.delay(15)

			//action.Click(pagetobeclicked)


			action.Click(logodeletebtn)
			WebUI.delay(2)
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			WebUI.delay(5)
			action.WaitVisible(deletesuccessmssg)
			action.Click(addnewlogo)
			action.Type(logoname,"00000")
			WebUI.delay(5)
			action.Click(alldistributorchkbox)
			WebUI.delay(5)
			action.Click(browsefilebtn)
			WebUI.delay(3)
			uploadfile()
			WebUI.delay(3)
			action.Click(insertbtn)
			action.WaitVisible(addlogosuccessmssg)
			action.Click(logolistbtn)
			WebUI.delay(10)
			//action.Click(pagetobeclicked)


			action.Click(logodeletebtn)
			WebUI.delay(2)
			//Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			WebUI.delay(5)
			action.WaitVisible(deletesuccessmssg)


		}
		catch(Exception e) {
			Assert.fail("AddLogoForDistributor failed due to "+e)
		}
	}

	@Keyword
	public void uploadfile() {
		try {
			StringSelection sel = new StringSelection("C:\\Users\\astha.nigam\\Desktop\\Images\\II_4_Slate_Matt_Logo.ai");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
			System.out.println("selection" +sel);
			Robot robot = new Robot();
			Thread.sleep(1000);
			//robot.keyPress(KeyEvent.VK_ENTER);
			//robot.keyRelease(KeyEvent.VK_ENTER);

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);

			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			Thread.sleep(1000);

			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER)


		}
		catch(Exception e) {
			println("uploadfile failed due to "+e)
			throw e
		}
	}


	@Keyword
	public void AddLogoForNoDistributor() {
		try {
			action.Click(logotab)
			action.Click(addnewlogo)
			action.Click(browsefilebtn)
			WebUI.delay(2)
			uploadfile()
			action.Click(logoname)
			action.Type(logoname,"00000")
			action.SelectByText(distributor,"No Distributor")
			action.Click(leftmovebtn)
			action.Click(insertbtn)
			action.WaitVisible(addlogosuccessmssg)
			action.Click(logolistbtn)
			action.WaitVisible(editbtn)
			action.Click(editbtn)
			action.WaitVisible(selectedcorpbox)
			action.SelectByValue(selectedcorpbox, "No Distributor")
			action.WaitVisible(userdropdown)
			action.Click(userdropdown)
			action.Click(updatebtn)
			action.Click(updatesuccessmssg)


			WebUI.delay(10)
			//action.Click(pagetobeclicked)


			action.Click(logodeletebtn)
			WebUI.delay(2)
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			WebUI.delay(5)
			action.WaitVisible(deletesuccessmssg)
			action.Click(addnewlogo)
			action.Type(logoname,"00000")
			WebUI.delay(5)
			action.Click(alldistributorchkbox)
			WebUI.delay(5)
			action.Click(browsefilebtn)
			WebUI.delay(3)
			uploadfile()
			WebUI.delay(3)
			action.Click(insertbtn)
			action.WaitVisible(addlogosuccessmssg)



			action.Click(logolistbtn)
			WebUI.delay(10)
			//action.Click(pagetobeclicked)


			action.Click(logodeletebtn)
			WebUI.delay(2)
			//Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			WebUI.delay(5)
			action.WaitVisible(deletesuccessmssg)


		}
		catch(Exception e) {
			Assert.fail("AddLogoForDistributor failed due to "+e)
		}
	}

	@Keyword
	public void SelectFisrtLogoAndClickOnEditLink() {
		try{
			action.Click(firsteditlink)
			action.VerifyCurrentPage("EditItems.aspx")
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			Assert.fail("Add Distributors failed due to "+ e)
		}
	}

	@Keyword
	public void ClickOnLogosLink() {
		try{
			action.Click(logotab)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			Assert.fail("Click On Logos Link failed due to "+ e)
		}
	}

	@Keyword
	public void EditFisrtLogoAndUpdte() {
		try{
			action.Click(firstogoeditlink)
			action.WaitForPageToLoad()
			action.Click(updatebtn)
		}
		catch(Exception e) {
			Assert.fail("Edit Fisrt Logo failed due to "+ e)
		}
	}

	@Keyword
	public void AssociateDDPartToTemplate() {
		try {
			action.WaitVisible(edittemplate)
			action.Click(edittemplate)
			action.WaitVisible(finishedgoodstab)
			action.Click(finishedgoodstab)
			action.WaitVisible(savebtn)

			boolean checkpart = action.IsDisplayed(ddpartinRHSbox)

			println("VALUE "+checkpart)

			if(!checkpart) {
				println("INSIDE IF")
				action.Click(ddpartinLHSbox)
				action.Click(rightarrow)
				action.Click(savebtn)
				action.WaitVisible(updatesuccess)
			}
		}
		catch(Exception e) {
			Assert.fail("AssociateDDPartToTemplate failed due to "+e)
		}
	}

	@Keyword
	public void MakeTemplateAsStaticCoupon() {
		try {
			action.WaitVisible(edittemplate)
			action.Click(edittemplate)
			action.WaitVisible(templatesavebtn)
			action.ScrollToViewElement(staticcouponchkbox)
			action.Click(staticcouponchkbox)
			action.Click(templatesavebtn)
			action.WaitVisible(updatetempsuccessmssg)
		}
		catch(Exception e) {
			Assert.fail("MakeTemplateAsStaticCoupon failed due to "+e)
		}
	}
}
