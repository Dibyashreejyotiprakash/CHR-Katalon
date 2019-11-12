package com.poswm

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

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

import com.utilities.Interaction
import internal.GlobalVariable
import org.openqa.selenium.WebDriver
import org.testng.Assert
import org.openqa.selenium.Alert
import org.openqa.selenium.By
import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable

public class WarehouseUsersPage {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()


	By addnewuserbtn = By.xpath("//*[@id='ctl00_MainContent_rdGridWarehouseUsers_ctl00_ctl02_ctl00_InitInsertButton']")
	By firstname = By.xpath("//*[@id='ctl00_MainContent_rdGridWarehouseUsers_ctl00_ctl02_ctl04_EditFormControl_txtFirstName']")
	By lastname = By.xpath("//*[@id='ctl00_MainContent_rdGridWarehouseUsers_ctl00_ctl02_ctl04_EditFormControl_txtLastName']")
	By email = By.xpath("//*[@id='ctl00_MainContent_rdGridWarehouseUsers_ctl00_ctl02_ctl04_EditFormControl_txtUserName']")
	By password = By.xpath("//*[@id='ctl00_MainContent_rdGridWarehouseUsers_ctl00_ctl02_ctl04_EditFormControl_txtPassword']")
	By phonenumber = By.xpath("//*[@id='ctl00_MainContent_rdGridWarehouseUsers_ctl00_ctl02_ctl04_EditFormControl_txtPhone']")
	By clientuserid = By.xpath("//*[@id='ctl00_MainContent_rdGridWarehouseUsers_ctl00_ctl02_ctl04_EditFormControl_txtClientUserID']")
	By activecheckbox = By.xpath("//*[@id='ctl00_MainContent_rdGridWarehouseUsers_ctl00_ctl02_ctl04_EditFormControl_chkbxIsActive']")
	By insertbtn = By.xpath("//*[@id='ctl00_MainContent_rdGridWarehouseUsers_ctl00_ctl02_ctl04_EditFormControl_btnInsert']")
	By firstusereditlink = By.xpath("//*[@id='ctl00_MainContent_rdGridWarehouseUsers_ctl00__0']//a")
	By alluserspresentingrid = By.xpath("//*[@id='ctl00_MainContent_rdGridWarehouseUsers']//tbody//tr[contains(@id,'ctl00_MainContent_rdGridWarehouseUsers_c')]")


	By editfirstname = By.xpath("//*[@id='ctl00_MainContent_rdGridWarehouseUsers_ctl00_ctl05_EditFormControl_txtFirstName']")
	By editlastname = By.xpath("//*[@id='ctl00_MainContent_rdGridWarehouseUsers_ctl00_ctl05_EditFormControl_txtLastName']")
	By editemailaddress = By.xpath("//*[@id='ctl00_MainContent_rdGridWarehouseUsers_ctl00_ctl05_EditFormControl_txtUserName']")
	By phoneno = By.xpath("//*[@id='ctl00_MainContent_rdGridWarehouseUsers_ctl00_ctl05_EditFormControl_txtPhone']")
	By availablewarehouse = By.xpath("//*[@id='ctl00_MainContent_rdGridWarehouseUsers_ctl00_ctl05_EditFormControl_rdDropDownAllWarehouses']")
	By availablewarehousecheckbox = By.xpath("//*[@id='ctl00_MainContent_rdGridWarehouseUsers_ctl00_ctl05_EditFormControl_rdDropDownAllWarehouses_i0']//input")
	By editactivecheckbox = By.xpath("//*[@id='ctl00_MainContent_rdGridWarehouseUsers_ctl00_ctl05_EditFormControl_chkbxIsActive']")
	By updatebtn = By.xpath("//*[@id='ctl00_MainContent_rdGridWarehouseUsers_ctl00_ctl05_EditFormControl_btnUpdate']")
	By closebtn = By.xpath("//*[@id='ctl00_MainContent_rdGridWarehouseUsers_ctl00_ctl05_EditFormControl_btnCancel']")
	By deleteusersbtn = By.xpath("//*[@id='ctl00_MainContent_rdGridWarehouseUsers_ctl00_ctl05_EditFormControl_btnDelete']")

