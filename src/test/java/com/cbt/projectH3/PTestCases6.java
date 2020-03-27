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

public class PTestCases6 {

    private WebDriver driver;
    private String  URL1="https://www.fakemail.net/";
    private  String URL2="http://practice.cybertekschool.com/sign_up";


@Test
    public void mailTest(){
        String mailText= driver.findElement(By.className("animace")).getText();
    BrowserUtils.wait(2);
        driver.get(URL2);
        driver.findElement(By.name("full_name")).sendKeys("HalisCan");
        BrowserUtils.wait(1);
        driver.findElement(By.name("email")).sendKeys(mailText);
        BrowserUtils.wait(1);
        driver.findElement(By.name("wooden_spoon")).submit();
        BrowserUtils.wait(1);
       String expected = "Thank you for signing up. Click the button below to return to the home page.";
       String actual=driver.findElement(By.xpath("//h3[text()='Thank you for signing up. Click the button below to return to the home page.']")).getText();
        Assert.assertEquals(expected,actual);
       BrowserUtils.wait(1);

        driver.get(URL1);
       BrowserUtils.wait(3);
        driver.findElement(By.xpath("//*[@id=\"schranka\"]/tr[1]")).click();
        BrowserUtils.wait(1);
        WebElement warningMessage=driver.findElement(By.xpath("//span[text()='do-not-reply@practice.cybertekschool.com']"));
         Assert.assertTrue(warningMessage.isDisplayed());
      }

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get(URL1);

    }

    @AfterMethod
    public void teardown(){
   driver.quit();
    }

}
