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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.url_login)

WebUI.maximizeWindow()

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('AT_LoginByEmail/input_Email_email'), GlobalVariable.username)

WebUI.setText(findTestObject('AT_LoginByEmail/input_Password_password'), GlobalVariable.Password)

WebUI.click(findTestObject('AT_LoginByEmail/button_Masuk'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

//WebUI.click(findTestObject('null'))

WebUI.selectOptionByLabel(findTestObject('null'), Provinsi, false)

WebUI.selectOptionByLabel(findTestObject('null'), Kabupaten, false)

WebUI.selectOptionByLabel(findTestObject('null'), Kecamatan, false)

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 'Test Lagi')

WebUI.setText(findTestObject('null'), 'Test Lagi Test Lagi Test Lagi Test Lagi Test Lagi Test Lagi Test Lagi Test Lagi Test Lagi Test Lagi Test Lagi Test Lagi Test Lagi Test Lagi Test Lagi Test Lagi Test Lagi Test Lagi Test Lagi Test Lagi Test Lagi Test Lagi Test Lagi Test Lagi ')

WebUI.click(findTestObject('null'))

WebUI.uploadFile(findTestObject('null'), 'C:\\Users\\win10\\Downloads\\kopi6.jpg')

//WebUI.Upload_file.uploadFile(findTestObject('null'), 'Downloads\\kopi6.jpg')

//WebUI.delay(5)
//WebUI.click(findTestObject('null'))
//WebUI.click(findTestObject('Tulispost/button_Pilih gambar'), 'E:\\KERJA\\coba.JPG')
//WebUI.Upload_file(findTestObject('Tulispost/button_Pilih gambar'), 'E:\\KERJA\\coba.JPG')

WebUI.submit(findTestObject('null'))

