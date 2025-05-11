import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

import io.cucumber.datatable.*;


import org.openqa.selenium.WebDriver

import com.kms.katalon.core.webui.driver.DriverFactory

import org.openqa.selenium.By

import org.openqa.selenium.WebElement

import org.openqa.selenium.interactions.Actions

import com.kms.katalon.core.webui.common.WebUiCommonHelper

import org.openqa.selenium.JavascriptExecutor

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver



class MobileLegends {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	WebDriver driver = DriverFactory.getWebDriver()

	JavascriptExecutor executor = ((driver) as JavascriptExecutor)
	@Given("User is on Mobile Legends Page of VocaGame")
	def user_is_on_mobile_legends_page_of_voca_game() {
		println "a"
		WebUI.openBrowser('https://vocagame.com/mobile-legends-bang-bang')
		WebUI.maximizeWindow()
	}

	@Then("Konfirmasi Top Up Button on Mobile Legends Page of VocaGame is disabled")
	def konfirmasi_top_up_button_on_mobile_legends_page_of_voca_game_is_disabled() {
		println "b"
		WebElement KonfirmasiTopUpButton = WebUiCommonHelper.findWebElement(findTestObject('Mobile Legends/KonfirmasiTopUpButton'),30)

		executor.executeScript("arguments[0].scrollIntoViewIfNeeded()", KonfirmasiTopUpButton);

		WebUI.verifyElementNotClickable(findTestObject('Mobile Legends/KonfirmasiTopUpButton'))
	}

	@When("User chooses {int} Diamonds on Mobile Legends Page of VocaGame")
	def user_chooses_diamonds_on_mobile_legends_page_of_voca_game(Integer int1) {
		println "c"
		WebElement threediamonds = WebUiCommonHelper.findWebElement(findTestObject('Mobile Legends/3DiamondsArticle'),30)
		executor.executeScript("arguments[0].scrollIntoViewIfNeeded()", threediamonds);
		WebUI.click(findTestObject('Mobile Legends/3DiamondsArticle'))
	}

	@When("User types {string} on Kode Voucher textbox on Mobile Legends Page of VocaGame")
	def user_types_on_kode_voucher_textbox_on_mobile_legends_page_of_voca_game(String string) {
		println "d"
	}

	@When("User clicks Pakai Kode Voucher Button on Mobile Legends Page of VocaGame")
	def user_clicks_pakai_kode_voucher_button_on_mobile_legends_page_of_voca_game() {
		println "e"
		WebElement pakaikodevoucherbutton = WebUiCommonHelper.findWebElement(findTestObject('Mobile Legends/PakaiKodeVoucherButton'),30)
		executor.executeScript("arguments[0].scrollIntoViewIfNeeded()", pakaikodevoucherbutton);
		WebUI.click(findTestObject('Mobile Legends/PakaiKodeVoucherButton'))
	}

	@Then("the validation messages appears on Mobile Legends Page of VocaGame1")
	def the_validation_messages_appears_on_mobile_legends_page_of_voca_game1(io.cucumber.datatable.DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		println "f"
		String result =""
		println "f2"
		WebUI.waitForElementPresent(findTestObject('MobileLegends/PopupValidation'), 120)
		WebUI.verifyElementPresent(findTestObject('MobileLegends/PopupValidation'), 120)
		String message = WebUI.getText(findTestObject('MobileLegends/PopupValidation'))
		println(message)
		List<String> dataL = dataTable.asList(String.class)
		for (int i ; i<dataL.size(); i++) {
			println dataL.get(i)
			result = dataL.get(0);
		}

		assert message == result
		//"Kode voucher AB tidak ditemukan"
	}

	@Then("the validation messages appears on Mobile Legends Page of VocaGame2")
	def the_validation_messages_appears_on_mobile_legends_page_of_voca_game2(io.cucumber.datatable.DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		String result =""
		println "f2"
		WebUI.waitForElementPresent(findTestObject('MobileLegends/PopupValidation'), 120)
		WebUI.verifyElementPresent(findTestObject('MobileLegends/PopupValidation'), 120)
		String message = WebUI.getText(findTestObject('MobileLegends/PopupValidation'))
		println(message)
		List<String> dataL = dataTable.asList(String.class)
		for (int i ; i<dataL.size(); i++) {
			println dataL.get(i)
			result = dataL.get(0);
		}

		assert message == result
		//"ID advanced server"
	}

	@When("User types {string} on User ID textbox on Mobile Legends Page of VocaGame")
	def user_types_on_user_id_textbox_on_mobile_legends_page_of_voca_game(String string) {
		// Write code here that turns the phrase above into concrete actions
		println "g"
		WebElement useridtextbox = WebUiCommonHelper.findWebElement(findTestObject('MobileLegends/UserIDTextbox'),30)
		executor.executeScript("arguments[0].scrollIntoViewIfNeeded()", useridtextbox);
		WebUI.setText(findTestObject('MobileLegends/UserIDTextbox'), string)
	}

	@When("User types {string} on Zone ID textbox on Mobile Legends Page of VocaGame")
	def user_types_on_zone_id_textbox_on_mobile_legends_page_of_voca_game(String string) {
		// Write code here that turns the phrase above into concrete actions
		println "h"
		WebElement zoneidtextbox = WebUiCommonHelper.findWebElement(findTestObject('MobileLegends/ZoneIDTextbox'),30)
		executor.executeScript("arguments[0].scrollIntoViewIfNeeded()", zoneidtextbox);
		WebUI.setText(findTestObject('MobileLegends/ZoneIDTextbox'), string)
	}

	@When("User types {string} on Whatsapp textbox on Mobile Legends Page of VocaGame")
	def user_types_on_whatsapp_textbox_on_mobile_legends_page_of_voca_game(String string) {
		// Write code here that turns the phrase above into concrete actions
		println "i"
		WebElement nomorwhatsapptextbox = WebUiCommonHelper.findWebElement(findTestObject('MobileLegends/NomorWhatsAppTextbox'),30)
		executor.executeScript("arguments[0].scrollIntoViewIfNeeded()", nomorwhatsapptextbox);
		WebUI.setText(findTestObject('MobileLegends/NomorWhatsAppTextbox'), string)
	}

	@When("User clicks QRIS as payment on Mobile Legends Page of VocaGame")
	def user_clicks_qris_as_payment_on_mobile_legends_page_of_voca_game() {
		// Write code here that turns the phrase above into concrete actions
		println "j"
		WebElement qrisbutton = WebUiCommonHelper.findWebElement(findTestObject('MobileLegends/QRISButton'),30)
		executor.executeScript("arguments[0].scrollIntoViewIfNeeded()", qrisbutton);
		executor.executeScript('arguments[0].click()', qrisbutton)
	}

	@When("User clicks Konfirmasi Top Up Button on Mobile Legends Page of VocaGame")
	def user_clicks_konfirmasi_top_up_button_on_mobile_legends_page_of_voca_game() {
		// Write code here that turns the phrase above into concrete actions
		println "k"
		WebElement qrisdiv = WebUiCommonHelper.findWebElement(findTestObject('MobileLegends/QRISDiv'),30)
		executor.executeScript("arguments[0].scrollIntoViewIfNeeded()", qrisdiv);
		executor.executeScript('arguments[0].click()', qrisdiv)
	}
}