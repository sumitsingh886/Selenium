package TestNG.Data_Provider;

import helper.DemoHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {

    @DataProvider (name = "searchDataSet")
    public Object[][] searchData(){
        Object[][] searchKeyWord = new Object[3][2];
        searchKeyWord[0][0] = "India";
        searchKeyWord[0][1] = "Qutab Minar";

        searchKeyWord[1][0] = "Agra";
        searchKeyWord[1][1] = "Taj Mahal";

        searchKeyWord[2][0] = "Hyderbad";
        searchKeyWord[2][1] = "Chariminar";

        return searchKeyWord;

    }
    @Test (dataProvider = "searchDataSet")
    public void googleSearch(String country, String monument){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        WebElement searchField = driver.findElement(By.className("gLFyf"));
        searchField.sendKeys(country + " " + monument);

        driver.findElement(By.name("btnK")).submit();
        DemoHelper.pause();
        driver.quit();

    }
    @Test (dataProvider = "searchDataSet", dataProviderClass = TestNGDataProvider1.class)
    public void googleSearch2(String country, String monument){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        WebElement searchField = driver.findElement(By.className("gLFyf"));
        searchField.sendKeys(country + " " + monument);

        driver.findElement(By.name("btnK")).submit();
        DemoHelper.pause();
        driver.quit();

    }
}
