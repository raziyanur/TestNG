package Gun05;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

/*
       Senaryo ;
       1- Siteyi açınız.
       2- mac kelimeini göndererek aratınız.
       3- Çıkan sonuçlarda mac kelimesinin geçtiğini doğrulayınız.
       4- aynı işlemi samsung için de yapınız
     */
public class _03_SearchFanction extends GenelWebDriver {

    @Parameters("arananKelime")
    @Test
    void SarchFunction(String texSearch){
        WebElement search= driver.findElement(By.cssSelector("[class='form-control input-lg']"));
        search.sendKeys(texSearch);

        WebElement searchBtn= driver.findElement(By.cssSelector("[class='btn btn-default btn-lg']"));
        searchBtn.click();

        List<WebElement> sonuc=driver.findElements(By.cssSelector("[class='product-thumb'] [class='caption'] a"));
        for(WebElement e: sonuc )
        Assert.assertTrue(e.getText().toLowerCase().contains(texSearch));

    }

}
