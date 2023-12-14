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
public class ManageQuestionnaireCompaign_step extends Base_class{

	


		public static Singleton pom = new Singleton();
		 JavascriptExecutor js ;
		 
		 Questionnaire_stepdefinition questionnaireSD= new Questionnaire_stepdefinition();
		 
		@Given("User launch URL for ManageQuestionnairecampaign")
		public void user_launch_url_for_manage_questionnairecampaign() throws Throwable {
			questionnaireSD.user_launch_url_for_southern_questionnaires();		
			 Sleep(3000); 
		}

		@When("User enters valid {string} in Emailaddres field for ManageQuestionnairecampaign")
		public void user_enters_valid_in_emailaddres_field_for_manage_questionnairecampaign(String string) throws Throwable {
			questionnaireSD.user_enters_valid_in_emailaddres_field_for_questionnaires(string);		
			sleep(2000);
		}
		@Then("User enters {string} in Passowrd for ManageQuestionnairecampaign")
		public void user_enters_in_passowrd_for_manage_questionnairecampaign(String string) throws Throwable {
			questionnaireSD.user_enters_in_passowrd_for_questionnaires(string);		
			sleep(2000);
		}
		@Then("User select recaptcha checkbox for ManageQuestionnairecampaign")
		public void user_select_recaptcha_checkbox_for_manage_questionnairecampaign() throws Throwable {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,250)");
			sleep(5000);
			clickOnElement(pom.getlogin().getRecaptcha());
		}
		@Then("Click on Submit button for ManageQuestionnairecampaign")
		public void click_on_submit_button_for_manage_questionnairecampaign() throws Throwable {
			sleep(5000);
			questionnaireSD.click_on_submit_button_for_questionnaires();
		}
		@Then("User click on Manage_Questionnaire_campaingn")
		public void user_click_on_manage_questionnaire_campaingn() throws Throwable {
		
			sleep(5000);
			clickOnElement(pom.getquestionnaires().getQuestionnairescard());
			sleep(2000);
			clickOnElement(pom.getmanageQuestionnairecampaign().getManageQuestionnairecampaigncard());
			sleep(3000);
		}
		@Then("User click on filter option")
		public void user_click_on_filter_option() throws Throwable {
			clickOnElement(pom.getmanageQuestionnairecampaign().getManageQuestionnairefilter());
			sleep(3000);
		}
		@Then("User select on administration username")
		public void user_select_on_administration_username() throws Throwable {
			clickOnElement(pom.getmanageQuestionnairecampaign().getSelectuserfromfilter());
			
		
			WebElement element = driver.findElement(By.xpath("//div[@class='text-right px-3 py-2']/button"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			
			sleep(3000);
			clickOnElement(pom.getmanageQuestionnairecampaign().getClickApplybutton());
			//Sleep(3000);
			
		}
		@Then("User click on eye icon")
		public void user_click_on_eye_icon() throws Throwable {
			
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,650)");
			sleep(3000);
			///SEND REMINDER
		/*	WebElement scroll1 = driver.findElement(By.xpath("(//tbody/tr/td[@data-label='Send reminder'])[1]/button//*[name()='svg']/*[name()='g']"));
	     	((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = arguments[0].offsetWidth", scroll1);
	    	Sleep(3000);
	    	driver.findElement(By.xpath("(//tbody/tr/td[@data-label='Send reminder'])[1]/button//*[name()='svg']/*[name()='g']"));
	    	Sleep(3000);
	    	driver.findElement(By.xpath("(//tbody/tr/td[@data-label='Send reminder'])[1]/button//*[name()='svg']/*[name()='g']")).click();
	    	Sleep(3000);	
	     	driver.findElement(By.xpath("//textarea[@id='Notes']")).sendKeys("we add reminder for Questionnaire");
	    	Sleep(3000);
	    	driver.findElement(By.xpath("//button[text()=' Confirm & Send ']")).click();
		    Sleep(3000);
		    driver.findElement(By.xpath("//a[@id='success-ok-btn']")).click();
	        Sleep(3000);
	     	*/
			//EYE ICON
			WebElement scroll = driver.findElement(By.xpath("((//tbody/tr/td[@data-label='Actions'])[1]/button//*[name()='svg']//*[name()='g'])[1]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = arguments[0].offsetWidth", scroll);
			sleep(3000);
			driver.findElement(By.xpath("((//tbody/tr/td[@data-label='Actions'])[1]/button//*[name()='svg']//*[name()='g'])[1]"));
			sleep(3000);
			driver.findElement(By.xpath("((//tbody/tr/td[@data-label='Actions'])[1]/button//*[name()='svg']//*[name()='g'])[1]")).click();	
				
			JavascriptExecutor jse1 = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,650)");
			sleep(3000);
			System.out.println("almost near");
			///
			//WebElement scroll1 = driver.findElement(By.xpath("//td[@data-label='View Answer']/button"));
			//((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = arguments[0].offsetWidth", scroll1);
			System.out.println("completed");
		}
}
