package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lip_Globals.Base_class;

public class SouthernQuestionnaire extends Base_class {

	public SouthernQuestionnaire() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[6]/div//*[name()='svg']/following-sibling::p")
	private WebElement Questionnairescard;

	@FindBy(xpath = "//button/div/p[text()='Manage Questionnaire Templates']")
	private WebElement manage_Questionnaire_template;

	@FindBy(xpath = "//button[@class='btn btn-primary cursor-pointer']/span[text()='Create New Questionnaire Template']")
	private WebElement create_new_Questionnaires_template;

	@FindBy(xpath = "//input[@id='questionnaire-title-q-title-accordian']")
	private WebElement Questionnaire_title;

	@FindBy(xpath = "(//label[@class='accordion-card'])[2]")
	private WebElement welcomeinfo_downarrow;

	@FindBy(xpath = "//textarea[@id='questionnaire-welcome-info-q-info-accordian']")
	private WebElement welcome_information;

	@FindBy(xpath = "(//div[@class='grid grid-cols-1 gap-4'])[1]")
	private WebElement section1arrow;

	@FindBy(xpath = "//input[@id='section-input-0']")
	private WebElement section1title;

	@FindBy(xpath = "//input[@id='section-description0']")
	private WebElement section1description;

	@FindBy(xpath = "//div[@id='qQuestion']/label/input[@value='single-text']")
	private WebElement singlelinetextradio;

	@FindBy(xpath = "//input[@placeholder='Type a single line text question here']")
	private WebElement singlelinetext;

	@FindBy(xpath = "//span[contains(text(),'Add Question')]")
	private WebElement Add_Question;

	@FindBy(xpath = "//div[@id='qQuestion']/label/input[@value='free-text']")
	private WebElement freetextradio;
	@FindBy(xpath = "(//input[@placeholder='Type a free text question here'])[1]")
	private WebElement freetext;

	// --add Question button require multiple choice---//
	@FindBy(xpath = "//div[@id='qQuestion']/label/input[@value='multiple-choice']")
	private WebElement multiplechoiceradio;
	// (//input[@placeholder='Type a free text question here'])[2]
	@FindBy(xpath = "//input[@id='question-input-q-multiple-choice-0-2']")
	private WebElement multiplechoicetext;

	@FindBy(xpath = "(//label[contains(text(),'Select question type')])")
	private WebElement multipleQuetiontype;

	@FindBy(xpath = "//label[contains(text(),'Select question type')]//parent::div/parent::div/following-sibling::div/div/div[2]/div/div[1]/span")
	private WebElement multipleQuetiontypeoptions;
	@FindBy(xpath = "//div/p[text()='Multiple choice options']/following-sibling::div[2]/div/div/div/div/input[@id='multiple-choice-option-q-multiple-choice-0-20-option-input-0']")
	private WebElement multiplechoiceoption1;
	@FindBy(xpath = "//div/p[text()='Multiple choice options']/following-sibling::div[2]/div/div/div/div/input[@id='multiple-choice-option-q-multiple-choice-0-21-option-input-1']")
	private WebElement multiplechoiceoption2;

	// --add Question button require drop down ---//

	// input[@placeholder='Type a question here that requires a dropdown response']
	@FindBy(xpath = "//div[@id='qQuestion']/label/input[@value='dropdown']")
	private WebElement dropdownradio;
	@FindBy(xpath = "//div/label[text()='Dropdown *']/parent::div/following-sibling::div/input[@id='question-input-q-dropdown-0-3']")
	private WebElement dropdowntext;

	@FindBy(xpath = "//div/label[text()='Dropdown *']/parent::div/following-sibling::div[3]/div[2]/div/div/div/div/input[@id='dropdown-option-q-dropdown-0-30-option-input-0']")
	private WebElement dropdownoption1;
	@FindBy(xpath = "//div/label[text()='Dropdown *']/parent::div/following-sibling::div[3]/div[2]/div/div/div[2]/div/input[@id='dropdown-option-q-dropdown-0-31-option-input-1']")
	private WebElement dropdownoption2;

	// --add Question button require likert ---//
	@FindBy(xpath = "//div[@id='qQuestion']/label/input[@value='likert']")
	private WebElement Likertradio;
	@FindBy(xpath = "//div/label[text()='Likert *']/parent::div/following-sibling::div/input[@id='question-input-q-likert-0-4']")
	private WebElement Likerttext;
	@FindBy(xpath = "//div[@id='radio-button-div-likert-metric-type-selection']/label/input[@name='3 point scale']")
	private WebElement setmetricthree;
	@FindBy(xpath = "(//div/p[text()='Enter your responses *']/following-sibling::div[2]/div/input[@placeholder='Enter your response *'])[1]")
	private WebElement Likertresponse1;
	@FindBy(xpath = "(//div/p[text()='Enter your responses *']/following-sibling::div[2]/div/input[@placeholder='Enter your response *'])[2]")
	private WebElement Likertresponse2;
	@FindBy(xpath = "(//div/p[text()='Enter your responses *']/following-sibling::div[2]/div/input[@placeholder='Enter your response *'])[3]")
	private WebElement Likertresponse3;

