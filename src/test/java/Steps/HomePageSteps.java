package Steps;

import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomePageSteps{
    HomePage homePage = new HomePage(Setup.driver);

    @Given("Im on homepage")
    public void imOnHomePage(){
        Assert.assertTrue(homePage.checkOnHomePageWithCookiePopUp());
    }
    @When("I click raw materials")
    public void goToRawMaterialsPage(){
        homePage.goToRawMaterialsPage();
}
    @Then("Im on homepage without cookie")
    public void checkOnHomePage(){
        Assert.assertTrue(homePage.checkOnHomePage());
}
    @When("I click cash loans")
    public void goToCashLoansComparisonPage(){
        homePage.goToComparisonLoanPage();
}
    @When("I click on currency in markets submenu")
    public void goToCurrencyPage(){
    homePage.goToCurrencyPage();
    }
}
