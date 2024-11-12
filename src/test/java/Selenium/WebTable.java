import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.List;

public class WebTable {
    @Test
    public void table() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Web Scraping\\Selenium\\table.html");

        System.out.println(driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText());

        //find no of rows in table
        List < WebElement> noRows = driver.findElements(By.xpath("//table/tbody/tr"));
        System.out.println("No. of rows:" + noRows.size());

        List <WebElement> noColumns = driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
        System.out.println("No. of columns:" + noColumns.size());

        for (int i = 2; i <= noRows.size(); i++){
            for (int j= 1; j <=noColumns.size(); j++){
                String tableData = driver.findElement(By.xpath("//table/tbody/tr["+ i + "]/td[" + j + "]")).getText();
                System.out.println(tableData);
            }
        }

        driver.quit();
    }
    @Test
    public void table_1() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        List<WebElement> noRows = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
        System.out.println("No. of rows:" + noRows.size());

        List<WebElement> noColumns = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th"));
        System.out.println("No. of columns:" + noColumns.size());
        for (int i = 2; i <= noRows.size(); i++){
            for (int j= 1; j <=noColumns.size(); j++){
                String tableData = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+ i + "]/td[" + j + "]")).getText();
                System.out.println(tableData);
            }
        }

        driver.quit();
    }
}
