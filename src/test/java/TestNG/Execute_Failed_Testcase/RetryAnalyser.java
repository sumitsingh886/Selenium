package TestNG.Execute_Failed_Testcase;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer {
    int counterForRetryAnalyser = 0;
    int setMaxLimitForRetry = 3;

    public boolean retry(ITestResult result) {
        if(!result.isSuccess()){
            if(counterForRetryAnalyser < setMaxLimitForRetry){
                counterForRetryAnalyser++;
                return true;
            }
        }
        return false;
    }
}
