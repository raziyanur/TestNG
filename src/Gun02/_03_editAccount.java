package Gun02;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

/*
      1- Siteyi açınız.
      2- Edit Account a tıklatınız.
      3- Yeni isim ve soyisim göndererek Continue yapınız.
      4- İşlem sonucunu kontrol ediniz.
      5- Bu işlemi 2 kez çalıştırarak eski haline getiriniz.
     */
public class _03_editAccount extends GenelWebDriver {

    @Test
    void editAccount1(){
        for (int i = 0; i < 2; i++) {

            WebElement Edit = driver.findElement(By.cssSelector("[class='list-group']>a:nth-child(2)"));
            Edit.click();

            WebElement ad = driver.findElement(By.id("input-firstname"));
            ad.clear();
            ad.sendKeys("Raziye");

            WebElement soyad = driver.findElement(By.id("input-lastname"));
            wait.until(ExpectedConditions.visibilityOf(soyad));
            soyad.clear();
            soyad.sendKeys("mutlu");

            WebElement contiue = driver.findElement(By.cssSelector("[class='btn btn-primary']"));
            contiue.click();
            Tools.successMessageValidation();
        }
        }
    @Test //yontem 2
        void EditAccount(){
            editAccount("Ahmet","Mutlu");
            Tools.Bekle(2);
        editAccount("Raziye","Nur");
        }
        void editAccount(String ad,String soyad){
            WebElement Edit = driver.findElement(By.cssSelector("[class='list-group']>a:nth-child(2)"));
            Edit.click();

            WebElement firstname = driver.findElement(By.id("input-firstname"));
            firstname.clear();
            firstname.sendKeys(ad);

            WebElement lastname = driver.findElement(By.id("input-lastname"));
            lastname.clear();
            lastname.sendKeys(soyad);

            WebElement contiue = driver.findElement(By.cssSelector("[class='btn btn-primary']"));
            contiue.click();
            Tools.successMessageValidation();



        }

    }


