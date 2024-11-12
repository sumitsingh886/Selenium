package TestNG.Execute_Failed_Testcase;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class RetryListener implements IAnnotationTransformer {

    public void transform(ITestAnnotation testAnnotation, Class testClass,
                          Constructor testConstructor, Method testMethod) {
        testAnnotation.setRetryAnalyzer(RetryAnalyser.class);
    }
}
