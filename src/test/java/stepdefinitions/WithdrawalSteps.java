package stepdefinitions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import nicebank.Account;

public class WithdrawalSteps {

    private Account account;

    @Given("^my account has been credited with (\\d+) Euro\\.$")
    public void myAccountHasBeenCreditedWithEuro(int amount) {
        account = new Account();
        account.credit(amount);
    }

    @When("^I withdraw (\\d+) Euro\\.$")
    public void iWithdrawEuro(int amount) {
        account.debit(amount);
    }

    @Then("^the balance of my account should be (\\d+) Euro\\.$")
    public void theBalanceOfMyAccountShouldBeEuro(int amount) {
        assertThat(account.getBalance(), is(amount));
    }
}
