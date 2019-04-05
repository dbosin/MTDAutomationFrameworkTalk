package stepdefinitions.jenkins;

import cucumber.TestContext;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import dataproviders.ConfigFileReader;
import org.apache.log4j.Logger;

public class Hooks {

    TestContext testContext;
    private final static Logger logger = Logger.getLogger(Hooks.class);


    public Hooks(TestContext context) {
        testContext = context;
    }

    @Before
    public void BeforeSteps() {
        logger.info("Hook before steps");
		/*What all you can perform here
			Starting a webdriver
			Setting up DB connections
			Setting up test data
			Setting up browser cookies
			Navigating to certain page
			or anything before the test
		*/
        ConfigFileReader configFileReader = new ConfigFileReader();
        testContext.getWebDriverManager().getDriver().get(configFileReader.getApplicationUrl());
    }

    @After
    public void AfterSteps() {
        logger.info("Hook after steps");
        testContext.getWebDriverManager().closeDriver();
    }

}