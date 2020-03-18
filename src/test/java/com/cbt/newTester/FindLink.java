package com.cbt.newTester;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindLink {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");
//how to collect all links from this page!
List<WebElement> links=driver.findElements(By.tagName("a"));
       for (WebElement eachLink:links ) {
            System.out.println(eachLink.getText());
            System.out.println(eachLink.getAttribute("href"));
            System.out.println();
           /* eachLink.click();
            Thread.sleep(2000);*/
        }
        for(int i=1; i < links.size(); i++) {
            links.get(i).click();
          // Thread.sleep(2000);
            driver.navigate().back();
          //Thread.sleep(2000);
            //refresh list again
            links=driver.findElements(By.tagName("a"));
        }



        Thread.sleep(3000);
        driver.quit();
    }
}
