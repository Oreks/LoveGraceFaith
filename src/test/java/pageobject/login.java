package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class login {

    @FindBy(how = How.CSS, using = ".right > li:nth-child(4) > a:nth-child(1)")
    private WebElement Login;

    @FindBy(how = How.ID, using = "email")
    private WebElement Email;

    @FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
    private WebElement password;

    @FindBy(how = How.CSS, using = "button.huge:nth-child(2)")
    private WebElement SignIn;

  //  @FindBy(how = How.CSS, using = "li.dropdown:nth-child(4) > a:nth-child(1)")
   // private WebElement Confirmation;

    public void ClickLogin()
    {
        Login.click();
    }

    public void enterEmail()
    {
        Email.sendKeys("tupsyn2000@yahoo.com");
    }

    public void enterPassword()
    {
        password.sendKeys("Testing123");
    }

    public void clickSignIn()
    {
        SignIn.click();
    }

   // public void LoginConfirmed()
   // {
    //    Confirmation.getText();
   // }

}
