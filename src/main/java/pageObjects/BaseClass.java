package pageObjects;

import driver.CreateDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseClass {
    CreateDriver driver;
    public void BaseClass() {
        PageFactory.initElements(CreateDriver.getInstance().getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='k1zIA rSk4se']")
    private WebElement googleLogo;

    public void waitUntilLogo(){
        WebDriverWait driverWait = new WebDriverWait(CreateDriver.getInstance().getDriver(),Duration.ofSeconds(30));
        driverWait.until(ExpectedConditions.visibilityOf(googleLogo));
    }
}
