package com.cbt.newTester;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_GoogleSerch2 {
    public static void main(String[] args)throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.okta.com/");
        Thread.sleep(2000);
       WebElement name=driver.findElement(By.linkText("Sign In"));
       name.click();
        Thread.sleep(2000);
        //By.name("q") --> name="q"==>name - it's one of the selenium locators
        //there are 8 locators!!=>we use locators to find elements
       //to choose locator, just use By.locator
        driver.get("http://google.com");
        WebElement search= driver.findElement(By.name("q"));
          search.sendKeys("Java", Keys.ENTER);
        Thread.sleep(2000);
          //if see <a> element, it calls link
        WebElement news=driver.findElement(By.linkText("News"));
       news.click();

        Thread.sleep(2000);
        driver.quit();
    }
}
