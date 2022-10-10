package Gun1;

import org.testng.annotations.*;

public class _02_Annotation {
/*
         @BeforeClass --> // Her class çalışıyorken önce burası çalışır
           @BeforeMetod --> // Her metoddan(test metod) önce çalışır
              @Test     -->  testlerin çalıştığı metodlar
              @Test     -->  testlerin çalıştığı metodlar
           @AfterMetod --> // Her metoddan(test metod) sonra çalışır
         @AfterClass --> // Her class çalışıyorken sonra burası çalışır
     */

@BeforeClass
    void beforeClass() {
        System.out.println("her classtan once calisacak: before Class");
    }
    @BeforeMethod
    void beforeMetod(){
        System.out.println("her test metoddan once calisacak: BeforeMetod");
    }

    @AfterMethod
    void  afterMetod(){
        System.out.println("her test metoddan sonra calisir : After metod ");
    }
    @AfterClass
    void afterClass(){
        System.out.println("her class dan sonra calisacak: After class");
    }
    @Test
    void test1(){
        System.out.println("Test 1 calisti");
    }
    @Test
    void test2(){
        System.out.println("Test 1 calisti");
    }
}
