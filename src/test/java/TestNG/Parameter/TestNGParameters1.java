package TestNG.Parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameters1 {
    @Test
    @Parameters({"AutomobileName"})
    public void Automobile(String name){
        System.out.println("Automobile Name: " + name);
    }
}
