package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lip_Globals.Base_class;

public class CreateQuestionnaireCampaign extends Base_class {

	public CreateQuestionnaireCampaign() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//button[@class='card-block card-tiles cursor-pointer'])[2]/div/p[text()='Create Questionnaire Campaign ']")
	private WebElement createQuestionnairecampaigncard;

	@FindBy(xpath = "//div[@class='multiselect__tags']/span/span")
	private WebElement clickmanage_Questionnaire_template;

	@FindBy(xpath = "((//div[@class='multiselect__content-wrapper']/ul/li)/span/span[text()='wellbeing'])[1]")
	private WebElement selectQuestionnairetemplate;

	@FindBy(xpath = "//form/div[2]/span/input")
	private WebElement Questionnairecompletd;
	@FindBy(xpath = "//input[@id='calendarDatePickerInput']/following-sibling::div/div")
	private WebElement Questionnairecompletdate;

	@FindBy(xpath = "(//div[@class='multiselect__tags'])[2]")
	private WebElement QuestionnairesTeams;

	@FindBy(xpath = "(//div[@class='multiselect__content-wrapper'])[2]/ul/li/span/span[text()='Andover Area HV']")
	private WebElement selectQuestionnairesTeams;

	@FindBy(xpath = "//form/div[4]/div[2]/span/span")
	private WebElement clicknhsnumberfield;

	@FindBy(xpath = "(//div[@class='multiselect__content-wrapper'])[3]/ul/li/span/span[text()='4417564515']")
	private WebElement selectnhsnumberfield;

	@FindBy(xpath = "//button[text()=' Confirm & Send ']")
	private WebElement Questionnairecampaignconfirmbutton;

	public WebElement getCreateQuestionnairecampaigncard() {
		return createQuestionnairecampaigncard;
	}

	public WebElement getClickmanage_Questionnaire_template() {
		return clickmanage_Questionnaire_template;
	}

	public WebElement getSelectQuestionnairetemplate() {
		return selectQuestionnairetemplate;
	}

	public WebElement getQuestionnairecompletd() {
		return Questionnairecompletd;
	}

	public WebElement getQuestionnairecompletdate() {
		return Questionnairecompletdate;
	}

	public WebElement getQuestionnairesTeams() {
		return QuestionnairesTeams;
	}

	public WebElement getselectQuestionnairesTeams() {
		return selectQuestionnairesTeams;
	}

	public WebElement getclicknhsnumberfield() {
		return clicknhsnumberfield;
	}

	public WebElement getselectnhsnumberfield() {

		return selectnhsnumberfield;
	}

	public WebElement getQuestionnairecampaignconfirmbutton() {
		return Questionnairecampaignconfirmbutton;
	}
}