	// --add Question button require image ---//
	@FindBy(xpath = "//div[@id='qQuestion']/label/input[@value='imagery']")
	private WebElement imageradio;
	// input[@id='question-imagery-upload-q-imagery-0-5']
	// input[@accept='image/*']
	@FindBy(xpath = "//input[@id='question-imagery-upload-q-imagery-0-5']")
	private WebElement imageicon;
	@FindBy(xpath = " //input[@placeholder='Type a imagery question here *']")
	private WebElement imagetextarea;

	// --add Question button require date ---//
	@FindBy(xpath = "//div[@id='qQuestion']/label/input[@value='date']")
	private WebElement Dateradio;
	@FindBy(xpath = "//input[@id='question-input-q-date-0-6']")
	private WebElement Datetext;

	// --add Question button require date & time ---//
	@FindBy(xpath = "//div[@id='qQuestion']/label/input[@value='dateTime']")
	private WebElement Date_timeradio;
	@FindBy(xpath = "//input[@id='question-input-q-date-time-0-7']")
	private WebElement Date_timetext;
	// --add Question button require number ---//
	@FindBy(xpath = "//div[@id='qQuestion']/label/input[@value='number']")
	private WebElement Numberradio;
	@FindBy(xpath = "//input[@placeholder='Type a number question here']")
	private WebElement Numbertext;

	// --add Question button require information ---//
	@FindBy(xpath = "//div[@id='qQuestion']/label/input[@value='information']")
	private WebElement Informationradio;
	@FindBy(xpath = "//textarea[@id='question-input-q-information-0-9']")
	private WebElement Informationtext;

	// --add Question button require Hyperlink ---//
	@FindBy(xpath = "//div[@id='qQuestion']/label/input[@value='hyperlink']")
	private WebElement Hyperlinkradio;
	@FindBy(xpath = "//input[@placeholder='Type a hyperlink question here']")
	private WebElement Hyperlinktext;

	// --closing information ---//
	@FindBy(xpath = "//input[@id='checkbox-input-q-closing-info-accordian']/following-sibling::label")
	private WebElement Closinginformationsection;
	@FindBy(xpath = "//textarea[@id='questionnaire-closing-info-q-closing-info-accordian']")
	private WebElement Closinginformationtextarea;

	// --send out parameter ---//
	@FindBy(xpath = "//input[@id='checkbox-input-q-parameters-accordian']/following-sibling::label")
	private WebElement sendoutparametersection;
	@FindBy(xpath = "//div[@id='checkbox-button-div-send-out-parameter-selection']/label/input[@value='nhs']")
	private WebElement SOPNHScheckbox;
	@FindBy(xpath = "//div[@id='checkbox-button-div-send-out-parameter-selection']/label/input[@value='ageDob']")
	private WebElement SOPDOBrange;
	@FindBy(xpath = "//div[@id='checkbox-button-div-send-out-parameter-selection']/label/input[@value='locationTeam']")
	private WebElement SOPTeamreferred;
	@FindBy(xpath = "//div[@id='checkbox-button-div-send-out-parameter-selection']/label/input[@value='gp']")
	private WebElement SOPGPPractice;
	@FindBy(xpath = "//div[@id='checkbox-button-div-send-out-parameter-selection']/label/input[@value='haveAppointment']")
	private WebElement SOPAppointmentdaterange;
	@FindBy(xpath = "//div[@id='checkbox-button-div-send-out-parameter-selection']/label/input[@value='appointmentVenue']")
	private WebElement SOPAppointmentvenue;
	@FindBy(xpath = "//div[@id='checkbox-button-div-send-out-parameter-selection']/label/input[@value='appointmentType']")
	private WebElement SOPAppointmenttype;
	@FindBy(xpath = "//div[@id='checkbox-button-div-send-out-parameter-selection']/label/input[@value='school']")
	private WebElement SOPschool;

	// --anonymous ---//
	@FindBy(xpath = "//input[@id='toggleBtn-super-admin-anonymosie']")
	private WebElement Anonymosie;

	@FindBy(xpath = "(//button[@aria-label='Save'])[1]")
	private WebElement Saveasdraft;
	@FindBy(xpath = "//button[@aria-label='review']")
	private WebElement Preview;
	@FindBy(xpath = "(//button[@aria-label='Save'])[2]")
	private WebElement Publish;
	@FindBy(xpath = "//a[text()='Okay']")
	private WebElement okaypublish;

