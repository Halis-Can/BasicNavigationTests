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

public class PTestCases_9_10_11_12 {
    WebDriver driver;
    private String URL="https://practice-cybertekschool.herokuapp.com/";

    @Test
    public void statusTest200(){
driver.findElement(By.linkText("Status Codes")).click();
        BrowserUtils.wait(2);
driver.findElement(By.xpath("//a[text()='200']")).click();
        BrowserUtils.wait(1);
        WebElement warningMessage=driver.findElement(By.xpath("//p"));
        BrowserUtils.wait(1);
        Assert.assertTrue(warningMessage.isDisplayed());

    }
    @Test
    public void statusTest301(){
        driver.findElement(By.linkText("Status Codes")).click();
        BrowserUtils.wait(2);
        driver.findElement(By.xpath("//a[text()='301']")).click();
        BrowserUtils.wait(1);
        WebElement warningMessage=driver.findElement(By.xpath("//p"));
        BrowserUtils.wait(1);
        Assert.assertTrue(warningMessage.isDisplayed());

    }    @Test
    public void statusTest404(){
        driver.findElement(By.linkText("Status Codes")).click();
        BrowserUtils.wait(2);
        driver.findElement(By.xpath("//a[text()='404']")).click();
        BrowserUtils.wait(1);
        WebElement warningMessage=driver.findElement(By.xpath("//p"));
        BrowserUtils.wait(1);
        Assert.assertTrue(warningMessage.isDisplayed());

    }    @Test
    public void statusTest500(){
        driver.findElement(By.linkText("Status Codes")).click();
        BrowserUtils.wait(2);
        driver.findElement(By.xpath("//a[text()='500']")).click();
        BrowserUtils.wait(1);
        WebElement warningMessage=driver.findElement(By.xpath("//p"));
        BrowserUtils.wait(1);
        Assert.assertTrue(warningMessage.isDisplayed());

    }

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get(URL);
    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
