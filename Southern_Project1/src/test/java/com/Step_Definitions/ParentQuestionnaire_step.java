package com.Step_Definitions;

import com.Lip_Globals.Base_class;
import com.Singleton_Design_Pattern.Singleton;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.Configuration_Reader.FileReaderManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParentQuestionnaire_step extends Base_class{

	

		public static Singleton pom = new Singleton();
		JavascriptExecutor js;

		 Questionnaire_stepdefinition questionnaireSD= new Questionnaire_stepdefinition();
		@Given("User launch URL for parentQuestionnaire")
		public void user_launch_url_for_parent_questionnaire() throws InterruptedException,Throwable {
			sleep(3000);
			//geturl("https://staging.southern.mindwave.site/");

			//clickOnElement(pom.getlogin().getalreadysignup());
			//sleep(3000);
			questionnaireSD.user_launch_url_for_southern_questionnaires();		
			 Sleep(3000); 
		}

		@When("User enters valid {string} in Emailaddres field for parentQuestionnaire")
		public void user_enters_valid_in_emailaddres_field_for_parent_questionnaire(String string)
				throws InterruptedException, IOException {
			String getparentQuestionnaireemail = FileReaderManager.getInstanceCR().getparentQuestionnaireemail();
			Inputvalues(pom.getlogin().getEmail(),getparentQuestionnaireemail);
			sleep(2000);
		}

		@Then("User enters {string} in Passowrd for parentQuestionnaire")
		public void user_enters_in_passowrd_for_parent_questionnaire(String string) throws InterruptedException, IOException {
			String getparentQuestionnairepassword = FileReaderManager.getInstanceCR().getparentQuestionnairepassword();
			Inputvalues(pom.getlogin().getPassword(), getparentQuestionnairepassword);
			sleep(3000);
		}

		@Then("User select recaptcha checkbox for parentQuestionnaire")
		public void user_select_recaptcha_checkbox_for_parent_questionnaire() throws InterruptedException {
			// Sleep(10000);
			System.out.println("enter");
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,250)");
			sleep(3000);
			clickOnElement(pom.getlogin().getRecaptcha());
		}

		@Then("Click on Submit button for parentQuestionnaire")
		public void click_on_submit_button_for_parent_questionnaire() throws InterruptedException {
			sleep(3000);
			System.out.println("loginbut");

			WebElement button = driver.findElement(By.xpath("//button[text()='Log in']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", button);

			sleep(5000);
		}

		@Then("User click on parentQuestionnaire")
		public void user_click_on_parent_questionnaire() throws InterruptedException {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,250)");
			sleep(30000);
			WebElement button3 = driver.findElement(By.xpath(
					"//button[@class='card-block card-tiles cursor-pointer']/div/*[local-name()='svg']/following-sibling::p[text()='Questionnaires ']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", button3);
			// clickOnElement(pom.getparentquestionnaire().getParentQuestionnaire());
			sleep(3000);
		}

		@Then("User click on keybutton")
		public void user_click_on_keybutton() throws InterruptedException {
			clickOnElement(pom.getparentquestionnaire().getKeybutton());
			sleep(3000);
		}

		@Then("User select on Questionnaire under list")
		public void user_select_on_questionnaire_under_list() throws InterruptedException {
			clickOnElement(pom.getparentquestionnaire().getselectfirst());
			sleep(3000);
		}

		@Then("User enter answer for singleline")
		public void user_enter_answer_for_singleline() throws InterruptedException, IOException {
			String getparentsingleline = FileReaderManager.getInstanceCR().getparentsingleline();
			Inputvalues(pom.getparentquestionnaire().getParentsingleline(), getparentsingleline);
			sleep(3000);
		}

		@Then("User enter answer for freetext")
		public void user_enter_answer_for_freetext() throws InterruptedException, IOException {
			String getparentfreetext = FileReaderManager.getInstanceCR().getparentfreetext();
			Inputvalues(pom.getparentquestionnaire().getParentfreetext(), getparentfreetext);
			sleep(3000);
		}

		@Then("User enter answer for multiplechoice option1")
		public void user_enter_answer_for_multiplechoice_option1() throws InterruptedException {
			clickOnElement(pom.getparentquestionnaire().getParentmultipleoption1());
			sleep(3000);
		}

		@Then("User enter answer for multiplechoice option2")
		public void user_enter_answer_for_multiplechoice_option2() throws InterruptedException {
			clickOnElement(pom.getparentquestionnaire().getParentmultipleoption2());
			sleep(3000);
		}

		@Then("User select dropdown option")
		public void user_select_dropdown_option() throws InterruptedException {
			clickOnElement(pom.getparentquestionnaire().getParentdropdown());
			sleep(3000);
			clickOnElement(pom.getparentquestionnaire().getParentdropdownoption());
			sleep(3000);
		}

		@Then("User enter answer for likert option")
		public void user_enter_answer_for_likert_option() throws InterruptedException {
			// Inputvalues(pom.getparentquestionnaire().getParentlikertoption(),"Blood
			// pressure likert activities");
			sleep(3000);
		}

		@Then("User enter answer for imagetext")
		public void user_enter_answer_for_imagetext() throws InterruptedException, IOException {
			String getparentimagetextarea = FileReaderManager.getInstanceCR().getparentimagetextarea();
			Inputvalues(pom.getparentquestionnaire().getParentimagetextarea(),getparentimagetextarea );
			sleep(3000);
		}

		@Then("User enter answer for date")
		public void user_enter_answer_for_date() throws InterruptedException {
			clickOnElement(pom.getparentquestionnaire().getParentdate());
			sleep(5000);
			clickOnElement(pom.getparentquestionnaire().getParentdateoption());
			sleep(3000);
		}

		@Then("User enter answer for date and time")
		public void user_enter_answer_for_date_and_time() throws InterruptedException {
			clickOnElement(pom.getparentquestionnaire().getParentdateandtime());
			sleep(5000);
			clickOnElement(pom.getparentquestionnaire().getParentdateandtimeoption());
			sleep(3000);
		}

		@Then("User enter answer for number")
		public void user_enter_answer_for_number() throws InterruptedException, IOException {
			String getParentnumberoption = FileReaderManager.getInstanceCR().getParentnumberoption();
			Inputvalues(pom.getparentquestionnaire().getParentnumberoption(),getParentnumberoption);
			sleep(3000);
		}

		@Then("User enter answer for hyperlink")
		public void user_enter_answer_for_hyperlink() throws InterruptedException, IOException {
			String getParenthyperlinkoption = FileReaderManager.getInstanceCR().getParenthyperlinkoption();
			Inputvalues(pom.getparentquestionnaire().getParenthyperlinkoption(),getParenthyperlinkoption);
			sleep(3000);
		}

		@Then("User click on submit button")
		public void user_click_on_submit_button() throws InterruptedException {
			clickOnElement(pom.getparentquestionnaire().getParentsubmit());
			sleep(3000);

			WebElement button2 = driver.findElement(By.xpath("//a[text()='Okay']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", button2);
			sleep(5000);

			/*
			 * driver.findElement(By.xpath(
			 * "//div[@id='QuestionnaireListNGrid']/div/table/tbody/tr/td[contains(text(),'001')]"
			 * )); Sleep(3000); JavascriptExecutor js = (JavascriptExecutor)driver;
			 * js.executeScript(
			 * "document.getElementById('gvLocationHorizontalRail').scrollLeft += 250", "");
			 * Sleep(5000); driver.findElement(By.xpath(
			 * "//div[@id='QuestionnaireListNGrid']/div/table/tbody/tr/td[@data-label='Actions']/button"
			 * )).click();
			 */

		}
}
