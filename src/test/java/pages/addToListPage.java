package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addToListPage {

    WebDriver driver;
    public addToListPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement SetPathElement(String device, String button){
        By path = By.xpath("//h2[@class='product-title']//* [contains(text(),'"+device +"')]//following::div[@class='add-info']//div[2]/button[text()='"+button+"']");
        return driver.findElement(path);
    }

    public WebElement addToShoppingSuccessMsg(){
        By path =By.xpath("//div[@class='bar-notification success']//a[contains(text(),'shopping cart')]");
        return driver.findElement(path);
    }

}
