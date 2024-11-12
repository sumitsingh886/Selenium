import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class BrokenLinks {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.deadlinkcity.com/");

        List< WebElement > linkList = driver.findElements(By.tagName("a"));

        int resCode = 200; //valid link
        int brokenLinkCount = 0;
        System.out.println("Total Links " + linkList.size());
        for (WebElement element: linkList){
            String url = element.getAttribute("href");

            try {
                URL urlLink = new URL(url);
                HttpURLConnection hcu = (HttpURLConnection)urlLink.openConnection();
                hcu.setRequestMethod("HEAD");
                hcu.connect();

                resCode = hcu.getResponseCode();
                if(resCode >=400){
                    System.out.println(url + "broken link.");
                    brokenLinkCount ++;
                }

            } catch (MalformedURLException e) {

            } catch (Exception e) {

            }
        }
        System.out.println("Total broken links " + brokenLinkCount);
    driver.quit();

    }
}
