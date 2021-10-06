package Task2.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;
    @FindBy(xpath = "//input[@name='email'][@type='email']")
    private WebElement emailField;
    @FindBy(name = "password")
    private WebElement passwordField;
    @FindBy(id = "submit-login")
    private WebElement signInButton;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void loginAs() {
        emailField.clear();
        emailField.sendKeys("piotr@test.com");
        passwordField.clear();
        passwordField.sendKeys("12345");
        signInButton.click();
    }
}
