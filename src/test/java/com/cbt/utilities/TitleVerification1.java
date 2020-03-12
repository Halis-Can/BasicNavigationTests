package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class TitleVerification1 {
    public static void main(String[] args) throws Exception {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");

            WebDriverManager.chromedriver().setup();
       WebDriver driver=new ChromeDriver();
//Homework 2_1:
        for (String eachPage: urls ) {
            driver.get(eachPage);
            Thread.sleep(2000);
            String expected="Practice";
            String actualTitle = driver.getTitle();

            if (expected.equals(actualTitle)) {
                System.out.println("Pass ");
            }
        }

        Thread.sleep(2000);
       driver.quit();
    }
}
