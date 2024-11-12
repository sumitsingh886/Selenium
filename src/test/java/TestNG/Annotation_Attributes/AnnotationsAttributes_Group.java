package TestNG.Annotation_Attributes;

import org.testng.annotations.Test;

public class AnnotationsAttributes_Group {
    @Test (groups = "Software Company")
    public void infosys(){
        System.out.println("Infosys");
    }
    @Test (groups = "Software Company")
    public void wipro(){
        System.out.println("Wipro");
    }
    @Test(groups = "Automobile")
    public void tata(){
        System.out.println("Tata");
    }
    @Test (groups = "Automobile")
    public void maruti(){
        System.out.println("Maruti");
    }
}
