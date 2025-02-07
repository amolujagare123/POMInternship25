import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ForgotPasswordTest {



    @Test
    public void loginTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost/ip");

        Login login = new Login(driver);
        login.clickForgotPassword();

        ForgotPassword forgotPasswod = new ForgotPassword(driver);
        forgotPasswod.setTxtEmail("amol@gmail.com");
        forgotPasswod.btnReset();



    }
}
