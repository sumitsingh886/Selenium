package TestNG.Parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameters2 {
    @Test
    @Parameters({"SoftwareCompanyName"})
    public void SoftwareCompany(String name){
        System.out.println("Automobile Name: " + name);
    }
}
