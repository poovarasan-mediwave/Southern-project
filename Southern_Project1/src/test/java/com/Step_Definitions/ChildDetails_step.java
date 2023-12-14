package com.Step_Definitions;

import com.Lip_Globals.Base_class;
import com.Singleton_Design_Pattern.Singleton;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Configuration_Reader.FileReaderManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChildDetails_step extends Base_class {

//		public static WebDriver driver = Runner_Class.driver;

	public static Singleton sdp = new Singleton();

	@Given("User now navigated to the Home page")
	public void user_now_navigated_to_the_home_page() throws Throwable {
		get_Driver("Chrome");
		geturl("https://staging.southern.mindwave.site/");
		Thread.sleep(10000);
	}

	@When("User now click AlreadySignUp link")
	public void user_now_click_already_sign_up_link() throws Throwable {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getInstanceLog_In().getAlreadySignUp());
		Thread.sleep(5000);
	}

	@When("User now enters The {string} In Email Field")
	public void user_now_enters_the_in_email_field(String string) throws Throwable {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		String email = FileReaderManager.getInstanceCR().getemailchild();
		Inputvalues(sdp.getInstanceLog_In().getEmail(), email);
		Thread.sleep(3000);
	}

	@When("User now enters The {string} In Password Field")
	public void user_now_enters_the_in_password_field(String string) throws Throwable {
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

	@When("User now clicks the Login button to login")
	public void user_now_clicks_the_login_button_to_login() throws Throwable {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getChild_Flow().getLoginbutton());
		Thread.sleep(25000);
	}

	@Then("user Verify Home text in dashboard page")
	public void user_verify_home_text_in_dashboard_page() throws InterruptedException {

		WebElement msg = driver.findElement(By.xpath(
				"//div[@class='mw-main-container']/div/div/h3[text()='Welcome to Southern Health Parent Information Portal']"));
		String text = msg.getText();
		if (msg.isEnabled() && text.contains("Welcome to Southern Health Parent Information Portal")) {
			System.out.println("Welcome to Southern Health Parent Information Portal");
		} else

			System.out.println("Failed: dashboard not displayed");
		Thread.sleep(3000);

	}

	@Then("user click on child User icon")
	public void user_click_on_child_user_icon() throws Throwable {

		// driver.navigate().refresh();
		// driver.findElement(By.xpath("//div[@class='grid grid-cols-2 gap-6 md:flex
		// md:flex-wrap']/button/div/*[name()='svg']/following-sibling::p")).click();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[@class='grid grid-cols-2 gap-6 md:flex md:flex-wrap']/button/div/*[name()='svg']/following-sibling::p")));
		driver.findElement(By.xpath(
				"//div[@class='grid grid-cols-2 gap-6 md:flex md:flex-wrap']/button/div/*[name()='svg']/following-sibling::p"))
				.click();
		Thread.sleep(15000);
	}

	@Then("verify child page text")
	public void verify_child_page_text() {
		WebElement msg = driver
				.findElement(By.xpath("//div[@id='vueapp--southern-child-overview']//div//div//div//h3"));
		String text = msg.getText();
		if (msg.isEnabled() && text.contains("Welcome to the record")) {
			System.out.println("Welcome to the record of child overview page");
		} else

			System.out.println("Failed: child overview page not displayed");

	}

	@Then("click to view child acess details")
	public void click_to_view_child_acess_details() throws Throwable {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getChild_Flow().getChildaccessicon());
		Thread.sleep(8000);
	}

	@Then("take screenshot of the child parents carer page")
	public void take_screenshot_of_the_child_parents_carer_page() throws Throwable {
		screenshot("Child Home Page.png");
		Thread.sleep(6000);
	}

	@Then("Navigate back to child overview")
	public void navigate_back_to_child_overview() throws Throwable {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getChild_Flow().getChildoverviewlink());
		Thread.sleep(6000);
	}

	@Then("click to view appointment page")
	public void click_to_view_appointment_page() throws Throwable {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getChild_Flow().getAppointmentsicon());
		Thread.sleep(20000);
	}

	@Then("click to View details of appointments")
	public void click_to_view_details_of_appointments() throws Throwable {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getChild_Flow().getClicktoviewappointmentdetails());
		Thread.sleep(6000);
	}

	@Then("Click to reschedule appointment")
	public void click_to_reschedule_appointment() throws Throwable {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getChild_Flow().getAppointmentreschedule());
		Thread.sleep(25000);
	}

	@Then("click to select the location")
	public void click_to_select_the_location() throws InterruptedException {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getChild_Flow().getSelectLocation());
		Sleep(5000);
	}

	@Then("Click to select the date to be rescheduled")
	public void click_to_select_the_date_to_be_rescheduled() throws InterruptedException {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getChild_Flow().getSelectDate());
		Sleep(5000);
	}

	@Then("select time slot")
	public void select_time_slot() throws InterruptedException {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getChild_Flow().getSelectTime());
		Sleep(5000);
	}

	@Then("click confirm booking")
	public void click_confirm_booking() throws Throwable {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getChild_Flow().getConfirmbooking());
		Thread.sleep(25000);
	}

	@Then("view the appointment success message")
	public void view_the_appointment_success_message() {
		WebElement msg = driver.findElement(By.xpath("//div[@id='success-content']"));
		String text = msg.getText();
		if (msg.isEnabled() && text.contains("Your appointment has been rescheduled")) {
			System.out.println("Suceess: Your appointment has been rescheduled");
		} else

			System.out.println("Failed: Appointment not rescheduled");

	}

	@Then("click Okay to view the rescheduled appointment")
	public void click_okay_to_view_the_rescheduled_appointment() throws Throwable {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getChild_Flow().getOkaysuccesspopup());
		Thread.sleep(25000);
	}

	@Then("take screenshot of the appointment rescheduled")
	public void take_screenshot_of_the_appointment_rescheduled() throws Throwable {
		screenshot("AppointmentReschedule.png");

	}

	@Then("click child overview link")
	public void click_child_overview_link() throws Throwable {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getChild_Flow().getChildoverviewlink());
		Thread.sleep(10000);
	}

	@Then("Click Newborn screening and immunisation icon")
	public void click_newborn_screening_and_immunisation_icon() throws InterruptedException {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getChild_Flow().getClickimmunisationscreeningicon());
		Thread.sleep(20000);
	}

	@Then("click to view immunisation")
	public void click_to_view_immunisation() throws InterruptedException {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getChild_Flow().getClickimmunisationpanel());
		Thread.sleep(10000);
	}

	@Then("Take screenshot of immunisation page")
	public void take_screenshot_of_immunisation_page() throws Throwable {
		screenshot("ImmunisationPage.png");
		Thread.sleep(10000);

	}

	@Then("click to view screening")
	public void click_to_view_screening() throws InterruptedException {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getChild_Flow().getClickscreeningpanel());
		Thread.sleep(5000);
	}

	@Then("Take scrceenshot of the screening page")
	public void take_scrceenshot_of_the_screening_page() throws Throwable {
		screenshot("ScreeningPage.png");
		Thread.sleep(10000);
	}

	@Then("click child overview link again")
	public void click_child_overview_link_again() throws InterruptedException {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getChild_Flow().getChildoverviewlink());
		Thread.sleep(10000);
	}

	@Then("click letters and documents")
	public void click_letters_and_documents() throws InterruptedException {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getChild_Flow().getLettersanddocumentsicon());
		Thread.sleep(25000);
	}

	@Then("Click All button to view all documents")
	public void click_all_button_to_view_all_documents() throws InterruptedException {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getChild_Flow().getAllButton());
		Sleep(3000);
	}

	@Then("Click View Document button to view the document")
	public void click_view_document_button_to_view_the_document() throws InterruptedException {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getChild_Flow().getViewDocument());
		Sleep(20000);
	}

	@Then("click Close icon to close the document")
	public void click_close_icon_to_close_the_document() throws InterruptedException {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getChild_Flow().getCloseDocument());
		Sleep(5000);
	}

	@Then("Click Filter icon to filter the documents")
	public void click_filter_icon_to_filter_the_documents() throws InterruptedException {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getChild_Flow().getClickFilter());
		Sleep(2000);
	}

	@Then("select checkboxes to select the document title")
	public void select_checkboxes_to_select_the_document_title() throws InterruptedException {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getChild_Flow().getSelectCheckBox3());
		Sleep(1000);
		clickOnElement(sdp.getChild_Flow().getSelectCheckBox8());
		Sleep(1000);
		clickOnElement(sdp.getChild_Flow().getSelectCheckBox16());
		Sleep(1000);
	}

	@Then("Click Apply button to view the filtered documents")
	public void click_apply_button_to_view_the_filtered_documents() throws InterruptedException {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getChild_Flow().getApplyButton());
		Sleep(2000);
	}

	@Then("click filter and clear the title to view all documents")
	public void click_filter_and_clear_the_title_to_view_all_documents() throws InterruptedException {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getChild_Flow().getClickFilter());
		Sleep(2000);
		clickOnElement(sdp.getChild_Flow().getClearButton());
		Sleep(2000);
	}

	@Then("Click Sort icon to sort filter")
	public void click_sort_icon_to_sort_filter() throws InterruptedException {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getChild_Flow().getSortIcon());
		Sleep(2000);
	}

	@Then("choose aplhabetically order to sort")
	public void choose_aplhabetically_order_to_sort() throws InterruptedException {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getChild_Flow().getSortAlphabetically());
		Sleep(2000);
	}

	@Then("Take scrceenshot of the Documents page")
	public void take_scrceenshot_of_the_documents_page() throws Exception {
		screenshot("Documents.png");
		System.out.println("end point7");
		System.out.println("test");
		Sleep(5000);
	}

	@Then("click Home link")
	public void click_home_link() throws InterruptedException {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getChild_Flow().getClickhomelink());
		System.out.println("test1");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(250,350)");
		Thread.sleep(500);
		System.out.println("end point6");
		Thread.sleep(20000);
	}

	@Then("click Resources icon")
	public void click_resources_icon() throws InterruptedException {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getChild_Flow().getClickresourcesicon());
		System.out.println("end point5");
		Thread.sleep(20000);
	}

	@Then("click findout more button")
	public void click_findout_more_button() throws InterruptedException {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getChild_Flow().getClickfindoutmorebutton());
		System.out.println("end point4");
		Thread.sleep(20000);
	}

	@Then("make as favourite")
	public void make_as_favourite() throws Throwable {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getChild_Flow().getClickstar());
		System.out.println("end point3");
		Thread.sleep(10000);
	}

	@Then("view the marked favourite card")
	public void view_the_marked_favourite_card() throws Throwable {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getChild_Flow().getClickfavouritebutton());
		System.out.println("end point2");
		Thread.sleep(10000);
	}

	@Then("take screenshot of the resources page")
	public void take_screenshot_of_the_resources_page() throws Throwable {
		System.out.println("end point");
		screenshot("ResourcesPage.png");
		Thread.sleep(10000);
	}

}
