package TestNG.Parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameters3 {
    @Test
    @Parameters({"Keyword"})
    public void googleSearch(String searchData){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        WebElement searchField = driver.findElement(By.className("gLFyf"));
        searchField.sendKeys(searchData);

        Assert.assertEquals(searchData, searchField.getAttribute("value"));
        driver.quit();
    }
}
