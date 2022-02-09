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

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/AT_LoginByEmail/a_Masuk dengan Email'))

WebUI.setText(findTestObject('Object Repository/AT_LoginByEmail/input_Email_email'), GlobalVariable.username)

WebUI.setText(findTestObject('Object Repository/Event/Page_Masuk  AtmaGo/input_Password_password'), GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/Event/Page_Masuk  AtmaGo/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Event/Page_Beranda  AtmaGo/a_Ada info apa hari ini'))

WebUI.click(findTestObject('Object Repository/Event/Page_Pilih Jenis Postingan  AtmaGo/a_AcaraBagikan informasi acara dan undang warga'))

WebUI.setText(findTestObject('Object Repository/Event/AT_Buat Acara/input__subject'), 'Ini hanya contoh')

WebUI.click(findTestObject('Object Repository/Event/Page_AtmaGo/button_1 Des 2021'))

WebUI.click(findTestObject('Object Repository/Event/Page_AtmaGo/button_15'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Event/Page_AtmaGo/select_Pukul 800900100011001200130014001500_e14bfe'), 
    '13', true)

WebUI.click(findTestObject('Event/Page_AtmaGo/button_15 Des 2021'))

WebUI.click(findTestObject('Object Repository/Event/Page_AtmaGo/button_18'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Event/Page_AtmaGo/select_Pukul 800900100011001200130014001500_e14bfe_1'), 
    '20', true)

WebUI.setText(findTestObject('Event/Page_AtmaGo/textarea__post_text'), 'Hanya Coba Saja')

WebUI.setText(findTestObject('Event/Page_AtmaGo/input__svelte-17qb5ew'), Provinsi)

WebUI.sendKeys(findTestObject('Event/Page_AtmaGo/input__svelte-17qb5ew'), Keys.chord(Keys.DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Event/Page_AtmaGo/input__Kabupaten'), Kabupaten)

WebUI.sendKeys(findTestObject('AT_Buat Berita/input__Kabupaten'), Keys.chord(Keys.DOWN, Keys.ENTER))

WebUI.setText(findTestObject('AT_Buat Berita/input__Kecamatan'), Kecamatan)

WebUI.sendKeys(findTestObject('AT_Buat Berita/input__Kecamatan'), Keys.chord(Keys.DOWN, Keys.ENTER))

WebUI.uploadFile(findTestObject('AT_Buat Berita/div_Masukkan gambar'), upload)

WebUI.submit(findTestObject('AT_Buat Berita/button_Kirim'))

WebUI.click(findTestObject('Event/Page_AtmaGo/Lihat_Postingan'))

