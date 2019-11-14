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

WebUI.waitForPageLoad(300)

CustomKeywords.'com.utilities.Interaction.GetUrl'(GlobalVariable.bunamedesigntracker, GlobalVariable.testtyperegression, 
    GlobalVariable.environment)

CustomKeywords.'com.designtracker.LoginPage.LoginToDesignTarcker'('dibyashree.jyoti@brandmuscle.com', 'chr@1234')

CustomKeywords.'com.designtracker.HomePage.ClickOnhighrarchy'()

CustomKeywords.'com.designtracker.HierarchyPage.AssociateUserForSupplier'()

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(300)

CustomKeywords.'com.utilities.Interaction.GetUrl'(GlobalVariable.bunamewswadmin, GlobalVariable.testtyperegression, GlobalVariable.environment)

CustomKeywords.'com.wswadmin.HomePage.NavigateToItemGatingGroupManagement'()

CustomKeywords.'com.wswadmin.StandardItemGating.ValidateUserOnWswAdminForSupplier'()

