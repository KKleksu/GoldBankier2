package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Common extends PageObject {
    public Common(WebDriver driver) {
        super(driver);
    }

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


    public void sortQuotesBy1TableAsc(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@class='js-data-table-sorting'][contains(text(),'" + name + "')]"))));
        driver.findElement(By.xpath("//*[@class='js-data-table-sorting'][contains(text(),'" + name + "')]")).click();
    }

    public void sortQuotesBy1TableDesc(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@class='js-data-table-sorting'][contains(text(),'" + name + "')]"))));
        driver.findElement(By.xpath("//*[@class='js-data-table-sorting'][contains(text(),'" + name + "')]")).click();
        driver.findElement(By.xpath("//*[@class='js-data-table-sorting -active'][contains(text(),'" + name + "')]")).click();
    }

    public void sortQuotesBy2TableAsc(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//*[@class='js-data-table-sorting'][contains(text(),'" + name + "')])[3]"))));
        driver.findElement(By.xpath("(//*[@class='js-data-table-sorting'][contains(text(),'" + name + "')])[3]")).click();
    }

    public void sortQuotesBy2TableDesc(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//*[@class='js-data-table-sorting'][contains(text(),'" + name + "')])[3]"))));
        driver.findElement(By.xpath("(//*[@class='js-data-table-sorting'][contains(text(),'" + name + "')])[3]")).click();
        driver.findElement(By.xpath("//*[@class='js-data-table-sorting -active'][contains(text(),'" + name + "')]")).click();
    }

    public boolean checkSortQuotesAsc(String sortBy) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='js-data-table-sorting -active']")));
        return driver.findElement(By.xpath("//*[@class='js-data-table-sorting -active']")).isDisplayed();
    }

    public boolean checkSortQuotesDesc(String sortBy) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='js-data-table-sorting -active -desc']")));
        return driver.findElement(By.xpath("//*[@class='js-data-table-sorting -active -desc']")).isDisplayed();
    }
    public void changeMainChartCard(String name) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='m-quotes-section-quotes-card-list__item']//*[@title='" + name + "']")));
        driver.findElement(By.xpath("(//*[@class='m-quotes-section-quotes-card-list__item']//*[@title='" + name + "'])")).click();
    }
    public void changeMainChartCard(String name, String number) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='m-quotes-section-quotes-card-list__item']//*[@title='" + name + "'])[" + number + "]")));
        driver.findElement(By.xpath("(//*[@class='m-quotes-section-quotes-card-list__item']//*[@title='" + name + "'])[" + number + "]")).click();
    }

    //public void changeMainChartCardSecSameName(String name){
    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='m-quotes-section-quotes-card-list__item']//*[@title='"+name+"'])[2]")));
    // driver.findElement(By.xpath("(//*[@class='m-quotes-section-quotes-card-list__item']//*[@title='"+name+"'])[2]")).click();
    //}
    //public void changeMainChartCard3ThSameName(String name){
    // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='m-quotes-section-quotes-card-list__item']//*[@title='"+name+"'])[3]")));
    //driver.findElement(By.xpath("(//*[@class='m-quotes-section-quotes-card-list__item']//*[@title='"+name+"'])[3]")).click();
    // }
    //Nie działa dla walut Euro domyślnie wszytkie 3 są aktywne dla różnych kursów
    public boolean checkChangeMainChartCard(String name,String number) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='m-quotes-section-quotes-card-list__item']//*[@class='m-section-quotes-card -is-active'][@title='" + name + "'])["+number+"]")));
        return driver.findElement(By.xpath("(//*[@class='m-quotes-section-quotes-card-list__item']//*[@class='m-section-quotes-card -is-active'][@title='" + name + "'])["+number+"]")).isDisplayed();
    }
    public boolean checkChangeMainChartCard(String name) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='m-quotes-section-quotes-card-list__item']//*[@class='m-section-quotes-card -is-active'][@title='" + name + "']")));
        return driver.findElement(By.xpath("(//*[@class='m-quotes-section-quotes-card-list__item']//*[@class='m-section-quotes-card -is-active'][@title='" + name + "'])")).isDisplayed();
    }

    public void changeNavTab(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='m-tabs-nav']//*[contains(text(),'" + name + "')]")));
        driver.findElement(By.xpath("//*[@class='m-tabs-nav']//*[contains(text(),'" + name + "')]")).click();
    }

    public boolean checkChangeNavTab(String name) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='m-tabs-nav__item js-section-main-chart-nav -is-active'][contains(text(),'"+name+"')]")));
        return driver.findElement(By.xpath("//*[@class='m-tabs-nav__item js-section-main-chart-nav -is-active'][contains(text(),'"+ name +"')]")).isDisplayed();
    }

    public void changePeriod(String period) {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='m-quotes-option__buttons']//*[@data-value='" + period + "']")));
        driver.findElement(By.xpath("//*[@class='m-quotes-option__buttons']//*[@data-value='" + period + "']")).click();
    }

    public boolean checkChangePeriod(String period) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='m-quotes-option__buttons']//*[@data-value='" + period + "']")));
        Thread.sleep(3000);
        if (period.equals("6M")) {
            return driver.findElement(By.xpath("//*[@class='m-quotes-option__buttons']//*[@class='a-quotes-button md-show -" + period + " -active'][@data-value='" + period + "']")).isDisplayed();
        } else if (period.equals("5Y")) {
            return driver.findElement(By.xpath("//*[@class='m-quotes-option__buttons']//*[@class='a-quotes-button md-show -" + period + " -active'][@data-value='" + period + "']")).isDisplayed();
        } else if (period.equals("Max")) {
            return driver.findElement(By.xpath("//*[@class='m-quotes-option__buttons']//*[@class='a-quotes-button md-show -" + period + " -active'][@data-value='" + period + "']")).isDisplayed();
        } else {
            return driver.findElement(By.xpath("//*[@class='m-quotes-option__buttons']//*[@class='a-quotes-button -" + period + " -active'][@data-value='" + period + "']")).isDisplayed();
        }
    }
}
