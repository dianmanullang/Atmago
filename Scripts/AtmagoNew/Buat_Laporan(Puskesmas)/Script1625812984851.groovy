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

WebUI.click(findTestObject('AT_LoginByEmail/a_Masuk dengan Email'))

WebUI.setText(findTestObject('AT_LoginByEmail/input_Email_email'), GlobalVariable.username)

WebUI.setText(findTestObject('AT_LoginByEmail/input_Password_password'), GlobalVariable.Password)

WebUI.click(findTestObject('AT_LoginByEmail/button_Masuk'))

//WebUI.click(findTestObject('AT_Buat Laporan(Bencana)/PostingSebagai User'))
WebUI.navigateToUrl(GlobalVariable.url_create)

WebUI.click(findTestObject('AT_Buat Laporan(Bencana)/a_Laporan WargaLaporkan masalah yang terjadi'))

WebUI.click(findTestObject('AT_Layanan Puskesmas/div_Laporan Puskesmas'))

WebUI.click(findTestObject('AT_Layanan Puskesmas/div_Persyaratan dan Prosedur'))

WebUI.click(findTestObject('AT_Layanan Puskesmas/button_Pilih Puskesmas'))

WebUI.click(findTestObject('AT_Layanan Puskesmas/button_Pilih'))

WebUI.setText(findTestObject('AT_Buat Laporan(Bencana)/textarea__post_text'), Keterangan)

//WebUI.setText(findTestObject('AT_Buat Berita/input__svelte-17qb5ew'), Provinsi)
//WebUI.sendKeys(findTestObject('AT_Buat Berita/input__svelte-17qb5ew'), Keys.chord(Keys.DOWN, Keys.ENTER))
//WebUI.setText(findTestObject('AT_Buat Berita/input__Kabupaten'), Kabupaten)
//WebUI.sendKeys(findTestObject('AT_Buat Berita/input__Kabupaten'), Keys.chord(Keys.DOWN, Keys.ENTER))
//WebUI.setText(findTestObject('AT_Buat Berita/input__Kecamatan'), Kecamatan)
//WebUI.sendKeys(findTestObject('AT_Buat Berita/input__Kecamatan'), Keys.chord(Keys.DOWN, Keys.ENTER))
WebUI.uploadFile(findTestObject('AT_Buat Laporan(Bencana)/div_Masukkan gambar'), filepath)

//String path1 = 'C:/Users/win10/Downloads/vaksin.jpg'
//String path2 = 'C:/Users/win10/Downloads/vaksin2.jpg'
//String finalPath = (path1 + '\n') + path2
//WebUI.uploadFile(findTestObject('AT_Buat Laporan(Bencana)/div_Masukkan gambar'), finalPath)
WebUI.check(findTestObject('AT_Layanan Puskesmas/input_Kirim secara anonim_svelte-os1c6e'))

WebUI.click(findTestObject('AT_Layanan Puskesmas/button_Kirim'))

WebUI.click(findTestObject('AT_Layanan Puskesmas/Lihat_Postingan'))

