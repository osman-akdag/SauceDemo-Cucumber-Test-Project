@LoginTests

Feature: Login Test Cases

  @NegativeLoginTest[001]
  Scenario Outline: Empty username & Empty Password
    Given Go To Login Page
    When Click Login Button
    Then Verify "<error_message>" error message
    Examples:
      | error_message                      |
      | Epic sadface: Username is required |

  @NegativeLoginTest[002]
  Scenario Outline: Empty username
    Given Go To Login Page
    When Enter "<password>" in password field
    And Click Login Button
    Then Verify "<error_message>" error message
    Examples:
      | error_message                      | password     |
      | Epic sadface: Username is required | secret_sauce |

  @NegativeLoginTest[003]
  Scenario Outline: Empty password
    Given Go To Login Page
    When Enter "<username>" in username field
    And Click Login Button
    Then Verify "<error_message>" error message
    Examples:
      | error_message                      | username      |
      | Epic sadface: Password is required | standart_user |

  @NegativeLoginTest[004]
  Scenario Outline: Correct username & Wrong password
    Given Go To Login Page
    When Enter "<correct_username>" in username field
    And Enter "<wrong_password>" in password field
    And Click Login Button
    Then Verify "<error_message>" error message
    Examples:
      | error_message                                                             | correct_username | wrong_password |
      | Epic sadface: Username and password do not match any user in this service | standart_user    | wrong_password |

  @NegativeLoginTest[005]
  Scenario Outline: Wrong username & Correct password
    Given Go To Login Page
    When Enter "<wrong_username>" in username field
    And Enter "<correct_password>" in password field
    And Click Login Button
    Then Verify "<error_message>" error message
    Examples:
      | error_message                                                             | wrong_username | correct_password |
      | Epic sadface: Username and password do not match any user in this service | wrong_username | secret_sauce     |

  @NegativeLoginTest[006]
  Scenario Outline: Wrong username & Wrong password
    Given Go To Login Page
    When Enter "<wrong_username>" in username field
    And Enter "<wrong_password>" in password field
    And Click Login Button
    Then Verify "<error_message>" error message
    Examples:
      | error_message                                                             | wrong_username | wrong_password |
      | Epic sadface: Username and password do not match any user in this service | wrong_username | wrong_password |

  @PositiveLoginTest[007]
  Scenario Outline: Correct username & Correct password
    Given Go To Login Page
    When Enter "<correct_username>" in username field
    And Enter "<correct_password>" in password field
    And Click Login Button
    Then Verify that you are on Products Page
    Examples:
      | correct_username | correct_password |
      | standard_user    | secret_sauce     |
