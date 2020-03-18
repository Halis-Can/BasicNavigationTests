package com.cbt.newTester;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        //driver.findElement(By.xpath("//*[@id=\"content\"]/div/button[1]")).click();
        // ==2.way List<>
        List<WebElement> buttons=driver.findElements(By.tagName("button"));
        buttons.get(0).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        buttons.get(1).click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        //================
        buttons.get(2).click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Halis can side");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();






 Thread.sleep(2000);
 driver.quit();

    }
}
