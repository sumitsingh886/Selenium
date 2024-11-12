import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class JavascriptExe {
    @Test
    public void inputField() {
        //Launch Chrome Browser
        WebDriver driver = new ChromeDriver();
        //Maximize browser
        driver.manage().window().maximize();
        //open URL
        driver.get("http://www.uitestingplayground.com/textinput");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("document.getElementById('newButtonName').value='Sumit';");

        driver.quit();

    }
    @Test
    public void buttonClick() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.uitestingplayground.com/textinput");
        JavascriptExecutor js = (JavascriptExecutor)driver;

        //Click on a Button
        WebElement button = driver.findElement(By.xpath("//button[@id='updatingButton']"));
        js.executeScript("arguments[0].click()", button);

        driver.quit();
    }
    @Test
    public void refresh() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.uitestingplayground.com/textinput");
        JavascriptExecutor js = (JavascriptExecutor)driver;

        //Refresh Browser
        js.executeScript("history.go(0)");

        driver.quit();
    }
    @Test
    public void zoomInOut() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.uitestingplayground.com/textinput");
        JavascriptExecutor js = (JavascriptExecutor)driver;

        //Zoom 50%
        js.executeScript("document.body.style.zoom='50%'");

        driver.quit();
    }
    @Test
    public void borderColor() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.uitestingplayground.com/textinput");
        JavascriptExecutor js = (JavascriptExecutor)driver;

        WebElement button = driver.findElement(By.xpath("//button[@id='updatingButton']"));
        //draw border outside the element
        js.executeScript("arguments[0].style.border = '3px solid red';", button);

        driver.quit();
    }
    @Test
    public void getDomain_Title_URL(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.uitestingplayground.com/textinput");
        JavascriptExecutor js = (JavascriptExecutor)driver;

        //get domain name
        String domainName =  js.executeScript("return document.domain;").toString();
        System.out.println(domainName);

        //get title
        String title =  js.executeScript("return document.title;").toString();
        System.out.println(title);

        //get URL
        String url =  js.executeScript("return document.URL;").toString();
        System.out.println(url);

        driver.quit();

    }
    @Test
    public void getHeight_Width() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.uitestingplayground.com/textinput");
        JavascriptExecutor js = (JavascriptExecutor)driver;

        //return height and width of the web page
        String height = js. executeScript("return window.innerHeight;").toString();
        System.out.println("Height: " + height);
        String width = js. executeScript("return window.innerWidth;").toString();
        System.out.println("Wight: " + width);

        driver.quit();
    }
    @Test
    public void scroll() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.uitestingplayground.com/home");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Scroll vertically till the end
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        //Scroll vertically page up
//        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

        driver.quit();
    }
    @Test
    public void alertMessage() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.uitestingplayground.com/home");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("alert('This is my alert message.';");

        driver.quit();
    }
    @Test
    public void navigateURL() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.uitestingplayground.com/home");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.location = 'http://www.google.com'");
        driver.quit();
    }
    @Test
    public void flash() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.uitestingplayground.com/textinput");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement button = driver.findElement(By.xpath("//button[@id='updatingButton']"));

        String bgColor = button.getCssValue("backgroundColor");
        for (int i = 0; i < 50; i++) {
            js.executeScript("arguments[0].style.backgroundColor= '#000000'", button);

            try {
                Thread.sleep(20); //20ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            js.executeScript("arguments[0].style.backgroundColor= '" + bgColor + "'", button);
            try {
                Thread.sleep(20); //20ms
            } catch (InterruptedException e) {
                    e.printStackTrace();
            }
        }
        driver.quit();
    }
}
