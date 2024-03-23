Feature: Login functionality on login page of Application				
Scenario Outline: Verification of login button with numbers of credential

Given Open the Chrome Bowser and launch the application				
When Enter the Username "<username>" and Password "<password>"				
Then Login the credential

    Examples: 
      | username       | password     | case |
      | standard_user  | secret_sauce | valid |
      | tct            | test123      |  invalid | 
      | problem_user   | secret_sauce | valid |