	public WebElement getQuestionnairescard() {
		return Questionnairescard;
	}

	public WebElement getmanage_Questionnaire_template() {
		return manage_Questionnaire_template;
	}

	public WebElement getcreate_new_Questionnaires_template() {
		return create_new_Questionnaires_template;
	}

	public WebElement getQuestionnaire_title() {
		return Questionnaire_title;
	}

	public WebElement getwelcomeinfo_downarrow() {
		return welcomeinfo_downarrow;
	}

	public WebElement getwelcome_information() {
		return welcome_information;
	}

	public WebElement getsection1arrow() {
		return section1arrow;
	}

	public WebElement getsection1title() {
		return section1title;
	}

	public WebElement getsection1description() {
		return section1description;
	}

	public WebElement getsinglelinetextradio() {
		return singlelinetextradio;
	}

	public WebElement getsinglelinetext() {
		return singlelinetext;
	}

	/**** Add Question ***/
	public WebElement getAdd_Question() {
		return Add_Question;
	}

	////////////
	public WebElement getfreetextradio() {
		return freetextradio;
	}

	public WebElement getfreetext() {
		return freetext;
	}

	public WebElement getmultiplechoiceradio() {
		return multiplechoiceradio;
	}

	public WebElement getmultiplechoicetext() {
		return multiplechoicetext;
	}

	public WebElement getmultipleQuetiontypeoptions() {
		return multipleQuetiontypeoptions;
	}

	public WebElement getmultiplechoiceoption1() {
		return multiplechoiceoption1;
	}

	public WebElement getmultiplechoiceoption2() {
		return multiplechoiceoption2;
	}

	public WebElement getdropdownradio() {
		return dropdownradio;
	}

	public WebElement getdropdowntext() {
		return dropdowntext;
	}

	public WebElement getdropdownoption1() {
		return dropdownoption1;
	}

	public WebElement getdropdownoption2() {
		return dropdownoption2;
	}

	public WebElement getLikertradio() {
		return Likertradio;
	}

	public WebElement getLikerttext() {
		return Likerttext;
	}

	public WebElement getsetmetricthree() {
		return setmetricthree;
	}

	public WebElement getLikertresponse1() {
		return Likertresponse1;
	}

	public WebElement getLikertresponse2() {
		return Likertresponse2;
	}

	public WebElement getLikertresponse3() {
		return Likertresponse3;
	}

	public WebElement getimageradio() {
		return imageradio;
	}

	public WebElement getimageicon() {
		return imageicon;
	}

	public WebElement getimagetextarea() {
		return imagetextarea;
	}

	public WebElement getDateradio() {
		return Dateradio;
	}

	public WebElement getDatetext() {
		return Datetext;
	}

	public WebElement getDate_timeradio() {
		return Date_timeradio;
	}

	public WebElement getDate_timetext() {
		return Date_timetext;
	}

	public WebElement getNumberradio() {
		return Numberradio;
	}

	public WebElement getNumbertext() {
		return Numbertext;
	}

	public WebElement getInformationradio() {
		return Informationradio;
	}

	public WebElement getInformationtext() {
		return Informationtext;
	}

	public WebElement getHyperlinkradio() {
		return Hyperlinkradio;
	}

	public WebElement getHyperlinktext() {
		return Hyperlinktext;
	}

	public WebElement getClosinginformationradio() {
		return Closinginformationsection;
	}

	public WebElement getClosinginformationtextarea() {
		return Closinginformationtextarea;
	}

	public WebElement getsendoutparametersection() {
		return sendoutparametersection;
	}

	public WebElement getSOPNHScheckbox() {
		return SOPNHScheckbox;
	}

	public WebElement getSOPDOBrange() {
		return SOPDOBrange;
	}

	public WebElement getSOPTeamreferred() {
		return SOPTeamreferred;
	}

	public WebElement getSOPGPPractice() {
		return SOPGPPractice;
	}

	public WebElement getSOPAppointmentdaterange() {
		return SOPAppointmentdaterange;
	}

	public WebElement getSOPAppointmentvenue() {
		return SOPAppointmentvenue;
	}

	public WebElement getSOPschool() {
		return SOPschool;
	}

	public WebElement getAnonymosie() {
		return Anonymosie;
	}

	public WebElement getSaveasdraft() {
		return Saveasdraft;
	}

	public WebElement getPreview() {
		return Preview;
	}

	public WebElement getPublish() {
		return Publish;
	}

	public WebElement getmultipleQuetiontype() {
		return multipleQuetiontype;
	}

	// multipleQuetiontype
	// button[text()='Okay']
	public WebElement getokaypublish() {
		return okaypublish;
	}
}
