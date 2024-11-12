package TestNG.Data_Provider;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class DataProviderWithExcel {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("http:/www.google.com");
        driver.manage().window().maximize();
    }

    @Test(dataProvider = "searchDataProvider")
    public void searchKeyword(String keyword) {
        WebElement searchbox = driver.findElement(By.className("gLFyf"));
        searchbox.sendKeys(keyword);
        searchbox.sendKeys(Keys.ENTER);
    }

    @DataProvider(name = "searchDataProvider")
    public Object[][] searchDataProviderMethod() throws IOException {
        String fileName = "C:\\Users\\sumit.singh\\Downloads\\SearchData.xlsx";
        Object[][] searchData = getExceldata(fileName, "Sheet1");
//        Object[][] searchData = new Object[2][1];
//        searchData[0][0] = "Taj Mahal";
//        searchData[1][0] = "India";

        return searchData;
    }

    public String[][] getExceldata(String fileName, String sheetName) throws IOException {
        String[][] data = null;

        FileInputStream inputStream = new FileInputStream(fileName);

        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet excelSheet = workbook.getSheet(sheetName);
        int totalRow = excelSheet.getLastRowNum() + 1;
        int totalCell = excelSheet.getRow(0).getLastCellNum();

        data = new String[totalRow - 1][totalCell];
        for (int currentRow = 1; currentRow < totalRow; currentRow++) {
            for (int currentCell = 0; currentCell < totalCell; currentCell++) {
                data[currentRow - 1][currentCell] = excelSheet.getRow(currentRow).getCell(currentCell).getStringCellValue();
            }
        }
        workbook.close();
        return data;
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
