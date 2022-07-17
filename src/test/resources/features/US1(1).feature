@B26G1-18
Feature: As a truck driver I should be able to access Vehicle under Fleet module.
	#1.Verify that truck driver should be able to see all Vehicle information once navigate to Vehicle page. 
	#2.Verify that when user click on any car on the grid , system should display general information 
	#about the car 
	#3.Verify that truck driver can add Event and it should display under Activity tab and General 
	#information page as well
	#4.Verify that Truck driver can reset the setting

	Background: open login page and login as truck driver
		Given user is on the login page
		Then user logs in as a "truck driver"
		Then user clicks on the "Fleet" module


	@B26G1-64 @B26G1-11 @B26G1 @US1 @VYTrack
	Scenario: New-As a truck driver I should be able to access Vehicle under Fleet module.
		      When user navigates to vehicle page
		      And user sees the grid
		      When user clicks any car on the grid
		      Then user sees the vehicle information

