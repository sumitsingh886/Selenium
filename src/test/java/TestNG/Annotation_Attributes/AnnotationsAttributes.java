package TestNG.Annotation_Attributes;

import org.testng.annotations.Test;

public class AnnotationsAttributes {
    @Test (description = "This is TestCase1")
    public void Test_1_Description(){
        System.out.println("Mobile Login TestCase");
    }
//    @Test (timeOut = 200 , priority = 2)
//    public void Test_2_Timeout() throws InterruptedException {
//        Thread.sleep(400);
//        System.out.println("Web Login TestCase");
//    }
    @Test(priority = 0)
    public void Test_3_Priority(){
        System.out.println("API Login TestCase");
    }
    @Test(dependsOnMethods = {"Test_1_Description", "Test_3_Priority"})
    // If the dependence is failed then below test cases is not execute
    public void Test_4_Depends_Method(){
        System.out.println("Depends Method Method");
    }
    @Test(enabled = false)
    // If the dependence is failed then below test cases is not execute
    public void Test_5_Enabled(){
        System.out.println("Enabled");
    }
}
