package pageobjects.jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.ID, using = "j_username")
    private WebElement usernameField;

    @FindBy(how = How.NAME, using = "j_password")
    private WebElement passwordField;

    @FindBy(how = How.NAME, using = "Submit")
    private WebElement submitButton;

    public void enterUsername(String username){
        usernameField.clear();
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password){
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickOnSubmitButton() throws InterruptedException {
            submitButton.click();
    }

    public void navigateToLoginPage() {
        driver.get("http://localhost:8080");
    }


    }
