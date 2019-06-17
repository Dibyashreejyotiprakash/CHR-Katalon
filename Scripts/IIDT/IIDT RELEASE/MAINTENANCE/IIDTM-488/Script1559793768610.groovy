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

CustomKeywords.'com.utilities.DemooInteractions.GetUrl'('INSTANTIMPACTUSERSITE1', 'SMOKE', 'UAT1')

WebUI.waitForPageLoad(30)

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('WSWADMIN/HomePage/BrandMuscleTab'), 30)

WebUI.click(findTestObject('WSWADMIN/HomePage/BrandMuscleTab'))

WebUI.waitForElementVisible(findTestObject('WSWADMIN/HomePage/NotificationTab'), 30)

WebUI.mouseOver(findTestObject('WSWADMIN/HomePage/NotificationTab'))

WebUI.click(findTestObject('WSWADMIN/HomePage/NotificationTab'))

WebUI.waitForPageLoad(30)

WebUI.waitForElementVisible(findTestObject('WSWADMIN/NotificationPage/GroupMaintenance'), 30)

WebUI.click(findTestObject('WSWADMIN/NotificationPage/GroupMaintenance'))

WebUI.waitForPageLoad(30)

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('http://ii4.uat.brandmuscle.net')

WebUI.waitForPageLoad(0)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('II-USERSITE/LoginPage/UserName'), 'diageoadmin@centiv.com')

WebUI.setText(findTestObject('II-USERSITE/LoginPage/Password'), 'go2web')

WebUI.click(findTestObject('II-USERSITE/LoginPage/LoginBtn'))

WebUI.waitForPageLoad(30)

WebUI.waitForElementVisible(findTestObject('II-USERSITE/Home Page/POSOnDemand'), 300)

WebUI.mouseOverOffset(findTestObject('II-USERSITE/Home Page/POSOnDemand'), 0, 0)

WebUI.waitForElementVisible(findTestObject('II-USERSITE/Home Page/POSTemplates'), 30)

WebUI.mouseOver(findTestObject('II-USERSITE/Home Page/POSTemplates'))

WebUI.click(findTestObject('II-USERSITE/Home Page/POSTemplates'))

WebUI.waitForPageLoad(30)

WebUI.waitForElementVisible(findTestObject('II-USERSITE/ItemSearchPage/SearchTextBox'), 0)

WebUI.setText(findTestObject('II-USERSITE/ItemSearchPage/SearchTextBox'), '131675')

WebUI.click(findTestObject('II-USERSITE/ItemSearchPage/SearchBtn'))

WebUI.waitForPageLoad(30)

WebUI.navigateToUrl('http://ii4.uat.brandmuscle.net/POS/ItemDetails.aspx?tid=131675')

WebUI.waitForPageLoad(30)

WebUI.waitForElementVisible(findTestObject('II-USERSITE/CreateDesignPage/CreateDesignBtn'), 30)

WebUI.scrollToElement(findTestObject('II-USERSITE/CreateDesignPage/CreateDesignBtn'), 0)

WebUI.click(findTestObject('II-USERSITE/CreateDesignPage/CreateDesignBtn'))

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('II-USERSITE/CreateDesignPage/PreviewChangesBtn'))

WebUI.navigateToUrl('http://ii4.uat.brandmuscle.net/POS/ProductSelection.aspx?TemplateID=131675')

WebUI.click(findTestObject('II-USERSITE/ProductSelectionPage/ItemTypeDropDown'))

WebUI.waitForElementVisible(findTestObject('II-USERSITE/ProductSelectionPage/ItemTypeValues'), 30)

WebUI.click(findTestObject('II-USERSITE/ProductSelectionPage/ItemTypeValues'))

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('II-USERSITE/ProductSelectionPage/MediaLaminations'))

WebUI.waitForElementVisible(findTestObject('II-USERSITE/ProductSelectionPage/MediaLaminationValue'), 30)

WebUI.click(findTestObject('II-USERSITE/ProductSelectionPage/MediaLaminationValue'))

WebUI.waitForElementVisible(findTestObject('II-USERSITE/ProductSelectionPage/Quantity'), 30)

WebUI.setText(findTestObject('II-USERSITE/ProductSelectionPage/Quantity'), '12')

WebUI.waitForElementVisible(findTestObject('II-USERSITE/ProductSelectionPage/NoBtn'), 30)

WebUI.click(findTestObject('II-USERSITE/ProductSelectionPage/NoBtn'))

WebUI.scrollToElement(findTestObject('II-USERSITE/ProductSelectionPage/AddToKartBtn'), 300)

WebUI.waitForElementClickable(findTestObject('II-USERSITE/ProductSelectionPage/AddToKartBtn'), 30)

WebUI.navigateToUrl('http://ii4.uat.brandmuscle.net/ShoppingCart/ShoppingCart.aspx')

