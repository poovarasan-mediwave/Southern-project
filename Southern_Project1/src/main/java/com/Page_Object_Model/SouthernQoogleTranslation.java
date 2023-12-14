package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lip_Globals.Base_class;

public class SouthernQoogleTranslation extends Base_class {

	public SouthernQoogleTranslation() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@aria-label='Menu items']/*[name()='svg']")
	private WebElement GTbentomenu;

	@FindBy(xpath = "//ul[@class='sidemenu']/div/div/div/button/li")
	private WebElement GTaccountsetting;
	@FindBy(xpath = "//ul[@class='sidemenu']/div/div/div/button/following-sibling::div[2]/div/li[1]")
	private WebElement GTprofile;
	@FindBy(xpath = "//form[@class='mw-form-group']/div[4]/label/following-sibling::div/div[2]/span")
	private WebElement Profilepreferlanguage;
	@FindBy(xpath = "//form[@class='mw-form-group']/div[4]/label/following-sibling::div/div[3]/ul/li/span/fieldset/div/span[text()='Tamil']")
	private WebElement preferlanguageselected;
	@FindBy(xpath = "//form[@class='mw-form-group']/div[9]/button")
	private WebElement preferlanguagesubmitbutton;

	public WebElement getGTbentomenu() {
		return GTbentomenu;
	}

	public WebElement getGTaccountsetting() {
		return GTaccountsetting;
	}

	public WebElement getGTprofile() {
		return GTprofile;
	}

	public WebElement getProfilepreferlanguage() {
		return Profilepreferlanguage;
	}

	public WebElement getPreferlanguageselected() {
		return preferlanguageselected;
	}

	public WebElement getPreferlanguagesubmitbutton() {
		return preferlanguagesubmitbutton;
	}
}
