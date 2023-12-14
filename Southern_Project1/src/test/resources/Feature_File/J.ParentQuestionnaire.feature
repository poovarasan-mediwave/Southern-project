@ParentQuestionnaire
Feature: ParentQuestionnaire

  Scenario: ParentQuestionnaire
    Given User launch URL for parentQuestionnaire
    When User enters valid "<email address>" in Emailaddres field for parentQuestionnaire
    Then User enters "<password>" in Passowrd for parentQuestionnaire
    Then User select recaptcha checkbox for parentQuestionnaire
    Then Click on Submit button for parentQuestionnaire
    Then User click on parentQuestionnaire
    Then User click on keybutton
    Then User select on Questionnaire under list
    Then User enter answer for singleline
    Then User enter answer for freetext
    Then User enter answer for multiplechoice option1
    Then User enter answer for multiplechoice option2
    Then User select dropdown option
    Then User enter answer for likert option
    Then User enter answer for imagetext
    Then User enter answer for date
    Then User enter answer for date and time
    Then User enter answer for number
    Then User enter answer for hyperlink
    #Then User enter click for saveasdraft
    Then User click on submit button
