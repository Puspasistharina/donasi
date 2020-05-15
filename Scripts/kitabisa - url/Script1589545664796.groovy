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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://kitabisa.com/')

WebUI.waitForPageLoad(5)

WebUI.navigateToUrl('https://kitabisa.com/campaign/patungansembakocovid')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Kitabisa/Page_Berbagi Makanan Buka Puasa untuk Sesama/button_DONASI SEKARANG'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Kitabisacom - Indonesias Fundraising Platform/div_Rp 10000'))

WebUI.click(findTestObject('Object Repository/Page_Kitabisacom - Indonesias Fundraising Platform/span_Transfer BCA'))

WebUI.click(findTestObject('Object Repository/Page_Kitabisacom - Indonesias Fundraising Platform/span_LANJUTKAN PEMBAYARAN'))

WebUI.setText(findTestObject('Object Repository/Page_Kitabisacom - Indonesias Fundraising Platform/input_atau lengkapi data di bawah ini_fullname'), 
    'Rina Puspasistha')

WebUI.setText(findTestObject('Object Repository/Page_Kitabisacom - Indonesias Fundraising Platform/input_atau lengkapi data di bawah ini_username'), 
    '081180616247')

WebUI.click(findTestObject('Page_Kitabisacom - Indonesias Fundraising Platform/span_LANJUTKAN PEMBAYARAN'))

