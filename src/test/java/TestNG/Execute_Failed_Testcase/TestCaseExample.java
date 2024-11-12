package TestNG.Execute_Failed_Testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaseExample {

    @Test
    public void TestCase01(){
        Assert.assertTrue(false);
    }

    @Test
    public void TestCase02(){
        Assert.assertTrue(false);
    }

    @Test //(retryAnalyzer = RetryAnalyser.class)
    public void TestCase03(){
        Assert.assertTrue(true);
    }
}