	By filterddn = By.xpath("//*[@id='ctl00_MainContent_rdDropDownWarehouses_Input']")
	By filterbtn = By.xpath("//*[@id='ctl00_MainContent_btnFilterUserGrid_input']")
	By clearbtn = By.xpath("//*[@id='ctl00_MainContent_btnClearUserGrid_input']")

	@Keyword
	public void VerifyWarehouseUsersPage() {

		try{
			action.VerifyCurrentPage("WarehouseUsers.aspx")
		}
		catch(Exception e) {
			Assert.fail("Verify Ware House Users page failed due to "+ e)
		}
	}

	@Keyword
	public void AddNewUser() {
		try{
			WebUI.delay(10)
			boolean statusofaaddnewbtn = action.IsElementEnabled(addnewuserbtn)
			WebUI.delay(10)
			Assert.assertTrue(statusofaaddnewbtn)
			WebUI.delay(10)
			if(statusofaaddnewbtn == true) {
				action.WaitUntilElementClickable(addnewuserbtn)
				action.Click(addnewuserbtn)
				WebUI.delay(3)
				action.Type(firstname, "firsttest")
				WebUI.delay(3)
				action.Type(lastname, "lasttest")
				WebUI.delay(3)
				action.Type(email, "testemial@brandmuscle.com")
				WebUI.delay(3)
				action.Type(phonenumber, "1234567890")
				WebUI.delay(3)
				String txtclientuserid = action.GenerateRandomAplphabaNeumericString(6)
				println ("Client user id is ---------"+clientuserid )
				WebUI.delay(3)
				action.Type(clientuserid, txtclientuserid)
				WebUI.delay(3)
				action.Click(insertbtn)
			}
			else{
				throw new Exception ("Add new user button disabled")
			}
		}
		catch(Exception e) {
			Assert.fail("Add New User failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyEditUser() {
		try{
			List<WebElement> allusers = action.GetElements(alluserspresentingrid)
			int totalusers = allusers.size()
			if(totalusers >0) {
				action.WaitUntilElementClickable(firstusereditlink)
				action.Click(firstusereditlink) 
					WebUI.delay(2)
					boolean statusofeditfirstname = action.IsElementDisplayed(editfirstname)
					Assert.assertTrue(statusofeditfirstname)

					WebUI.delay(1)
					boolean statusofeditsecondname = action.IsElementDisplayed(editlastname)
					Assert.assertTrue(statusofeditsecondname)

					WebUI.delay(1)
					boolean statusofeditemailaddress = action.IsElementDisplayed(editemailaddress)
					Assert.assertTrue(statusofeditemailaddress)

					WebUI.delay(1)
					boolean statusofeditcheckbox = action.IsElementSelected(editactivecheckbox)
					Assert.assertTrue(statusofeditcheckbox)

					WebUI.delay(1)
					boolean statusofmembersofgroup = action.IsElementSelected(availablewarehouse)
					Assert.assertTrue(statusofmembersofgroup)

					action.WaitUntilElementClickable(updatebtn)
					WebUI.delay(1)
					boolean statusofmembersofupdatebtn = action.IsElementEnabled(updatebtn)
					Assert.assertTrue(statusofmembersofupdatebtn)

					action.WaitUntilElementClickable(closebtn)
					WebUI.delay(1)
					boolean statusofclosebtn = action.IsElementEnabled(closebtn)
					Assert.assertTrue(statusofclosebtn)

					WebUI.delay(1)
					action.WaitUntilElementClickable(deleteusersbtn)
					boolean statusofdeleteuserbtn = action.IsElementEnabled(deleteusersbtn)
					Assert.assertTrue(statusofdeleteuserbtn)
				}
			else{
				throw new Exception("No user available in the grid")
			}
		}
		catch(Exception e) {
			Assert.fail("Verify Edit User failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyFilterDDNFilterBtnClearBtn() {
		try{
			boolean statusoffilterddn = action.IsElementDisplayed(filterddn)
			Assert.assertTrue(statusoffilterddn)

			boolean statusoffilterbtn = action.IsElementDisplayed(filterbtn)
			Assert.assertTrue(statusoffilterbtn)

			boolean statusoffilterclearbtn = action.IsElementDisplayed(filterddn)
			Assert.assertTrue(statusoffilterclearbtn)
		}
		catch(Exception e) {
			Assert.fail("Verify Filter DDN Filter Btn Clear Btn failed due to "+ e)
		}
	}
}
