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

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 'krishms@123.com')

WebUI.setEncryptedText(findTestObject('null'), 'sdGpgyGk7wy70wWFNp6bxA==')

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 'mskrish@123.com')

WebUI.setEncryptedText(findTestObject('null'), 'sdGpgyGk7wy70wWFNp6bxA==')

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('Object Repository/AddToCart/Page_Home Page/input_Search_q'), 'juno jackets')

WebUI.click(findTestObject('Object Repository/AddToCart/Page_Home Page/div_Toggle NavMy Cart0        window.checko_e47d7c'))

WebUI.click(findTestObject('Object Repository/AddToCart/Page_Home Page/button_Search'))

WebUI.setText(findTestObject('Object Repository/AddToCart/Page_Home Page/input_Search_q'), 'juno ja')

WebUI.click(findTestObject('Object Repository/AddToCart/Page_Home Page/span_Juno Jaket'))

WebUI.click(findTestObject('Object Repository/AddToCart/Page_Search results for Juno Jaket/div_M'))

WebUI.click(findTestObject('Object Repository/AddToCart/Page_Search results for Juno Jaket/span_Add to Cart'))

WebUI.verifyElementText(findTestObject('Object Repository/AddToCart/Page_Juno Jacket/div_You need to choose options for your item'), 
    'You need to choose options for your item.')

WebUI.click(findTestObject('Object Repository/AddToCart/Page_Juno Jacket/div_L'))

WebUI.click(findTestObject('Object Repository/AddToCart/Page_Juno Jacket/span_Add to Cart'))

WebUI.click(findTestObject('Object Repository/AddToCart/Page_Juno Jacket/div_Color_option-label-color-93-item-50'))

WebUI.click(findTestObject('Object Repository/AddToCart/Page_Juno Jacket/span_Add to Cart'))

WebUI.verifyElementText(findTestObject('Object Repository/AddToCart/Page_Juno Jacket/a_My Cart11items'), 'My Cart\n\n1\n\n\n1\nitems')

