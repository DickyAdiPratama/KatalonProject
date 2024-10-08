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

WebUI.callTestCase(findTestCase('Login/SCN_002_TC_001_Login'), [('email') : 'dicky12@yopmail.com', ('password') : 'Adi1234567'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Checkout/Page_Lets Shop/b_ZARA COAT 3'), 'ZARA COAT 3')

WebUI.click(findTestObject('Object Repository/Checkout/Page_Lets Shop/button_Add To Cart'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Lets Shop/button_Cart 1'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Lets Shop/button_Checkout'))

WebUI.setText(findTestObject('Object Repository/Checkout/Page_Lets Shop/input_dicky12yopmail.com_input txt text-validated'), 
    'ind')

WebUI.click(findTestObject('Object Repository/Checkout/Page_Lets Shop/span_Indonesia'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Lets Shop/a_Place Order'))

WebUI.verifyElementText(findTestObject('Object Repository/Checkout/Page_Lets Shop/h1_Thankyou for the order'), 'THANKYOU FOR THE ORDER.')

WebUI.closeBrowser()

