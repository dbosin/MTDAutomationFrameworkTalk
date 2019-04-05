package stepdefinitions.jenkins;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
//import pageObjects.MercadoLibre.HomePage;
import pageobjects.jenkins.LoginPage;

import java.util.List;

public class JenkinsLoginSteps {

    private TestContext testContext;
    private LoginPage loginPage;
    private final static Logger logger = Logger.getLogger(JenkinsLoginSteps.class);


    public JenkinsLoginSteps(TestContext context) {
        testContext = context;
        loginPage = testContext.getPageObjectManager().getLoginPage();
    }

    @Given("^User is on Home Page$")
    public void user_is_on_Home_Page() {
        logger.info("user_is_on_Home_Jenkins_Page");
    }

    @When("^User Navigate to LogIn Page$")
    public void user_Navigate_to_LogIn_Page(){
        loginPage.navigateToLoginPage();
    }

    @When("^User enters Credentials to LogIn$")
    public void user_enters_Credentials_to_LogIn(List<Credentials> userCredentials) throws InterruptedException {
        for (Credentials credentials : userCredentials) {
            loginPage.enterUsername(credentials.getUsername());
            loginPage.enterPassword(credentials.getPassword());
            loginPage.clickOnSubmitButton();
        }
    }


    @Then("^Home page is displayed$")
    public void home_page_is_displayed() {
        assert testContext.getPageObjectManager().getHomePage().jenkinsIconIsDisplayed();
    }

}
