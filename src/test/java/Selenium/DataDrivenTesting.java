package Selenium;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.*;

public class DataDrivenTesting {
    @Test
    public void printExcelFileData() throws IOException {

        XSSFWorkbook ExcelWBook = null;
        XSSFSheet ExcelWSheet;
        XSSFRow Row;
        XSSFCell Cell;

        //Create an object of File class to open file.
        File excelFile = new File("C:\\Users\\sumit.singh\\Downloads\\TestDataFile.xlsx");

        //Create an object of FileInputStream to read data from file
        FileInputStream inputStream = new FileInputStream(excelFile);

        //Excel -> workbook -> sheet -> row -> cell
        //Create object of XSSFWorkbook to handle xlsx file
        ExcelWBook = new XSSFWorkbook(inputStream);
        //to access workbook sheet
        ExcelWSheet = ExcelWBook.getSheetAt(0);

        //get total row count
        int totalRow = ExcelWSheet.getLastRowNum() + 1;

        //get total no. of cells in a row
        int totalCell = ExcelWSheet.getRow(0).getLastCellNum();

        for (int currentRow = 0; currentRow < totalRow; currentRow++) {

            for (int currentCell = 0; currentCell < totalCell; currentCell++) {
                System.out.println(ExcelWSheet.getRow(currentRow).getCell(currentCell).toString());
//                System.out.println("\t");
            }
            System.out.println();
        }
        ExcelWBook.close();
    }

    @Test
    public void loginWithExcelData() throws IOException {

        XSSFWorkbook ExcelWBook = null;
        XSSFSheet ExcelWSheet;

        //Create an object of File class to open file.
        File excelFile = new File("C:\\Users\\sumit.singh\\Downloads\\TestDataFile.xlsx");

        //Create an object of FileInputStream to read data from file
        FileInputStream inputStream = new FileInputStream(excelFile);

        //Excel -> workbook -> sheet -> row -> cell
        //Create object of XSSFWorkbook to handle xlsx file
        ExcelWBook = new XSSFWorkbook(inputStream);
        //to access workbook sheet
        ExcelWSheet = ExcelWBook.getSheetAt(0);

        //get total row count
        int totalRow = ExcelWSheet.getLastRowNum() + 1;

        for (int currentRow = 1; currentRow < totalRow; currentRow++) {
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com/v1/");
            driver.findElement(By.id("user-name")).sendKeys(ExcelWSheet.getRow(currentRow).getCell(0).toString());

            driver.findElement(By.id("password")).sendKeys(ExcelWSheet.getRow(currentRow).getCell(1).toString());

            driver.findElement(By.id("login-button")).click();

            driver.quit();
        }
        ExcelWBook.close();
    }
}
