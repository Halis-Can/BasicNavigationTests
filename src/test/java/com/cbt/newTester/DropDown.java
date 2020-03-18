package com.cbt.newTester;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");
        Thread.sleep(2000);
        Select selectSimpleDropdown=new Select(driver.findElement(By.id("dropdown")));
        selectSimpleDropdown.selectByVisibleText("Option 1");
        Thread.sleep(1500);
        selectSimpleDropdown.selectByVisibleText("Option 2");
        Thread.sleep(2000);
        //================select day,months year===
        Select selectYear=new Select(driver.findElement(By.id("year")));
        Select selectMonths=new Select(driver.findElement(By.id("month")));
        Select selectDay=new Select(driver.findElement(By.id("day")));
        //=======
        Thread.sleep(2000);
        selectYear.selectByVisibleText("1977");
        selectMonths.selectByVisibleText("February");
        selectDay.selectByVisibleText("7");
        Thread.sleep(1000);
        //=====select all months with using List<>
        List<WebElement> months=selectMonths.getOptions();
        for (WebElement eachMonth:months  ) {

            selectMonths.selectByVisibleText(eachMonth.getText());
            System.out.println(eachMonth.getText());

        }
        //===========state selections=====
        Select selectState=new Select(driver.findElement(By.id("state")));
        selectState.selectByValue("GA");
        Thread.sleep(1000);

        //===========Language selections=====
        Select selectLanguage=new Select(driver.findElement(By.name("Languages")));
        selectLanguage.selectByValue("java");
        selectLanguage.selectByValue("python");
        selectLanguage.selectByValue("ruby");
        Thread.sleep(1000);
        selectLanguage.deselectAll();

        //============select website====
       driver.findElement(By.id("dropdownMenuLink")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Yahoo")).click();



        Thread.sleep(2000);
        driver.quit();
    }
}
