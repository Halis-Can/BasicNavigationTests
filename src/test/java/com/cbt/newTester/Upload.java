package com.cbt.newTester;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/upload");
        WebElement upload = driver.findElement(By.id("file-upload"));
        Thread.sleep(2000);
        String filePath = System.getProperty("user.dir")+"/pom.xml";
        upload.sendKeys(filePath);
        driver.findElement(By.id("file-submit")).click();

        Thread.sleep(2000);
        driver.quit();
    }
}
