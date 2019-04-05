Feature: JenkinsLogin
    @SmokeTestJenkins
	Scenario: User is Logged In Jenkins as Admin
		Given User is on Home Page
		When User Navigate to LogIn Page
		And User enters Credentials to LogIn
		  | Username   | Password |
		  | Admin | Admin123. |
		Then Home page is displayed

    @SmokeTestJenkins
	Scenario: User is Logged In Jenkins as User
		Given User is on Home Page
		When User Navigate to LogIn Page
		And User enters Credentials to LogIn
		  | Username   | Password |
		  | dbosin | diegote |
		Then Home page is displayed

#    @SmokeTestJenkins
#	Scenario: User is Logged In Jenkins as User
#		Given User is on Home Page
#		When User Navigate to LogIn Page
#		And User enters Credentials to LogIn
#		  | Username   | Password |
#		  | dbosin | diegotE |
#		Then