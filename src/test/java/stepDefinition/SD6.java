package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.*;
import util.BrowserFactory;

public class SD6 extends BaseStep{
    WebDriver driver = GetDriver();
    categoryPage element = new categoryPage(driver);

    @Given("user click on computer any category")
    public void SelectCategories() {
        element.SelectCategoryElement("Computers ").click();
    }

    @Then("selected category displayed")
    public void selectCatSuccess(){
        String expectedMsg = "Computers";
        String actualMsg = element.categorySuccessMsgPath().getText();
        Assert.assertTrue(actualMsg.contains(expectedMsg));
    }
}
