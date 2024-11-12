package TestNG.Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListenerClass implements ITestListener {

    public void onStart(ITestContext Result){
        System.out.println("On start method invoked......");
    }

    public void onFinish(ITestContext Result){
        System.out.println("On finish method invoked......");
    }

    public void onTestFailure(ITestResult Result){
        System.out.println("Name of test method failed: " + Result.getName());
    }

    public void onTestSkipped(ITestResult Result){
        System.out.println("Name of test method skipped: " + Result.getName());
    }

    public void onTestStart(ITestResult Result){
        System.out.println("Name of test method started: " + Result.getName());
    }

    public void onTestSuccess(ITestResult Result){
        System.out.println("Name of test method success: " + Result.getName());
    }

    public void onTestFailedButWithinSuccessPercentage(ITestContext Result){
    }
}
