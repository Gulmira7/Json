package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.Driver;

public class MvnRepository_Steps {

    @When("User is on mvn repository page")
    public void user_is_on_mvn_repository_page() {
        Driver.getDriver().get("https://mvnrepository.com");
    }

    @When("User should see search button")
    public void user_should_see_search_button() {

    }

    @Then("User should look for the word {string}")
    public void user_should_look_for_the_word(String string) {

    }

    @Then("User should see a word {string} in the results")
    public void user_should_see_a_word_in_the_results(String string) {

    }
}
