package TestNG.Batch_Testing;

import org.testng.annotations.Test;

public class PaymentTest {
    @Test
    public void cashOnDelivery(){
        System.out.println("Cash On Delivery Passed");
    }
    @Test
    public void netBanking(){
        System.out.println("Net Banking Passed");
    }
}
