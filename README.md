This code implements the basic architecture of a web tests automation framework, based on selenium, cucumber and Java.

## Prerequisites:
 - Docker
 - JDK 12
 - Maven
 - Intellij community edition

## Download & start the application to test (Jenkins docker image):
 - docker pull jenkins/jenkins:lts 
 - docker run -p 8080:8080 -p 50000:50000 jenkins/jenkins:lts
 - Enter to http://localhost:8080 from the browser 
 - Use the password provided in the console to unlock Jenkins
 - Select Install default plugins 
 - Configure the admin as user:"admin" password: "Password0."
 - Create a new user: "user" password:"Password1."

## Open the project:
 - Clone the repository
 - Open Intellij Idea
 - Import the project, foollowing the wizard for maven projects
 - Run the project

## The main features implemented are:
- [x] Gherking syntax
- [x] Feature file
- [x] Log4J
- [x] End 2 end selenium test
- [x] Page Object Pattern 
- [x] Page Object Manager
- [x] Web Driver Manager
- [x] PicoContainer to share test context
- [x] Hooks: Before and After
- [x] Report plugins


## Related links:
 ### Jenkins: 
 - https://hub.docker.com/r/jenkins/jenkins
 - https://github.com/jenkinsci/docker/blob/master/README.md
 ### Docker:
 - https://docs.docker.com/engine/reference/commandline/docker/