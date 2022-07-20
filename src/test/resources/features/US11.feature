Feature: Verifying accessing to Vehicle Service Log

	#Verifying authorized user access Vehicle Serviece Log
  @B26G1-60 @B26G1-11 @Vytrack
  Scenario: As a truck driver I should be able to access Vehicle Serviece Log
    Given as a authorized user on login page
    When authorized user logs in valid credentials
    And user on homepage
    And user clicks Vehicle Service Log dropdown
    Then user should be able to see Vehicle service Log page