import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddClientTest {
    WebDriver driver;

    @BeforeClass
    public void doLogin()
    {
         driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost/ip");

        Login login = new Login(driver);

        login.setTxtUsername("amolujagare@gmail.com");
        login.setTxtPassword("admin123");
        login.clickLogin();
    }

    @Test
    public void addClientTest()
    {
        Menu menu = new Menu(driver);
        menu.clickAddClient();

        AddClient addClient = new AddClient(driver);





        addClient.enterClientName("Swarali1");
        addClient.enterClientSurname("Patil");
        addClient.setLanguage("English");
        addClient.enterStreetAddress1("123 Main St");
        addClient.enterStreetAddress2("Apt 4B");
        addClient.enterCity("Pune");
        addClient.enterState("Maharashtra");
        addClient.enterZipCode("411001");
        addClient.setCountry("India");
        addClient.setGender("Female");
        addClient.setDate("6/11/2034");
        addClient.enterPhoneNumber("9876543210");
        addClient.enterFaxNumber("0221234567");
        addClient.enterMobileNumber("9876543210");
        addClient.enterEmailAddress("swarali@example.com");
        addClient.enterWebAddress("www.example.com");
        addClient.enterVATID("VAT123456");
        addClient.enterTaxesCode("TAX7890");
        addClient.clickSave();

        String expected = "Record successfully created";
        String actual = "";

        try {
            actual = driver.findElement(By.className(".alert-success")).getText();
        }
        catch (Exception e)
        {

        }

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"incorrect or wrong message");
    }
}
