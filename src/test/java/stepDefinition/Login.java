package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static Actions.Action.*;
import static Util.HighLightElement.highLightElement;
import static Util.WaitUntil.waitUntil;

public class Login extends AbstractStepDef {

    @Given("user insert username")
    public void userInsertUsername() throws InterruptedException {
    navigate(loginPageUrl,driver);
    waitUntil(3);
    sendKey(loginPage.getUsernameField(), "Admin");
    }
    @And("user insert password")
    public void userInsertPassword() throws InterruptedException {
  waitUntil(3);
    sendKey(loginPage.getPasswordField(), "admin123");
    isDisplayed(loginPage.getLoginLogo());

    }
    @When("user clicks on Login button")
    public void userClicksOnLoginButton() throws InterruptedException{
    click(loginPage.getSubmitButton(), 3);

    }
    @Then("user is redirect to homepage")
    public void userIsRedirectToHomepage() throws InterruptedException {
    waitUntil(2);
    highLightElement(homePage.getDashboardSign());
    Assert.assertEquals("Dashboard", homePage.getDashboardSign().getText());
        
    }
    @And ("user clicks on LogOut button")
    public void userClickOnLogOutButton() {
        click(homePage.getUserMeniu(), 1);
        highLightElement(homePage.getLogOutButton());
        waitUntil(5);
        click(homePage.getLogOutButton(), 1);
    }
}
