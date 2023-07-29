@LoginTests

  Feature: Login Test Cases

  @AllEmpty
  Scenario Outline: Empty username & Empty Password
    Given Go To Login Page
    When Click the Login Button
    Then Verify "<errorMessage>" error message
    Examples:
      |errorMessage|
      |Epic sadface: Username is required|