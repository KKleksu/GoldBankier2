package Steps;

import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageSteps{
    HomePage homePage = new HomePage(Setup.driver);

    @Given("Im on homepage")
    public void imOnHomePage(){
           Assert.assertTrue(homePage.checkOnHomePage());
    }
@When("I click raw materials")
public void goToRawMaterialsPage(){
homePage.goToRawMaterialsPage();
}

}
