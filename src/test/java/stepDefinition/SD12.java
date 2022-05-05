package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.*;

public class SD12  extends BaseStep{
    WebDriver driver = GetDriver();
    addToListPage element = new addToListPage(driver);
    loginPage loginElement = new loginPage(driver);
    completeOrderPage order = new completeOrderPage(driver);

    @Given("user login with valid data")
    public void log_in() {
        loginElement.LoginElement().click();
        loginElement.EmailElement().sendKeys(loginElement.email);
        loginElement.PasswordElement().sendKeys(loginElement.pass);
        loginElement.PasswordElement().sendKeys(Keys.ENTER);
    }
    @And("user add item to cart")
    public void add_to_cart(){
        String BtnName = "Add to cart";
        driver.navigate().to("https://demo.nopcommerce.com/notebooks");
        element.SetPathElement("Asus N551JK-XO076H Laptop",BtnName).click();
        driver.findElement(By.className("ico-cart")).click();
    }
    @When("user press continue and complete the process")
    public void completeOrder() throws InterruptedException {

        order.checkTerms().click();
        order.checkout().click();

        Select dropdown = new Select(order.dropdownElement());
        dropdown.selectByVisibleText("Egypt");
        order.cityElement().sendKeys("Cairo");
        order.addressElement().sendKeys("any address");
        order.zipCodeElement().sendKeys("11595");
        order.phoneElement().sendKeys("123456789");
        order.saveBtn().click();
        Thread.sleep(2000);
        order.shippingOptionElement().click();
        order.shippingNextBtnElement().click();
        Thread.sleep(2000);
        order.paymentMethodElement().click();

        order.paymentNextBtnElement().click();
        Thread.sleep(2000);
        order.paymentInfoNextBtnElement().click();
        order.paymentInfoNextBtnElement().click();
        Thread.sleep(2000);
        order.confirmBtnElement().click();
        Thread.sleep(2000);
    }
    @Then("order completed successfully")
    public void confirmOrder() throws InterruptedException {
        String expectedMsg = "Your order has been successfully processed!";
        String actualMsg = order.successMsg().getText();
        Assert.assertTrue(actualMsg.contains(expectedMsg));
        Thread.sleep(2000);
    }
}
