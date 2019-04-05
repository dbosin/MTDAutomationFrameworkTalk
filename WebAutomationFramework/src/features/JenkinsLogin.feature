Feature: JenkinsLogin
    @SmokeTestJenkins
	Scenario: User is Logged In Jenkins as Admin
		Given User is on Home Page
		When User Navigate to LogIn Page
		And User enters Credentials to LogIn
		  | Username   | Password |
		  | admin | Password0. |
		Then Home page is displayed

    @SmokeTestJenkins
	Scenario: User is Logged In Jenkins as User
		Given User is on Home Page
		When User Navigate to LogIn Page
		And User enters Credentials to LogIn
		  | Username   | Password |
		  | user | Password1. |
		Then Home page is displayed

    @SmokeTestJenkins
	Scenario: User is Tries to Log In Jenkins with Incorrect Credentials
		Given User is on Home Page
		When User Navigate to LogIn Page
		And User enters Credentials to LogIn
		  | Username   | Password |
          | dbosin | wrongPwd |
		Then Credentials alert is displayed
		When User Navigate to LogIn Page
		And User enters Credentials to LogIn
		  | Username   | Password |
		  | wronguser | Password1. |
		Then Credentials alert is displayed
		When User Navigate to LogIn Page
		And User enters Credentials to LogIn
		  | Username   | Password |
		  |  | Password1. |
		Then Credentials alert is displayed
		When User Navigate to LogIn Page
		And User enters Credentials to LogIn
		  | Username   | Password |
		  | dbosin |  |
		Then Credentials alert is displayed