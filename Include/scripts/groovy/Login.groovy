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

import com.kms.katalon.core.webui.common.WebUiCommonHelper

import org.openqa.selenium.JavascriptExecutor

class Login {
	
	WebDriver driver = DriverFactory.getWebDriver()
	
		JavascriptExecutor executor = ((driver) as JavascriptExecutor)
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	/*
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
	 */

	/*
	 @Given("User is on Login Page of VocaGame")
	 def user_is_on_login_page_of_voca_game() {
	 println "a"
	 }
	 @When("User clicks button {string} on Login Page of VocaGame")
	 def user_clicks_button_on_login_page_of_voca_game(String string) {
	 println "b"
	 }
	 @When("User clicks link {string} on Login Page of VocaGame")
	 def user_clicks_link_on_login_page_of_voca_game(String string) {
	 println "e"
	 }
	 @Then("User is directed from Login Page of VocaGame to Registration Page of VocaGame")
	 public void user_is_directed_from_login_page_of_voca_game_to_registration_page_of_voca_game() {
	 println "f"
	 }
	 @Then("User is directed from Login Page of VocaGame to Reset Password Page of VocaGame")
	 public void user_is_directed_from_login_page_of_voca_game_to_reset_password_page_of_voca_game() {
	 println "g"
	 }
	 @Then("the validation messages appears on Login Page of VocaGame")
	 def the_validation_messages_appears_on_login_page_of_voca_game(DataTable table) {
	 List<String> dataL = table.asList(String.class)
	 for (int i ; i<dataL.size(); i++) {
	 println dataL.get(i)
	 }
	 }
	 */

	@Given("User is on Login Page of VocaGame")
	def user_is_on_login_page_of_voca_game() {
		println "a"
		WebUI.openBrowser('https://vocagame.com/account/auth/login')
		WebUI.maximizeWindow()
		WebUI.waitForElementPresent(findTestObject('Login/NomorWhatsAppTextbox'), 120)
		WebUI.verifyElementPresent(findTestObject('Login/NomorWhatsAppTextbox'), 120)
		WebUI.waitForElementPresent(findTestObject('Login/PasswordTextbox'), 120)
		WebUI.verifyElementPresent(findTestObject('Login/PasswordTextbox'), 120)
	}

	@When("User clicks button {string} on Login Page of VocaGame")
	def user_clicks_button_on_login_page_of_voca_game(String string) {
		println "b"
		WebElement login = WebUiCommonHelper.findWebElement(findTestObject('Login/ButtonLogin'),30)
		executor.executeScript("arguments[0].scrollIntoViewIfNeeded()", login);
		
		WebUI.click(findTestObject('Login/ButtonLogin'))
	}


	@When("User puts the following on Login Page of VocaGame")
	def user_puts_the_following_on_login_page_of_voca_game(io.cucumber.datatable.DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		println "e"

		/*
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
		 */


		List<String> dataL = dataTable.asList(String.class)
		for (int i ; i<dataL.size(); i++) {
			println dataL.get(i)
			WebUI.setText(findTestObject('Login/NomorWhatsAppTextbox'), dataL.get(0))
			WebUI.setText(findTestObject('Login/PasswordTextbox'), dataL.get(1))
		}

	}

	@Then("the validation messages appears on Login Page of VocaGame1")
	def the_validation_messages_appears_on_login_page_of_voca_game1(io.cucumber.datatable.DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		println "f"

		WebUI.waitForElementPresent(findTestObject('Login/NomorWhatsAppMessage'), 120)
		WebUI.verifyElementPresent(findTestObject('Login/NomorWhatsAppMessage'), 120)
		String message = WebUI.getText(findTestObject('Login/NomorWhatsAppMessage'))

		WebUI.waitForElementPresent(findTestObject('Login/PasswordMessage'), 120)
		WebUI.verifyElementPresent(findTestObject('Login/PasswordMessage'), 120)
		String message2 = WebUI.getText(findTestObject('Login/PasswordMessage'))

		String result =""
		String result2 = ""
		List<String> dataL = dataTable.asList(String.class)
		for (int i ; i<dataL.size(); i++) {
			println dataL.get(i)
			result = dataL.get(0);
			result2 = dataL.get(1);
		}
		assert result == message
		assert result2 == message2

		//Nomor WhatsApp tidak boleh kosong!
		//Password tidak boleh kosong!
	}

	@Then("the validation messages appears on Login Page of VocaGame2")
	def the_validation_messages_appears_on_login_page_of_voca_game2(io.cucumber.datatable.DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		println "f2"

		WebUI.waitForElementPresent(findTestObject('Login/ValidationPopup'), 120)
		WebUI.verifyElementPresent(findTestObject('Login/ValidationPopup'), 120)
		String message = WebUI.getText(findTestObject('Login/ValidationPopup'))

		String result =""

		List<String> dataL = dataTable.asList(String.class)
		for (int i ; i<dataL.size(); i++) {
			println dataL.get(i)
			result = dataL.get(0);

		}
		assert result == message


		//Wrong password. Verify and try again.
	}

	@Then("the validation messages appears on Login Page of VocaGame3")
	def the_validation_messages_appears_on_login_page_of_voca_game3(io.cucumber.datatable.DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		println "f3"


		WebUI.waitForElementPresent(findTestObject('Login/ValidationPopup'), 120)
		WebUI.verifyElementPresent(findTestObject('Login/ValidationPopup'), 120)
		String message = WebUI.getText(findTestObject('Login/ValidationPopup'))

		String result =""

		List<String> dataL = dataTable.asList(String.class)
		for (int i ; i<dataL.size(); i++) {
			println dataL.get(i)
			result = dataL.get(0);

		}
		assert result == message


		//Phone number not found. Please use a valid, registered number.
	}
}