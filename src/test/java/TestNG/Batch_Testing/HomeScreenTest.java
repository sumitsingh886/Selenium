package TestNG.Batch_Testing;

import org.testng.annotations.Test;

public class HomeScreenTest {
    @Test
    public void launchApplication(){
        System.out.println("Application Launch Passed");
    }
    @Test
    public void verifyTitle(){
        System.out.println("Verify Title Passed");
    }
    @Test
    public void verifyLogo(){
        System.out.println("Verify Logo Passed");
    }
}
