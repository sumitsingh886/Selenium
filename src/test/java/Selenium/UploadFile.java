import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class UploadFile {

    public static void main(String[] args) throws AWTException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

//        driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\sumit.singh\\Downloads\\dummy.pdf");

        WebElement upload = driver.findElement(By.xpath("//input[@type='file']"));
        Actions actions = new Actions(driver);
        actions.click(upload).perform();

        Robot rb = new Robot();
        rb.delay(2000);
        //copy file to clipboard
        StringSelection ss = new StringSelection("C:\\Users\\sumit.singh\\Downloads\\dummy.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);

        //perform Ctrl + v action tp paste file
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);

        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);

        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

        driver.quit();
    }
}
