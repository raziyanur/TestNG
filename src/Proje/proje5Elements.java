package Proje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class proje5Elements {
    public proje5Elements(
    WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[text()='Log in']")
    public  WebElement login;

    @FindBy(id = "Email")
    public WebElement eMail;

    @FindBy(id ="Password" )
    public WebElement Password;

    @FindBy(css = "[value='Log in']")
    public WebElement loginAc;

    @FindBy(tagName = "body")
    public WebElement body;

    @FindBy(css = "[class='validation-summary-errors'] span")
    public WebElement invalid;

    @FindBy(css = "[value='Add to cart']")
    public List<WebElement> urunSec;

    @FindBy(linkText = "Shopping cart")
    public WebElement shopping;

    @FindBy(id = "termsofservice")
    public WebElement agree;

    @FindBy(id = "checkout")
    public WebElement checkOut;

    @FindBy(id = "BillingNewAddress_CountryId")
    public WebElement menu;

    @FindBy(id = "BillingNewAddress_City")
    public WebElement city;

    @FindBy(id = "BillingNewAddress_Address1")
    public WebElement address1;

    @FindBy(id ="billing-address-select" )
    List<WebElement> addressControl;

    @FindBy(css = "[title='Continue']")
    public WebElement continiu;

    @FindBy(id = "PickUpInStore")
    public WebElement radio;

    @FindBy(id ="BillingNewAddress_ZipPostalCode" )
    public WebElement zipCode;

    @FindBy(id = "BillingNewAddress_PhoneNumber")
    public WebElement phone;

    @FindBy(css = "[id='billing-buttons-container'] input")
    public WebElement ctnBtn;

    @FindBy(css = "[id='shipping-buttons-container'] input")
    public WebElement ctnBtn2;

    @FindBy(css = "[id='shipping-method-buttons-container'] input")
    public WebElement ctnBtn3;

    @FindBy(css = "[id='payment-method-buttons-container'] input")
    public WebElement ctnBtn4;

    @FindBy(css = "[id='payment-info-buttons-container'] input")
    public WebElement ctnBtn5;

    @FindBy(css = "[id='confirm-order-buttons-container'] input")
    public WebElement confirm;

    @FindBy(css = "[class='title']")
    public WebElement successfully;
}
