package steps.Task1;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class AddressesSteps {
    private WebDriver driver;

    @Given("^Login to account$")
    public void logInToAccount() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://mystore-testlab.coderslab.pl/");
        WebElement signInButton = driver.findElement(By.xpath("//a[@title=\"Log in to your customer account\"]"));
        signInButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.invisibilityOf(signInButton));
        WebElement emailField = driver.findElement(By.xpath("//input[@name='email'][@type='email']"));
        emailField.clear();
        emailField.sendKeys("piotr@test.com");
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.clear();
        passwordField.sendKeys("12345");
        WebElement signInButtonToAccount = driver.findElement(By.id("submit-login"));
        signInButtonToAccount.click();
        wait.until(ExpectedConditions.invisibilityOf(signInButtonToAccount));
    }
    @When("^Click field Addresses after the log in$")
    public void clickFieldAddressesOnAccount() {
        WebElement addressesField = driver.findElement(By.id("addresses-link"));
        addressesField.click();
    }
    @And("^Create new address$")
    public void createNewAddress() {
        WebElement addAddress = driver.findElement(By.xpath("//a[@data-link-action=\"add-address\"]"));
        addAddress.click();
    }
    @Then("^Enter alias (.*)$")
    public void enterAlias(String alias) {
        WebElement enteraliasField = driver.findElement(By.xpath("//input[@name=\"alias\"]"));
        enteraliasField.clear();
        enteraliasField.sendKeys(alias);
    }
    @And ("^Enter address(.*)$")
            public void enterAddress(String address) {
        WebElement enterAddressFormField = driver.findElement(By.name("address1"));
        enterAddressFormField.clear();
        enterAddressFormField.sendKeys(address);
    }
    @And ("^Enter city(.*)$")
            public void enterCity(String city) {
        WebElement enterCityFormField = driver.findElement(By.name("city"));
        enterCityFormField.clear();
        enterCityFormField.sendKeys(city);
    }
    @And ("^Enter postalcode(.*)$")
            public void enterPostalcode(String postalcode) {
        WebElement enterPostalcodeFormField = driver.findElement(By.name("postcode"));
        enterPostalcodeFormField.clear();
        enterPostalcodeFormField.sendKeys(postalcode);
    }
    @And ("^select country$")
    public void selectCountryFromList(){
        WebElement chooseCountry = driver.findElement(By.name("id_country"));
        chooseCountry.click();
        Select country = new Select(chooseCountry);
        country.selectByValue("17");
    }
    @And ("^Enter phone(.*)")
            public void enterPhone(String phone) {
        WebElement enterPhoneFormField = driver.findElement(By.xpath("//input[@name=\"phone\"]"));
        enterPhoneFormField.clear();
        enterPhoneFormField.sendKeys(phone);
    }
    @And ("^Confirm form$")
            public void confirmForm() {
        WebElement confirmFormField = driver.findElement(By.xpath("//button[@class=\"btn btn-primary float-xs-right\"][@type=\"submit\"]"));
        confirmFormField.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.invisibilityOf(confirmFormField));
    }
        @And("^New address added$")
        public void confirmAddress(){
            WebElement addressConfirmation = driver.findElement(By.xpath("//*[text()[contains(.,'Address successfully added')]]"));
            assertEquals("Address successfully added!",addressConfirmation.getText());
        }
    @And("^Close browser$")
    public void closeBrowser() throws IOException {
        driver.quit();
        Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
    }
}

