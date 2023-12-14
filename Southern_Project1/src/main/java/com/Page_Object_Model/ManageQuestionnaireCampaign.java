package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lip_Globals.Base_class;

public class ManageQuestionnaireCampaign extends Base_class {

	public ManageQuestionnaireCampaign() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//button[@class='card-block card-tiles cursor-pointer'])[3]/div/p[text()='Manage Questionnaire Campaigns ']")
	private WebElement manageQuestionnairecampaigncard;

	@FindBy(xpath = "//div[@id='questionnaire-responses-list-sort-filter-component']/div/div/button/div//*[name()='svg']")
	private WebElement manageQuestionnairefilter;

	@FindBy(xpath = "//div[@class='max-h-[500px] overflow-y-auto px-0']/fieldset/div/span[text()='Basingstoke Central HV']")
	private WebElement selectuserfromfilter;

	@FindBy(xpath = "//div[@class='text-right px-3 py-2']/button")
	private WebElement clickApplybutton;

	public WebElement getManageQuestionnairecampaigncard() {
		return manageQuestionnairecampaigncard;
	}

	public WebElement getManageQuestionnairefilter() {
		return manageQuestionnairefilter;
	}

	public WebElement getSelectuserfromfilter() {
		return selectuserfromfilter;
	}

	public WebElement getClickApplybutton() {
		return clickApplybutton;
	}

}
