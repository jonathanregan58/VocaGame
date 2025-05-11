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

class ForgetPasswordandResetPassword {
	WebDriver driver = DriverFactory.getWebDriver()

	JavascriptExecutor executor = ((driver) as JavascriptExecutor)
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	/*
	 @Given("User is on Forget Password Page of VocaGame")
	 def user_is_on_forget_password_page_of_voca_game() {
	 /*
	 System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\user\\\\.katalon\\\\packages\\\\Katalon_Studio_Windows_64-8.6.8\\\\Katalon_Studio_Windows_64-8.6.8\\\\configuration\\\\resources\\\\drivers\\\\chromedriver_win32\\\\chromedriver.exe")
	 ChromeOptions options = new ChromeOptions()
	 options.setExperimentalOption('excludeSwitches', ['enable-automation'])
	 options.setExperimentalOption('useAutomationExtension', false)
	 options.addArguments("–disable-blink-features=AutomationControlled")
	 WebDriver driver = new ChromeDriver(options)
	 DriverFactory.changeWebDriver(driver)
	 */

	/*
	 ChromeOptions options = new ChromeOptions();
	 options.setExperimentalOption("useAutomationExtension", false);
	 WebDriver driver = new ChromeDriver(options);
	 DriverFactory.changeWebDriver(driver)
	 */

	//	WebUI.openBrowser('https://vocagame.com/')
	//	WebUI.maximizeWindow()
	//	WebUI.waitForElementPresent(findTestObject('ForgetPasswordandResetPassword/KirimKodeOTPButton'), 120)
	//	WebUI.waitForElementPresent(findTestObject('ForgetPasswordandResetPassword/NomorWhatsAppTextbox'), 120)
	//}

	/*
	 @When("User clicks button {string} on Forget Password Page of VocaGame1")
	 def user_clicks_button_on_forget_password_page_of_voca_game_when(String string) {
	 WebUI.click(findTestObject('ForgetPasswordandResetPassword/KirimKodeOTPButton'))
	 }
	 @Then("the validation messages appears on Forget Password Page of VocaGame")
	 def the_validation_messages_appears_on_forget_password_page_of_voca_game(io.cucumber.datatable.DataTable dataTable) {
	 }
	 @Given("User types \"{int}\"on Nomor WhatsApp textbox on Forget Password Page of VocaGame")
	 def user_types_on_nomor_whats_app_textbox_on_forget_password_page_of_voca_game(Integer int1) {
	 WebUI.click(findTestObject('ForgetPasswordandResetPassword/NomorWhatsAppTextbox'))
	 WebUI.setText(findTestObject('ForgetPasswordandResetPassword/NomorWhatsAppTextbox'), int1)
	 }
	 @Given("User clicks button {string} on Forget Password Page of VocaGame2")
	 def user_clicks_button_on_forget_password_page_of_voca_game_given(String string) {
	 WebUI.click(findTestObject('ForgetPasswordandResetPassword/KirimKodeOTPButton'))
	 }
	 */

	/*
	 * 
	 @Given("I want to write a step with (.*)")
	 def I_want_to_write_a_step_with_name(String name) {
	 println name
	 }
	 @When("I check for the (\\d+) in step")
	 def I_check_for_the_value_in_step(int value) {
	 println value
	 }
	 @Then("I verify the (.*) in step")
	 def I_verify_the_status_in_step(String status) {
	 println status
	 }
	 * 
	 */

	@Given("User is on Forget Password Page of VocaGame")
	def user_is_on_forget_password_page_of_voca_game() {
		println "a"
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\user\\\\.katalon\\\\packages\\\\Katalon_Studio_Windows_64-8.6.8\\\\Katalon_Studio_Windows_64-8.6.8\\\\configuration\\\\resources\\\\drivers\\\\chromedriver_win32\\\\chromedriver.exe")
		ChromeOptions options = new ChromeOptions()
		options.setExperimentalOption('excludeSwitches', ['enable-automation'])
		options.setExperimentalOption('useAutomationExtension', false)
		options.addArguments("–disable-blink-features=AutomationControlled")
		WebDriver driver = new ChromeDriver(options)
		DriverFactory.changeWebDriver(driver)
		WebUI.openBrowser('https://vocagame.com/account/auth/forgot-password')
		WebUI.maximizeWindow()
		WebUI.waitForElementPresent(findTestObject('ForgetPasswordandResetPassword/KirimKodeOTPButton'), 120)
		WebUI.waitForElementPresent(findTestObject('ForgetPasswordandResetPassword/NomorWhatsAppTextbox'), 120)
	}

	@When("User clicks button {string} on Forget Password Page of VocaGame")
	def void user_clicks_button_on_forget_password_page_of_voca_game(String string) {
		println "b"
		WebElement kirimkodeotp = WebUiCommonHelper.findWebElement(findTestObject('ForgetPasswordandResetPassword/KirimKodeOTPButton'),30)
		executor.executeScript("arguments[0].scrollIntoViewIfNeeded()", kirimkodeotp);

		WebUI.click(findTestObject('ForgetPasswordandResetPassword/KirimKodeOTPButton'))
	}

