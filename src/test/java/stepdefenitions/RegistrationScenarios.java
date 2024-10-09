package stepdefenitions;

import com.google.inject.Inject;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.Language;
import models.Skill;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.RegistrationPage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class RegistrationScenarios extends BaseStepDefintions {
    @Inject
    private WebDriver driver;
    public static final Logger logger = LogManager.getLogger(RegistrationScenarios.class);

    private final List<String> langugages = Arrays.asList("Arabic", "English", "Polish");
    private final List<String> skills = Arrays.asList("Adobe InDesign", "APIs");

    @Inject
    private RegistrationPage registrationPage;


    @Given("the user is on the registration page")
    public void the_user_is_on_the_registration_page() {
        logger.info(driver.getTitle());
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

    @When("I fill in the registration form with the following details:")
    public void i_fill_in_the_registration_form_with_the_following_details
            (DataTable dataTable) {
        List<Map<String, String>> listofMaps = dataTable.asMaps();
        for (Map<String, String> map : listofMaps) {
            enterRegistrationDetails(map);
            enterGenderDetails("Male");
            enterHobbies("CR_MO");
            enterLanguagesAndSelectThem(langugages, Language.getAllValues());
            enterTheSkills(skills, Skill.getAllValues());
        }
    }

    private void enterTheSkills(List<String> skills, List<String> allValues) {
        Select select = new Select(registrationPage.getSkillsSelect());
        for (String s : skills) {
            if (allValues.contains(s)) {
                select.selectByVisibleText(s);
            }
        }
    }

    private void getSkills() {
        List<String> skills = new ArrayList<>();
        List<WebElement> languagesExpected = registrationPage.getListOfSkills();
        for (WebElement s : languagesExpected) {
            skills.add(s.getText());
        }
        logger.info("The Valid languages are " + skills);
    }


    private void enterLanguagesAndSelectThem(List<String> languages, List<String> allValues) {
        registrationPage.getLanguageTextBox().click();
        String baseXpath = "//div[@id='msdd']/following-sibling::div/ul/li/a[contains(text(),'";
        String endXpath = "')]";
        for (String values : allValues) {
            if (languages.contains(values)) {
                driver.findElement(By.xpath(baseXpath + values + endXpath)).click();
            }
        }
    }

    private void enterHobbies(String hobbies) {
        String[] hobbiesData = hobbies.split("_");
        for (String hobbie : hobbiesData) {
            if ("CR".equalsIgnoreCase(hobbie)) {
                registrationPage.getCricketHobby().click();
            }
            if ("MO".equalsIgnoreCase(hobbie)) {
                registrationPage.getMoviesHobby().click();
            }
            if ("HO".equalsIgnoreCase(hobbie)) {
                registrationPage.getHockeyHobby().click();
            }
        }
    }

    private void enterGenderDetails(String gender) {
        switch (gender) {
            case "Female": {
                registrationPage.getFemaleGender().click();
                break;
            }
            case "Male": {
                registrationPage.getMaleGender().click();
            }

        }
    }


    private void enterRegistrationDetails(Map map) {
        registrationPage.getFirstName().sendKeys(String.valueOf(map.get("firstName")));
        registrationPage.getLastName().sendKeys((CharSequence) map.get("lastName"));
        registrationPage.getAddress().sendKeys(map.get("address").toString());
        registrationPage.getEmailAddress().sendKeys(map.get("email").toString());
        registrationPage.getPhoneNumber().sendKeys(map.get("phone").toString());
        registrationPage.getPassword().sendKeys(map.get("password").toString());
        registrationPage.getConfirmPassword().sendKeys(map.get("confirmPassword").toString());
    }


    @Then("the registration should be successful")
    public void the_registration_should_be_successful() {
        // Write code here that turns the phrase above into concrete actions
    }


}
