package stepdefenitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class RegistrationScenarios {
    public static final Logger logger = LogManager.getLogger(RegistrationScenarios.class);

    @Given("the user is on the registration page")
    public void the_user_is_on_the_registration_page() {
        logger.info("Navigating to the registration page");
    }

    @When("the user enters valid registration details")
    public void the_user_enters_valid_registration_details() {
        logger.info("Registration details entered");
    }

    @When("the user submits the registration form")
    public void the_user_submits_the_registration_form() {
        logger.info("Registration form submitted");
    }

    @Then("the user should see a registration success message")
    public void the_user_should_see_a_registration_success_message() {
        logger.info("Registration success message");
    }


    @When("the user submits the registration form with missing required fields")
    public void the_user_submits_the_registration_form_with_missing_required_fields() {

    }

    @Then("the user should see an error message indicating the missing fields")
    public void the_user_should_see_an_error_message_indicating_the_missing_fields() {
logger.info("heloo");
    }

    @When("the user enters an invalid email address")
    public void the_user_enters_an_invalid_email_address() {

    }

    @Then("the user should see an error message indicating an invalid email address")
    public void the_user_should_see_an_error_message_indicating_an_invalid_email_address() {

    }

    @When("the user enters a weak password")
    public void the_user_enters_a_weak_password() {

    }

    @Then("the user should see an error message indicating the password is too weak")
    public void the_user_should_see_an_error_message_indicating_the_password_is_too_weak() {

    }


}
