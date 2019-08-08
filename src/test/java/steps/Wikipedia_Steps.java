package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.WikipediaHomePaga;
import utilities.Config;
import utilities.Driver;

public class Wikipedia_Steps {
    WikipediaHomePaga wikipediaHomePaga = new WikipediaHomePaga();

    @Given("User is on Wikipadia page")
    public void user_is_on_Wikipadia_page() {
        Driver.getDriver().get(Config.getProperty("wikiURL"));
    }

    @When("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String string) {
    wikipediaHomePaga.searchBox.sendKeys(string);
    }
    @When("User clicks on search button")
    public void user_clicks_on_search_button() {
        wikipediaHomePaga.searchButton.click();

    }

    @Then("User sees {string}is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String string) {
        String actualTitle = Driver.getDriver().getTitle();
        String expextedTitle = string+" - Wikipedia";
        Assert.assertTrue(actualTitle.equalsIgnoreCase(expextedTitle));

    }
    @Then("User sees {string} is in the main header")
    public void user_sees_is_in_the_main_header(String mainHeader) {
    String expectedHeader = mainHeader;
    String actualHeader = wikipediaHomePaga.mainHeader.getText();
    Assert.assertEquals(expectedHeader,actualHeader);
    }

    @Then("User sees {string} is in the image header")
    public void user_sees_is_in_the_image_header(String imageHeader) {
    String expectedImageHeader = imageHeader;
    String actualImageHeader = wikipediaHomePaga.imageHeader.getText();
    Assert.assertEquals(actualImageHeader, expectedImageHeader);
    }


}
