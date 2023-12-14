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

import com.Configuration_Reader.FileReaderManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddStaff_step extends Base_class {
	
	



		//public static WebDriver driver = Runner_Class.driver;

		public static Singleton sdp = new Singleton();


		@Given("User needs to launch the browser")
		public void user_needs_to_launch_the_browser() throws Throwable {
			get_Driver("Chrome");
			geturl("https://staging.southern.mindwave.site/");
			Thread.sleep(5000);
		}
		@When("User then clicks AlreadySignUp link")
		public void user_then_clicks_already_sign_up_link() throws Throwable {
			//Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
			clickOnElement(sdp.getInstanceLog_In().getAlreadySignUp());
			Thread.sleep(5000);
		}
		@When("User needs to enter The {string} In Email Field")
		public void user_needs_to_enter_the_in_email_field(String string) throws Throwable {
			//Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
			String email = FileReaderManager.getInstanceCR().getLoginemail();
			Inputvalues(sdp.getInstanceLog_In().getEmail(), email);
			Thread.sleep(3000);
		}
		@When("User needs to enter The {string} In Password Field")
		public void user_needs_to_enter_the_in_password_field(String string) throws Throwable {
			//Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
			String password = FileReaderManager.getInstanceCR().getLoginpassword();
			Inputvalues(sdp.getInstanceLog_In().getPassword(), password);
			Thread.sleep(5000);
			Thread.sleep(3000);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,250)");
			Thread.sleep(3000);
			clickOnElement(sdp.getChild_Flow().getRecaptcha());
			Thread.sleep(3000);
		}
		@When("User needs to click the Login button")
		public void user_needs_to_click_the_login_button() throws Throwable {
			//Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
			clickOnElement(sdp.getInstanceLog_In().getLogin());
			Thread.sleep(8000);
		}


		@Then("User should be navigated to Home Page")  
		public void user_should_be_navigated_to_home_page() {

			String pageTitle = "Super Admin Dashboard";

			if(driver.getTitle().equalsIgnoreCase(pageTitle))
			{

				System.out.println("Login Successfull");
			} else

				System.out.println("Login UnSuccessfull");
		}



		@Then("click Staff Overview icon")
		public void click_staff_overview_icon() throws Throwable {
			//Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
			clickOnElement(sdp.getAdd_Staff().getClickStaffOverview());
			Thread.sleep(4000);
		}



		@Then("click add staff button")
		public void click_add_staff_button() throws Throwable {
			//Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
			clickOnElement(sdp.getAdd_Staff().getAddStaffbutton());
			Thread.sleep(4000);
		}



		@Then("user needs to click the user role dropbox")
		public void user_needs_to_click_the_user_role_dropbox() throws Throwable {
			driver.findElement(By.xpath("//label[text()='Select user role']")).click();
			Thread.sleep(1000);
		}


		@Then("user selects admin user option")
		public void user_selects_admin_user_option() throws Throwable {
			driver.findElement(By.xpath("//input[@id='superadmin role id 1']")).click();
			Thread.sleep(2000);
		}


		@Then("enter {string} in firstname field")
		public void enter_in_firstname_field(String string) throws Throwable {
			//Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
			String firstname1 = FileReaderManager.getInstanceCR().getfirstname1();
			Inputvalues(sdp.getAdd_Staff().getFirstname(), firstname1);
			Thread.sleep(3000);
		}
		@Then("enter {string} in lastname field")
		public void enter_in_lastname_field(String string) throws Throwable {
		//	Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
			String lastname1 = FileReaderManager.getInstanceCR().getlastname1();
			Inputvalues(sdp.getAdd_Staff().getLastname(), lastname1);
			Thread.sleep(3000);
		}
		@Then("enter  {string} in rioid field")
		public void enter_in_rioid_field(String string) throws Throwable {
			//Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
			String RIOID1 = FileReaderManager.getInstanceCR().getRIOID1();
			Inputvalues(sdp.getAdd_Staff().getRioid(), RIOID1);
			Thread.sleep(3000);
		}



		@Then("user clicks on create profile button")
		public void user_clicks_on_create_profile_button() throws Throwable {
			//Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
			clickOnElement(sdp.getAdd_Staff().getCreateprofilebutton());
			Thread.sleep(4000);
		}

		@Then("get confirmation text1")
		public void get_confirmation_text1() throws Throwable {
			
			WebElement msg=driver.findElement(By.xpath("//h3[@id='success-title']"));
			String text=msg.getText();
			if (msg.isEnabled() && text.contains("User profile added"))
			{ 
				System.out.println("User added success");
			}else
			
				System.out.println("Failed: User not added");
				
			}
			

			
		@Then("click ok1 to exit")
		public void click_ok1_to_exit() throws Throwable {
			//Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
			clickOnElement(sdp.getAdd_Staff().getClickOkaybutton());
			Thread.sleep(3000);
		}
		
		@Then("take screenshot of the added admin user")
		public void take_screenshot_of_the_added_admin_user() throws Throwable {
			screenshot("AdminUser.png");
		    Thread.sleep(3000);
		}

		
		@Then("click to add staff button to add superadmin user")
		public void click_to_add_staff_button_to_add_superadmin_user() throws InterruptedException {
			//Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
			clickOnElement(sdp.getAdd_Staff().getAddStaffbutton());
			Thread.sleep(4000);
		}
		
		
		@Then("user now clicks the user role dropbox")
		public void user_now_clicks_the_user_role_dropbox() throws InterruptedException {
			driver.findElement(By.xpath("//label[text()='Select user role']")).click();
			Thread.sleep(1000);
		}
		
		@Then("user now selects superadmin user option")
		public void user_now_selects_superadmin_user_option() throws Throwable {
			driver.findElement(By.xpath("//input[@id='admin role id 2']")).click();
			Thread.sleep(2000);
		}
		
		
		@Then("user enters {string} in firstname field")
		public void user_enters_in_firstname_field(String string) throws InterruptedException, IOException {
			//Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
			String firstname2 = FileReaderManager.getInstanceCR().getfirstname2();
			Inputvalues(sdp.getAdd_Staff().getFirstname(), firstname2);
			Thread.sleep(3000);
		}
		
		
		@Then("user enters {string} in lastname field")
		public void user_enters_in_lastname_field(String string) throws InterruptedException, IOException {
			//Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
			String lastname2 = FileReaderManager.getInstanceCR().getlastname2();
			Inputvalues(sdp.getAdd_Staff().getLastname(), lastname2);
			Thread.sleep(3000);
		}
		
		
		@Then("user enters  {string} in rioid field")
		public void user_enters_in_rioid_field(String string) throws InterruptedException, IOException {
			//Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
			String RIOID2 = FileReaderManager.getInstanceCR().getRIOID2();
			Inputvalues(sdp.getAdd_Staff().getRioid(), RIOID2);
			Thread.sleep(3000);
		}
		
		
		@Then("user then clicks on create profile button")
		public void user_then_clicks_on_create_profile_button() throws InterruptedException {
			//Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
			clickOnElement(sdp.getAdd_Staff().getCreateprofilebutton());
			Thread.sleep(4000);
		}
		
		@Then("User gets confirmation text1")
		public void user_gets_confirmation_text1() {
			WebElement msg=driver.findElement(By.xpath("//h3[@id='success-title']"));
			String text=msg.getText();
			if (msg.isEnabled() && text.contains("User profile added"))
			{ 
				System.out.println("User added success");
			}else
			
				System.out.println("Failed: User not added");
				
			}
		
		
		@Then("User clicks ok2 to exit")
		public void user_clicks_ok2_to_exit() throws InterruptedException {
			//Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
			clickOnElement(sdp.getAdd_Staff().getClickOkaybutton());
			Thread.sleep(3000);
		}
		
		
		@Then("user takes screenshot of the added superadmin user")
		public void user_takes_screenshot_of_the_added_superadmin_user() throws Exception {
			screenshot("SuperAdminUser.png");
		    Thread.sleep(3000);
		}



		@Then("User clicks to add staff button to add staff user")
		public void user_clicks_to_add_staff_button_to_add_staff_user() throws InterruptedException {
			//Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
			clickOnElement(sdp.getAdd_Staff().getAddStaffbutton());
			Thread.sleep(4000);
		}
		
		
		@Then("user then clicks the user role dropbox")
		public void user_then_clicks_the_user_role_dropbox() throws InterruptedException {
			driver.findElement(By.xpath("//label[text()='Select user role']")).click();
			Thread.sleep(1000);
		}
		
		
		@Then("user then selects staff user option")
		public void user_then_selects_staff_user_option() throws InterruptedException {
			driver.findElement(By.xpath("//input[@id='staff role id 3']")).click();
			Thread.sleep(2000);
		}
		
		@Then("user must enter {string} in firstname field")
		public void user_must_enter_in_firstname_field(String string) throws InterruptedException, IOException {
		//	Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
			String firstname3 = FileReaderManager.getInstanceCR().getfirstname3();
			Inputvalues(sdp.getAdd_Staff().getFirstname(), firstname3);
			Thread.sleep(3000);
		}
		
		
		@Then("user must enter {string} in lastname field")
		public void user_must_enter_in_lastname_field(String string) throws InterruptedException, IOException {
			//Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
			String lastname3 = FileReaderManager.getInstanceCR().getlastname3();
			Inputvalues(sdp.getAdd_Staff().getLastname(), "RamCharan");
			Thread.sleep(3000);
		}
		
		
		@Then("user must enter  {string} in rioid field")
		public void user_must_enter_in_rioid_field(String string) throws InterruptedException, IOException {
			//Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
			String RIOID3 = FileReaderManager.getInstanceCR().getRIOID3();
			Inputvalues(sdp.getAdd_Staff().getRioid(), RIOID3);
			Thread.sleep(3000);
		}
		
		
		@Then("user has to click on create profile button")
		public void user_has_to_click_on_create_profile_button() throws InterruptedException {
			//Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
			clickOnElement(sdp.getAdd_Staff().getCreateprofilebutton());
			Thread.sleep(4000);
		}
		
		
		@Then("User should get confirmation text1")
		public void user_should_get_confirmation_text1() {
			WebElement msg=driver.findElement(By.xpath("//h3[@id='success-title']"));
			String text=msg.getText();
			if (msg.isEnabled() && text.contains("User profile added"))
			{ 
				System.out.println("User added success");
			}else
			
				System.out.println("Failed: User not added");
				
			}
		
		@Then("User must click ok3 to exit")
		public void user_must_click_ok3_to_exit() throws InterruptedException {
			//Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
			clickOnElement(sdp.getAdd_Staff().getClickOkaybutton());
			Thread.sleep(3000);
		}
		
		@Then("user takes screenshot of the added staff user")
		public void user_takes_screenshot_of_the_added_staff_user() throws Exception {
			screenshot("StaffUser.png");
		    Thread.sleep(3000);
		}

}
