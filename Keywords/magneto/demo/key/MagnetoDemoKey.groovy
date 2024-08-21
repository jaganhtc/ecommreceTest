package magneto.demo.key

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class MagnetoDemoKey {


	@Keyword
	def openBrowser (String url) {

		WebUI.openBrowser(GlobalVariable.url)
		WebUI.maximizeWindow()
	}

	@Keyword
	def closeBrowser () {

		WebUI.closeBrowser()
	}

	@Keyword
	def SignOut () {

		WebUI.click(findTestObject('Object Repository/SignOn/Page_My Account/button_Change'))
		WebUI.click(findTestObject('Object Repository/SignOn/Page_My Account/btnSignOut'))
	}



	@Keyword
	def Login (String username,String password) {

		WebUI.click(findTestObject('Object Repository/Login/Page_Home Page/a_Sign In'))

		WebUI.sendKeys(findTestObject('Object Repository/Login/Page_Customer Login/txtusername'), GlobalVariable.username)
		WebUI.sendKeys(findTestObject('Object Repository/Login/Page_Customer Login/txtpassword'), GlobalVariable.password)

		WebUI.click(findTestObject('Object Repository/Login/Page_Customer Login/span_Sign In'))

		WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Page_Home Page/button_Change'), 5)
	}



	@Keyword

	def createAnAccount(String firstname,String lastname,String email,String password,String confirmpassword) {

		WebUI.click(findTestObject('Object Repository/SignOn/Page_Home Page/linkCreate an Account'))


		WebUI.sendKeys(findTestObject('Object Repository/SignOn/Page_Create New Customer Account/txtFirstName'), GlobalVariable.firstname)
		WebUI.sendKeys(findTestObject('Object Repository/SignOn/Page_Create New Customer Account/txtLastName'), GlobalVariable.lastname)
		WebUI.sendKeys(findTestObject('Object Repository/SignOn/Page_Create New Customer Account/txtEmail'), GlobalVariable.email)
		WebUI.sendKeys(findTestObject('Object Repository/SignOn/Page_Create New Customer Account/txtPassword'), GlobalVariable.password)
		WebUI.sendKeys(findTestObject('Object Repository/SignOn/Page_Create New Customer Account/txtConfirmPassword'), GlobalVariable.password)

		WebUI.click(findTestObject('Object Repository/SignOn/Page_Create New Customer Account/labelCreate an Account'))


		String acccreated= WebUI.verifyElementText(findTestObject('Object Repository/SignOn/Page_My Account/infoConfirmationMessage'), 'Thank you for registering with Main Website Store.')
		String accalreadycreated=WebUI.verifyElementText(findTestObject('Object Repository/SignOn/Page_My Account/infoConfirmationMessage'),'')
	}
	
	
	@Keyword
	def addProducToCart (String product) {
		
		WebUI.sendKeys(findTestObject('Object Repository/AddToCart/Page_Home Page/input_Search_q'), GlobalVariable.productname)
		WebUI.click(findTestObject('Object Repository/AddToCart/Page_Home Page/span_Juno Jaket'))
		WebUI.click(findTestObject('Object Repository/AddToCart/Page_Home Page/button_Search'))
		WebUI.click(findTestObject('Object Repository/AddToCart/Page_Search results for Juno Jaket/span_Add to Cart'))
		
		WebUI.click(findTestObject('Object Repository/AddToCart/Page_Juno Jacket/div_Color_option-label-color-93-item-50'))
		WebUI.click(findTestObject('Object Repository/AddToCart/Page_Juno Jacket/div_L'))
		
		WebUI.click(findTestObject('Object Repository/AddToCart/Page_Juno Jacket/span_Add to Cart'))
		
		WebUI.click(findTestObject('Object Repository/AddToCart/Page_Juno Jacket/a_My Cart11items'))
		
	}
	
	
	
}
