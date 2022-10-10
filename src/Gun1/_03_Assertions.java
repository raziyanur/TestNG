package Gun1;

import org.testng.Assert;
import org.testng.annotations.Test;


public class _03_Assertions {
    //yesel tik: test de hata yok
    //Sari carpi: test de hata var


    @Test
    void EqualOrnek(){
        String s1="Merhaba";
        String s2="Iyi aksamlar";

        //olusan , beklenen, "hata basligi"
        Assert.assertEquals(s1,s2,"Karsilastirma sonucu");
        //Actual: olusan
        //Expected: Beklnen


    }

    @Test
    void notEqualOrnek(){
        String s1="Merhaba";
        String s2="Iyi aksamlar";

        //olusan , beklenen, "hata basligi"
        Assert.assertNotEquals(s1,s2,"Karsilastirma sonucu");
        //Actual: olusan
        //Expected: Beklnen


    }
    @Test
    void TrueOrnek(){
        int s1=55;
        int s2=555;

        //olusan , beklenen, "hata basligi"
        Assert.assertTrue(s1==s2,"Karsilastirma sonucu");
        //Actual: olusan
        //Expected: Beklnen


    }
    @Test
    void nullOrnek(){
        String s1=null;


        //olusan , beklenen, "hata basligi"
        Assert.assertNull(s1,"Karsilastirma sonucu");
        //Actual: olusan
        //Expected: Beklnen
    }
    @Test
    void drektFail(){
        Assert.fail();
    }
}
