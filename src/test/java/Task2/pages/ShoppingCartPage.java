package Task2.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
    private WebDriver driver;
    @FindBy(xpath = ("//*[text()[contains(.,'Proceed to checkout')]]"))
    private WebElement proccedToCheckoutField;

    public ShoppingCartPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void proceedToChechkoutOnShoppingCart(){
        proccedToCheckoutField.click();
    }
}
