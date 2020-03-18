package com.cbt.newTester;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com");
        WebElement rileUpload=driver.findElement(By.xpath("//a[@href=\"/download\"]"));
        rileUpload.click();




        Thread.sleep(2000);
        driver.quit();
    }

}
