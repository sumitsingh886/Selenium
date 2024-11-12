package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DatepickerDemo2 {
    public static void main(String[] args){

        String expectedDay = "10";
        String expectedMonthYear = "Jul 2025";

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("w");

        driver.findElement(By.xpath("//div[@id='onwardCal']")).click();

        while (true){
            String calendarMonthYear = driver.findElement(By.xpath("//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'][position()=2]")).getText().substring(0,8);
            if (calendarMonthYear.equals(expectedMonthYear)){
                driver.findElement(By.xpath("//span[text()='" + expectedDay +"']")).click();
                break;
            }else {
                driver.findElement(By.xpath("//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'][position()=3]")).click();
            }
        }
    }
}
