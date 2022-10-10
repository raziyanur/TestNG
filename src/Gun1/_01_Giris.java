package Gun1;

import org.testng.annotations.Test;

public class _01_Giris {

    @Test(priority = 1)//annotation lar
void webSitesiiniAc(){
    System.out.println("drover tanimlandi ve web sitesi acildi");
}
    @Test(priority = 2)
void LoginTestIsleminiYap(){
    System.out.println("Login test islemleri yapildi");
    // yesil tik hatali assertion yok demek.绿色对勾表示没有错误
}

    @Test(priority = 3)
void diriveriKapat(){
    System.out.println("driver kapatildi ve cikildi");
}






}
