package stepdefenitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WithdrawCash {
    int accountBalance;
    @Given("^I have a balance of \\$(\\d+) in my account$")
    public void i_have_a_balance_of_$_in_my_account(Integer int1) {
        accountBalance=int1;
    }
    @When("^I request \\$(\\d+)$")
    public void i_request_$(Integer int1) {
      System.out.println("The Value of amount to dispensed is"+" "+int1);
    }
    @Then("^\\$(\\d+) should be dispensed$")
    public void $_should_be_dispensed(Integer int1) {
        accountBalance-=int1;
        System.out.println("The Balance is"+" "+accountBalance);
    }
}
