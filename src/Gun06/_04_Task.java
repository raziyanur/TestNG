package Gun06;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class _04_Task extends GenelWebDriver {
    /*
     * Daha önceki derslerde yaptğımı Search fonksiyonunu
     * Mac,ipod ve samsung için Dataprovider ile yapınız.
     */
    @Test (dataProvider = "getData")
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
