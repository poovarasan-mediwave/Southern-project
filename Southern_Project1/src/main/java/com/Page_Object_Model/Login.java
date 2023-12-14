package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lip_Globals.Base_class;

public class Login extends Base_class {

	public Login() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='email']")
	private WebElement Email;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement Password;

	@FindBy(xpath = "//button[@class='btn  btn-primary']")
	private WebElement Login_button;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement Loginbutton;

	@FindBy(xpath = "//div/iframe[@role='presentation']")
	WebElement Recaptcha;
	@FindBy(xpath = "//div/a[@href='/auth/login']")
	WebElement alreadysignup;

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getRecaptcha() {
		return Recaptcha;
	}

	public WebElement getalreadysignup() {
		return alreadysignup;
	}

}
