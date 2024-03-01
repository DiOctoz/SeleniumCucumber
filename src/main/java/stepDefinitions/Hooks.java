package stepDefinitions;

import driver.CreateDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import static driver.CreateDriver.*;

public class Hooks {
    CreateDriver driver;

    @Before
    public void setupWebDriver() throws Exception {
        CreateDriver.getInstance().setDriver("chrome");
    }

    @After
    public void teardownDriver() {
        CreateDriver.getInstance().closeDriver();
    }

}
