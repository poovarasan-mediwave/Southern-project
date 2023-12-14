package com.Step_Definitions;

import org.openqa.selenium.JavascriptExecutor;

import com.Configuration_Reader.FileReaderManager;
import com.Lip_Globals.Base_class;
import com.Singleton_Design_Pattern.Singleton;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUp_step extends Base_class {
	public static Singleton sdp = new Singleton();

	@Given("User is in Home Page")
	public void user_is_in_home_page() throws InterruptedException, Throwable {
		get_Driver(FileReaderManager.getInstanceCR().getDriver());
		geturl(FileReaderManager.getInstanceCR().getUrl());
		Thread.sleep(7000);
	}

	@When("click on SignUp link")
	public void click_on_sign_up_link() throws InterruptedException {
		clickOnElement(sdp.getInstanceSign_Up().getSignUp());
		Thread.sleep(3000);
	}

	@Then("User enters valid {string} in FirstName field")
	public void user_enters_valid_in_first_name_field(String firstname) throws Throwable {
		Inputvalues(sdp.getInstanceSign_Up().getFirstName(), FileReaderManager.getInstanceCR().getfirstname());
		Thread.sleep(2000);
	}

	@Then("User enters valid {string} in LastName field")
	public void user_enters_valid_in_last_name_field(String lastname) throws Throwable {
		Inputvalues(sdp.getInstanceSign_Up().getLastName(), FileReaderManager.getInstanceCR().getlastname());
		Thread.sleep(2000);
	}

	@Then("User enters valid {string} in Emailaddres field")
	public void user_enters_valid_email_address(String emailaddress) throws Throwable {
		Inputvalues(sdp.getInstanceSign_Up().getEmail(), FileReaderManager.getInstanceCR().getSignupemailaddress());
		Thread.sleep(2000);
	}

	@Then("user enter valid {string} in PhoneNumber")
	public void user_enter_valid_phone_number(String phonenumber) throws Throwable {
		Inputvalues(sdp.getInstanceSign_Up().getMobileNumber(), FileReaderManager.getInstanceCR().getphonenumber());
		Thread.sleep(2000);
	}

	@Then("User enters {string} in Passowrd")
	public void user_enters_password(String password) throws Throwable {
		String Password = FileReaderManager.getInstanceCR().getSignuppassword();
		Inputvalues(sdp.getInstanceSign_Up().getPassword(), Password);
		Thread.sleep(2000);
	}

	@Then("User enters {string} in ConfirmPassword")
	public void user_enters_password_combination(String confirmpassword) throws Throwable {
		String ConfirmPassword = FileReaderManager.getInstanceCR().getpasswordcombination();
		Inputvalues(sdp.getInstanceSign_Up().getConfirmPassword(), ConfirmPassword);
		Thread.sleep(2000);
	}

	@Then("Users selects the  Terms of Service field")
	public void users_selects_the_terms_of_service_field() throws Throwable {
		clickOnElement(sdp.getInstanceSign_Up().getSelectterms());
		Thread.sleep(2000);
	}

	@Then("User selects the Privacy Statement")
	public void user_selects_the_privacy_statement() throws Throwable {
		clickOnElement(sdp.getInstanceSign_Up().getSelectprivacy());
		Thread.sleep(2000);
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)");
		Thread.sleep(3000);
//		clickOnElement(sdp.getInstanceChild_Flow().getRecaptcha());
		Thread.sleep(3000);
	}

	@And("Click SignUp to create account")
	public void click_sign_up_to_create_account() throws InterruptedException {
		clickOnElement(sdp.getInstanceSign_Up().getSignupButton());
		Thread.sleep(8000);
	}

	@Then("Success pop up displays if child linked orelse error message displays")
	public void success_pop_up_displays_if_child_linked_orelse_error_message_displays() {

		if (driver.getPageSource().contains("Congratulations")) {
			String gettext = gettext(sdp.getInstanceSign_Up().getSuccessContent());
			System.out.println(gettext);

		} else {
			String gettext = gettext(sdp.getInstanceSign_Up().getErrorContent());
			System.out.println(gettext);

		}
	}

	@Then("Take screenshot of the SignUp Page")
	public void take_screenshot_of_the_sign_up_page() throws Exception {
		screenshot("SignUpScreen.png");
	}
}
