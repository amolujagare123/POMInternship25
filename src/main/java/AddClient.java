import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddClient {

    @FindBy (xpath="//input[@id='client_name']") WebElement clientName;
    @FindBy (xpath="//input[@id='client_surname']") WebElement clientSurname;
    @FindBy (xpath="//input[@id='client_address_1']") WebElement streetAddress1;
    @FindBy (xpath="//input[@id='client_address_2']") WebElement streetAddress2;
    @FindBy (xpath="//input[@id='client_city']") WebElement city;
    @FindBy (xpath="//input[@id='client_state']") WebElement state;
    @FindBy (xpath="//input[@id='client_zip']") WebElement zipCode;
    @FindBy (xpath="//input[@id='client_phone']") WebElement phoneNumber;
    @FindBy (xpath="//input[@id='client_fax']") WebElement faxNumber;
    @FindBy (xpath="//input[@id='client_mobile']") WebElement mobileNumber;
    @FindBy (xpath="//input[@id='client_email']") WebElement emailAddress;
    @FindBy (xpath="//input[@id='client_web']") WebElement webAddress;
    @FindBy (xpath="//input[@id='client_vat_id']") WebElement vATID;
    @FindBy (xpath="//input[@id='client_tax_code']") WebElement taxesCode;
    @FindBy (xpath="//button[@id='btn-submit']") WebElement save;


    @FindBy (id = "select2-client_language-container")
    WebElement languageContainer;

    @FindBy (xpath="//input[@aria-label='Search']")
    WebElement search;

    WebDriver driver ;
    public void setLanguage(String language)
    {
        languageContainer.click();
        search.sendKeys(language);

        driver.findElement(By.xpath("//li[normalize-space()= '"+language+"']")).click();
    }

    @FindBy (id = "select2-client_country-container")
    WebElement countryContainer;


    public void setCountry(String country)
    {
        countryContainer.click();
        search.sendKeys(country);

        driver.findElement(By.xpath("//li[normalize-space()= '"+country+"']")).click();
    }

    @FindBy (id="select2-client_gender-container")
    WebElement genderContainer;

    public void setGender(String gender)
    {
        genderContainer.click();

        driver.findElement(By.xpath("//li[normalize-space()= '"+gender+"']")).click();
    }

    public AddClient(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }


    public void enterClientName(String name) {
        clientName.sendKeys(name);
    }

    public void enterClientSurname(String surname) {
        clientSurname.sendKeys(surname);
    }

    public void enterStreetAddress1(String address1) {
        streetAddress1.sendKeys(address1);
    }

    public void enterStreetAddress2(String address2) {
        streetAddress2.sendKeys(address2);
    }

    public void enterCity(String cityName) {
        city.sendKeys(cityName);
    }

    public void enterState(String stateName) {
        state.sendKeys(stateName);
    }

    public void enterZipCode(String zip) {
        zipCode.sendKeys(zip);
    }

    public void enterPhoneNumber(String phone) {
        phoneNumber.sendKeys(phone);
    }

    public void enterFaxNumber(String fax) {
        faxNumber.sendKeys(fax);
    }

    public void enterMobileNumber(String mobile) {
        mobileNumber.sendKeys(mobile);
    }

    public void enterEmailAddress(String email) {
        emailAddress.sendKeys(email);
    }

    public void enterWebAddress(String web) {
        webAddress.sendKeys(web);
    }

    public void enterVATID(String vat) {
        vATID.sendKeys(vat);
    }

    public void enterTaxesCode(String taxCode) {
        taxesCode.sendKeys(taxCode);
    }

    public void clickSave() {
        save.click();
    }
    @FindBy (xpath="//input[@id='client_birthdate']")
    WebElement birthdate;

    public void  setDate(String setDate)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value','02/99/2019')",birthdate);
    }



}
