package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
public class BrowserFactory {
    /**your homework will be to improve this method!
     *This method return webdriver object based on browser type
     *If you want to use chrome browser,just provide chrome as a parameter
     *
     * @param browser
     * @return webdriver object
     */
    public static WebDriver getDriver(String browser){
        if(browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().version("79.0").setup();
            return new ChromeDriver();
        }else if(browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }else if (browser.equalsIgnoreCase("Opera")){
            WebDriverManager.operadriver().setup();
            return new OperaDriver();
        }else if (browser.equalsIgnoreCase("IE")){
            WebDriverManager.iedriver().setup();
            return new InternetExplorerDriver();
        }
        else{
            return null;
        }
    }

}
