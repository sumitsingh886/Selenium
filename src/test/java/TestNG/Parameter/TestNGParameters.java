package TestNG.Parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameters {
    @Test
    @Parameters({"i","j"})
    public void addition(int a, int b){
        System.out.println("Addition:" + (a + b));
    }
    @Test
    @Parameters({"i","j"})
    public void subtraction(int a, int b) {
        System.out.println("Subtraction:" + (a - b));
    }
    @Test
    @Parameters({"i","j"})
    public void multiplication(int a, int b) {
        System.out.println("Multipication:" + (a * b));
    }
}
