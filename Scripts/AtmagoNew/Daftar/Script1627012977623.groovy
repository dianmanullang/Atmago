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

WebUI.openBrowser(GlobalVariable.url_daftar)

WebUI.maximizeWindow()

WebUI.click(findTestObject('AT_Daftar Facebook/a_Daftar dengan Facebook'))

WebUI.setText(findTestObject('AT_Daftar Facebook/Email'), GlobalVariable.email_fb)

WebUI.setText(findTestObject('AT_Daftar Facebook/Pwd'), GlobalVariable.pwd)

WebUI.click(findTestObject('AT_Daftar Facebook/button_Login'))

WebUI.selectOptionByValue(findTestObject('AT_Daftar Facebook/select_Pilih.PriaWanita'), JenisKelamin, false)

WebUI.selectOptionByValue(findTestObject('AT_Daftar Facebook/tgl_lhir'), Tanggal, false)

WebUI.selectOptionByValue(findTestObject('AT_Daftar Facebook/bln'), Bulan, false)

WebUI.selectOptionByValue(findTestObject('AT_Daftar Facebook/tahun'), Tahun, false)

WebUI.submit(findTestObject('AT_Daftar Facebook/button_Simpan'))

