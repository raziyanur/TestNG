package Gun04;

import org.testng.annotations.*;

public class _01_Intro {
    /*
     @BeforeSuit
       @BeforeTest
         @BeforeGroup
           @BeforeClass
             @BeforeMethod
               @Test
               @Test
             @AfterMethod
           @AfterClass
        @AfterGroup
     @AfterTest
   @AfterSuit

    */
    @BeforeSuite
    void bSuit(){System.out.println("Before suit");}

    @BeforeTest
    void bTest(){ System.out.println("Before Test"); }

    @BeforeGroups
    void bGroups(){System.out.println("Before groups");}

    @BeforeClass
    void bClass(){System.out.println("Before class");}

    @BeforeMethod
    void bMethod(){System.out.println("Before method");}

    @Test
    void TestIntro1_1 (){System.out.println("Test intro 1");}

    @Test
    void TestIntro2_2 (){System.out.println("Test intro 2");}

    @AfterSuite
    void aSuit(){System.out.println("After suit");}

    @AfterTest
    void aTest(){ System.out.println("After Test"); }

    @AfterGroups
    void aGroups(){System.out.println("After groups");}

    @AfterClass
    void aClass(){System.out.println("After class");}

    @AfterMethod
    void aMethod(){System.out.println("After method");}






}
