package com.cbt.newTester;

import com.cbt.utilities.BrowserFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAndiFrame {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/iframe");
        driver.switchTo().frame("mce_0_ifr");
        WebElement frame=driver.findElement(By.id("tinymce"));
        System.out.println(frame.getText());
        Thread.sleep(2000);
        frame.clear();
        Thread.sleep(2000);
        frame.sendKeys("hello halis");

        driver.switchTo().defaultContent();




        Thread.sleep(4000);
        driver.quit();
    }
}
