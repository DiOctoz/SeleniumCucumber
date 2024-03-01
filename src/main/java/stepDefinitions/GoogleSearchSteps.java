package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.GoogleSearchPO;

public class GoogleSearchSteps {
    GoogleSearchPO googleSearchPO;

    @Given("Open Google")
    public void Open_Google() throws Exception {
        googleSearchPO = new GoogleSearchPO();
        googleSearchPO.waitUntilLogo();
    }

    @When("Search by Keyword")
    public void searchByKeyword() {

    }

    @Then("Confirm the Result")
    public void confirmTheResult() {
    }
}
