package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class categoryPage {
    WebDriver driver;
    public categoryPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement SelectCategoryElement(String category){
        By SelectCategory = By.xpath("//a[contains(text(),'" + category +"')]");
        return  driver.findElement(SelectCategory);
    }

    public WebElement categorySuccessMsgPath(){
        By msg = By.xpath("//div[@class='page-title']//h1[contains(text(),'Computers')]");
        return driver.findElement(msg);
    }

    public WebElement tagSuccessMsgPath(){
        By msg = By.xpath("//div[@class='page-title']//h1");
        return driver.findElement(msg);
    }
}
