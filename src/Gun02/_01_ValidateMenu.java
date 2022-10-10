package Gun02;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/*
        Senaryo;
        1- Siteyi açınız
        2- Top Menudeki menu elemanlarının olduğunu doğrulayınız.
     */
public class _01_ValidateMenu extends GenelWebDriver {
    @Test
    void loginTest() {
        WebElement inputEmail = driver.findElement(By.id("input-email"));
        inputEmail.sendKeys("razi@gmail.com");

        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("2529688");

        WebElement loginBtn = driver.findElement(By.cssSelector("input[value='Login']"));
        loginBtn.click();
    }
    ////ul[@class='nav navbar-nav']



    @Test
    void menuValidation(){
        List<String> menuExpectedList=new ArrayList<>();
        menuExpectedList.add("Desktops");
        menuExpectedList.add("Laptops & Notebooks");
        menuExpectedList.add("Components");
        menuExpectedList.add("Tablets");
        menuExpectedList.add("Software");
        menuExpectedList.add("Phones & PDAs");
        menuExpectedList.add("Cameras");
        menuExpectedList.add("MP3 Players");

        By menuFinder=By.cssSelector("ul[class='nav navbar-nav']>li");
        List<WebElement> menuActual=driver.findElements(menuFinder);

        Tools.compareToList(menuExpectedList, menuActual);
    }




}

