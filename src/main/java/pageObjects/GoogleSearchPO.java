package pageObjects;

import driver.CreateDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPO extends BaseClass{
    CreateDriver driver;
    public GoogleSearchPO() throws Exception {
        super();
        PageFactory.initElements(CreateDriver.getInstance().getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"APjFqb\"]")
    protected WebElement searchField;

}
