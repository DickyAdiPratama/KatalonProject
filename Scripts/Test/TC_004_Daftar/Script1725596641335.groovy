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

WebUI.navigateToUrl(url)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Testing/Button_Login_M2U'))

WebUI.closeWindowTitle('Maybank Indonesia | Kemudahan Transaksi Finansial di Ujung Jari Anda')

WebUI.switchToWindowTitle('Maybank2u')

WebUI.click(findTestObject('Testing/Button_Daftar_Sekarang'))

WebUI.click(findTestObject('Testing/select_currency'))

WebUI.click(findTestObject('Testing/currency'))

WebUI.setText(findTestObject('Testing/nomor_rekening'), nomor_rekening)

WebUI.setText(findTestObject('Testing/pin'), pin)

WebUI.click(findTestObject('Testing/radiobutton_syaratketentuan'))

WebUI.switchToWindowIndex(1)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Testing/Button_Lanjutkan'))

WebUI.verifyElementText(findTestObject('Testing/Alert_Kartu Anda tidak terdaftar'), 'Kartu Anda tidak terdaftar. Harap coba kembali beberapa saat lagi.')

WebUI.closeBrowser()

