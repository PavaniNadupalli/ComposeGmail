Feature: feature to test composeGmail functionality with subject as  Incubyte and body as Automation QA test for Incubyte

  Scenario: check compose functionality with valid inputs and click on send
    Given login into gmail with valid user
    And enter required subject and body
    When user enters email in to column
    Then click on send
  
 