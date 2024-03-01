import driver.CreateDriver;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class CreateWebDriver {
    private static CreateWebDriver instance = null;
    WebDriver driver;
    Properties props;

    public CreateWebDriver() {
    }
    public static CreateWebDriver getIns(){
        if(instance == null){
            instance = new CreateWebDriver();
        }
        return instance;
    }

    public setWebDriver(){
        driver.
    }
    public WebDriver getWebDriver(){
        return this.driver;
    }
    public void closeWebDriver(){
        getWebDriver().close();
        getWebDriver().quit();
    }
}
