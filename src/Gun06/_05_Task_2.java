package Gun06;

import Utils.ParametrelilWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class _05_Task_2 extends ParametrelilWebDriver {
    /**
     * Bir önceki task da yapılan testi PARAMETERDRIVER ile yapınız
     * sonrasında fakrlı tarayıcılar ile çalıştırınız.
     * sonrasında paralel çalıştırınız.
     */
    @Test(dataProvider = "getData")
    void SearchFunction(String texSearch){
        WebElement search= driver.findElement(By.cssSelector("[class='form-control input-lg']"));
        search.clear();
        search.sendKeys(texSearch);

        WebElement searchBtn= driver.findElement(By.cssSelector("[class='btn btn-default btn-lg']"));
        searchBtn.click();

        List<WebElement> sonuc=driver.findElements(By.cssSelector("[class='product-thumb'] [class='caption'] a"));
        for(WebElement e: sonuc )
            Assert.assertTrue(e.getText().toLowerCase().contains(texSearch));

    }
    @DataProvider
    public Object[] getData(){
        Object[] data={"mac","ipod","samsung"};

        return data;
    }





}
