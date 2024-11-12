package TestNG;

import org.testng.annotations.Test;

public class EnableDisable {
    @Test(enabled = false)
    public void mobileLoginPersonalLoan() {
        System.out.println("Mobile Login Personal Loan");
    }
    @Test(enabled = false)
    public void wenLoginPersonalLoan() {
        System.out.println("Web Login Personal Loan");
    }
    @Test(enabled = true)
    public void APILoginPersonalLoan() {
        System.out.println("API Login Personal Loan");
    }
    @Test
    public void mobileLoginAutomobile() {
        System.out.println("Mobile Login Automobile");
    }
    @Test
    public void wenLoginAutomobile() {
        System.out.println("Web Login Automobile");
    }
    @Test
    public void APILoginAutomobile() {
        System.out.println("API Login Automobile");
    }
}
