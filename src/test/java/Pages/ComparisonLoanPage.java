package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ComparisonLoanPage extends PageObject{
    public ComparisonLoanPage(WebDriver driver) {super(driver);}

    @FindBy(id = "amount")
            WebElement loanAmount;
    @FindBy(id = "period")
            WebElement loanPeroid;
    @FindBy(css = ".button.search-form__submit-btn")
            WebElement showLoanOffers;
    @FindBy(xpath = "//*[@class='offers__item-content-attribute -to-repay']//*[@class='offers__item-content-attribute-value']")
            WebElement firstAmountToRepay;
    @FindBy(css = ".button.filters.-outlined")
            WebElement filtrButton;
    @FindBy(xpath = "//*[@class='button filters__modal-button']")
            WebElement applyFilters;




    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    public boolean checkOnLoanComparisonPage(){
        wait.until(ExpectedConditions.visibilityOf(loanAmount));
        return loanAmount.isDisplayed();
    }
    public void sendLoanAmount(String amount){
        wait.until(ExpectedConditions.visibilityOf(loanAmount));
        loanAmount.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,amount);
        //loanAmount.sendKeys(amount);
    }
    public void sendLoanPeroid(String peroid){
        wait.until(ExpectedConditions.visibilityOf(loanPeroid));
        loanPeroid.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,peroid);
        //loanPeroid.sendKeys(peroid);
    }
    public void serchLoanOffers(){
        wait.until(ExpectedConditions.elementToBeClickable(showLoanOffers));
        showLoanOffers.click();
    }
    public boolean checkSerchedLoanOffers(Float amount) throws InterruptedException {
       // wait.until(ExpectedConditions.visibilityOf(firstAmountToRepay));
        Thread.sleep(2000);
        String a=firstAmountToRepay.getText();
        a=a.substring(0,a.length()-3);
        a=a.replace(" ","");
        a=a.replace(",",".");
        float numberA= Float.parseFloat(a);
        return numberA > amount;
    }
    public void chooseFiltersInTable(String mainFilter, String subFilter){
        wait.until(ExpectedConditions.elementToBeClickable(filtrButton));
        filtrButton.click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[contains(text(),'Bez zabezpieczeń')]//following-sibling::div//*[contains(text(),'Dowolnie')]"))));
        driver.findElement(By.xpath("//*[contains(text(),'"+mainFilter+"')]//following-sibling::div//*[contains(text(),'"+subFilter+"')]")).click();
        applyFilters.click();
    }
    public boolean checkChooseFiltersInTable(String mainFilter, String subFilter) throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(filtrButton));
        filtrButton.click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[contains(text(),'Bez zabezpieczeń')]//following-sibling::div//*[contains(text(),'Dowolnie')]"))));
        return driver.findElement(By.xpath("//*[contains(text(),'"+mainFilter+"')]//following-sibling::div//*[contains(text(),'"+subFilter+"')]//input")).isSelected();
    }
}
