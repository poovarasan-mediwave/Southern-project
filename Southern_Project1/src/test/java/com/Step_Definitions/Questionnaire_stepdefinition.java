package com.Step_Definitions;

import com.Lip_Globals.Base_class;
import com.Singleton_Design_Pattern.Singleton;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.Configuration_Reader.FileReaderManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Questionnaire_stepdefinition extends Base_class{
	
	


		public Singleton pom = new Singleton();
		JavascriptExecutor js;

		@Given("User launch URL for southern Questionnaires")
		
		  public void user_launch_url_for_southern_questionnaires() throws Throwable {
			get_Driver("chrome");
			String url = FileReaderManager.getInstanceCR().getURL();
			geturl(url);
		}
		

		@When("User enters valid {string} in Emailaddres field for Questionnaires")
		public void user_enters_valid_in_emailaddres_field_for_questionnaires(String string) throws Throwable {
			
			String getcreateemail = FileReaderManager.getInstanceCR().getcreateemail();
			System.out.println(getcreateemail);
			Inputvalues(pom.getlogin().getEmail(), getcreateemail);
			sleep(2000);
		}

		@Then("User enters {string} in Passowrd for Questionnaires")
		public void user_enters_in_passowrd_for_questionnaires(String string) throws Throwable {
			// Inputvalues(pom.getlogin().getPassword(), "Southern@1234");
			String getCreatorPassword = FileReaderManager.getInstanceCR().getCreatorPassword();
			Inputvalues(pom.getlogin().getPassword(), getCreatorPassword);
			sleep(3000);
		}

		@Then("User select recaptcha checkbox for Questionnaires")
		public void user_select_recaptcha_checkbox_for_questionnaires() throws Throwable {

			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,250)");
			sleep(5000);
			clickOnElement(pom.getlogin().getRecaptcha());
					sleep(5000);
		}

		@Then("Click on Submit button for Questionnaires")
		public void click_on_submit_button_for_questionnaires() throws Throwable {
			sleep(5000);
			System.out.println("loginbut");
			// clickOnElement(pom.getlogin().getLoginbtn());
			// Sleep(5000);

			WebElement button = driver.findElement(By.xpath("//button[text()='Log in']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", button);

			System.out.println("loginbutton");
			sleep(3000);
		}

		@Then("select Questionnaires module in dashbaord")
		public void select_questionnaires_module_in_dashbaord() throws Throwable {

			
			clickOnElement(pom.getquestionnaires().getQuestionnairescard());
			System.out.println("loginbutton");
			sleep(4000);
		}

		@Then("select manage Questionnaires templete for Questionnaires")
		public void select_manage_questionnaires_templete_for_questionnaires() throws Throwable {
			clickOnElement(pom.getquestionnaires().getmanage_Questionnaire_template());
			sleep(3000);
		}

		@Then("click on create_Questionnaire_template for Questionnaires")
		public void click_on_create_questionnaire_template_for_questionnaires() throws Throwable {

			new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath(
					"//button[@class='btn btn-primary cursor-pointer']//span[text()='Create New Questionnaire Template']")))
					.click();
			
			sleep(3000);
		}

		@Then("User input title name for Questionnaires")
		public void user_input_title_name_for_questionnaires() throws Throwable {
			String questionnaire_title = FileReaderManager.getInstanceCR().getQuestionnaire_title();
			Inputvalues(pom.getquestionnaires().getQuestionnaire_title(), questionnaire_title);
			sleep(3000);
		}

		@Then("User input welcome information for Questionnaires")
		public void user_input_welcome_information_for_questionnaires() throws Throwable {
			clickOnElement(pom.getquestionnaires().getwelcomeinfo_downarrow());
			sleep(3000);
			String welcome_information = FileReaderManager.getInstanceCR().getwelcome_information();
			Inputvalues(pom.getquestionnaires().getwelcome_information(), welcome_information);
			sleep(3000);
		}
		/// /////////////////////////////////

		@Then("User click on section1 button for Questionnaires")
		public void user_click_on_section1_button_for_questionnaires() throws Throwable {
			clickOnElement(pom.getquestionnaires().getsection1arrow());
			sleep(3000);
		}

		@Then("User input section title for Questionnaires")
		public void user_input_section_title_for_questionnaires() throws Throwable {
			String questionnaire_section = FileReaderManager.getInstanceCR().getQuestionnaire_section();
			Inputvalues(pom.getquestionnaires().getsection1title(), questionnaire_section);
			sleep(3000);
		}

		@Then("User input section description for Questionnaires")
		public void user_input_section_description_for_questionnaires() throws Throwable {
			String questionnaire_description = FileReaderManager.getInstanceCR()
					.getQuestionnaire_description();
			Inputvalues(pom.getquestionnaires().getsection1description(), questionnaire_description);
			sleep(3000);
		}

		@Then("User click on single_line_text radio button")
		public void user_click_on_single_line_text_radio_button() throws Throwable {
			// clickOnElement(pom.getquestionnaires().getAdd_Question());
			clickOnElement(pom.getquestionnaires().getsinglelinetextradio());
			sleep(3000);
		}

		@Then("User input on single_line_text for Questionnaires")
		public void user_input_on_single_line_text_for_questionnaires() throws Throwable {
			String getsinglelinetext = FileReaderManager.getInstanceCR().getsinglelinetext();
			Inputvalues(pom.getquestionnaires().getsinglelinetext(), getsinglelinetext);
			sleep(3000);
		}

		@Then("User click on Add_Question button for Questionnaires")
		public void user_click_on_add_question_button_for_questionnaires() throws Throwable {
			sleep(3000);
			clickOnElement(pom.getquestionnaires().getAdd_Question());
		}

		@Then("User click on Free_Text radio button for Questionnaires")
		public void user_click_on_free_text_radio_button_for_questionnaires() throws Throwable {
			// clickOnElement(pom.getquestionnaires().getAdd_Question());
			clickOnElement(pom.getquestionnaires().getfreetextradio());
			sleep(3000);
		}

		@Then("User input on Free_text field for Questionnaires")
		public void user_input_on_free_text_field_for_questionnaires() throws Throwable {
			String getfreetext = FileReaderManager.getInstanceCR().getfreetext();
			Inputvalues(pom.getquestionnaires().getfreetext(), getfreetext);
			sleep(3000);
		}

		@Then("User click on Multiplechoice radio button for Questionnaires")
		public void user_click_on_multiplechoice_radio_button_for_questionnaires() throws Throwable {
			clickOnElement(pom.getquestionnaires().getAdd_Question());
			sleep(2000);
			clickOnElement(pom.getquestionnaires().getmultiplechoiceradio());
			sleep(3000);

		}

		@Then("User input on Multiplechoice text field for Questionnaires")
		public void user_input_on_multiplechoice_text_field_for_questionnaires() throws Throwable {
			 String getmultiplechoicetext = FileReaderManager.getInstanceCR().getmultiplechoicetext();
			 Inputvalues(pom.getquestionnaires().getmultiplechoicetext(), getmultiplechoicetext);
			sleep(3000);
		}

		@Then("User click on Question type option for Questionnaires")
		public void user_click_on_question_type_option_for_questionnaires() throws Throwable {

			clickOnElement(pom.getquestionnaires().getmultipleQuetiontype());
			sleep(2000);
			clickOnElement(pom.getquestionnaires().getmultipleQuetiontypeoptions());
			sleep(3000);

		}

		@Then("User input on Multiple choice option1 for Questionnaires")
		public void user_input_on_multiple_choice_option1_for_questionnaires() throws Throwable {
			String getmultiplechoiceoption1 = FileReaderManager.getInstanceCR().getmultiplechoiceoption1();
			Inputvalues(pom.getquestionnaires().getmultiplechoiceoption1(), getmultiplechoiceoption1);
			sleep(3000);
		}

		@Then("User input on Multiple choice option2 for Questionnaires")
		public void user_input_on_multiple_choice_option2_for_questionnaires() throws Throwable {
			String getmultiplechoiceoption2 = FileReaderManager.getInstanceCR().getmultiplechoiceoption2();
			Inputvalues(pom.getquestionnaires().getmultiplechoiceoption2(), getmultiplechoiceoption2);
			sleep(3000);
		}

		@Then("User click on dropdown radio for Questionnaires")
		public void user_click_on_dropdown_radio_for_questionnaires() throws Throwable {
			clickOnElement(pom.getquestionnaires().getAdd_Question());
			sleep(2000);
			clickOnElement(pom.getquestionnaires().getdropdownradio());
			sleep(3000);
		}

		@Then("User input on dropdown text field for Questionnaires")
		public void user_input_on_dropdown_text_field_for_questionnaires() throws Throwable {
			String getdropdowntext = FileReaderManager.getInstanceCR().getdropdowntext();
			Inputvalues(pom.getquestionnaires().getdropdowntext(), getdropdowntext);
			sleep(3000);
		}

		@Then("User input on dropdown option1 field for Questionnaires")
		public void user_input_on_dropdown_option1_field_for_questionnaires() throws Throwable {
			String getdropdownoption1 = FileReaderManager.getInstanceCR().getdropdownoption1();
			Inputvalues(pom.getquestionnaires().getdropdownoption1(), getdropdownoption1);
			sleep(3000);
		}

		@Then("User input on dropdown option2 field for Questionnaires")
		public void user_input_on_dropdown_option2_field_for_questionnaires() throws Throwable {
			String dropdownoption2 = FileReaderManager.getInstanceCR().dropdownoption2();
			Inputvalues(pom.getquestionnaires().getdropdownoption2(), dropdownoption2);
			sleep(3000);
		}

		@Then("User input on Likert field for Questionnaires")
		public void user_input_on_likert_field_for_questionnaires() throws Throwable {
			clickOnElement(pom.getquestionnaires().getAdd_Question());
			sleep(2000);
			clickOnElement(pom.getquestionnaires().getLikertradio());
			sleep(3000);
			String getLikerttext = FileReaderManager.getInstanceCR().getLikerttext();
			Inputvalues(pom.getquestionnaires().getLikerttext(), getLikerttext);
			sleep(3000);

		}

		@Then("User input on set metric option for Questionnaires")
		public void user_input_on_set_metric_option_for_questionnaires() throws Throwable {
			sleep(3000);
			clickOnElement(pom.getquestionnaires().getsetmetricthree());
		}

		@Then("User input on Likert response1 for Questionnaires")
		public void user_input_on_likert_response1_for_questionnaires() throws Throwable {
			String getLikertresponse1 = FileReaderManager.getInstanceCR().getLikertresponse1();
			Inputvalues(pom.getquestionnaires().getLikertresponse1(), getLikertresponse1);
			sleep(3000);
		}

		@Then("User input on Likert response2 for Questionnaires")
		public void user_input_on_likert_response2_for_questionnaires() throws Throwable {
			String getLikertresponse2 = FileReaderManager.getInstanceCR().getLikertresponse2();
			Inputvalues(pom.getquestionnaires().getLikertresponse2(), getLikertresponse2);
			sleep(3000);
		}

		@Then("User input on likert response3 for Questionnaires")
		public void user_input_on_likert_response3_for_questionnaires() throws Throwable {
			String getLikertresponse3 = FileReaderManager.getInstanceCR().getLikertresponse3();
			Inputvalues(pom.getquestionnaires().getLikertresponse3(), getLikertresponse3);
			sleep(3000);
		}

		@Then("User click on Imageradio button for Questionnaires")
		public void user_click_on_imageradio_button_for_questionnaires() throws Throwable {
			clickOnElement(pom.getquestionnaires().getAdd_Question());
			sleep(2000);
			clickOnElement(pom.getquestionnaires().getimageradio());
			sleep(3000);
		}

		@Then("user click on select image for Questionnaires")
		public void user_click_on_select_image_for_questionnaires() throws Throwable {
			sleep(6000);

			WebElement svgObj = driver.findElement(
					By.xpath("//input[@id='question-imagery-upload-q-imagery-0-5']/parent::div/div/*[name()='svg']"));
			Actions actionBuilder = new Actions(driver);
			actionBuilder.click(svgObj).build().perform();
			sleep(8000);

			Robot rb = new Robot();
			StringSelection Other_file = new StringSelection("C:\\Users\\mindwave\\mcuhero.png");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Other_file, null);
			rb.delay(1000);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			sleep(2000);

		}

		@Then("user input on image text for Questionnaires")
		public void user_input_on_image_text_for_questionnaires() throws Throwable {
			String getimagetextarea = FileReaderManager.getInstanceCR().getimagetextarea();
			Inputvalues(pom.getquestionnaires().getimagetextarea(), getimagetextarea);
			sleep(3000);
		}

		@Then("User click on Dateradio button for Questionnaires")
		public void user_click_on_dateradio_button_for_questionnaires() throws Throwable {
			clickOnElement(pom.getquestionnaires().getAdd_Question());
			sleep(2000);
			clickOnElement(pom.getquestionnaires().getDateradio());
			sleep(3000);
		}

		@Then("User input on Date text for Questionnaires")
		public void user_input_on_date_text_for_questionnaires() throws Throwable {
			sleep(3000);
			String getDatetext = FileReaderManager.getInstanceCR().getDatetext();
			Inputvalues(pom.getquestionnaires().getDatetext(), getDatetext);
		}

		@Then("User click on Dateandtimeradio button for Questionnaires")
		public void user_click_on_dateandtimeradio_button_for_questionnaires() throws Throwable {
			clickOnElement(pom.getquestionnaires().getAdd_Question());
			sleep(2000);
			clickOnElement(pom.getquestionnaires().getDate_timeradio());
			sleep(3000);
		}

		@Then("User input on Dateandtime text for Questionnaires")
		public void user_input_on_dateandtime_text_for_questionnaires() throws Throwable {
			sleep(3000);
			String getDate_timetext = FileReaderManager.getInstanceCR().getDate_timetext();
			Inputvalues(pom.getquestionnaires().getDate_timetext(), getDate_timetext);
		}

		@Then("User click on Numberradio button for Questionnaires")
		public void user_click_on_numberradio_button_for_questionnaires() throws Throwable {
			clickOnElement(pom.getquestionnaires().getAdd_Question());
			sleep(2000);
			clickOnElement(pom.getquestionnaires().getNumberradio());
			sleep(3000);
		}

		@Then("User input on Number for Questionnaires")
		public void user_input_on_number_for_questionnaires() throws Throwable {
			sleep(3000);
			String getNumbertext = FileReaderManager.getInstanceCR().getNumbertext();
			Inputvalues(pom.getquestionnaires().getNumbertext(), getNumbertext);
		}

		@Then("User click on Informationradio button for Questionnaires")
		public void user_click_on_informationradio_button_for_questionnaires() throws Throwable {
			clickOnElement(pom.getquestionnaires().getAdd_Question());
			sleep(2000);
			clickOnElement(pom.getquestionnaires().getInformationradio());
			sleep(3000);
		}

		@Then("User input on Informationtext for Questionnaires")
		public void user_input_on_informationtext_for_questionnaires() throws Throwable {
			sleep(3000);
			String getInformationtext = FileReaderManager.getInstanceCR().getInformationtext();
			Inputvalues(pom.getquestionnaires().getInformationtext(), getInformationtext);
		}

		@Then("User click on Hyperlinkradio button for Questionnaires")
		public void user_click_on_hyperlinkradio_button_for_questionnaires() throws Throwable {
			clickOnElement(pom.getquestionnaires().getAdd_Question());
			sleep(2000);
			clickOnElement(pom.getquestionnaires().getHyperlinkradio());
			sleep(3000);
		}

		@Then("User input on Hyperlink text for Questionnaires")
		public void user_input_on_hyperlink_text_for_questionnaires() throws Throwable {
			sleep(3000);
			String getHyperlinktext = FileReaderManager.getInstanceCR().getHyperlinktext();
			Inputvalues(pom.getquestionnaires().getHyperlinktext(), getHyperlinktext);
		}

		@Then("User click on closinginformation section for Questionnaires")
		public void user_click_on_closinginformation_section_for_questionnaires() throws Throwable {
			// clickOnElement(pom.getquestionnaires().getAdd_Question());
			
			clickOnElement(pom.getquestionnaires().getClosinginformationradio());
			sleep(3000);
		}

		@Then("User input on closinginformation text for Questionnaires")
		public void user_input_on_closinginformation_text_for_questionnaires() throws Throwable {
			sleep(3000);
			String getClosinginformationtextarea = FileReaderManager.getInstanceCR().getClosinginformationtextarea();
			Inputvalues(pom.getquestionnaires().getClosinginformationtextarea(),
					getClosinginformationtextarea);
		}

		@Then("User click on sendoutparameter section for Questionnaires")
		public void user_click_on_sendoutparameter_section_for_questionnaires() throws Throwable {
			sleep(3000);
			clickOnElement(pom.getquestionnaires().getsendoutparametersection());
		}

		@Then("User clickk on sendout checkbox for Questionnaires")
		public void user_clickk_on_sendout_checkbox_for_questionnaires() throws Throwable {
			sleep(3000);
			clickOnElement(pom.getquestionnaires().getSOPNHScheckbox());
		}

		@Then("User click on Publish button for Questionnaires")
		public void user_click_on_publish_button_for_questionnaires() throws Throwable {
			sleep(3000);
			clickOnElement(pom.getquestionnaires().getPublish());

		}

		@Then("user click on okay button for publish Questionnaires")
		public void user_click_on_okay_button_for_publish_questionnaires() throws Throwable {
			sleep(5000);
			clickOnElement(pom.getquestionnaires().getokaypublish());
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,250)");
		}

}
