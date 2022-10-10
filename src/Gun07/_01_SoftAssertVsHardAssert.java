package Gun07;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _01_SoftAssertVsHardAssert {
    @Test
    void hardAsset() {
        String s1 = "Merhaba";

        Assert.assertEquals("Merhaba 123", s1, "HardAsset Sonucu");
        System.out.println("Hard asser sonrasi");// hardassert hata verdiginde sonrasi calismaz
    }

    @Test
    void softAssert(){
        String  strHomePage="www.facebook.com/homepage";
        String  strCartPage="www.facebook.com/cartpage";
        String  strEditAccount="www.facebook.com/editaccountpage";

        SoftAssert _softAssert=new SoftAssert();
        _softAssert.assertEquals("www.facebook.com/homepage",strHomePage);
        System.out.println("assert1");

        _softAssert.assertEquals("www.facebook.com/profil",strCartPage);
        System.out.println("assert2");

        _softAssert.assertEquals("www.facebook.com/setting",strEditAccount);
        System.out.println("assert3");

        _softAssert.assertAll();//butun assert sonuclarini isleme koyuyor
        System.out.println("Aktiflik sonrasi");// bu boluum assertAll dan sonra oldugu ceoncesinde
        //hata olustugu icin, yazilmadi
    }


}