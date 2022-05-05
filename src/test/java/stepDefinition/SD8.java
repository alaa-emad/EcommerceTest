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

public class SD8 extends BaseStep{
    WebDriver driver = GetDriver();
    categoryPage element = new categoryPage(driver);

    @Given("user click on different tags")
    public void SelectTags(){
        element.SelectCategoryElement("Computers ").click();
        element.SelectCategoryElement("camera").click();
    }
    @Then("the items filtered by selected tags")
    public void selectTagsSuccess(){
        String expectedMsg = "Products tagged with 'camera'";
        String actualMsg = element.tagSuccessMsgPath().getText();
        Assert.assertTrue(actualMsg.contains(expectedMsg));
    }

}
