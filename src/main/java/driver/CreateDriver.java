package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;

public class CreateDriver {
    // local variables
    private static CreateDriver instance = null;

    private WebDriver webDriver;
    private Properties props = new Properties();

    // constructor
    public CreateDriver() {
    }
    public static CreateDriver getInstance() {
        if (instance == null) {
            instance = new CreateDriver();
        }
        return instance;
    }
    public final void setDriver(String browser) throws Exception {

        //props.load(new FileInputStream("Global_VARS.SE_PROPS"));

//        switch (browser) {
//            case "chrome":
//                ChromeOptions chOptions = new ChromeOptions();
//                chOptions.addArguments("--disable-plugins", "--disable-extensions", "--disable-popup-blocking");
          //      webDriver = new ChromeDriver(chOptions);
        webDriver = new ChromeDriver();
//                break;
//        }
        getDriver().manage().window().maximize();
        getDriver().get("https://google.com/");
    }

    public WebDriver getDriver() {
        return webDriver;
    }
    public void closeDriver() {
        try {
            getDriver().quit();
        }

        catch ( Exception e ) {
            // do something
        }
    }
}
