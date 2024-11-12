package TestNG.Batch_Testing;

import org.testng.annotations.Test;

public class LoginTest {
    @Test
    public void loginByMobileNumber(){
        System.out.println("Login By Mobile Passed");
    }
    @Test
    public void loginByEmail(){
        System.out.println("Login By Email Passed");
    }
}
