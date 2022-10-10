package Gun03;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

/*
       Senaryo;
       1- Siteyi açınız.
       2- Adress Ekleyiniz.
       3- En son eklenen adresi edit yaparak ad ve soyadı değiştirip kaydediniz.
       4- En son eklenen adresi siliniz.
 */
public class _02_AddressFunctionality extends GenelWebDriver {

    @Test
    void addAdress() {
        WebElement adressBook = driver.findElement(By.xpath("(//a[text()='Address Book'])[1]"));
        adressBook.click();

        WebElement newAdress = driver.findElement(By.xpath("//a[text()='New Address']"));
        newAdress.click();

        WebElement firstName = driver.findElement(By.id("input-firstname"));
        firstName.sendKeys("Raziye");

        WebElement lastName = driver.findElement(By.id("input-lastname"));
        lastName.sendKeys("Raziye");

        WebElement company = driver.findElement(By.id("input-company"));
        company.sendKeys("Amazon");

        WebElement adress1 = driver.findElement(By.id("input-address-1"));
        adress1.sendKeys("Turkey");

        WebElement adress2 = driver.findElement(By.id("input-address-2"));
        adress2.sendKeys("Kazakistan");

        WebElement city = driver.findElement(By.id("input-city"));
        city.sendKeys("Almaty");

        WebElement postcode = driver.findElement(By.id("input-postcode"));
        postcode.sendKeys("050006");

        WebElement country = driver.findElement(By.id("input-country"));
        Select countryS = new Select(country);
        countryS.selectByVisibleText("Turkey");

        //wait.until(ExpectedConditions.elementToBeClickable(country));

        wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.cssSelector("select[id='input-zone']>option"))));
        //bu elemanın bayatlamış hali gidene kadar bekle

        WebElement State = driver.findElement(By.id("input-zone"));
        Select state = new Select(State);
        state.selectByVisibleText("Samsun");

//        WebElement state=driver.findElement(By.id("input-zone"));
//        Select ddmenu1=new Select(state);
//        System.out.println("ddmenu1 .size1= " + ddmenu1.getOptions().size());
//       重要步骤如下：意思是等到可以看到下拉菜单以内的选项为止
//        wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.cssSelector("[id='input-zone']>option"),ddmenu1.getOptions().size()));
//        System.out.println("ddmenu1 .size2= " + ddmenu1.getOptions().size());
//        ddmenu1.selectByIndex(5);
//        Actions actions=new Actions(driver);
//        Action action=actions.moveToElement(state).click().sendKeys("a").build();
//        action.perform();
//        action=actions.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build();
//        action.perform();
//        Tools.Bekle(2);

        WebElement radioNo = driver.findElement(By.xpath("//input[@value='0']"));
        radioNo.click();

        WebElement ctn = driver.findElement(By.xpath("//input[@value='Continue']"));
        ctn.click();

        Tools.successMessageValidation();

    }

    @Test(dependsOnMethods = {"addAdress"})
    void EditAdress() {
        WebElement adressBook = driver.findElement(By.xpath("(//a[text()='Address Book'])[1]"));
        adressBook.click();

        List<WebElement> editAll = driver.findElements(By.linkText("Edit"));
        WebElement sonEdit=editAll.get(editAll.size()-1);
        sonEdit.click();

        WebElement firstName = driver.findElement(By.id("input-firstname"));
        firstName.clear();
        firstName.sendKeys("Razi");

        WebElement lastName = driver.findElement(By.id("input-lastname"));
        lastName.clear();
        lastName.sendKeys("Nur");

//        WebElement company = driver.findElement(By.id("input-company"));
//        company.clear();
//        company.sendKeys("Amazon");
//
//        WebElement adress1 = driver.findElement(By.id("input-address-1"));
//        adress1.clear();
//        adress1.sendKeys("Turkey");
//
//        WebElement adress2 = driver.findElement(By.id("input-address-2"));
//        adress2.clear();
//        adress2.sendKeys("Kazakistan");
//
//        WebElement city = driver.findElement(By.id("input-city"));
//        city.clear();
//        city.sendKeys("Almaty");
//
//        WebElement postcode = driver.findElement(By.id("input-postcode"));
//        postcode.clear();
//        postcode.sendKeys("050006");
//
//        WebElement country = driver.findElement(By.id("input-country"));
//        Select countryS = new Select(country);
//        countryS.selectByVisibleText("Kazakhstan");
//
//        WebElement State = driver.findElement(By.id("input-zone"));
//        Select state = new Select(State);
//        state.selectByVisibleText("Almaty");
        WebElement ctn = driver.findElement(By.xpath("//input[@value='Continue']"));
        ctn.click();
        Tools.successMessageValidation();
    }

    @Test(dependsOnMethods = {"EditAdress"})
    void deleteAdress() {
        WebElement adressBook = driver.findElement(By.xpath("(//a[text()='Address Book'])[1]"));
        adressBook.click();

        List<WebElement> deleteAll = driver.findElements(By.linkText("Delete"));
        WebElement sonDelete=deleteAll.get(deleteAll.size()-2);
        sonDelete.click();

        Tools.successMessageValidation();
    }
}