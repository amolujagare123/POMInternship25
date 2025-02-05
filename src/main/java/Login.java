import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    /*WbdDriver driver ;
    WebElement element = driver.findElement(By.xpath("");*/

    @FindBy (xpath = "//input[@id='email']")
    WebElement txtUsername;

    @FindBy(xpath = " //input[@id='password']")
    WebElement txtPassword;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement btnLogin;

    public Login(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy (xpath = "//a[@class='btn btn-default']")
    WebElement forgotPassword;


    void setTxtUsername(String username)
    {
        txtUsername.sendKeys(username);
    }

    void setTxtPassword(String password)
    {
        txtPassword.sendKeys(password);
    }

    void clickLogin()
    {
        btnLogin.click();
    }

    void clickForgotPassword()
    {
        forgotPassword.click();
    }
}
