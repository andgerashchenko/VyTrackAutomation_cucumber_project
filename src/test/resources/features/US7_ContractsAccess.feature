Feature: Test Contract page accessibility
  User Story: As an authorized user I should be able to access Vehicle Contract page.
@B26G1-62
  Scenario Outline: Access to Contract page by <UserType>
    Given "<UserName>" logging in to the page with "<Password>"
    Then "<UserType>" has correct accessibility to Contract page
    Examples:
      | UserType     | UserName        | Password    |
      | TruckDriver  | user1           | UserUser123 |
      | TruckDriver  | user2           | UserUser123 |
      | StoreManager | storemanager51  | UserUser123 |
      | StoreManager | storemanager52  | UserUser123 |
      | SalesManager | salesmanager101 | UserUser123 |
      | SalesManager | salesmanager102 | UserUser123 |
      | SalesManager | salesmanager103 | UserUser123 |