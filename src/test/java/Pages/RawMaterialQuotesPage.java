package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RawMaterialQuotesPage extends PageObject {
    public RawMaterialQuotesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".m-quotes-data-table__container")
    WebElement tableMostImportant;
    @FindBy(xpath = "//*[contains(text(),'Surowiec')]//*[@class='a-icon a-icon-chevron-down']")
    WebElement sortMostImportantByRawMaterialAsc;
    @FindBy(xpath = "(//*[contains(text(),'Surowiec')]//*[@class='a-icon a-icon-chevron-down'])[2]")
    WebElement sortMostImportantByRawMaterialDesc;
    @FindBy(xpath = "//*[contains(text(),'Kurs')]//*[@class='a-icon a-icon-chevron-down']")
    WebElement sortMostImportantByStockPriceAsc;
    @FindBy(xpath = "(//*[contains(text(),'Kurs')]//*[@class='a-icon a-icon-chevron-down'])[2]")
    WebElement sortMostImportantByStockPriceDesc;
    @FindBy(xpath = "//*[contains(text(),'Zm. %')]//*[@class='a-icon a-icon-chevron-down']")
    WebElement sortMostImportantByPercentChangeAsc;
    @FindBy(xpath = "(//*[contains(text(),'Zm. %')]//*[@class='a-icon a-icon-chevron-down'])[2]")
    WebElement sortMostImportantByPercentChangeDesc;
    @FindBy(xpath = "//*[contains(text(),'Zmiana')]//*[@class='a-icon a-icon-chevron-down']")
    WebElement sortMostImportantByChangeAsc;
    @FindBy(xpath = "(//*[contains(text(),'Zmiana')]//*[@class='a-icon a-icon-chevron-down'])[2]")
    WebElement sortMostImportantByChangeDesc;
    @FindBy(xpath = "//*[contains(text(),'Otwarcie')]//*[@class='a-icon a-icon-chevron-down']")
    WebElement sortMostImportantByOpenAsc;
    @FindBy(xpath = "(//*[contains(text(),'Otwarcie')]//*[@class='a-icon a-icon-chevron-down'])[2]")
    WebElement sortMostImportantByOpenDesc;
    @FindBy(xpath = "//*[contains(text(),'Max')]//*[@class='a-icon a-icon-chevron-down']")
    WebElement sortMostImportantByMaxAsc;
    @FindBy(xpath = "(//*[contains(text(),'Max')]//*[@class='a-icon a-icon-chevron-down'])[2]")
    WebElement sortMostImportantByMaxDesc;
    @FindBy(xpath = "//*[contains(text(),'Min')]//*[@class='a-icon a-icon-chevron-down']")
    WebElement sortMostImportantByMinAsc;
    @FindBy(xpath = "(//*[contains(text(),'Min')]//*[@class='a-icon a-icon-chevron-down'])[2]")
    WebElement sortMostImportantByMinDesc;
    @FindBy(xpath = "//*[contains(text(),'Czas')]//*[@class='a-icon a-icon-chevron-down']")
    WebElement sortMostImportantByTimeAsc;
    @FindBy(xpath = "(//*[contains(text(),'Czas')]//*[@class='a-icon a-icon-chevron-down'])[2]")
    WebElement sortMostImportantByTimeDesc;
    @FindBy(xpath = "//*[contains(text(),'Jednostka')]//*[@class='a-icon a-icon-chevron-down']")
    WebElement sortMostImportantByUnitAsc;
    @FindBy(xpath = "(//*[contains(text(),'Jednostka')]//*[@class='a-icon a-icon-chevron-down'])[2]")
    WebElement sortMostImportantByUnitDesc;
    @FindBy(xpath = "(//*[contains(text(),'Surowiec')]//*[@class='a-icon a-icon-chevron-down'])[5]")
    WebElement sortAllByRawMaterialAsc;
    @FindBy(xpath = "(//*[contains(text(),'Surowiec')]//*[@class='a-icon a-icon-chevron-down'])[6]")
    WebElement sortAllByRawMaterialDesc;
    @FindBy(xpath = "(//*[contains(text(),'Kurs')]//*[@class='a-icon a-icon-chevron-down'])[5]")
    WebElement sortAllByStockPriceAsc;
    @FindBy(xpath = "(//*[contains(text(),'Kurs')]//*[@class='a-icon a-icon-chevron-down'])[6]")
    WebElement sortAllByStockPriceDesc;
    @FindBy(xpath = "(//*[contains(text(),'Zm. %')]//*[@class='a-icon a-icon-chevron-down'])[5]")
    WebElement sortAllByPercentChangeAsc;
    @FindBy(xpath = "(//*[contains(text(),'Zm. %')]//*[@class='a-icon a-icon-chevron-down'])[6]")
    WebElement sortAllByPercentChangeDesc;
    @FindBy(xpath = "(//*[contains(text(),'Zmiana')]//*[@class='a-icon a-icon-chevron-down'])[5]")
    WebElement sortAllByChangeAsc;
    @FindBy(xpath = "(//*[contains(text(),'Zmiana')]//*[@class='a-icon a-icon-chevron-down'])[6]")
    WebElement sortAllByChangeDesc;
    @FindBy(xpath = "(//*[contains(text(),'Otwarcie')]//*[@class='a-icon a-icon-chevron-down'])[5]")
    WebElement sortAllByOpenAsc;
    @FindBy(xpath = "(//*[contains(text(),'Otwarcie')]//*[@class='a-icon a-icon-chevron-down'])[6]")
    WebElement sortAllByOpenDesc;
    @FindBy(xpath = "(//*[contains(text(),'Max')]//*[@class='a-icon a-icon-chevron-down'])[5]")
    WebElement sortAllByMaxAsc;
    @FindBy(xpath = "(//*[contains(text(),'Max')]//*[@class='a-icon a-icon-chevron-down'])[6]")
    WebElement sortAllByMaxDesc;
    @FindBy(xpath = "(//*[contains(text(),'Min')]//*[@class='a-icon a-icon-chevron-down'])[5]")
    WebElement sortAllByMinAsc;
    @FindBy(xpath = "(//*[contains(text(),'Min')]//*[@class='a-icon a-icon-chevron-down'])[6]")
    WebElement sortAllByMinDesc;
    @FindBy(xpath = "(//*[contains(text(),'Czas')]//*[@class='a-icon a-icon-chevron-down'])[5]")
    WebElement sortAllByTimeAsc;
    @FindBy(xpath = "(//*[contains(text(),'Czas')]//*[@class='a-icon a-icon-chevron-down'])[6]")
    WebElement sortAllByTimeDesc;
    @FindBy(xpath = "(//*[contains(text(),'Jednostka')]//*[@class='a-icon a-icon-chevron-down'])[5]")
    WebElement sortAllByUnitAsc;
    @FindBy(xpath = "(//*[contains(text(),'Jednostka')]//*[@class='a-icon a-icon-chevron-down'])[6]")
    WebElement sortAllByUnitDesc;
    @FindBy(css = ".flatpickr-input")
    WebElement openFlatpicker;
    @FindBy(xpath = "//*[@class='dayContainer']//*[contains(text(),'3')]")
            WebElement changeStockDate;
    @FindBy(xpath = "//*[contains(text(),'Śr. 03.12.2025, 23:00')]")
            WebElement updateDate;


    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public void changeStockDate(){
        wait.until(ExpectedConditions.elementToBeClickable(openFlatpicker));
        openFlatpicker.click();
        changeStockDate.click();
    }
    public void sortMostImportatBy(String sortBy) {

        switch (sortBy) {
            case "RawMaterialAsc":
                wait.until(ExpectedConditions.elementToBeClickable(sortMostImportantByRawMaterialAsc));
                sortMostImportantByRawMaterialAsc.click();
                break;
            case "RawMaterialDesc":
                wait.until(ExpectedConditions.elementToBeClickable(sortMostImportantByRawMaterialDesc));
                sortMostImportantByRawMaterialDesc.click();
                break;
            case "StockPriceAsc":
                wait.until(ExpectedConditions.elementToBeClickable(sortMostImportantByStockPriceAsc));
                sortMostImportantByStockPriceAsc.click();
                break;
            case "StockPriceDesc":
                wait.until(ExpectedConditions.elementToBeClickable(sortMostImportantByStockPriceDesc));
                sortMostImportantByStockPriceDesc.click();
                break;
            case "PercentChangeAsc":
                wait.until(ExpectedConditions.elementToBeClickable(sortMostImportantByPercentChangeAsc));
                sortMostImportantByPercentChangeAsc.click();
                break;
            case "PercentChangeDesc":
                wait.until(ExpectedConditions.elementToBeClickable(sortMostImportantByPercentChangeDesc));
                sortMostImportantByPercentChangeDesc.click();
                break;
            case "ChangeAsc":
                wait.until(ExpectedConditions.elementToBeClickable(sortMostImportantByChangeAsc));
                sortMostImportantByChangeAsc.click();
                break;
            case "ChangeDesc":
                wait.until(ExpectedConditions.elementToBeClickable(sortMostImportantByChangeDesc));
                sortMostImportantByChangeDesc.click();
                break;
            case "OpenAsc":
                wait.until(ExpectedConditions.elementToBeClickable(sortMostImportantByOpenAsc));
                sortMostImportantByOpenAsc.click();
                break;
            case "OpenDesc":
                wait.until(ExpectedConditions.elementToBeClickable(sortMostImportantByOpenDesc));
                sortMostImportantByOpenDesc.click();
                break;
            case "MaxAsc":
                wait.until(ExpectedConditions.elementToBeClickable(sortMostImportantByMaxAsc));
                sortMostImportantByMaxAsc.click();
                break;
            case "MaxDesc":
                wait.until(ExpectedConditions.elementToBeClickable(sortMostImportantByMaxDesc));
                sortMostImportantByMaxDesc.click();
                break;
            case "MinAsc":
                wait.until(ExpectedConditions.elementToBeClickable(sortMostImportantByMinAsc));
                sortMostImportantByMinAsc.click();
                break;
            case "MinDesc":
                wait.until(ExpectedConditions.elementToBeClickable(sortMostImportantByMinDesc));
                sortMostImportantByMinDesc.click();
                break;
            case "TimeAsc":
                wait.until(ExpectedConditions.elementToBeClickable(sortMostImportantByTimeAsc));
                sortMostImportantByTimeAsc.click();
                break;
            case "TimeDesc":
                wait.until(ExpectedConditions.elementToBeClickable(sortMostImportantByTimeDesc));
                sortMostImportantByTimeDesc.click();
                break;
            case "UnitAsc":
                wait.until(ExpectedConditions.elementToBeClickable(sortMostImportantByUnitAsc));
                sortMostImportantByUnitAsc.click();
                break;
            case "UnitDesc":
                wait.until(ExpectedConditions.elementToBeClickable(sortMostImportantByUnitDesc));
                sortMostImportantByUnitDesc.click();
                break;

        }

    }

    public void sortAllBy(String sortBy) {

        switch (sortBy) {
            case "RawMaterialAsc":
                wait.until(ExpectedConditions.elementToBeClickable(sortAllByRawMaterialAsc));
                sortAllByRawMaterialAsc.click();
                break;
            case "RawMaterialDesc":
                wait.until(ExpectedConditions.elementToBeClickable(sortAllByRawMaterialDesc));
                sortAllByRawMaterialDesc.click();
                break;
            case "StockPriceAsc":
                wait.until(ExpectedConditions.elementToBeClickable(sortAllByStockPriceAsc));
                sortAllByStockPriceAsc.click();
                break;
            case "StockPriceDesc":
                wait.until(ExpectedConditions.elementToBeClickable(sortAllByStockPriceDesc));
                sortAllByStockPriceDesc.click();
                break;
            case "PercentChangeAsc":
                wait.until(ExpectedConditions.elementToBeClickable(sortAllByPercentChangeAsc));
                sortAllByPercentChangeAsc.click();
                break;
            case "PercentChangeDesc":
                wait.until(ExpectedConditions.elementToBeClickable(sortAllByPercentChangeDesc));
                sortAllByPercentChangeDesc.click();
                break;
            case "ChangeAsc":
                wait.until(ExpectedConditions.elementToBeClickable(sortAllByChangeAsc));
                sortAllByChangeAsc.click();
                break;
            case "ChangeDesc":
                wait.until(ExpectedConditions.elementToBeClickable(sortAllByChangeDesc));
                sortAllByChangeDesc.click();
                break;
            case "OpenAsc":
                wait.until(ExpectedConditions.elementToBeClickable(sortAllByOpenAsc));
                sortAllByOpenAsc.click();
                break;
            case "OpenDesc":
                wait.until(ExpectedConditions.elementToBeClickable(sortAllByOpenDesc));
                sortAllByOpenDesc.click();
                break;
            case "MaxAsc":
                wait.until(ExpectedConditions.elementToBeClickable(sortAllByMaxAsc));
                sortAllByMaxAsc.click();
                break;
            case "MaxDesc":
                wait.until(ExpectedConditions.elementToBeClickable(sortAllByMaxDesc));
                sortAllByMaxDesc.click();
                break;
            case "MinAsc":
                wait.until(ExpectedConditions.elementToBeClickable(sortAllByMinAsc));
                sortAllByMinAsc.click();
                break;
            case "MinDesc":
                wait.until(ExpectedConditions.elementToBeClickable(sortAllByMinDesc));
                sortAllByMinDesc.click();
                break;
            case "TimeAsc":
                wait.until(ExpectedConditions.elementToBeClickable(sortAllByTimeAsc));
                sortAllByTimeAsc.click();
                break;
            case "TimeDesc":
                wait.until(ExpectedConditions.elementToBeClickable(sortAllByTimeDesc));
                sortAllByTimeDesc.click();
                break;
            case "UnitAsc":
                wait.until(ExpectedConditions.elementToBeClickable(sortAllByUnitAsc));
                sortAllByUnitAsc.click();
                break;
            case "UnitDesc":
                wait.until(ExpectedConditions.elementToBeClickable(sortAllByUnitDesc));
                sortAllByUnitDesc.click();
                break;

        }
    }
    public boolean checkOnQuotesPage(){
        wait.until(ExpectedConditions.visibilityOf(tableMostImportant));
        return tableMostImportant.isDisplayed();
    }
public boolean checkUpdateDate(){
        wait.until(ExpectedConditions.visibilityOf(updateDate));
        return updateDate.isDisplayed();
}
}