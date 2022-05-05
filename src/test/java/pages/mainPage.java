package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mainPage {
    WebDriver driver;
    public mainPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement SearchBoxElement(){
        By searchBox = By.id("small-searchterms");
        return driver.findElement(searchBox);
    }

    public WebElement SelectCurrencyElement(){
        By dropdown = By.id("customerCurrency");
        return driver.findElement(dropdown);
    }
    public WebElement changeCurrenciesMsg(){
        By path = By.xpath("//div[@class='currency-selector']//select[@id='customerCurrency']//option[2][contains(text(),'Euro')]");
        return driver.findElement(path);
    }


}
