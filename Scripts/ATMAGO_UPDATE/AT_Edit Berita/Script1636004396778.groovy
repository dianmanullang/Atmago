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

WebUI.openBrowser(GlobalVariable.url_login)

WebUI.maximizeWindow()

WebUI.click(findTestObject('null'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('AT_LoginByEmail/input_Email_email'), GlobalVariable.username)

WebUI.setText(findTestObject('AT_LoginByEmail/input_Password_password'), GlobalVariable.Password)

WebUI.click(findTestObject('AT_LoginByEmail/button_Masuk'))

WebUI.navigateToUrl('https://www.atmago.com/berita-warga/keindahan-danau-toba-sebagai-salah-satu-destinasi-wisata-di-indonesia_1d47d932-61e7-4db8-a190-93735e097ed7')

WebUI.navigateToUrl('https://komunitas.atmago.com/posts/discussion/1d47d932-61e7-4db8-a190-93735e097ed7/edit?t=ZXlKaGJHY2lPaUpJVXpJMU5pSXNJblI1Y0NJNklrcFhWQ0o5LmV5SmxlSEFpT2pFMk5Ea3dPRGM0TkRjc0ltbGtJam9pT0RZM05qTWlMQ0p2Y21sblgybGhkQ0k2TVRZek16TXhPVGcwTnl3aWNtOXNaU0k2SW5WelpYSWlmUS4yZmc4STBPZ3dFZllJamozVlBOdU41cW5VTHBEV1ZNcDlCUXFwbU85M2Y4')

WebUI.setText(findTestObject('AT_Buat Berita/Judul'), 'Keindahan Danau Toba Sebagai Salah Satu Destinasi Wisata di Indonesia!!!')

WebUI.click(findTestObject('AT_Buat Berita/button_Kirim'))

WebUI.click(findTestObject('AT_Buat Berita/Lihat_Postingan'))

