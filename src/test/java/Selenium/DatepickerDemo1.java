package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DatepickerDemo1 {
    public static void main(String[] args) {

        String expectedDay = "10";
        String expectedMonth = "July";
        String expectedYear = "2001";

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/datepicker/");

        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();

        while (true){
            String calendarMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
            String calendarYear = driver.findElement(By.className("ui-datepicker-year")).getText();

            if (calendarMonth.equals(expectedMonth) && calendarYear.equals(expectedYear)){
//                driver.findElement(By.xpath("//a[text()='10']")).click();
                List <WebElement> dayList = driver.findElements(By.xpath("//table/tbody/tr/td"));

                for (WebElement e : dayList){
                    String calendarDay = e.getText();
                    if (calendarDay.equals(expectedDay)){
                        e.click();
                        break;
                    }
                }
                break;
            }else {
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
            }
        }
    }
}
