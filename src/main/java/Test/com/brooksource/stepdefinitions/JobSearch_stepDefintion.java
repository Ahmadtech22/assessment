package Test.com.brooksource.stepdefinitions;

import Test.com.brooksource.pages.JobSearch_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.utils.ConfigReader;
import utils.utils.DriverHelper;

public class JobSearch_stepDefintion {
    WebDriver driver = DriverHelper.getDriver();
    JobSearch_Page jobSearch_page = new JobSearch_Page(driver);


    @When("User provide keyword for search box")
    public void user_provide_keyword_for_search_box()  {
        jobSearch_page.insertKeywordAndSearch(ConfigReader.readProperty("keyword"));

    }

    @Then("User Validate all position list have same keyword")
    public void user_validate_all_position_list_have_same_keyword() {
        jobSearch_page.validateSearching(ConfigReader.readProperty("keyword"));
    }


    @Then("User Validate after view the position and return to the list it should show the list")
    public void user_validate_after_view_the_position_and_return_to_the_list_it_should_show_the_list() throws InterruptedException {
        jobSearch_page.validateListAfterView(driver);
    }

    @Then("User validate title  for each position")
    public void user_validate_title_for_each_position()  {
        jobSearch_page.ValidateTilte(driver);

    }
}
