package com.cbt.newTester;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters {
    /*    We have 8 locators:
id <----- <h3 id="smth"></h3> the best locator. Always unique
name <----- <h3 name="smth"></h3> good locator. Not Always unique, but mostly
tagName <----- <h3></h3> | h3 is a tag name. not good locator, almost never unique
className <----- <h3 class="smth"></h3> not good locator, because almost never unique
linkText <----- ok locator, sometimes unique
partialLinkText <----- same as linkText
xpath
cssSelector

to check if tag name is unique:

//tagname
     */
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/sign_up");
        Thread.sleep(2000);
        WebElement name=driver.findElement(By.name("full_name"));
        name.sendKeys("Halis");
        Thread.sleep(2000);

        WebElement email=driver.findElement(By.name("email"));
        email.sendKeys("Haliscan@hotmail.com");
        Thread.sleep(2000);

        WebElement signUp=driver.findElement(By.name("wooden_spoon"));
          // signUp.click();
        //when you see type="submit", you can use submit() instead of click()!
        //it make sense to use when click() method doesn't work!
        signUp.submit();
        Thread.sleep(2000);


Thread.sleep(2000);
driver.quit();
    }
}
