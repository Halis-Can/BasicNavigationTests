package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StringUtility {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver = new ChromeDriver();
    }
    public static void verifyEquals(String expected, String actual) {
        if (expected.equals(actual)) {
            System.out.println(" pass ");
        } else {
            System.out.println("failed");
        }
    }
}