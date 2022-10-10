package Proje;

import Utils.GenelWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class proje5Scenario1 extends GenelWebDriver {
    @Test
    void validLogin(){
    proje5Elements elements=new proje5Elements(driver);
    elements.login.click();
    elements.eMail.sendKeys("grupalti@gmail.com");
    elements.Password.sendKeys("123456");
    elements.loginAc.click();
    Assert.assertTrue(elements.body.getText().contains("grupalti@gmail.com"));
}



}
