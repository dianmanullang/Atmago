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

WebUI.selectOptionByLabel(findTestObject('null'), Provinsi, true)

WebUI.selectOptionByLabel(findTestObject('null'), Kabupaten, true)

WebUI.selectOptionByLabel(findTestObject('null'), Kecamatan, true)

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), Judul)

WebUI.selectOptionByLabel(findTestObject('null'), TglMulai, true)

WebUI.selectOptionByLabel(findTestObject('null'), BulanMulai, true)

WebUI.selectOptionByLabel(findTestObject('null'), TahunMulai, false)

WebUI.selectOptionByLabel(findTestObject('null'), JamMulai, false)

WebUI.selectOptionByLabel(findTestObject('null'), TglSelesai, true)

WebUI.selectOptionByLabel(findTestObject('null'), BulanSelesai, true)

WebUI.selectOptionByLabel(findTestObject('null'), TahunSelesai, true)

WebUI.selectOptionByLabel(findTestObject('null'), JamSelesai, false)

WebUI.setText(findTestObject('null'), Deskripsi)

//WebUI.uploadFile(findTestObject('null'), upload)

WebUI.Upload_file.uploadFile(findTestObject('null'), 'Downloads\\kopi6.jpg')

WebUI.submit(findTestObject('null'))

