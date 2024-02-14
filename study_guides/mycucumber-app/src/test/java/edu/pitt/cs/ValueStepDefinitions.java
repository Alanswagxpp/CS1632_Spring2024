package edu.pitt.cs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class ValueStepDefinitions {
    Value value;
    @Given("a Value")
    public void a_value() {
        // Write code here that turns the phrase above into concrete actions
        this.value = new Value();
    }
    @When("I incVal")
    public void i_inc_val() {
        // Write code here that turns the phrase above into concrete actions
        this.value.incVal();
    }

    @Then("getVal returns {int}")
    public void get_val_returns(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals((int) int1, this.value.getVal());
    }
}
