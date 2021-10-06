package Task2.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {
    private WebDriver driver;
    @FindBy(xpath = "//button[@class=\"btn btn-touchspin js-touchspin bootstrap-touchspin-up\" and @type=\"button\"]")
    private WebElement addQuantityField;
    @FindBy(xpath = "//button[@data-button-action=\"add-to-cart\"]")
    private WebElement addToCart;
    @FindBy(id = "group_1")
    private WebElement sizeField;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void chooseSize() {

        Select size = new Select(sizeField);
        size.selectByValue("2");
    }

    public void addQuantityAndAddToCart(int quantity) {
        for (int i = 1; i < quantity; i++) {
            addQuantityField.click();
        }
        addToCart.click();
    }
}
