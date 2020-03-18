package com.cbt.newTester;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C_RadioButton {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        driver.manage().window().maximize();
        //<input type="radio">
        List<WebElement> radioButtons=driver.findElements(By.tagName("input"));//findElementsssss!! not findElement!!
        //task:Which buttom are enable or disaple!
        //<input type="radio" id="red" name="color">
        for (WebElement eachButton: radioButtons) {
            System.out.println(eachButton.getAttribute("id")+" is selected?"+eachButton.isSelected());//is.Selected()==> returns true, if button already clicked
            if (eachButton.isEnabled()) {//==>is.Enable()==>retuns true, if button can be clicked
                eachButton.click();
                System.out.println("Cliccked on :"+eachButton.getAttribute("id"));
                Thread.sleep(1000);
            }else{
                System.out.println("Button is disable, not clicket :"+eachButton.getAttribute("id"));

            }
            System.out.println();
        }


 Thread.sleep(1000);
 driver.quit();
    }
}
