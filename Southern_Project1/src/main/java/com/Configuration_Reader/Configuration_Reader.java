package com.Configuration_Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties prop;

	public Configuration_Reader() throws IOException {

		File f = new File(
				"C:\\Users\\Mediwave Digital\\Projects\\uyhuyguguy\\src\\main\\java\\com\\Configuration_Properties\\Configuration.properties");

		FileInputStream fis = new FileInputStream(f);

		prop = new Properties();
		prop.load(fis);
	}

	public String getfirstname() {

		String firstname = prop.getProperty("firstname");
		return firstname;
	}

	public String getlastname() {

		String lastname = prop.getProperty("lastname");
		return lastname;
	}

	public String getSignupemailaddress() {

		String Signupemailaddress = prop.getProperty("Signupemailaddress");
		return Signupemailaddress;
	}

	public String getphonenumber() {

		String phonenumber = prop.getProperty("phonenumber");
		return phonenumber;
	}

	public String getSignuppassword() {

		String Signuppassword = prop.getProperty("Signuppassword");
		return Signuppassword;
	}

	public String getpasswordcombination() {

		String passwordcombination = prop.getProperty("passwordcombination");
		return passwordcombination;
	}

	public String getLoginemail() {

		String Loginemail = prop.getProperty("email");
		return Loginemail;
	}

	public String getLoginpassword() {

		String Loginpassword = prop.getProperty("password");
		return Loginpassword;
	}

	public String getChildNHSNumber() {

		String ChildNHSNumber = prop.getProperty("ChildNHSNumber");
		return ChildNHSNumber;
	}

	public String getDate() {

		String Date = prop.getProperty("Date");
		return Date;
	}

	public String getMonth() {

		String Month = prop.getProperty("Month");
		return Month;
	}

	public String getYear() {

		String Year = prop.getProperty("Year");
		return Year;
	}

	public String getfirstname1() {

		String firstname1 = prop.getProperty("firstname1");
		return firstname1;
	}

	public String getlastname1() {

		String lastname1 = prop.getProperty("lastname1");
		return lastname1;
	}

	public String getRIOID1() {

		String RIOID1 = prop.getProperty("RIOID1");
		return RIOID1;
	}

	public String getfirstname2() {

		String firstname2 = prop.getProperty("firstname2");
		return firstname2;
	}

	public String getlastname2() {

		String lastname2 = prop.getProperty("lastname2");
		return lastname2;
	}

	public String getRIOID2() {

		String RIOID2 = prop.getProperty("RIOID2");
		return RIOID2;
	}

	public String getfirstname3() {

		String firstname3 = prop.getProperty("firstname3");
		return firstname3;
	}

	public String getlastname3() {

		String lastname3 = prop.getProperty("lastname3");
		return lastname3;
	}

	public String getRIOID3() {

		String RIOID3 = prop.getProperty("RIOID3");
		return RIOID3;
	}

	public String getadminemail() {

		String adminemail = prop.getProperty("adminemail");
		return adminemail;
	}

	public String getadminpassword() {

		String adminpassword = prop.getProperty("adminpassword");
		return adminpassword;
	}

	public String getsearch() {

		String search = prop.getProperty("search");
		return search;
	}

	public String getSubjectField() {

		String SubjectField = prop.getProperty("SubjectField");
		return SubjectField;
	}

	public String getSuggestionsField() {

		String SuggestionsField = prop.getProperty("SuggestionsField");
		return SuggestionsField;
	}

	public String getUpdateLastName() {

		String UpdateLastName = prop.getProperty("UpdateLastName");
		return UpdateLastName;
	}

	public String getemailchild() {

		String emailchild = prop.getProperty("emailchild");
		return emailchild;
	}

	public String getpasswordchild() {

		String passwordchild = prop.getProperty("passwordchild");
		return passwordchild;
	}

	public String getURL() {

		String url = prop.getProperty("url");
		return url;

	}

	public String getcreateemail() {

		String email = prop.getProperty("Email");
		return email;

	}

	public String getCreatorPassword() {
		String password = prop.getProperty("Password");
		return password;
	}

	public String getQuestionnaire_title() {
		String Questionnaire_title = prop.getProperty("Questionnaire_title");
		return Questionnaire_title;
	}

	public String getwelcome_information() {
		String welcome_information = prop.getProperty("welcome_information");
		return welcome_information;
	}

	public String getQuestionnaire_section() {
		String Questionnaire_section = prop.getProperty("Questionnaire_section");
		return Questionnaire_section;
	}

	public String getQuestionnaire_description() {
		String Questionnaire_description = prop.getProperty("Questionnaire_description");
		return Questionnaire_description;
	}

	public String getsinglelinetext() {
		String singlelinetext = prop.getProperty("singlelinetext");
		return singlelinetext;
	}

	public String getfreetext() {
		String freetext = prop.getProperty("freetext");
		return freetext;
	}

	public String getmultiplechoicetext() {
		String multiplechoicetext = prop.getProperty("multiplechoicetext");
		return multiplechoicetext;
	}

	public String getmultiplechoiceoption1() {
		String multiplechoiceoption1 = prop.getProperty("multiplechoiceoption1");
		return multiplechoiceoption1;
	}

	public String getmultiplechoiceoption2() {
		String multiplechoiceoption2 = prop.getProperty("multiplechoiceoption2");
		return multiplechoiceoption2;
	}

	public String getdropdowntext() {
		String dropdowntext = prop.getProperty("dropdowntext");
		return dropdowntext;
	}

	public String getdropdownoption1() {
		String dropdownoption1 = prop.getProperty("dropdownoption1");
		return dropdownoption1;
	}

	public String dropdownoption2() {
		String dropdownoption2 = prop.getProperty("dropdownoption2");
		return dropdownoption2;
	}

	public String getLikerttext() {
		String Likerttext = prop.getProperty("Likerttext");
		return Likerttext;
	}

	public String getLikertresponse1() {
		String Likertresponse1 = prop.getProperty("Likertresponse1");
		return Likertresponse1;
	}

	public String getLikertresponse2() {
		String Likertresponse2 = prop.getProperty("Likertresponse2");
		return Likertresponse2;
	}

	public String getLikertresponse3() {
		String Likertresponse3 = prop.getProperty("Likertresponse3");
		return Likertresponse3;
	}

	public String getimagetextarea() {
		String imagetextarea = prop.getProperty("imagetextarea");
		return imagetextarea;
	}

	public String getDatetext() {
		String Datetext = prop.getProperty("Datetext");
		return Datetext;
	}

	public String getDate_timetext() {
		String Date_timetext = prop.getProperty("Date_timetext");
		return Date_timetext;
	}

	public String getNumbertext() {
		String Numbertext = prop.getProperty("Numbertext");
		return Numbertext;
	}

	public String getInformationtext() {
		String Informationtext = prop.getProperty("Informationtext");
		return Informationtext;
	}

	public String getHyperlinktext() {
		String Hyperlinktext = prop.getProperty("Hyperlinktext");
		return Hyperlinktext;
	}

	public String getClosinginformationtextarea() {
		String Closinginformationtextarea = prop.getProperty("Closinginformationtextarea");
		return Closinginformationtextarea;
	}

	public String getparentQuestionnaireemail() {
		String parentQuestionnaireemail = prop.getProperty("parentQuestionnaireemail");
		return parentQuestionnaireemail;
	}

	public String getparentQuestionnairepassword() {
		String parentQuestionnairepassword = prop.getProperty("parentQuestionnairepassword");
		return parentQuestionnairepassword;
	}

	public String getparentsingleline() {
		String parentsingleline = prop.getProperty("parentsingleline");
		return parentsingleline;
	}

	public String getparentfreetext() {
		String parentfreetext = prop.getProperty("parentfreetext");
		return parentfreetext;
	}

	public String getparentimagetextarea() {
		String parentimagetextarea = prop.getProperty("parentimagetextarea");
		return parentimagetextarea;
	}

	public String getParentnumberoption() {
		String Parentnumberoption = prop.getProperty("Parentnumberoption");
		return Parentnumberoption;
	}

	public String getParenthyperlinkoption() {
		String Parenthyperlinkoption = prop.getProperty("Parenthyperlinkoption");
		return Parenthyperlinkoption;
	}

	public String getUrl() {
		String Parenthyperlinkoption = prop.getProperty("URL");
		return Parenthyperlinkoption;
	}
	public String getDriver() {
		String Parenthyperlinkoption = prop.getProperty("Driver");
		return Parenthyperlinkoption;
	}
	

}
