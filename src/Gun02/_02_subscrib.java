package Gun02;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
/*
  Senaryo
  1- Siteyi açınız.
  2- Newsletter  Subscribe ve UnSubscribe işlemlerini ayrı ayı testlerde yapınız.
3- Newsletter  üyelik işlemini, üye ise , üyelikten çıkma, değilse ekleme şeklinde yapınız
 */
public class _02_subscrib extends GenelWebDriver {
    By linkNewsletter=By.linkText("Newsletter");
    By yes=By.xpath("(//input[@type='radio'])[1]");
    By no=By.cssSelector("input[value='0'");
    By cnt=By.cssSelector("input[value='Continue']");
@Test (priority = 1)
   void subscribYes() {

    WebElement newsletter = wait.until(ExpectedConditions.visibilityOfElementLocated(linkNewsletter));
    newsletter.click();

    WebElement yesRadio = driver.findElement(yes);
    yesRadio.click();

    WebElement continueButton = driver.findElement(cnt);
    continueButton.click();

    Tools.successMessageValidation();
}
    @Test (priority = 2)
    void subscribNo(){

        WebElement newsletter=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Newsletter")));
        newsletter.click();

        WebElement noRadio=driver.findElement(no);
        noRadio.click();

        WebElement continueButton= driver.findElement(cnt);
        continueButton.click();

        Tools.successMessageValidation();

    }

    @Test (priority = 3)
    void subscribBoth(){

        WebElement newsletter=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Newsletter")));
        newsletter.click();
        WebElement yesRadio = driver.findElement(yes);
        WebElement noRadio=driver.findElement(no);
        if(yesRadio.isSelected())
            noRadio.click();
        else yesRadio.click();

        WebElement continueButton= driver.findElement(cnt);
        continueButton.click();

        Tools.successMessageValidation();

    }
}
