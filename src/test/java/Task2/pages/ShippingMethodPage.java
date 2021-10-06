package Task2.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingMethodPage {
    private WebDriver driver;
    @FindBy(name = "confirmDeliveryOption")
    private WebElement confirmDeliveryContinueButton;
    @FindBy(id = "delivery_option_1")
    private WebElement prestaShopButtonRadio;
    public ShippingMethodPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void choosePrestaShopAndConfirmDeliveryByContinueButton(){
        if (!prestaShopButtonRadio.isSelected()) {
            prestaShopButtonRadio.click();
        }
        confirmDeliveryContinueButton.click();
    }
}
