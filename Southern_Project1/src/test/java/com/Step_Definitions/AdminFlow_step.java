package com.Step_Definitions;

import com.Lip_Globals.Base_class;
import com.Singleton_Design_Pattern.Singleton;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.Configuration_Reader.FileReaderManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminFlow_step extends Base_class {

	public static Singleton sdp = new Singleton();

	@Given("User should  navigate to the Home page")
	public void user_should_navigate_to_the_home_page() throws Throwable {
		get_Driver("Chrome");
		geturl("https://staging.southern.mindwave.site/");
		Thread.sleep(6000);
	}

	@When("User then click AlreadySignUp link")
	public void user_then_click_already_sign_up_link() throws Throwable {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getInstanceLog_In().getAlreadySignUp());
		Thread.sleep(2000);
	}

	@When("User entered The {string} In Email UI Field")
	public void user_entered_the_in_email_ui_field(String string) throws Throwable {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		String adminemail = FileReaderManager.getInstanceCR().getadminemail();
		Inputvalues(sdp.getInstanceLog_In().getEmail(), adminemail);
		Thread.sleep(2000);

	}

	@When("User entered The {string} In Password UI Field")
	public void user_entered_the_in_password_ui_field(String string) throws Throwable {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		String adminpassword = FileReaderManager.getInstanceCR().getadminpassword();
		Inputvalues(sdp.getInstanceLog_In().getPassword(), adminpassword);
		Thread.sleep(2000);
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)");
		Thread.sleep(3000);
		clickOnElement(sdp.getChild_Flow().getRecaptcha());
		Thread.sleep(3000);
	}

	@When("User has clicked the Login button")
	public void user_has_clicked_the_login_button() throws Throwable {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getInstanceLog_In().getLoginbutton());
		Thread.sleep(2000);
	}

	@Then("Take screenshot of admin home page")
	public void take_screenshot_of_admin_home_page() throws Throwable {
		screenshot("AdminHomepage.png");
		Thread.sleep(3000);
	}

	@Then("Click on Parent overview icon")
	public void click_on_parent_overview_icon() throws Throwable {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getAdmin_Flow().getClickparentoverview());
		Thread.sleep(3000);
	}

	@Then("Type the parent you want to {string} text")
	public void type_the_parent_you_want_to_text(String string) throws Throwable {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		String search = FileReaderManager.getInstanceCR().getsearch();
		Inputvalues(sdp.getAdmin_Flow().getSearchtext(), search);
		Thread.sleep(3000);
	}

	@Then("press enter key to view the search result")
	public void press_enter_key_to_view_the_search_result() throws InterruptedException {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getAdmin_Flow().getClicksearchicon());
		Thread.sleep(2000);
	}

	/*
	 * @Then("click on namecard to view parent details") public void
	 * click_on_namecard_to_view_parent_details() throws Throwable {
	 * clickOnElement(sdp.getInstanceAdmin_Flow().getClicknamecard());
	 * Thread.sleep(2000); }
	 */

	@Then("Take screenshot of the page displayed")
	public void take_screenshot_of_the_page_displayed() throws Exception {
		screenshot("SearchParent.png");
		Thread.sleep(3000);
	}

	@When("User click on Home Link to navigate to Home page")
	public void user_click_on_home_link_to_navigate_to_home_page() throws InterruptedException {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getAdmin_Flow().getHomeLink());
		Thread.sleep(3000);
	}

	@Then("User needs to click on StaffOverview icon")
	public void user_needs_to_click_on_staff_overview_icon() throws InterruptedException {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getAdmin_Flow().getClickStaffOverviewicon());
		Thread.sleep(3000);
	}

	@Then("user clicks on 3dots to change user role")
	public void user_clicks_on_3dots_to_change_user_role() throws InterruptedException {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getAdmin_Flow().getClick3dots());
		Thread.sleep(3000);
	}

	@Then("user selects Change role")
	public void user_selects_change_role() throws InterruptedException {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
		clickOnElement(sdp.getAdmin_Flow().getClickChangeRoletext());
		Thread.sleep(3000);
	}

	@Then("user select the user to be changed")
	public void user_select_the_user_to_be_changed() throws InterruptedException {
		// Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);

		WebElement superadmin = driver.findElement(By.xpath("//input[@id='superadmin role id 1']"));
		boolean selected1 = superadmin.isSelected();
		System.out.println(selected1);
		WebElement admin = driver.findElement(By.xpath("//input[@id='admin role id 2']"));
		boolean selected2 = admin.isSelected();
		System.out.println(selected2);
		WebElement staff = driver.findElement(By.xpath("//input[@id='staff role id 3']"));
		boolean selected3 = staff.isSelected();
		System.out.println(selected3);

		if (selected1 == true) {

			driver.findElement(By.xpath("//input[@id='admin role id 2']")).click();
			Thread.sleep(1000);
			clickOnElement(sdp.getAdmin_Flow().getClickconfirmnewrolebutton());
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//button[contains(@class,'absolute right')])[2]")).click();
			Thread.sleep(1000);

		} else if (selected2 == true) {
			driver.findElement(By.xpath("//input[@id='staff role id 3']")).click();
			Thread.sleep(1000);
			clickOnElement(sdp.getAdmin_Flow().getClickconfirmnewrolebutton());
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//button[contains(@class,'absolute right')])[2]")).click();
			Thread.sleep(1000);
		} else {
			driver.findElement(By.xpath("//input[@id='superadmin role id 1']")).click();
			Thread.sleep(1000);
			clickOnElement(sdp.getAdmin_Flow().getClickconfirmnewrolebutton());
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//button[contains(@class,'absolute right')])[2]")).click();
			Thread.sleep(1000);
		}
	}

	@Then("take screenshot of the page after userrole changed")
	public void take_screenshot_of_the_page_after_userrole_changed() throws Exception {
		System.out.println("User Role Changed Successfully:");
		screenshot("UserRoleChanged.png");
		Thread.sleep(5000);
	}
}