	@Then("the validation messages appears on Forget Password Page of VocaGame1")
	public void the_validation_messages_appears_on_forget_password_page_of_voca_game1(io.cucumber.datatable.DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		println "c"

		WebUI.waitForElementPresent(findTestObject('ForgetPasswordandResetPassword/PopupValidation'), 120)
		WebUI.verifyElementPresent(findTestObject('ForgetPasswordandResetPassword/PopupValidation'), 120)
		String message = WebUI.getText(findTestObject('ForgetPasswordandResetPassword/PopupValidation'))

		String result =""

		List<String> dataL = dataTable.asList(String.class)
		for (int i ; i<dataL.size(); i++) {
			println dataL.get(i)
			result = dataL.get(0);

		}
		assert result == message
		//phoneNumber should not be empty
	}

	@Then("the validation messages appears on Forget Password Page of VocaGame2")
	public void the_validation_messages_appears_on_forget_password_page_of_voca_game2(io.cucumber.datatable.DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		println "c1"

		WebUI.waitForElementPresent(findTestObject('ForgetPasswordandResetPassword/PopupValidation'), 120)
		WebUI.verifyElementPresent(findTestObject('ForgetPasswordandResetPassword/PopupValidation'), 120)
		String message = WebUI.getText(findTestObject('ForgetPasswordandResetPassword/PopupValidation'))

		String result =""

		List<String> dataL = dataTable.asList(String.class)
		for (int i ; i<dataL.size(); i++) {
			println dataL.get(i)
			result = dataL.get(0);

		}
		assert result == message
		//Account not found, please check your phone number
	}

	@When("User types {string} on Nomor WhatsApp textbox on Forget Password Page of VocaGame")
	public void user_types_on_nomor_whats_app_textbox_on_forget_password_page_of_voca_game(String string) {
		println "d"



		WebUI.setText(findTestObject('ForgetPasswordandResetPassword/NomorWhatsAppTextbox'), string)
	}

	@Then("User is directed to Reset Password Page of VocaGame")
	public void user_is_directed_to_reset_password_page_of_voca_game() {
		println "e"
		WebUI.waitForElementPresent(findTestObject('ForgetPasswordandResetPassword/KodeOTPDigitPertamaTextbox'), 120)
		WebUI.verifyElementPresent(findTestObject('ForgetPasswordandResetPassword/KodeOTPDigitPertamaTextbox'), 120)

		WebUI.waitForElementPresent(findTestObject('ForgetPasswordandResetPassword/KodeOTPDigitKeduaTextbox'), 120)
		WebUI.verifyElementPresent(findTestObject('ForgetPasswordandResetPassword/KodeOTPDigitKeduaTextbox'), 120)

		WebUI.waitForElementPresent(findTestObject('ForgetPasswordandResetPassword/KodeOTPDigitKetigaTextbox'), 120)
		WebUI.verifyElementPresent(findTestObject('ForgetPasswordandResetPassword/KodeOTPDigitKetigaTextbox'), 120)

		WebUI.waitForElementPresent(findTestObject('ForgetPasswordandResetPassword/KodeOTPDigitKeempatTextbox'), 120)
		WebUI.verifyElementPresent(findTestObject('ForgetPasswordandResetPassword/KodeOTPDigitKeempatTextbox'), 120)

		WebUI.waitForElementPresent(findTestObject('ForgetPasswordandResetPassword/KodeOTPDigitKelimaTextbox'), 120)
		WebUI.verifyElementPresent(findTestObject('ForgetPasswordandResetPassword/KodeOTPDigitKelimaTextbox'), 120)

		WebUI.waitForElementPresent(findTestObject('ForgetPasswordandResetPassword/KodeOTPDigitKeenamTextbox'), 120)
		WebUI.verifyElementPresent(findTestObject('ForgetPasswordandResetPassword/KodeOTPDigitKeenamTextbox'), 120)

		WebUI.waitForElementPresent(findTestObject('ForgetPasswordandResetPassword/KonfirmasiKodeOTPButton'), 120)
		WebUI.verifyElementPresent(findTestObject('ForgetPasswordandResetPassword/KonfirmasiKodeOTPButton'), 120)
		String currentUrl = WebUI.getUrl()

		String result = ""

		if (currentUrl == 'https://vocagame.com/account/auth/reset-password') {
			result = "OK"
		}

		assert result == "OK"

		//https://vocagame.com/account/auth/reset-password

	}

