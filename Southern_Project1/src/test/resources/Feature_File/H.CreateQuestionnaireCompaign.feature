@Questionnairescampaign
Feature:Questionnaire_campaign

Scenario: Questionnaire_campaign
Given User launch URL for southern Questionnaires campaign
When User enters valid "<email address>" in Emailaddres field for Questionnaires campaign
Then User enters "<password>" in Passowrd for Questionnaires campaign
Then User select recaptcha checkbox for Questionnaires campaign
Then Click on Submit button for Questionnaires campaign
Then User click on create_Questionnaire_campaingn
Then User click on User Questionnaire template dropdown
Then User select on Questionnaires template
Then User select on Questionnaires complete date					
Then User click on Teams
Then User click on NHS number
Then User click on confirm & send button

