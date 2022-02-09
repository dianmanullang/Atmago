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

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('AT_LoginByEmail/input_Email_email'), GlobalVariable.username)

WebUI.setText(findTestObject('AT_LoginByEmail/input_Password_password'), GlobalVariable.Password)

WebUI.click(findTestObject('AT_LoginByEmail/button_Masuk'))

WebUI.click(findTestObject('AT_Buat Laporan(Bencana)/a_Tulis post'))

WebUI.click(findTestObject('AT_Buat Berita/a_Posting sebagai Admin Komunitas'))

//WebUI.click(findTestObject('AT_Buat Berita/a_Komunitas Peduli Alam Indonesia'))

WebUI.click(findTestObject('AT_Buat Berita/Pilih Berita Warga'))

WebUI.setText(findTestObject('AT_Buat Berita/Judul'), Judul)

WebUI.setText(findTestObject('AT_Buat Berita/Deskripsi'), keterangan)

WebUI.setText(findTestObject('AT_Buat Berita/input__svelte-17qb5ew'), provinsi)

WebUI.sendKeys(findTestObject('AT_Buat Berita/input__svelte-17qb5ew'), Keys.chord(Keys.DOWN, Keys.ENTER))

WebUI.setText(findTestObject('AT_Buat Berita/input__Kabupaten'), kabupaten)

WebUI.sendKeys(findTestObject('AT_Buat Berita/input__Kabupaten'), Keys.chord(Keys.DOWN, Keys.ENTER))

WebUI.setText(findTestObject('AT_Buat Berita/input__Kecamatan'), kecamatan)

WebUI.sendKeys(findTestObject('AT_Buat Berita/input__Kecamatan'), Keys.chord(Keys.DOWN, Keys.ENTER))

WebUI.setText(findTestObject('AT_Buat Berita/input__Topik'), Topik)

WebUI.sendKeys(findTestObject('AT_Buat Berita/input__Topik'), Keys.chord(Keys.DOWN, Keys.ENTER))

WebUI.uploadFile(findTestObject('AT_Buat Berita/div_Masukkan gambar'), gambar)

WebUI.submit(findTestObject('AT_Buat Berita/button_Kirim'))

