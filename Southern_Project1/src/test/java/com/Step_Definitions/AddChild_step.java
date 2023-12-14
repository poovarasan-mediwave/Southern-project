package com.Step_Definitions;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Configuration_Reader.FileReaderManager;
import com.Lip_Globals.Base_class;
import com.Singleton_Design_Pattern.Singleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddChild_step extends Base_class {

//		public static WebDriver driver = Runner_Class.driver;
	public static Singleton sdp = new Singleton();

	@Given("User launchs the browser")
	public void user_launchs_the_browser() throws Throwable {
		get_Driver("Chrome");
		geturl("https://staging.southern.mindwave.site/");
		Thread.sleep(7000);
	}

	@When("User clicks AlreadySignUp link")
	public void user_clicks_already_sign_up_link() throws Throwable {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getInstanceLog_In().getAlreadySignUp());
		Thread.sleep(3000);
	}

	@When("User enter The {string} In Email Field")
	public void user_enter_the_in_email_field(String string) throws Throwable {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		String email = FileReaderManager.getInstanceCR().getemailchild();
		Inputvalues(sdp.getInstanceLog_In().getEmail(), email);
		Thread.sleep(3000);
	}

	@When("User enter The {string} In Password Field")
	public void user_enter_the_in_password_field(String string) throws Throwable {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		String Password = FileReaderManager.getInstanceCR().getpasswordchild();
		Inputvalues(sdp.getInstanceLog_In().getPassword(), Password);
		Thread.sleep(3000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)");
		Thread.sleep(3000);
		clickOnElement(sdp.getChild_Flow().getRecaptcha());
		Thread.sleep(3000);
	}

	@When("User click the Login button")
	public void user_click_the_login_button() throws Throwable {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getInstanceLog_In().getLogin());
		Thread.sleep(50000);
	}

	@Then("User navigated to Home Page")
	public void user_navigated_to_home_page() throws Throwable {

		String pageTitle = "Dashboard";

		if (driver.getTitle().equalsIgnoreCase(pageTitle)) {

			System.out.println("Login Successfull");
		} else

			System.out.println("Login UnSuccessfull");
	}

	/*
	 * @Given("User is on the HomePage") public void user_is_on_the_home_page() {
	 * String pageSource = "Welcome to Southern Health Parent Information Portal";
	 * 
	 * if(driver.getPageSource().equalsIgnoreCase(pageSource)) {
	 * 
	 * System.out.println("Navigated to Parent Dashboard"); } else
	 * 
	 * System.out.println("Failed to reach dashbaord..."); }
	 */

	@When("User click button to Add Child")
	public void user_click_button_to_add_child() throws Throwable {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getInstanceLog_In().getAddChild());
		Thread.sleep(15000);
	}

	@Then("User enters {string} in Child NHS Number Field")
	public void user_enters_in_child_nhs_number_field(String string) throws Throwable {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		String NHSNUmber = FileReaderManager.getInstanceCR().getChildNHSNumber();
		Inputvalues(sdp.getInstanceLog_In().getNHSNumber(), NHSNUmber);
		Thread.sleep(3000);
	}

	@Then("Users enters {string} in Date field")
	public void users_enters_in_date_field(String string) throws Throwable {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		String Date = FileReaderManager.getInstanceCR().getDate();
		Inputvalues(sdp.getInstanceLog_In().getDate(), Date);
		Thread.sleep(3000);
	}

	@Then("Users enters {string} in Month field")
	public void users_enters_in_month_field(String string) throws Throwable {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		String Month = FileReaderManager.getInstanceCR().getMonth();
		Inputvalues(sdp.getInstanceLog_In().getMonth(), Month);
		Thread.sleep(3000);
	}

	@Then("Users enters {string} in Year field")
	public void users_enters_in_year_field(String string) throws Throwable {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		String Year = FileReaderManager.getInstanceCR().getYear();
		Inputvalues(sdp.getInstanceLog_In().getYear(), Year);
		Thread.sleep(3000);
	}

	@Then("click Add child button")
	public void click_add_child_button() throws Throwable {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getInstanceLog_In().getAddchildbutton());
		Thread.sleep(25000);

	}

	@Then("verify success message")
	public void verify_success_message() throws InterruptedException {
		WebElement msg = driver.findElement(By.xpath("//h3[@id='success-title']//strong"));
		String text = msg.getText();
		if (msg.isEnabled() && text.contains("Congratulations!")) {
			System.out.println(
					"Congratulations!: We have been able to match the details you supplied. You will now be able to view appointments, immunisations, NHS Letters and view our resources.");
			Sleep(4000);
		} else

			System.out.println("Failed: Child not added");

	}

	@Then("take screen of the child added page")
	public void take_screen_of_the_child_added_page() throws Throwable {
		screenshot("AddChild.png");
		Sleep(3000);
	}

	@Then("user taken to Dashboard page")
	public void user_taken_to_dashboard_page() {
		System.out.println("Child added successfully");
	}

}
