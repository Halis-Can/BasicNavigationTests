package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {
    public static void main(String[] args) throws InterruptedException {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
//Homework 2_2:
        for (String eachPage: urls ) {
            driver.get(eachPage);
            String title=driver.getTitle();
            title=title.replace(" ","").toLowerCase();
            if (eachPage.contains(title)) {
                System.out.println("pass");
            } else {
                System.out.println("fail");
            }
            Thread.sleep(2000);

        }

        Thread.sleep(2000);
        driver.quit();
    }

}

