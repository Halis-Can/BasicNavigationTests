package com.cbt.newTester;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_Navigation {
    public static void main(String[] args) throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        Thread.sleep(2000);
        driver.get("https://www.amazon.com/");
        driver.navigate().to("https://www.google.com/");
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.getTitle();
        System.out.println( driver.getTitle());
        //========================
        String title=driver.getTitle();
        String expectedTitle="Google";
        System.out.println("title from WebBrowser is: " +title);

        verifyTitle(driver.getTitle(),"Google");

        Thread.sleep(4000);
        driver.quit();
    }
    public static void verifyTitle(String actual, String expected){
        if (actual.equals(expected)){
            System.out.println("TEST PASSTED");
        }else{
            System.out.println("TEST FAILED");
        }
    }
}
