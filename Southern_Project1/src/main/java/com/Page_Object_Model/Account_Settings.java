package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lip_Globals.Base_class;

public class Account_Settings extends Base_class {

	public Account_Settings() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='email']")
	private WebElement AlreadySignUp;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;

	@FindBy(xpath = "(//button[contains(@class,'btn ')])[1]")
	private WebElement Login;

	@FindBy(xpath = "//button[@aria-label='Menu items']")
	private WebElement BentoMenu;

	@FindBy(xpath = "//div[@id='southern-vueapp-menu']/div/li/a[@href='/feedback']")
	private WebElement Feedbackmenu;

	@FindBy(xpath = "//input[@placeholder='Enter your subject']")
	private WebElement SubjectField;

	@FindBy(xpath = "//textarea[@placeholder='Enter your feedback']")
	private WebElement SuggestionsField;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement SubmitFeedback;

	@FindBy(xpath = "//h3[text()='Success']")
	private WebElement SuccessText;

	@FindBy(xpath = "//div[text()='Thank you for your valuable feedback.']")
	private WebElement ConfirmMesg;

	@FindBy(xpath = "//a[text()='Okay']")
	private WebElement OkayButton;

	@FindBy(xpath = "//div[@id='southern-vueapp-menu']/div/div/button/li[@aria-label='Account settings']")
	private WebElement Accountsettingsmenu;

	@FindBy(xpath = "(//a[contains(@class,'block text-purple-600')])[1]")
	private WebElement profilemenu;

	@FindBy(xpath = "(//label[text()='Last Name']/following::input)[1]")
	private WebElement lastname;

	@FindBy(xpath = "//button[text()[normalize-space()='Update profile']]")
	private WebElement updatebutton;

	public WebElement getBentoMenu() {
		return BentoMenu;
	}

	public WebElement getFeedbackmenu() {
		return Feedbackmenu;
	}

	public WebElement getSubjectField() {
		return SubjectField;
	}

	public WebElement getSuggestionsField() {
		return SuggestionsField;
	}

	public WebElement getSubmitFeedback() {
		return SubmitFeedback;
	}

	public WebElement getSuccessText() {
		return SuccessText;
	}

	public WebElement getConfirmMesg() {
		return ConfirmMesg;
	}

	public WebElement getOkayButton() {
		return OkayButton;
	}

	public WebElement getAlreadySignUp() {
		return AlreadySignUp;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return Login;
	}

	public WebElement getAccountsettingsmenu() {
		return Accountsettingsmenu;
	}

	public WebElement getProfilemenu() {
		return profilemenu;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getUpdatebutton() {
		return updatebutton;
	}
}
