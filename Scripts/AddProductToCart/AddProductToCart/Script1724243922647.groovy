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

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/Page_Customer Login/input_Email_loginusername'), 'mskrish@123.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Customer Login/input_Password_loginpassword'), 'sdGpgyGk7wy70wWFNp6bxA==')

WebUI.click(findTestObject('Object Repository/Page_Customer Login/span_Sign In'))

WebUI.setText(findTestObject('Object Repository/Page_Home Page/input_Search_q'), 'juno jaket')

WebUI.click(findTestObject('Object Repository/Page_Home Page/li_Juno Jaket1'))

WebUI.click(findTestObject('Object Repository/Page_Search results for Juno Jaket/div_M'))

WebUI.click(findTestObject('Object Repository/Page_Search results for Juno Jaket/span_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Page_Juno Jacket/div_M'))

WebUI.click(findTestObject('Object Repository/Page_Juno Jacket/div_Color_option-label-color-93-item-53'))

WebUI.click(findTestObject('Object Repository/Page_Juno Jacket/span_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Page_Juno Jacket/span_1'))

WebUI.click(findTestObject('Object Repository/Page_Juno Jacket/button_Proceed to Checkout'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/span_Next'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/input_Best Way_ko_unique_2'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/span_Next'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/span_Place Order'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Success Page/span_Thank you for your purchase'), 'Thank you for your purchase!')

WebUI.click(findTestObject('Object Repository/Page_Success Page/span_Continue Shopping'))

