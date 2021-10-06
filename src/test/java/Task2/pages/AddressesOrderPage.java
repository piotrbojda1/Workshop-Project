package Task2.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressesOrderPage {
    private WebDriver driver;
    @FindBy(xpath = "//button[@name=\"confirm-addresses\"]")
    private WebElement continueButton;

    public AddressesOrderPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void continueButtonclick(){
        continueButton.click();
    }
}
