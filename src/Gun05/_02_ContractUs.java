package Gun05;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/*
  1- ContactUs a tıklayınız
  2- Mesaj kutusuna en az 10 karakterlik bir mesaj yazınız.
  3- Submit ettikten sonra Contact US yazısını doğrulayınız.
 */
public class _02_ContractUs extends GenelWebDriver {

    @Test@Parameters
    void contactUs(String gelenMesaj){
        WebElement contactUS= driver.findElement(By.linkText("Contact Us"));
        contactUS.click();

        WebElement Enquiry= driver.findElement(By.id("input-enquiry"));
        Enquiry.sendKeys(gelenMesaj);

        driver.manage().window().maximize();
        WebElement submit= driver.findElement(By.cssSelector("[class='btn btn-primary']"));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("[value='Submit']"))));
        submit.click();

        Assert.assertTrue(driver.findElement(By.id("content")).getText().contains("Contact Us"));
    }





}
