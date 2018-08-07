package stepdefs;
import Utility.Hook;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobject.login;
import static junit.framework.TestCase.assertTrue;
public class loginstepdefinition {
  login Login = new login();
  public loginstepdefinition()
  {
      PageFactory.initElements(Hook.driver, Login);
  }
    @Given("^I navigate to \"([^\"]*)\"$")
    public void iNavigateTo(String arg0) throws Throwable {
                //throw new PendingException();
       // System.setProperty("webdriver.gecko.driver", "C:\\SDET University\\Software\\geckodriver.exe");
       // Hook.driver = new FirefoxDriver();
        Hook.driver.get("http://dev.giftrt.com/");
    }
    @And("^I click on Login \"([^\"]*)\"$")
    public void iClickOnLogin(String arg0) throws Throwable {
          // throw new PendingException();
        Login.ClickLogin();
    }
    @When("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String arg0) throws Throwable {
       // throw new PendingException();
       Login.enterEmail();
    }
    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String arg0) throws Throwable {
         //throw new PendingException();
        Login.enterPassword();
    }
    @And("^I click on \"([^\"]*)\"$")
    public void iClickOn(String arg0) throws Throwable {
        //throw new PendingException();
        Login.clickSignIn();
    }
    @Then("^I should be signed in$")
    public void iShouldBeSignedIn() throws Throwable {
       // throw new PendingException();
       //Login.LoginConfirmed();
       String message = Hook.driver.findElement(By.cssSelector("li.dropdown:nth-child(4) > a:nth-child(1)")).getText();
       System.out.println("Confirmation:" + message);
      Assert.assertTrue(Hook.driver.findElement(By.cssSelector("li.dropdown:nth-child(4) > a:nth-child(1)")).isDisplayed());
    }
}
