import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TabOrWindow {
    public static void main(String[] args){
        //Launch chrome Browser
        WebDriver driver = new ChromeDriver();
        //Maximize browser
        driver.manage().window().maximize();
        //open URL
        driver.get("https://www.google.com/");
        System.out.println("First Page:" + driver.getTitle());
        //open new tab
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("http://www.uitestingplayground.com/");
        System.out.println("Second Tab: " + driver.getTitle());
        //get window handle
        Set<String> windowHandle = driver.getWindowHandles();
        List <String> handle = new ArrayList<String>();
        handle.addAll(windowHandle);
        driver.close();
        driver.switchTo().window(handle.get(0));
        System.out.println("First Page: " + driver.getTitle() );
        driver.quit();
    }
}
