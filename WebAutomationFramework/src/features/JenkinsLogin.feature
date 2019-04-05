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

#    @SmokeTestJenkins
#	Scenario: User is Logged In Jenkins as User
#		Given User is on Home Page
#		When User Navigate to LogIn Page
#		And User enters Credentials to LogIn
#		  | Username   | Password |
#		  | dbosin | diegotE |
#		Then