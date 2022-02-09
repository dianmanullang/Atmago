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

WebUI.click(findTestObject('AT_LoginByEmail/a_Masuk dengan Email'))

WebUI.setText(findTestObject('AT_LoginByEmail/input_Email_email'), 'diansimanullang07@gmail.com')

WebUI.setEncryptedText(findTestObject('AT_LoginByEmail/input_Password_password'), 'oTLW0XZ5ao/23BivDlhrlA==')

WebUI.click(findTestObject('AT_LoginByEmail/button_Masuk'))

WebUI.click(findTestObject('AT_Buat Aksi/a_Komunitas'))

WebUI.click(findTestObject('AT_Buat Aksi/Page_Komunitas AtmaGo/img_PUSKESMAS KECAMATAN TANJUNG_ag-avatar--size-1'))

WebUI.click(findTestObject('AT_Buat Aksi/Page_PUSKESMAS KECAMATAN TANJUNG  AtmaGo/a_Aksi'))

WebUI.click(findTestObject('AT_Buat Aksi/Page_PUSKESMAS KECAMATAN TANJUNG  AtmaGo/a_Yuk, buat Aksi baru di komunitas'))

WebUI.setText(findTestObject('AT_Buat Aksi/input__subject'), 'Test Action')

WebUI.setText(findTestObject('AT_Buat Aksi/textarea__post_text'), 'Ini adalah Contoh dari Aksi')

WebUI.setText(findTestObject('AT_Buat Aksi/input__svelte-17qb5ew'), 'Sumatera Utara')

WebUI.sendKeys(findTestObject('AT_Buat Aksi/input__svelte-17qb5ew'), Keys.chord(Keys.DOWN, Keys.ENTER))

WebUI.setText(findTestObject('AT_Buat Aksi/input__Kabupaten'), 'Medan Kota')

WebUI.sendKeys(findTestObject('AT_Buat Aksi/input__Kabupaten'), Keys.chord(Keys.DOWN, Keys.ENTER))

WebUI.setText(findTestObject('AT_Buat Aksi/input__Kecamatan'), 'Medan Kota')

WebUI.sendKeys(findTestObject('AT_Buat Aksi/input__Kecamatan'), Keys.chord(Keys.DOWN, Keys.ENTER))

WebUI.click(findTestObject('AT_Buat Aksi/button_1 Des 2021'))

WebUI.click(findTestObject('AT_Buat Aksi/button_24'))

WebUI.selectOptionByValue(findTestObject('AT_Buat Aksi/select_Pukul 800900100011001200130014001500_e14bfe'), '11', 
    true)

WebUI.click(findTestObject('AT_Buat Aksi/button_24 Des 2021'))

WebUI.click(findTestObject('AT_Buat Aksi/button_29'))

WebUI.selectOptionByValue(findTestObject('AT_Buat Aksi/select_Pukul 800900100011001200130014001500_e14bfe_1'), '19', 
    true)

WebUI.setText(findTestObject('AT_Buat Aksi/input_Jumlah_target_quantity'), '500')

WebUI.selectOptionByValue(findTestObject('AT_Buat Aksi/select_pohon kg sampah orang Rupiah barang'), '1', true)

WebUI.uploadFile(findTestObject('AT_Buat Aksi/div_Masukkan gambar'), 'D:\\a.jpg')

WebUI.click(findTestObject('AT_Buat Aksi/button_Kirim'))

WebUI.click(findTestObject('AT_Buat Aksi/Lihat_Postingan'))

