Feature: As a truck driver I should be able to
  access Vehicle under Fleet module.

  Background: open login page and login as truck driver
    Given user is on the login page
    Then user logs in as a "truck driver"
    Then user clicks on the "Fleet" module


    @wip
    Scenario: Truck driver sees all vehicle information
      When user navigates to vehicle page
      And user sees the grid
      When user clicks any car on the grid
      Then user sees the vehicle information