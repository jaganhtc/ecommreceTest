import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://magento.softwaretestingboard.com/')

WebUI.click(findTestObject('Object Repository/SignOn/Page_Home Page/linkCreate an Account'))

WebUI.setText(findTestObject('Object Repository/SignOn/Page_Create New Customer Account/txtFirstName'), 'cris')

WebUI.setText(findTestObject('Object Repository/SignOn/Page_Create New Customer Account/txtLastName'), 'gayle')

WebUI.setText(findTestObject('Object Repository/SignOn/Page_Create New Customer Account/txtEmail'), 'cris@gayle.com')

WebUI.setEncryptedText(findTestObject('Object Repository/SignOn/Page_Create New Customer Account/txtPassword'), 
    'sdGpgyGk7wy70wWFNp6bxA==')

WebUI.setEncryptedText(findTestObject('Object Repository/SignOn/Page_Create New Customer Account/txtConfirmPassword'), 
    'sdGpgyGk7wy70wWFNp6bxA==')

WebUI.click(findTestObject('Object Repository/SignOn/Page_Create New Customer Account/labelCreate an Account'))

WebUI.verifyElementText(findTestObject('Object Repository/SignOn/Page_My Account/infoConfirmationMessage'), 
    'Thank you for registering with Main Website Store.')

WebUI.verifyElementPresent(findTestObject('Object Repository/SignOn/Page_My Account/labelMyAccount'), 0)

WebUI.click(findTestObject('Object Repository/SignOn/Page_My Account/button_Change'))

WebUI.click(findTestObject('Object Repository/SignOn/Page_My Account/btnSignOut'))

WebUI.rightClick(findTestObject('Object Repository/SignOn/Page_/labelYou are signed out'))

