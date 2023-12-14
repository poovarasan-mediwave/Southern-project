package com.Step_Definitions;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;

import com.Configuration_Reader.FileReaderManager;
import com.Lip_Globals.Base_class;
import com.Singleton_Design_Pattern.Singleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountSettings_step extends Base_class {

	public static Singleton sdp = new Singleton();

	@Given("User2 launchs the chrome browser to view southern parent portal")
	public void user2_launchs_the_chrome_browser_to_view_southern_parent_portal() throws InterruptedException {
		get_Driver("Chrome");
		Sleep(2000);
		geturl("https://staging.southern.mindwave.site/");
	}

	@When("User2 need to clicks AlreadySignUp link")
	public void user2_need_to_clicks_already_sign_up_link() {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getInstanceLog_In().getAlreadySignUp());
	}

	@When("User2 enter emailaddress in the {string} In Email Field")
	public void user2_enter_emailaddress_in_the_in_email_field(String string) throws IOException {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		String email = FileReaderManager.getInstanceCR().getLoginemail();
		Inputvalues(sdp.getInstanceLog_In().getEmail(), email);
	}

	@When("User2 enter password in the {string} In Password Field")
	public void user2_enter_password_in_the_in_password_field(String string) throws IOException, InterruptedException {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		String Password = FileReaderManager.getInstanceCR().getLoginpassword();
		Inputvalues(sdp.getInstanceLog_In().getPassword(), Password);
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)");
		Thread.sleep(3000);
		clickOnElement(sdp.getChild_Flow().getRecaptcha());
		Thread.sleep(3000);

	}

	@When("User2 click now clicks the Login button")
	public void user2_click_now_clicks_the_login_button() throws InterruptedException {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getInstanceFeed_Form().getLogin());
		Sleep(20000);
	}

	@Then("User2 navigated to Home Page success")
	public void user2_navigated_to_home_page_success() throws InterruptedException {
		String pageTitle = "Dashboard";

		if (driver.getTitle().equalsIgnoreCase(pageTitle)) {

			System.out.println("Login Successfull");
			Sleep(7000);
		} else

			System.out.println("Login UnSuccessfull");
		Sleep(20000);
	}

	@Given("User clicks bento menu")
	public void user_clicks_bento_menu() throws InterruptedException {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getInstanceFeed_Form().getBentoMenu());
		Sleep(1000);
	}

	@Then("user clicks feedback menu")
	public void user_clicks_feedback_menu() throws InterruptedException {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getInstanceFeed_Form().getFeedbackmenu());
		Sleep(1000);
	}

	@Then("user enters {string} for feedback")
	public void user_enters_for_feedback(String string) throws InterruptedException, IOException {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		String SubjectField = FileReaderManager.getInstanceCR().getSubjectField();
		Inputvalues(sdp.getInstanceFeed_Form().getSubjectField(), SubjectField);
		Sleep(1000);
	}

	@Then("user enter {string} for feedback")
	public void user_enter_for_feedback(String string) throws InterruptedException, IOException {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		String SuggestionsField = FileReaderManager.getInstanceCR().getSuggestionsField();
		Inputvalues(sdp.getInstanceFeed_Form().getSuggestionsField(), SuggestionsField);
		Sleep(1000);
	}

	@Then("User clicks submit button")
	public void user_clicks_submit_button() throws InterruptedException {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getInstanceFeed_Form().getSubmitFeedback());
		Sleep(1000);
	}

	@Then("user clicks Okay button")
	public void user_clicks_okay_button() throws Exception {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getInstanceFeed_Form().getOkayButton());
		System.out.println("feedback form submitted");
		Sleep(1000);
		screenshot("FeedbackForm.png");
	}

	@Given("User clicks bento menu to click profile")
	public void user_clicks_bento_menu_to_click_profile() {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getInstanceFeed_Form().getBentoMenu());
	}

	@Then("user clicks account settings")
	public void user_clicks_account_settings() {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getInstanceFeed_Form().getAccountsettingsmenu());
	}

	@Then("user clicks profile menu")
	public void user_clicks_profile_menu() {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getInstanceFeed_Form().getProfilemenu());
	}

	@Then("users enters {string} to update")
	public void users_enters_to_update(String string) throws IOException {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		String UpdateLastName = FileReaderManager.getInstanceCR().getUpdateLastName();
		Inputvalues(sdp.getInstanceFeed_Form().getLastname(), UpdateLastName);
	}

	@Then("click update profile to update the changes made")
	public void click_update_profile_to_update_the_changes_made() throws Exception {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getInstanceFeed_Form().getUpdatebutton());
		Sleep(1000);
		System.out.println("Profile update successs");
		screenshot("ProfilePage.png");
		driver.close();
	}
}
