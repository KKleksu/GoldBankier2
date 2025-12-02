package Steps;

import Pages.InvestPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class InvestSteps {
    InvestPage investPage = new InvestPage(Setup.driver);

@Then("Im on invest page")
    public void imOnInvestPage(){
    Assert.assertTrue(investPage.checkOnInvestPage());
}
@When("I click on time {string}")
    public void clickOnTime(String time){
    investPage.changeTime(time);
}
@Then("Time is changed {string}")
    public void checkTimeChanged(String time){
    Assert.assertTrue(investPage.checkTime(time));
}
}
