import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Menu {

    @FindBy(xpath="//a[normalize-space()='Dashboard']")
    WebElement dashboard;

    @FindBy (xpath="//span[normalize-space()='Clients']")
    WebElement clients;

    @FindBy (xpath="//a[contains(text(),'Add Client')]")
    WebElement addClient;

    public Menu(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void clickDashboard() {
        dashboard.click();
    }

    /*public void clickClients() {
        clients.click();
    }*/

    public void clickAddClient() {
        clients.click();
        addClient.click();
    }

}
