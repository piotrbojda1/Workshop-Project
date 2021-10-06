package Task2.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    private WebDriver driver;
    @FindBy(xpath = "//a[@title='Log in to your customer account']")
    private WebElement signInButton;

public MainPage(WebDriver driver){
    this.driver = driver;
    PageFactory.initElements(driver,this);
}
public void signInToLogIn(){
    signInButton.click();
}
}
