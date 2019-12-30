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

import org.openqa.selenium.WebDriver

import com.kms.katalon.core.webui.driver.DriverFactory
import org.testng.Assert


public class ItemDetailsPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By ordernowbtn = By.xpath("//*[@id='Body_btnOrderNow']")
	By createdesignbtn = By.xpath("//input[@id='Body_btnProductDesign']")
	By selectheadline = By.xpath("//select[@id='Body_ddlHeadline']")
	By choosefont = By.xpath("//select[@id='Body_ddlChooseFont']")
	By choosecolor = By.xpath("//select[@id='Body_ddlChooseColor']")
	By chooselayout = By.xpath("//select[@id='Body_ddlChooseLayout']")
	//By previewchangebtn = By.xpath("//input[@id='btnRepaintImage']")
	By previewchangebtn = By.xpath("//input[@id='Body_repaintImageTopButton']")
	By nextstepbtn = By.xpath("//input[@id='btnNextStep']")
	By nobtn = By.xpath("//span[(text()='No')]")
	By itemtypedropdown = By.xpath("//input[@id='ctl00_Body_ItemTypeDropDownList1_Input']")
	By selectitemtype = By.xpath("//li[contains(text(),'Window Cling - Perforated')]")
	By dimensiondropdown = By.xpath("//input[@id='ctl00_Body_ddlDimension1_Input']")
	By selectdimension = By.xpath("//li[contains(text(),'12 X 18')]")
	By selectnewdimension = By.xpath("//li[contains(text(),'18 X 27')]")
	By quantity = By.xpath("//input[@id='ctl00_Body_qtyText1']")
	By addtocartbtn = By.xpath("//input[@id='Body_btnAddToCart']")
	By qntyrequiredmssg = By.xpath("//span[text() = 'Quantity is required']")
	By cartminmssg = By.xpath("(//span[contains(text(),'minimum')])[1]")
	By checkoutbtn = By.xpath("//input[@id='ctl00_Body_sideContToCheckOutBtn']")
	By minqntyalert = By.xpath("//span[contains(text(),'Min quantity for')]")
	By addmoreprodnobtn = By.xpath("//input[@id='Body_btnNo1']")
	By addmoreprodbtn = By.xpath("//a[@id='ctl00_Body_shopCartItemsListView_ctrl0_editAddProdLink']")
	By continuetocheckoutbtn = By.xpath("//input[@id='ctl00_Body_sideContToCheckOutBtn']")
	By clearshoppingcartbtn = By.xpath("//a[@id='Body_lnkDeleteAll']")
	By clearshoppingconfirm = By.xpath("(//span[contains(text(),'Yes')])[1]")
	By shoppingCartEmptytext = By.xpath("//h4[contains(text(),'Your shopping cart is empty')]")
	By productselectionnobtn = By.xpath("//input[@id='Body_btnNo1']")
	By paymentpagetext = By.xpath("//h1[contains(text(),'Enter Payment and Billing Details')]")
	By shoppingcartqty = By.xpath("//input[@id='ctl00_Body_shopCartItemsListView_ctrl0_qtyNumTextBox']")
	By designnumber = By.xpath("//span[@id='Body_lblDesignNumber']")
	By diecutframe = By.xpath("//li[contains(text(),'Die-Cut A-Frame Table Tent 4x6')]")
	By descriptionfield = By.xpath("//div[@id = 'ctl00_Body_radAjaxPanel']//h4[1]")
	By showpricebreak = By.xpath("//a[@id='priceBreakA1']")
	By unitprice = By.xpath("//th[contains(text(),'Unit Price')]")
	
	
	@Keyword
	public void ClickCreateDesignBtn() {
		try {
			action.ScrollToBottomOfPage()
			action.Click(createdesignbtn)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Click On Order Now failed due to "+ e)
		}
	}



	@Keyword
	public void ClickOnOrderNow() {
		try {
			action.WaitVisible(ordernowbtn)
			action.Click(ordernowbtn)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Click On Order Now failed due to "+ e)
		}
	}


	@Keyword
	public void SetVariableTemplateLayout() {
		try {

			//WebUI.delay(5)
			boolean status = action.IsElementEnabled(createdesignbtn)
			println("Status Is "+status)
			action.ScrollToViewElement(createdesignbtn)
			//WebUI.delay(3)
			action.Click(createdesignbtn)
			action.WaitVisible(selectheadline)
			action.SelectByText(selectheadline, "Cheers to your Valentine")
			action.SelectByText(choosefont, "Block")
			action.SelectByText(choosecolor, "Pink")
			action.SelectByText(chooselayout, "Menu")
			action.ScrollToViewElement(previewchangebtn)
			//action.WaitVisible(previewchangebtn)
			//WebUI.delay(10)
			action.WaitUntilElementClickable(previewchangebtn)
			//WebUI.delay(5)
			action.Click(previewchangebtn)
			action.ScrollToViewElement(nextstepbtn)
			action.WaitUntilElementClickable(nextstepbtn)
			action.Click(nextstepbtn)
			action.WaitVisible(nobtn)
			action.Click(nobtn)
		}
		catch(Exception e) {
			println ("SetVariableTemplateLayout failed due to "+ e)
			Assert.fail("SetVariableTemplateLayout failed")
		}
	}


	@Keyword
	public void SelectItemType() {
		try {
			action.Click(itemtypedropdown)
			action.Click(selectitemtype)
			action.Click(dimensiondropdown)
			action.Click(selectdimension)
			action.WaitVisible(quantity)
			action.Click(addtocartbtn)
			action.IsElementDisplayed(qntyrequiredmssg)
			action.Click(quantity)
			action.Type(quantity, "6")
			action.ScrollToViewElement(productselectionnobtn)
			action.WaitUntilElementClickable(productselectionnobtn)
			action.Click(productselectionnobtn)
			//WebUI.delay(5)
			action.WaitUntilElementClickable(addtocartbtn)
			action.Click(addtocartbtn)
		}
		catch(Exception e) {
			println("SelectItemType Failed")
			Assert.fail("SelectItemType Failed due to "+e)
		}
	}


	@Keyword
	public void SelectNewItemType() {
		try {
			action.Click(itemtypedropdown)
			action.Click(selectitemtype)
			action.Click(dimensiondropdown)
			action.Click(selectnewdimension)
			action.WaitVisible(quantity)
			action.Click(addtocartbtn)
			action.IsElementDisplayed(qntyrequiredmssg)
			action.Click(quantity)
			action.Type(quantity, "10")
			action.WaitUntilElementClickable(productselectionnobtn)
			action.Click(productselectionnobtn)
			WebUI.delay(5)
			action.WaitUntilElementClickable(addtocartbtn)
			action.Click(addtocartbtn)
			action.WaitVisible(showpricebreak)
			action.Click(showpricebreak)
			action.WaitVisible(unitprice)
		}
		catch(Exception e) {
			println("SelectItemType Failed")
			Assert.fail("SelectItemType Failed due to "+e)
		}
	}



	@Keyword
	public void Checkout() {
		try {
			WebUI.delay(3)
			action.WaitUntilElementClickable(continuetocheckoutbtn)
			action.Click(continuetocheckoutbtn)
		}
		catch(Exception e) {
			println("Checkout Failed")
			Assert.fail("Checkout Failed due to "+e)
		}
	}


	@Keyword
	public void ValidateMinimumQuantity() {

		try {
			boolean status = action.IsElementDisplayed(minqntyalert)
			Assert.assertTrue(status)
		}
		catch(Exception e) {
			println("ValidateMinimumQuantity Failed")
			Assert.fail("ValidateMinimumQuantity failed due to "+e)
		}
	}


	@Keyword
	public void ClearShoppingCart() {
		try {
			action.Click(clearshoppingcartbtn)
			action.WaitVisible(clearshoppingconfirm)
			action.Click(clearshoppingconfirm)
			action.WaitVisible(shoppingCartEmptytext)
		}
		catch(Exception e) {
			println("ClearShoppingCart Failed")
			Assert.fail("ClearShoppingCart failed due to "+e)
		}
	}

	@Keyword
	public void ValidateMinimumQuantityWithMultipleLineItem() {

		try {
			action.Click(addmoreprodbtn)
		}
		catch(Exception e) {
			println("ValidateMinimumQuantityWithMultipleLineItem Failed")
			Assert.fail("ValidateMinimumQuantityWithMultipleLineItem failed due to "+e)
		}
	}

	@Keyword
	public void CheckPaymentPage() {
		try {
			action.WaitVisible(paymentpagetext)
		}
		catch(Exception e) {
			println("CheckPaymentPage Failed")
			Assert.fail("CheckPaymentPage failed due to "+e)
		}
	}

	@Keyword
	public void EditShoppingCartQty() {
		try {
			WebUI.delay(3)
			action.Click(shoppingcartqty)
			action.Clear(shoppingcartqty)
			action.Type(shoppingcartqty, "15")
		}
		catch(Exception e) {
			println("EditShoppingCartQty Failed")
			Assert.fail("EditShoppingCartQty failed due to "+e)
		}
	}

	@Keyword
	public void EntervaluesToProductionSelectionPage() {
		try {
			action.Type(quantity, "10")
			action.ScrollToBottomOfPage()
			WebUI.delay(10)
			action.WaitUntilElementClickable(nobtn)
			action.Click(nobtn)
			WebUI.delay(10)
			action.WaitUntilElementClickable(addtocartbtn)
			action.Click(addtocartbtn)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println("Enter values To Production Selection Page failed due to "+ e)
		}
	}

	@Keyword
	public void ClickOnCreateYourOwnDesign() {
		try {
			action.WaitVisible(designnumber)
			//action.WaitVisible(diecutframe)
			//action.ScrollToViewElement(diecutframe)
			action.ScrollToBottomOfPage()
			WebUI.delay(2)
			action.Click(createdesignbtn)
		}
		catch(Exception e) {
			Assert.fail("ClickOnCreateYourOwnDesign Failed due to "+e)
		}
	}

	@Keyword
	public void ValidateNAinDescription() {
		try {
			action.WaitVisible(descriptionfield)
			String s = action.GetText(descriptionfield)
			boolean val = s.contains("N/A")
			Assert.assertEquals(val, "false")
		}
		catch(Exception e) {
			Assert.fail("ValidateNAinDescription Failed due to "+e)
		}
	}
}
