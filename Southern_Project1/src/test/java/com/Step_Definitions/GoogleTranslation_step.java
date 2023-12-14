package com.Step_Definitions;

import com.Lip_Globals.Base_class;
import com.Singleton_Design_Pattern.Singleton;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleTranslation_step extends Base_class {

	public static Singleton pom = new Singleton();
	Questionnaire_stepdefinition questionnaireSD = new Questionnaire_stepdefinition();
	JavascriptExecutor js;

	@Given("User launch URL for Google Translation")
	public void user_launch_url_for_google_translation() throws Throwable {
		// geturl("https://staging.southern.mindwave.site/");
		// clickOnElement(pom.getlogin().getalreadysignup());
		// Sleep(3000);
		questionnaireSD.user_launch_url_for_southern_questionnaires();
		Sleep(3000);
	}

	@When("User enters valid {string} in Emailaddres field for Google Translation")
	public void user_enters_valid_in_emailaddres_field_for_google_translation(String string) throws Throwable {
		// Inputvalues(pom.getlogin().getEmail(), "dhanraj+sa@mindwaveventures.com");
		questionnaireSD.user_enters_valid_in_emailaddres_field_for_questionnaires(string);
		sleep(2000);
	}

	@Then("User enters {string} in Passowrd for Google Translation")
	public void user_enters_in_passowrd_for_google_translation(String string) throws Throwable {
		// Inputvalues(pom.getlogin().getPassword(), "Southern@1234");
		questionnaireSD.user_enters_in_passowrd_for_questionnaires(string);
		sleep(3000);
	}

	@Then("User select recaptcha checkbox for Google Translation")
	public void user_select_recaptcha_checkbox_for_google_translation() throws Throwable {
		System.out.println("enter");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)");
		sleep(3000);
		clickOnElement(pom.getlogin().getRecaptcha());
	}

	@Then("Click on Submit button for Google Translation")
	public void click_on_submit_button_for_google_translation() throws Throwable {
		sleep(3000);
		System.out.println("loginbut");

		WebElement button = driver.findElement(By.xpath("//button[text()='Log in']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", button);

		System.out.println("loginbutton");
		sleep(3000);
	}

	@Then("Click on Bento menu")
	public void click_on_bento_menu() throws Throwable {
		clickOnElement(pom.getsoutherngoogletranslation().getGTbentomenu());
		sleep(3000);
	}

	@Then("click on account setting")
	public void click_on_account_setting() throws Throwable {
		clickOnElement(pom.getsoutherngoogletranslation().getGTaccountsetting());
		sleep(3000);
	}

	@Then("click on Profile")
	public void click_on_profile() throws Throwable {
		clickOnElement(pom.getsoutherngoogletranslation().getGTprofile());
		sleep(3000);
	}

	@Then("click on prefered language")
	public void click_on_prefered_language() throws Throwable {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,450)");
		sleep(3000);
		driver.findElement(By.xpath("//form[@class='mw-form-group']/div[4]/label/following-sibling::div/div[2]/span"))
				.click();
		sleep(2000);
		clickOnElement(pom.getsoutherngoogletranslation().getPreferlanguageselected());
	}

	@Then("click on submit for google translation")
	public void click_on_submit_for_google_translation() throws Throwable {
		sleep(3000);

		WebElement element = driver.findElement(By.xpath("//form[@class='mw-form-group']/div[9]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

		sleep(3000);
		driver.findElement(By.xpath("//form[@class='mw-form-group']/div[9]/button")).click();
		sleep(3000);
		WebElement button2 = driver.findElement(By.xpath("//a[@id='success-ok-btn']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", button2);

	}

}
