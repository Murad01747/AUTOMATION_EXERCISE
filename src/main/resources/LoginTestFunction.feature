
@Smoke
Feature: Login function test

Background:
		Given Open the browser
    And Go to the application

  @Positive @TC-1
  Scenario: As a automation exercise user,Login should pass with valid credential
    When Put valid email
    And Put valid password
    And Click login button
    Then Login should pass and logout button should visible 
   
	@Negative @TC-2
  Scenario: As a automation exercise user,Login should fail with invalid credential  
    When Put invalid email
    And  Put invalid password
    And  Click login button
    Then Login should fail and contain a msg Your email or password is incorrect!

    
