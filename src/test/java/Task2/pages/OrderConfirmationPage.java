package Task2.pages;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.apache.commons.io.FileUtils;


import java.io.File;
import java.io.IOException;

public class OrderConfirmationPage {
    private WebDriver driver;
    @FindBy(xpath = "//*[contains(text(), 'An email has been sent to your mail address piotr@test.com.')]")
    private WebElement paragraphText;

    public OrderConfirmationPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
public String orderConfirmationText(){
        return paragraphText.getText();
}

public void orderSnapshot() throws IOException {
    File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(src, new File("c:src/test/java/Task2/OrderPhoto/lastorder.png"));
}
}
