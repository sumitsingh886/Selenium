package TestNG;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class InvocationCount {
    @Test(invocationCount = 5)
    public void testMethod1(ITestContext Result){
        int currectInvocation = Result.getAllTestMethods()[0].getCurrentInvocationCount();
        System.out.println("Executing: " + currectInvocation);
        System.out.println("Test Method 1 ....");
    }

    @Test(invocationCount = 3)
    public void testMethod2(ITestContext contex){
        int currectInvocation = contex.getAllTestMethods()[1].getCurrentInvocationCount();
        System.out.println("Executing: " + currectInvocation);
        System.out.println("Test Method 2 ....");
    }
}
