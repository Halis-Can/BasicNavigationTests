package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTests {
    /*
    Test Case
1. Open browser
2.Go to website https://google.com
3. Save the title in a string variable
4. Go to https://etsy.com
5. Save the title in a string variable
6. Navigate back to previous page
7. Verify that title is same is in step 3
8. Navigate forward to previous page
9. Verify that title is same is in step 5
     */
    public static void main(String[] args) throws Exception{
     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();

        driver.get("http://google.com");
        String titleGoogle=driver.getTitle();
        System.out.println(titleGoogle);
        Thread.sleep(1000);

        driver.navigate().to("https://etsy.com");
        Thread.sleep(1000);
        String titleEtsy=driver.getTitle();
        System.out.println(titleEtsy);
        driver.navigate().back();
        verifyEquals(driver.getTitle(),"Google");

        driver.navigate().forward();
        verifyEquals(driver.getTitle(),"Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone");

        Thread.sleep(1000);
        driver.quit();

    }

    public static void verifyEquals(String expected,String actual) {
        if (expected.equals(actual)) {
            System.out.println("TEST PASSED ");
        } else {
            System.out.println("TEST FAILED");
        }
    }
}


