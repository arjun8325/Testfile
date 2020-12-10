package stepDefinations;
import cucumber.api.spring.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;




public class steps {
	
	
    private String today;
    private String actualAnswer;
    
    class IsItFriday {
        String isItFriday(String today) {
            return null;
        }
    }


    @Given("today is Sunday")
    public void today_is_Sunday() {
        today = "Sunday";
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_Friday_yet() {
        actualAnswer = "";
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }
}