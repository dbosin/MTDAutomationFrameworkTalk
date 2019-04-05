package cucumber;

import dataproviders.ConfigFileReader;
import managers.PageObjectManager;
import managers.WebDriverManager;

public class TestContext {
    private WebDriverManager webDriverManager;
    private PageObjectManager pageObjectManager;
    private ConfigFileReader configFileReader;
    private String baseUrl;

    public TestContext(){
        webDriverManager = new WebDriverManager();
        pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
        configFileReader = new ConfigFileReader();
        baseUrl = configFileReader.getApplicationUrl();
    }

    public WebDriverManager getWebDriverManager() {
        return webDriverManager;
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }

    public String getBaseUrl(){
        return baseUrl;
    }
}