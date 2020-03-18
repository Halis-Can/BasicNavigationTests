package com.cbt.newTester;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JumptoNewWindow {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://google.com");
        String handle=driver.getWindowHandle();
        System.out.println(handle);
        driver.switchTo();
        driver.get("http://amazon.com");

        driver.quit();
    }
}
