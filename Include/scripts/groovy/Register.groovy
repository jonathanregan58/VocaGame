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
import io.cucumber.datatable.DataTable

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

import org.openqa.selenium.WebDriver

import com.kms.katalon.core.webui.driver.DriverFactory

import org.openqa.selenium.By

import org.openqa.selenium.WebElement

import org.openqa.selenium.interactions.Actions

import com.kms.katalon.core.webui.common.WebUiCommonHelper

import org.openqa.selenium.JavascriptExecutor

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.datatable.*;


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

class Register {

	WebDriver driver = DriverFactory.getWebDriver()

	JavascriptExecutor executor = ((driver) as JavascriptExecutor)

	/*
	 @Given("User is on Register Page of VocaGame")
	 def user_is_on_register_page_of_voca_game() {
	 println "a1"
	 }
	 @When("User clicks button {string} on Register Page of VocaGame")
	 def user_clicks_button_on_register_page_of_voca_game(String string) {
	 println "a2"
	 }
	 @Then("the validation messages appears on Register Page of VocaGame")
	 def the_validation_messages_appears_on_register_page_of_voca_game(DataTable table) {
	 List<String> dataL = table.asList(String.class)
	 for (int i ; i<dataL.size(); i++) {
	 println dataL.get(i)
	 }
	 }
	 */


	@Given("User is on Register Page of VocaGame")
	def user_is_on_register_page_of_voca_game() {
		println "a"


		WebUI.openBrowser('https://vocagame.com/account/auth/register')
		WebUI.maximizeWindow()
	}

	@When("User clicks button {string} on Register Page of VocaGame1")
	def user_clicks_button_on_register_page_of_voca_game1(String string) {
		println "b"
	}

	@Then("the validation messages appears on Register Page of VocaGame1")
	def the_validation_messages_appears_on_register_page_of_voca_game1(io.cucumber.datatable.DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		println "c"
		
		WebUI.waitForElementPresent(findTestObject('Register/NamaDepanMessage'), 120)
		WebUI.verifyElementPresent(findTestObject('Register/NamaDepanMessage'), 120)
		
		String message = WebUI.getText(findTestObject('Register/NamaDepanMessage'))
		
		WebUI.waitForElementPresent(findTestObject('Register/NamaBelakangMessage'), 120)
		WebUI.verifyElementPresent(findTestObject('Register/NamaBelakangMessage'), 120)
		
		String message1 = WebUI.getText(findTestObject('Register/NamaBelakangMessage'))
		
		WebUI.waitForElementPresent(findTestObject('Register/NomorWhatsAppMessage'), 120)
		WebUI.verifyElementPresent(findTestObject('Register/NomorWhatsAppMessage'), 120)
		
		String message2 = WebUI.getText(findTestObject('Register/NomorWhatsAppMessage'))
		
		WebUI.waitForElementPresent(findTestObject('Register/PasswordMessage'), 120)
		WebUI.verifyElementPresent(findTestObject('Register/PasswordMessage'), 120)
		
		String message3 = WebUI.getText(findTestObject('Register/PasswordMessage'))
		
		WebUI.waitForElementPresent(findTestObject('Register/KonfirmasiPasswordMessage'), 120)
		WebUI.verifyElementPresent(findTestObject('Register/KonfirmasiPasswordMessage'), 120)
		
		String message4 = WebUI.getText(findTestObject('Register/KonfirmasiPasswordMessage'))
		
		String result =""
		String result1 =""
		String result2 =""
		String result3 =""
		String result4 =""
		
		List<String> dataL = dataTable.asList(String.class)
		for (int i ; i<dataL.size(); i++) {
			println dataL.get(i)
			result = dataL.get(0);
			result1 = dataL.get(1);
			result2 = dataL.get(2);
			result3 = dataL.get(3);
			result4 = dataL.get(4);
		}
		assert result == message
		assert result1 == message1
		assert result2 == message2
		assert result3 == message3
		assert result4 == message4
		/*
		 |Nama Depan tidak boleh kosong!|
      |Nama Belakang tidak boleh kosong!|
      |Nomor WhatsApp tidak boleh kosong!|
      |Password tidak boleh kosong!|
      |Konfirmasi Password tidak boleh kosong!|
		 */
		
	}