	@Given("User is on Reset Password Page of VocaGame")
	public void user_is_on_reset_password_page_of_voca_game() {
		println "f"

		WebUI.openBrowser('https://vocagame.com/account/auth/forgot-password')
		WebUI.maximizeWindow()
		WebUI.waitForElementPresent(findTestObject('ForgetPasswordandResetPassword/KirimKodeOTPButton'), 120)
		WebUI.waitForElementPresent(findTestObject('ForgetPasswordandResetPassword/NomorWhatsAppTextbox'), 120)


		String angka = "82111152597"

		WebUI.setText(findTestObject('ForgetPasswordandResetPassword/NomorWhatsAppTextbox'), angka)

		WebElement kirimkodeotp = WebUiCommonHelper.findWebElement(findTestObject('ForgetPasswordandResetPassword/KirimKodeOTPButton'),30)
		executor.executeScript("arguments[0].scrollIntoViewIfNeeded()", kirimkodeotp);

		WebUI.click(findTestObject('ForgetPasswordandResetPassword/KirimKodeOTPButton'))

		WebUI.waitForElementPresent(findTestObject('ForgetPasswordandResetPassword/KodeOTPDigitPertamaTextbox'), 120)
		WebUI.verifyElementPresent(findTestObject('ForgetPasswordandResetPassword/KodeOTPDigitPertamaTextbox'), 120)

		WebUI.waitForElementPresent(findTestObject('ForgetPasswordandResetPassword/KodeOTPDigitKeduaTextbox'), 120)
		WebUI.verifyElementPresent(findTestObject('ForgetPasswordandResetPassword/KodeOTPDigitKeduaTextbox'), 120)

		WebUI.waitForElementPresent(findTestObject('ForgetPasswordandResetPassword/KodeOTPDigitKetigaTextbox'), 120)
		WebUI.verifyElementPresent(findTestObject('ForgetPasswordandResetPassword/KodeOTPDigitKetigaTextbox'), 120)

		WebUI.waitForElementPresent(findTestObject('ForgetPasswordandResetPassword/KodeOTPDigitKeempatTextbox'), 120)
		WebUI.verifyElementPresent(findTestObject('ForgetPasswordandResetPassword/KodeOTPDigitKeempatTextbox'), 120)

		WebUI.waitForElementPresent(findTestObject('ForgetPasswordandResetPassword/KodeOTPDigitKelimaTextbox'), 120)
		WebUI.verifyElementPresent(findTestObject('ForgetPasswordandResetPassword/KodeOTPDigitKelimaTextbox'), 120)

		WebUI.waitForElementPresent(findTestObject('ForgetPasswordandResetPassword/KodeOTPDigitKeenamTextbox'), 120)
		WebUI.verifyElementPresent(findTestObject('ForgetPasswordandResetPassword/KodeOTPDigitKeenamTextbox'), 120)

		WebUI.waitForElementPresent(findTestObject('ForgetPasswordandResetPassword/KonfirmasiKodeOTPButton'), 120)
		WebUI.verifyElementPresent(findTestObject('ForgetPasswordandResetPassword/KonfirmasiKodeOTPButton'), 120)
		String currentUrl = WebUI.getUrl()

		String result = ""

		if (currentUrl == 'https://vocagame.com/account/auth/reset-password') {
			result = "OK"
		}

		assert result == "OK"


	}

	@When("User types \"{int}\"on kode OTP textbox on Reset Password Page of VocaGame")
	public void user_types_on_kode_otp_textbox_on_reset_password_page_of_voca_game(Integer int1) {
		println "g"
		WebUI.setText(findTestObject('ForgetPasswordandResetPassword/KodeOTPDigitPertamaTextbox'), 7)
		WebUI.setText(findTestObject('ForgetPasswordandResetPassword/KodeOTPDigitKeduaTextbox'), 7)
		WebUI.setText(findTestObject('ForgetPasswordandResetPassword/KodeOTPDigitKetigaTextbox'), 7)
		WebUI.setText(findTestObject('ForgetPasswordandResetPassword/KodeOTPDigitKeempatTextbox'), 7)
		WebUI.setText(findTestObject('ForgetPasswordandResetPassword/KodeOTPDigitKelimaTextbox'), 7)
		WebUI.setText(findTestObject('ForgetPasswordandResetPassword/KodeOTPDigitKeenamTextbox'), 7)
	}

	@When("User clicks button {string} on Reset Password Page of VocaGame")
	public void user_clicks_button_on_reset_password_page_of_voca_game(String string) {
		println "h"
		WebUI.click(findTestObject('ForgetPasswordandResetPassword/KonfirmasiKodeOTPButton'))
	}

	@Then("the validation messages appears on Reset Password Page of VocaGame")
	public void the_validation_messages_appears_on_reset_password_page_of_voca_game(io.cucumber.datatable.DataTable dataTable) {
		println "i"
		
		WebUI.waitForElementPresent(findTestObject('ForgetPasswordandResetPassword/PopupValidation'), 120)
		WebUI.verifyElementPresent(findTestObject('ForgetPasswordandResetPassword/PopupValidation'), 120)
		String message = WebUI.getText(findTestObject('ForgetPasswordandResetPassword/PopupValidation'))

		String result =""

		List<String> dataL = dataTable.asList(String.class)
		for (int i ; i<dataL.size(); i++) {
			println dataL.get(i)
			result = dataL.get(0);

		}
		assert result == message
		//The OTP you entered is invalid. Please double-check the OTP and try again.
	}
}