package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StockMarketPage extends PageObject{
    public StockMarketPage(WebDriver driver){super(driver);}

    @FindBy(css = ".m-quotes-speedometer-chart")
    WebElement fearGreedMeter;


    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


    public boolean checkImOnStockMarket(){
        wait.until(ExpectedConditions.visibilityOf(fearGreedMeter));
        return fearGreedMeter.isDisplayed();
    }
}
