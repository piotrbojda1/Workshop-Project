package Task2;

import Task2.pages.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class orderOnAccountTest {
    private static WebDriver driver;
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://mystore-testlab.coderslab.pl/");
    }
    @Test
    public void hummingbirdPrintedSweaterOrder() throws IOException {
        MainPage mainPage = new MainPage(driver);
        mainPage.signInToLogIn();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAs();

        AccountPage accountPage = new AccountPage(driver);
        accountPage.clickSearchOurCatalog();

        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.clickOnHummingbirdPrintedSweater();

        ProductPage productPage = new ProductPage(driver);
        productPage.chooseSize();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("container")));
        productPage.addQuantityAndAddToCart(5);

        PopupPage popupPage = new PopupPage(driver);
        popupPage.proceedToCheckoutClickField();

        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.proceedToChechkoutOnShoppingCart();

        AddressesOrderPage addressesOrderPage = new AddressesOrderPage(driver);
        addressesOrderPage.continueButtonclick();

        ShippingMethodPage shippingMethodPage = new ShippingMethodPage(driver);
        shippingMethodPage.choosePrestaShopAndConfirmDeliveryByContinueButton();

        PaymentPage paymentPage = new PaymentPage(driver);
        paymentPage.payByCheckRadioFieldSelect();
        paymentPage.selectCheckbox();
        paymentPage.orderWithAnObligationToPayFieldButton();

        OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage(driver);
        orderConfirmationPage.orderSnapshot();
        assertEquals("An email has been sent to your mail address piotr@test.com.",orderConfirmationPage.orderConfirmationText());
    }
        @After
        public void tearDown() {
            driver.quit();
        }
    }