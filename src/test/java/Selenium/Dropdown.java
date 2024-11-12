import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdown {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette");

        WebElement element = driver.findElement(By.tagName("select"));

        Select dropdown = new Select(element);

//        dropdown.selectByVisibleText("India");
//        dropdown.selectByValue("ALA");
        dropdown.selectByIndex(5);
        if(dropdown.isMultiple()==true){
            System.out.println("Dropdown is multiple");
        }else {
            System.out.println("Dropdown is not multiple");
        }

        List <WebElement> allOptions = dropdown.getOptions();
        for (WebElement el :allOptions){
            System.out.println(el.getText());
        }
        driver.quit();
    }
}
