package Task2.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
    private WebDriver driver;
    @FindBy(xpath = "//*[text()[contains(.,'Pay by Check')]]")
    private WebElement payByCheckRadioField;
    @FindBy(id ="conditions_to_approve[terms-and-conditions]")
    private WebElement checkbox;
    @FindBy(xpath = "//*[text()[contains(.,'Order with an obligation to pay')]]")
    private WebElement orderWithAnObligationToPayField;
    public PaymentPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void payByCheckRadioFieldSelect(){
        payByCheckRadioField.click();
    }
    public void selectCheckbox(){
        checkbox.click();
    }
    public void orderWithAnObligationToPayFieldButton(){
        orderWithAnObligationToPayField.click();
    }
}