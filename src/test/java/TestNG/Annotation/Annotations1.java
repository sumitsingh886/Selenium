package TestNG.Annotation;

import org.testng.annotations.*;

public class Annotations1 {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite.........");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite..........");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test..........");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test...........");
    }

    @BeforeClass
    public void beforeClassMethod(){
        System.out.println("Before Class ........");
    }

    @AfterClass
    public void afterClassMethod(){
        System.out.println("After Class .........");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method........");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method.........");
    }

    @Test
    public void test_1(){
        System.out.println("My First Test........");
    }

    @Test
    public void test_2(){
        System.out.println("My Second Test.......");
    }
}
