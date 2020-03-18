package com.cbt.newTester;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ClickButtom {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        Thread.sleep(2000);
        driver.findElement(By.id("disappearing_button")).click();

        Thread.sleep(2000);
        List<WebElement> list = driver.findElements(By.id("disappearing_button"));
        //if size is 0, that means no elements were found
        if(list.size() == 0){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }
        Thread.sleep(2000);


          List<WebElement> buttoms=driver.findElements(By.tagName("button"));
        Thread.sleep(2000);
        for (WebElement eachButtom : buttoms ) {
            eachButtom.click();
            Thread.sleep(2000);

        }

          Thread.sleep(2000);
         driver.quit();
       }
}