	@Then("the validation messages appears on Register Page of VocaGame2")
	def the_validation_messages_appears_on_register_page_of_voca_game2(io.cucumber.datatable.DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		println "c1"

		WebUI.waitForElementPresent(findTestObject('Register/PopUpValidation'), 120)
		WebUI.verifyElementPresent(findTestObject('Register/PopUpValidation'), 120)
		
		String message = WebUI.getText(findTestObject('Register/PopUpValidation'))
		
		String result =""
		
		List<String> dataL = dataTable.asList(String.class)
		for (int i ; i<dataL.size(); i++) {
			println dataL.get(i)
			result = dataL.get(0);
			
		}
		assert result == message
		//Phone number is already registered. Please use a different phone number.
	}

	@Then("the validation messages appears on Register Page of VocaGame3")
	def the_validation_messages_appears_on_register_page_of_voca_game3(io.cucumber.datatable.DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		println "c2"
		
		WebUI.waitForElementPresent(findTestObject('Register/KonfirmasiPasswordMessage'), 120)
		WebUI.verifyElementPresent(findTestObject('Register/KonfirmasiPasswordMessage'), 120)
		
		String message = WebUI.getText(findTestObject('Register/KonfirmasiPasswordMessage'))
		
		String result =""
		
		List<String> dataL = dataTable.asList(String.class)
		for (int i ; i<dataL.size(); i++) {
			println dataL.get(i)
			result = dataL.get(0);
			
		}
		assert result == message
		//Password dan Konfirmasi Password tidak sesuai
	}

	@When("User inputs the following on Register Page of VocaGame")
	def user_inputs_the_following_on_register_page_of_voca_game(io.cucumber.datatable.DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		println "d"
		List<String> dataL = dataTable.asList(String.class)
		for (int i ; i<dataL.size(); i++) {
			println dataL.get(i)
			WebElement namadepan = WebUiCommonHelper.findWebElement(findTestObject('Register/NamaDepanTextbox'),30)
			executor.executeScript("arguments[0].scrollIntoViewIfNeeded()", namadepan);

			WebUI.setText(findTestObject('Register/NamaDepanTextbox'), dataL.get(0))

			WebElement namabelakang = WebUiCommonHelper.findWebElement(findTestObject('Register/NamaBelakangTextbox'),30)
			executor.executeScript("arguments[0].scrollIntoViewIfNeeded()", namabelakang);

			WebUI.setText(findTestObject('Register/NamaBelakangTextbox'), dataL.get(1))

			WebElement nomorwhatsapp = WebUiCommonHelper.findWebElement(findTestObject('Register/NomorWhatsAppTextbox'),30)
			executor.executeScript("arguments[0].scrollIntoViewIfNeeded()", nomorwhatsapp);

			WebUI.setText(findTestObject('Register/NomorWhatsAppTextbox'), dataL.get(2))

			WebElement password = WebUiCommonHelper.findWebElement(findTestObject('Register/PasswordTextbox'),30)
			executor.executeScript("arguments[0].scrollIntoViewIfNeeded()", password);

			WebUI.setText(findTestObject('Register/PasswordTextbox'), dataL.get(3))


			WebElement konfirmasipassword = WebUiCommonHelper.findWebElement(findTestObject('Register/KonfirmasiPasswordTextbox'),30)
			executor.executeScript("arguments[0].scrollIntoViewIfNeeded()", konfirmasipassword);
			WebUI.setText(findTestObject('Register/KonfirmasiPasswordTextbox'), dataL.get(4))
		}
		/*
		 |Jonathan|
		 |Regan|
		 |82111152597|
		 |abcdef58|
		 |abcdef58|
		 */

		/*
		 |Jonathan|
		 |Regan|
		 |82111152597|
		 |abcdef58|
		 |abcdef59|
		 */
	}

	@When("User clicks {string} button on Register Page of VocaGame2")
	def user_clicks_button_on_register_page_of_voca_game2(String string) {
		println "e"
		WebUI.waitForElementPresent(findTestObject('Register/DaftarSekarangButton'), 120)
		WebUI.verifyElementPresent(findTestObject('Register/DaftarSekarangButton'), 120)
		WebUI.click(findTestObject('Register/DaftarSekarangButton'))
	}

	@Then("{string} button on Register Page of VocaGame is disabled")
	def button_on_register_page_of_voca_game_is_disabled(String string) {
		// Write code here that turns the phrase above into concrete actions
		println "f"
		WebUI.waitForElementPresent(findTestObject('Register/DaftarSekarangButton'), 120)
		WebUI.verifyElementPresent(findTestObject('Register/DaftarSekarangButton'), 120)
		WebUI.verifyElementNotClickable(findTestObject('Register/DaftarSekarangButton'))

	}
}