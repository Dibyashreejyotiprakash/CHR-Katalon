import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.dturl)

WebUI.setText(findTestObject('DESIGNTRACKER/LoginPage/UserName'), GlobalVariable.dtusername)

WebUI.setText(findTestObject('DESIGNTRACKER/LoginPage/Password'), GlobalVariable.dtpassowrd)

WebUI.click(findTestObject('DESIGNTRACKER/LoginPage/LoginBtn'))

WebUI.waitForElementVisible(findTestObject('DESIGNTRACKER/SalesPeopleJobViewTransfer/Page_DT Home/Site Adminstration'), 
    30)

WebUI.mouseOver(findTestObject('DESIGNTRACKER/SalesPeopleJobViewTransfer/Page_DT Home/Site Adminstration'))

WebUI.waitForAlert(2)

WebUI.click(findTestObject('DESIGNTRACKER/SalesPeopleJobViewTransfer/Page_DT Home/Sales ViewTransfer Job'))

WebUI.waitForElementClickable(findTestObject('DESIGNTRACKER/SalesPeopleJobViewTransfer/Sales People Jobs ViewTransfer page/ddlCorporation'), 
    30)

WebUI.click(findTestObject('DESIGNTRACKER/SalesPeopleJobViewTransfer/Sales People Jobs ViewTransfer page/ddlCorporation'))

WebUI.selectOptionByLabel(findTestObject('DESIGNTRACKER/SalesPeopleJobViewTransfer/Sales People Jobs ViewTransfer page/ddlCorporation'), 
    'Instant Impact 4.0 Demo Corp (Dist.)', false)

WebUI.waitForAlert(2)

WebUI.waitForElementVisible(findTestObject('DESIGNTRACKER/SalesPeopleJobViewTransfer/Sales People Jobs ViewTransfer page/ddlMarket'), 
    30)

WebUI.click(findTestObject('DESIGNTRACKER/SalesPeopleJobViewTransfer/Sales People Jobs ViewTransfer page/ddlMarket'))

WebUI.selectOptionByIndex(findTestObject('DESIGNTRACKER/SalesPeopleJobViewTransfer/Sales People Jobs ViewTransfer page/ddlMarket'), 
    1)

WebUI.waitForAlert(2)

WebUI.waitForElementVisible(findTestObject('DESIGNTRACKER/SalesPeopleJobViewTransfer/Sales People Jobs ViewTransfer page/ddlChooseAnAction'), 
    30)

WebUI.click(findTestObject('DESIGNTRACKER/SalesPeopleJobViewTransfer/Sales People Jobs ViewTransfer page/ddlChooseAnAction'))

WebUI.selectOptionByIndex(findTestObject('DESIGNTRACKER/SalesPeopleJobViewTransfer/Sales People Jobs ViewTransfer page/ddlChooseAnAction'), 
    1)

WebUI.waitForAlert(2)

WebUI.waitForElementVisible(findTestObject('DESIGNTRACKER/SalesPeopleJobViewTransfer/Sales People Jobs ViewTransfer page/ddlFromSalesPerson'), 
    30)

WebUI.click(findTestObject('DESIGNTRACKER/SalesPeopleJobViewTransfer/Sales People Jobs ViewTransfer page/ddlFromSalesPerson'))

WebUI.selectOptionByIndex(findTestObject('DESIGNTRACKER/SalesPeopleJobViewTransfer/Sales People Jobs ViewTransfer page/ddlFromSalesPerson'), 
    4)

WebUI.waitForAlert(2)

WebUI.waitForElementVisible(findTestObject('DESIGNTRACKER/SalesPeopleJobViewTransfer/Sales People Jobs ViewTransfer page/ddlToSalesPerson'), 
    30)

WebUI.click(findTestObject('DESIGNTRACKER/SalesPeopleJobViewTransfer/Sales People Jobs ViewTransfer page/ddlToSalesPerson'))

WebUI.selectOptionByIndex(findTestObject('DESIGNTRACKER/SalesPeopleJobViewTransfer/Sales People Jobs ViewTransfer page/ddlToSalesPerson'), 
    9)

WebUI.waitForAlert(2)

WebUI.click(findTestObject('DESIGNTRACKER/SalesPeopleJobViewTransfer/Sales People Jobs ViewTransfer page/btnTransfer'))

