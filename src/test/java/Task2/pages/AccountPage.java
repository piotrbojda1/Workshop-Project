package Task2.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
    private WebDriver driver;
    @FindBy(id = "addresses-link")
    private WebElement addressesField;
    @FindBy(className = "ui-autocomplete-input")
    private WebElement searchField;
    public AccountPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void clickSearchOurCatalog(){
        searchField.clear();
        searchField.click();
        searchField.sendKeys("Hummingbird Printed Sweater");
        searchField.sendKeys(Keys.ENTER);
    }
    public void clickAddressesField(){
        addressesField.click();
    }
}
