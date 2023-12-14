package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lip_Globals.Base_class;

public class ParentQuestionnaires extends Base_class {

	public ParentQuestionnaires() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@class='card-block card-tiles cursor-pointer']/div/*[local-name()='svg']/following-sibling::p[text()='Questionnaires ']")
	private WebElement parentQuestionnaire;

	@FindBy(xpath = "//div[@class='mw-grid-list ']/div[1]/div/p")
	private WebElement keybutton;
	@FindBy(xpath = "(//tbody/tr[@class='table-button'])[1]")
	private WebElement selectfirst;

	@FindBy(xpath = "//div[@class='w-full']/div/div[1]/div/input")
	private WebElement parentsingleline;
	@FindBy(xpath = "//div[@class='w-full']/div/div[2]/div/textarea")
	private WebElement parentfreetext;
	@FindBy(xpath = "//div[@class='w-full']/div/div[3]/div/div[2]/label[1]/span")
	private WebElement parentmultipleoption1;
	@FindBy(xpath = "//div[@class='w-full']/div/div[3]/div/div[2]/label[2]/span")
	private WebElement parentmultipleoption2;
	@FindBy(xpath = "//div[@class='w-full']/div/div[4]/div/div/div/div/label")
	private WebElement parentdropdown;

	@FindBy(xpath = "//div[@class='w-full']/div/div[4]/div/div/div[2]/div/div[2]/div/div[2]")
	private WebElement parentdropdownoption;
	@FindBy(xpath = "//div[@class='w-full']/div/div[5]/div/div[3]/span/span/span[3]")
	private WebElement parentlikertoption;
	@FindBy(xpath = "//div[@class='w-full']/div/div[6]/div/textarea")
	private WebElement parentimagetextarea;
	@FindBy(xpath = "//div[@class='w-full']/div/div[7]/div/div[2]/div")
	private WebElement parentdate;
	// div[@class='vc-popover-content-wrapper
	// is-interactive']/div/div/div[2]/div/div[1]/div[2]/div/span[text()='12']
	@FindBy(xpath = "//div[@class='vc-popover-content-wrapper is-interactive']/div/div/div[2]/div/div[1]/div[2]/div/span[text()='12']")
	private WebElement parentdateoption;

	@FindBy(xpath = " //div[@class='w-full']/div/div[8]/div/div[2]/div")
	private WebElement parentdateandtime;
	@FindBy(xpath = "(//div[@class='vc-popover-content-wrapper is-interactive'])[2]/div/div/div[2]/div/div/div[2]/div/span[text()='7']")
	private WebElement parentdateandtimeoption;

	@FindBy(xpath = "//div[@class='w-full']/div/div[9]/div/input")
	private WebElement parentnumberoption;
	@FindBy(xpath = "//div[@class='w-full']/div/div[11]/div/textarea")
	private WebElement parenthyperlinkoption;
	@FindBy(xpath = "//div[@class='grid-button']/button[@aria-label='Save as draft']")
	private WebElement parenthsaveasdraft;
	@FindBy(xpath = "//div[@class='grid-button']/button[@aria-label='Submit']")
	private WebElement parentsubmit;

	public WebElement getselectfirst() {
		return selectfirst;
	}

	public WebElement getParentQuestionnaire() {
		return parentQuestionnaire;
	}

	public WebElement getKeybutton() {
		return keybutton;
	}

	public WebElement getParentsingleline() {
		return parentsingleline;
	}

	public WebElement getParentfreetext() {
		return parentfreetext;
	}

	public WebElement getParentmultipleoption1() {
		return parentmultipleoption1;
	}

	public WebElement getParentmultipleoption2() {
		return parentmultipleoption2;
	}

	public WebElement getParentdropdown() {
		return parentdropdown;
	}

	public WebElement getParentdropdownoption() {
		return parentdropdownoption;
	}

	public WebElement getParentlikertoption() {
		return parentlikertoption;
	}

	public WebElement getParentimagetextarea() {
		return parentimagetextarea;
	}

	public WebElement getParentdate() {
		return parentdate;
	}

	public WebElement getParentdateoption() {
		return parentdateoption;
	}

	public WebElement getParentdateandtimeoption() {
		return parentdateandtimeoption;
	}

	public WebElement getParentdateandtime() {
		return parentdateandtime;
	}

	public WebElement getParentnumberoption() {
		return parentnumberoption;
	}

	public WebElement getParenthyperlinkoption() {
		return parenthyperlinkoption;
	}

	public WebElement getParenthsaveasdraft() {
		return parenthsaveasdraft;
	}

	public WebElement getParentsubmit() {
		return parentsubmit;
	}
}
