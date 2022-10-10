package Proje;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class proje5Scenario3 extends GenelWebDriver {
    @Test
    void urunsecmeFunction() {
        proje5Elements elements = new proje5Elements(driver);
        elements.login.click();
        elements.eMail.sendKeys("grupalti@gmail.com");
        elements.Password.sendKeys("123456");
        elements.loginAc.click();

        if (elements.urunSec.size() > 0) {
            elements.urunSec.get(1).click();
        }
        elements.shopping.click();
        elements.agree.click();
        elements.checkOut.click();

        if (elements.addressControl.size()>0){
        Select edmenu = new Select(elements.menu);
        edmenu.selectByVisibleText("Turkey");
        elements.city.sendKeys("Bursa");
        elements.address1.sendKeys("Orhangazi");
        elements.zipCode.sendKeys("16100");
        elements.phone.sendKeys("0555 555 55 55");}
        else {

        }





        wait.until(ExpectedConditions.elementToBeClickable(elements.ctnBtn)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.ctnBtn2)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.ctnBtn3)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.ctnBtn4)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.ctnBtn5)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.confirm)).click();
        wait.until(ExpectedConditions.urlToBe("http://demowebshop.tricentis.com/checkout/completed/"));

        wait.until(ExpectedConditions.visibilityOf(elements.successfully));

        String succesful1 = elements.successfully.getText();
        Assert.assertTrue(succesful1.contains("Your order has been successfully processed!"));


    }
}