package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class completeOrderPage {
    WebDriver driver;
    public completeOrderPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement checkTerms(){
        By element = By.id("termsofservice");
        return driver.findElement(element);
    }
    public WebElement checkout(){
        By element = By.id("checkout");
        return driver.findElement(element);
    }
    public WebElement dropdownElement(){
        By element = By.name("BillingNewAddress.CountryId");
        return driver.findElement(element);
    }
    public WebElement cityElement(){
        By element = By.id("BillingNewAddress_City");
        return driver.findElement(element);
    }
    public WebElement addressElement(){
        By element = By.id("BillingNewAddress_Address1");
        return driver.findElement(element);
    }
    public WebElement zipCodeElement(){
        By element = By.id("BillingNewAddress_ZipPostalCode");
        return driver.findElement(element);
    }

    public WebElement phoneElement(){
        By element = By.id("BillingNewAddress_PhoneNumber");
        return driver.findElement(element);
    }
    public WebElement saveBtn(){
        By element = By.name("save");
        return driver.findElement(element);
    }
    public WebElement shippingOptionElement(){
        By element = By.id("shippingoption_1");
        return driver.findElement(element);
    }
    public WebElement shippingNextBtnElement(){
        By element = By.xpath("//button[@class=\"button-1 shipping-method-next-step-button\"]");
        return driver.findElement(element);
    }
    public WebElement paymentMethodElement(){
        By element = By.id("paymentmethod_0");
        return driver.findElement(element);
    }
    public WebElement paymentNextBtnElement(){
        By element = By.xpath("//button[@class=\"button-1 payment-method-next-step-button\"]");
        return driver.findElement(element);
    }
    public WebElement paymentInfoNextBtnElement(){
        By element = By.xpath("//button[@class=\"button-1 payment-info-next-step-button\"]");
        return driver.findElement(element);
    }
    public WebElement confirmBtnElement(){
        By element = By.xpath("//button[@class=\"button-1 confirm-order-next-step-button\"]");
        return driver.findElement(element);
    }
    public WebElement successMsg(){
        By element = By.className("title");
        return driver.findElement(element);
    }
}
