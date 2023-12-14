package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lip_Globals.Base_class;

public class Admin_Flow extends Base_class {

	public Admin_Flow() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href=\"/auth/login\"]")
	private WebElement AlreadySignUp;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;

	@FindBy(xpath = "//button[@type='button']")
	private WebElement Loginbutton;

	@FindBy(xpath = "//p[normalize-space()='Parent overview']")
	private WebElement clickparentoverview;

	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement searchtext;

	@FindBy(xpath = "(//div[contains(@class,'absolute top-4')])[2]")
	private WebElement clicksearchicon;

	@FindBy(xpath = "(//p[@class='break-words pl-4'])[1]")
	private WebElement clicknamecard;

	@FindBy(xpath = "//button[normalize-space()='Deactivate']")
	private WebElement clickdeactivatebutton;

	@FindBy(xpath = "//button[@id='error-ok-btn']")
	private WebElement clickokerror;

	@FindBy(xpath = "//span[1]//a[@href='/']")
	private WebElement HomeLink;

	@FindBy(xpath = "//button[@role='button']/div/*[name()='svg']/following-sibling::p[text()='Staff overview ']")
	private WebElement ClickStaffOverviewicon;

	// @FindBy(css = "body > div:nth-child(1) > div:nth-child(5) > div:nth-child(1)
	// > div:nth-child(10) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)
	// > div:nth-child(1) > div:nth-child(1) > button:nth-child(1) >
	// svg:nth-child(1) > g:nth-child(1) > g:nth-child(2) > path:nth-child(1)")
	@FindBy(xpath = "(//div[@id='staffListNGrid']/div/div[2]/div/div/div/button/*[name()='svg'])[1]")
	private WebElement click3dots;

	@FindBy(xpath = "//button[@name='staff-status-change']/following-sibling::div[2]/div/span[text()='Change role']")
	private WebElement ClickChangeRoletext;

	@FindBy(xpath = "//input[@id='superadmin role id 1']")
	private WebElement ChooseUserRoletochange;

	@FindBy(xpath = "//div[@id='success-ok-btn-parent']/a")
	private WebElement Clickconfirmnewrolebutton;

	@FindBy(xpath = "//div[@id='success-close-btn']//*[name()='svg']//*[name()='g' and @id='Group_7810']//*[name()='g' and @id='Group_7809']//*[name()='rect' and @id='Rectangle_17442']")
	private WebElement clickcloseicononpopup;

	public WebElement getLoginbutton() {
		return Loginbutton;
	}

	public WebElement getHomeLink() {
		return HomeLink;
	}

	public WebElement getClickStaffOverviewicon() {
		return ClickStaffOverviewicon;
	}

	public WebElement getClick3dots() {
		return click3dots;
	}

	public WebElement getClickChangeRoletext() {
		return ClickChangeRoletext;
	}

	public WebElement getChooseUserRoletochange() {
		return ChooseUserRoletochange;
	}

	public WebElement getClickconfirmnewrolebutton() {
		return Clickconfirmnewrolebutton;
	}

	public WebElement getClickcloseicononpopup() {
		return clickcloseicononpopup;
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
		return Loginbutton;
	}

	public WebElement getClickparentoverview() {
		return clickparentoverview;
	}

	public WebElement getSearchtext() {
		return searchtext;
	}

	public WebElement getClicksearchicon() {
		return clicksearchicon;
	}

	public WebElement getClicknamecard() {
		return clicknamecard;
	}

	public WebElement getClickdeactivatebutton() {
		return clickdeactivatebutton;
	}

	public WebElement getClickokerror() {
		return clickokerror;
	}

}
