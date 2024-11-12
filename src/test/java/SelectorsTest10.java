import helper.DemoHelper;
import helper.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.List;

import static helper.Pages.HOME;
import static helper.Pages.SAVINGS;

public class SelectorsTest10 {

    WebDriver driver;
    @Test
    public void byId() {
        driver = DriverFactory.newDriver();
        driver.get(HOME);

        driver.findElement(By.id("register")).click();

    }

    @Test
    public void byClass() {
        driver = DriverFactory.newDriver();
        driver.get(HOME);
        driver.findElement(By.id("register")).click();

//        WebElement firstMatch = driver.findElement(By.className("invalid-feedback"));

        List<WebElement> feedbackList = driver.findElements(By.className("invalid-feedback"));

        Assert.assertEquals(feedbackList.get(0).getText(), "Valid first name is required");
        Assert.assertEquals(feedbackList.get(1).getText(), "Valid last name is required");
        Assert.assertEquals(feedbackList.get(2).getText(), "Please enter a valid email address");

    }

    @Test
    public void byTagName(){
        driver = DriverFactory.newDriver();
        driver.get(SAVINGS);

        var table = driver.findElement(By.id("rates"));
        var sameTable = driver.findElement(By.tagName("table"));

        System.out.println(table.getText());
        System.out.println(sameTable.getText());

    }

    @Test
    public void byLinkText(){
        driver = DriverFactory.newDriver();
        driver.get(HOME);
        driver.findElement(By.linkText("Savings")).click();

    }

    @Test
    public void byPartialLinkText(){
        driver = DriverFactory.newDriver();
        driver.get(HOME);
        driver.findElement(By.partialLinkText("Reg")).click();
    }

    @Test
    public void byCssSelector(){
    driver = DriverFactory.newDriver();
    driver.get(HOME);
    var datePicker = driver.findElement(By.cssSelector("input[type=date]"));
    datePicker.sendKeys("10/12/2024");
    DemoHelper.pause();

//    var clear = driver.findElement(By.cssSelector("button[id='clear']"));
    var clear = driver.findElement(By.cssSelector("button#clear[type=submit]"));
    clear.click();
    DemoHelper.pause();

    }

    @Test
    public void byCssSelector_2(){
        driver = DriverFactory.newDriver();
        driver.get(HOME);
        var checkbox = driver.findElement(By.cssSelector("[type=checkbox]:not(:checked)"));
        DemoHelper.pause();
        checkbox.click();
        DemoHelper.pause();
    }

    @Test
    public void byXpath(){
        driver = DriverFactory.newDriver();
        driver.get(SAVINGS);
        var cell = driver.findElement(By.xpath("/html/body/main/div/div/div/form/div/div[4]/table/tbody/tr[1]/td[4]"));
        System.out.println(cell.getText());

        var cell_2 = driver.findElement(By.xpath("//*[@id=\"rates\"]/tbody/tr[1]/td[4]"));
        System.out.println(cell_2.getText());

    }

    @Test
    public void byXpath_2(){
        driver = DriverFactory.newDriver();
        driver.get(HOME);
        var button = driver.findElement(By.xpath("//form/button[contains(text(), \"Register\")]"));
        System.out.println(button.getText());

    }

    @AfterMethod
    public void cleanUp(){
        driver.quit();
    }

}
