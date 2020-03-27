package com.cbt.projectH3;

import com.cbt.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PTestCases_8 {
    private WebDriver driver;
    private String URL="https://practice-cybertekschool.herokuapp.com/";

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get(URL);
    }
    @Test
    public void  countryTest(){
     driver.findElement(By.linkText("Autocomplete")).click();
        BrowserUtils.wait(2);
     driver.findElement(By.id("myCountry")).sendKeys("United States of America");
        BrowserUtils.wait(1);
     driver.findElement(By.xpath("//input[@value='Submit']")).click();
        BrowserUtils.wait(1);

        //Verified that following message is displayed:
     WebElement warningMessage=driver.findElement(By.xpath("//p[text()='You selected: United States of America']"));
     Assert.assertTrue(warningMessage.isDisplayed());
        BrowserUtils.wait(2);
    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
