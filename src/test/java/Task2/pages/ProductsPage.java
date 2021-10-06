package Task2.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
    private WebDriver driver;
    @FindBy(xpath = "//*[@data-id-product=\"2\"]")
    private WebElement selectedProduct;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void clickOnHummingbirdPrintedSweater(){
        selectedProduct.click();
    }
}
