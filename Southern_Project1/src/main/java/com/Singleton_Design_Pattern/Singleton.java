package com.Singleton_Design_Pattern;

import com.Page_Object_Model.Account_Settings;
import com.Page_Object_Model.AddChild;
import com.Page_Object_Model.AddStaff;
import com.Page_Object_Model.Admin_Flow;
import com.Page_Object_Model.Child_Details;
import com.Page_Object_Model.CreateQuestionnaireCampaign;
import com.Page_Object_Model.Login;
import com.Page_Object_Model.ManageQuestionnaireCampaign;
import com.Page_Object_Model.ParentQuestionnaires;
import com.Page_Object_Model.SignUp;
import com.Page_Object_Model.SouthernQoogleTranslation;
import com.Page_Object_Model.SouthernQuestionnaire;

public class Singleton {
	
	private SignUp sign_Up;

	private AddChild log_In;

	private AddStaff Add_Staff;

	private Admin_Flow Admin_flow;

	private Child_Details Child_Flow;

	private Account_Settings Feed_Form;

	private Login login;
	
	private SouthernQuestionnaire questionnaires;
	
	private CreateQuestionnaireCampaign createquestionnairecampaign;
	
	private ParentQuestionnaires parentquestionnaires;
	
	private SouthernQoogleTranslation southerngoogletranslation;
	
	private ManageQuestionnaireCampaign manageQuestionnairecampaign;

	public AddChild getInstanceLog_In() {
		log_In = new AddChild();
		return log_In;
	}

	public AddStaff getAdd_Staff() {

		Add_Staff = new AddStaff();
		return Add_Staff;

	}

	public Admin_Flow getAdmin_Flow() {

		Admin_flow = new Admin_Flow();
		return Admin_flow;
	}

	public Child_Details getChild_Flow() {

		Child_Flow = new Child_Details();
		return Child_Flow;
	}

	public Account_Settings getInstanceFeed_Form() {

		Feed_Form = new Account_Settings();
		return Feed_Form;
	}

/////////////////////------////////----------///////--------////////------///---------------///////

	public Login getlogin() {
		login = new Login();
		return login;
	}

	public SouthernQuestionnaire getquestionnaires() {
		questionnaires = new SouthernQuestionnaire();
		return questionnaires;
	}

	public CreateQuestionnaireCampaign getcreatequestionnairecampaign() {
		createquestionnairecampaign = new CreateQuestionnaireCampaign();
		return createquestionnairecampaign;
	}

	public ParentQuestionnaires getparentquestionnaire() {
		parentquestionnaires = new ParentQuestionnaires();
		return parentquestionnaires;
	}

	public SouthernQoogleTranslation getsoutherngoogletranslation() {
		southerngoogletranslation = new SouthernQoogleTranslation();
		return southerngoogletranslation;
	}

	public ManageQuestionnaireCampaign getmanageQuestionnairecampaign() {
		manageQuestionnairecampaign = new ManageQuestionnaireCampaign();
		return manageQuestionnairecampaign;
	}

	public SignUp getInstanceSign_Up() {

		sign_Up = new SignUp();
		return sign_Up;
	}

	

}
