package testRuner;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/feature/GoogleSearch.feature",
        //path of step definition file
        glue = "stepDefinitions"
)
public class TestRunner {
}

