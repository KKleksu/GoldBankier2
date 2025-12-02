package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RawMaterialsPage extends PageObject {

    public RawMaterialsPage(WebDriver driver) {
        super(driver);
    }

@FindBy (css = ".m-quotes-section-quotes-card-list")
    WebElement quotesSection;

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    public InvestPage goToInvestPage(String rawMaterial){
    wait.until(ExpectedConditions.visibilityOf(quotesSection));
    driver.findElement(By.xpath("//*[@class='m-quotes-section-quotes-card-list__item']//*[contains(text(),'"+rawMaterial+"')]")).click();
    return new InvestPage(driver);
    }
    public boolean imOnRawMaterialPage(){
        wait.until(ExpectedConditions.visibilityOf(quotesSection));
        return quotesSection.isDisplayed();
    }
}
