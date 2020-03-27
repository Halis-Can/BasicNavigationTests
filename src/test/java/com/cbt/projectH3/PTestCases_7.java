package com.cbt.projectH3;

import com.cbt.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PTestCases_7 {

private WebDriver driver;
private String URL="https://practice-cybertekschool.herokuapp.com/";

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get(URL);
    }

@Test
    public void filetxt(){
        driver.findElement(By.linkText("File Upload")).click();
        BrowserUtils.wait(2);

          WebElement upload=driver.findElement(By.id("file-upload"));
          BrowserUtils.wait(2);

          String filePath="C:\\Users\\ahali\\Desktop\\Textt.txt";
        upload.sendKeys(filePath);
        BrowserUtils.wait(2);
        driver.findElement(By.id("file-submit")).click();
        BrowserUtils.wait(2);

        //Verified that subject is: “File Uploaded!”
    String expected = "File Uploaded!";
    String actual = driver.findElement(By.xpath("//h3[text()='File Uploaded!']")).getText();
    Assert.assertEquals(actual, expected);

       //Verified that uploaded file name is displayed.
    WebElement warningMessage=driver.findElement(By.id("uploaded-files"));
    Assert.assertTrue(warningMessage.isDisplayed());

    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}