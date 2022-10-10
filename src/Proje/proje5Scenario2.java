package Proje;

import Utils.GenelWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class proje5Scenario2 extends GenelWebDriver {
    @Test
    void invalidLogin(){

        proje5Elements elements=new proje5Elements(driver);
        elements.login.click();
        elements.eMail.sendKeys("grupa@gmail.com");
        elements.Password.sendKeys("12345644");
        elements.loginAc.click();
       wait.until(ExpectedConditions.visibilityOf(elements.invalid));
        Assert.assertTrue(elements.invalid.getText().contains("Login was unsuccessful. Please correct the errors and try again."));

    }
}
