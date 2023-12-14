package com.Step_Definitions;

import com.Lip_Globals.Base_class;
import com.Singleton_Design_Pattern.Singleton;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.Configuration_Reader.FileReaderManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Createquestionnaire_Compaign_step extends Base_class{

	
	

		public static Singleton pom = new Singleton();
		JavascriptExecutor js;
		Questionnaire_stepdefinition questionnaireSD = new Questionnaire_stepdefinition();

		@Given("User launch URL for southern Questionnaires campaign")
		public void user_launch_url_for_southern_questionnaires_campaign() throws Throwable {
			//questionnaireSD.user_launch_url_for_southern_questionnaires();
			//Sleep(3000);
			get_Driver("chrome");
			String url = FileReaderManager.getInstanceCR().getURL();
			geturl(url);
		}

		@When("User enters valid {string} in Emailaddres field for Questionnaires campaign")
		public void user_enters_valid_in_emailaddres_field_for_questionnaires_campaign(String string) throws Throwable {
			questionnaireSD.user_enters_valid_in_emailaddres_field_for_questionnaires(string);
			sleep(2000);
		}

		@Then("User enters {string} in Passowrd for Questionnaires campaign")
		public void user_enters_in_passowrd_for_questionnaires_campaign(String string) throws Throwable {
			questionnaireSD.user_enters_in_passowrd_for_questionnaires(string);
			sleep(3000);
		}

		@Then("User select recaptcha checkbox for Questionnaires campaign")
		public void user_select_recaptcha_checkbox_for_questionnaires_campaign() throws Throwable {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,250)");
			sleep(5000);
			clickOnElement(pom.getlogin().getRecaptcha());
		}

		@Then("Click on Submit button for Questionnaires campaign")
		public void click_on_submit_button_for_questionnaires_campaign() throws Throwable {
			sleep(5000);
			questionnaireSD.click_on_submit_button_for_questionnaires();

		}



		@Then("User click on create_Questionnaire_campaingn")
		public void user_click_on_create_questionnaire_campaingn() throws Throwable {
			sleep(7000);
			clickOnElement(pom.getquestionnaires().getQuestionnairescard());
			sleep(2000);
			clickOnElement(pom.getcreatequestionnairecampaign().getCreateQuestionnairecampaigncard());
			sleep(3000);
		}

		@Then("User click on User Questionnaire template dropdown")
		public void user_click_on_user_questionnaire_template_dropdown() throws Throwable {
			clickOnElement(pom.getcreatequestionnairecampaign().getClickmanage_Questionnaire_template());

			sleep(3000);
		}

		@Then("User select on Questionnaires template")
		public void user_select_on_questionnaires_template() throws Throwable {

			clickOnElement(pom.getcreatequestionnairecampaign().getSelectQuestionnairetemplate());
			sleep(2000);
		}

		@Then("User select on Questionnaires complete date")
		public void user_select_on_questionnaires_complete_date() throws Throwable {
			// clickOnElement(pom.getcreatequestionnairecampaign().getQuestionnairecompletd());
			sleep(4000);
		}

		@Then("User click on Teams")
		public void user_click_on_teams() throws Throwable {
			clickOnElement(pom.getcreatequestionnairecampaign().getQuestionnairesTeams());
			sleep(4000);
		
			sleep(4000);
		
			System.out.println("team checking");
//			sleep(4000);
			//////////----------///////////-------
			//driver.findElement(By.xpath("(//div[@class='multiselect__tags'])[2]")).sendKeys("Andover Area HV");
			System.out.println("che");
			
			 WebDriverWait wait = new WebDriverWait(driver, 30); 
			    WebElement button = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//div[@class='multiselect__content-wrapper'])[2]/ul/li/span/span[text()='Andover Area HV'] "))));
			    button.click();
		//driver.findElement(By.xpath("(//div[@class='multiselect__content-wrapper'])[2]/ul/li/span/span[text()='Andover Area HV']")).click();
		//driver.findElement(By.xpath("(//div[@class='multiselect__content-wrapper'])[2]/ul/li/span")).click();
		
		//WebElement element = driver.findElement(By.xpath("(//div[@class='multiselect__content-wrapper'])[2]/ul/li/span/span[text()='Andover Area HV']"));
		//JavascriptExecutor executor = (JavascriptExecutor)driver;
		//executor.executeScript("arguments[0].click();", element);
		//div[@dropdown-id='adminTeams']/child::div[3]/child::ul/child::li[1]/child::span
			//driver.findElement(By.xpath("//div[@dropdown-id='adminTeams']/div[2]/following-sibling::div/ul/li/span/span[text()='Andover Area HV']")).click();
			
		//	btnClick(pom.getcreatequestionnairecampaign().getselectQuestionnairesTeams());
			System.out.println("after check");
			sleep(8000);

			
		}

		@Then("User click on NHS number")
		public void user_click_on_nhs_number() throws Throwable {
			clickOnElement(pom.getcreatequestionnairecampaign().getclicknhsnumberfield());
			sleep(2000);
			
			// clickOnElement(pom.getcreatequestionnairecampaign().getselectnhsnumberfield());
			driver.findElement(By.xpath(
					"(//div[@class='multiselect__content-wrapper'])[3]/ul/li/span/span[contains(text(), '4417564515 (Paula ATKINS)')]"))
					.click();
			//driver.findElement(By.xpath("(//div[@class='multiselect__content-wrapper'])[3]/ul/li/span/span[contains(text(), '0254094147 (Dublin JAMES)')]")).click();

			sleep(3000);
		}

		@Then("User click on confirm & send button")
		public void user_click_on_confirm_send_button() throws Throwable {

			// clickOnElement(pom.getcreatequestionnairecampaign().getQuestionnairecampaignconfirmbutton());
			WebElement button = driver.findElement(By.xpath("//button[text()=' Confirm & Send ']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", button);
			System.out.println("not click");
			sleep(3000);

			WebElement button2 = driver.findElement(By.xpath("//a[text()='Okay']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", button2);
			// clickOnElement(pom.getquestionnaires().getokaypublish());
			sleep(4000);

			
			sleep(3000);

			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,350)");

			sleep(3000);
			
			sleep(5000);
			
			WebElement web = driver.findElement(
					By.xpath("//div[@id='QuestionnaireListNGrid']/div/table/tbody/tr/td[@data-label='Actions']/button"));
			Point coordinates = web.getLocation();
			Robot robot = new Robot();
			robot.mouseMove(0, 0);
			robot.mouseMove(coordinates.getX(), coordinates.getY() + 120);
		}

}
