package com.cbt.projectH3;

import com.cbt.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class PTestCases {
    private WebDriver driver;
    private String URL="http://practice.cybertekschool.com/";
    private By RegisFormBy=By.linkText("Registration Form");

    private By FirstNameBy=By.name("firstname");
    private By LastNameBy=By.name("lastname");
    private By UserNameBy=By.name("username");
    private By EmailBy=By.name("email");
    private By PasswordBy=By.name("password");
    private By PhoneNumBy=By.name("phone");
    private By MaleBy=By.xpath("//input[@value='male']");
    private By BirdDayBy=By.name("birthday");
    private By DepartmentBy=By.xpath("//select[@name='department']");
    private By JobTitleBy=By.xpath("//select[@name='job_title']");
    private By LanguageBy=By.xpath("//input[@value='java']");





   @Test(description = "Verify that warning message is displayed: The date of birth is not valid ")
   public void verifyWarningMessage(){
       driver.findElement(BirdDayBy).sendKeys("“wrong_dob");
       BrowserUtils.wait(2);

       WebElement warningMessage=driver.findElement(By.xpath("//small[text()='The date of birth is not valid']"));
       Assert.assertTrue(warningMessage.isDisplayed());

   }

   @Test(description = " Verify that programming languages are displayed: c++, java, JavaScript")
   public void verifyLanguageDisplayed(){
     List<WebElement>  warningMessage=driver.findElements(By.className("form-check-input"));
       for (WebElement eachWarning:  warningMessage           ) {
           Assert.assertTrue(eachWarning.isDisplayed());
       }
   }
@Test(description ="Verify FirstName" )
    public void verifyFirstNameDisplayed(){
        driver.findElement(FirstNameBy).sendKeys("a");
        WebElement warningMessage=driver.findElement(By.xpath("//small[text()='first name must be more than" +
                " 2 and less than 64 characters long']"));
        Assert.assertTrue(warningMessage.isDisplayed());
    }
    @Test(description ="Verify lastName" )
    public void verifyLastNameDisplayed(){
        driver.findElement(LastNameBy).sendKeys("a");
        WebElement warningMessage=driver.findElement(By.xpath("//small[text()='The last name must be more than" +
                " 2 and less than 64 characters long']"));
        Assert.assertTrue(warningMessage.isDisplayed());
    }
    @Test(description ="Verify Completed Registration" )
    public void verifyValidInfo(){
        driver.findElement(FirstNameBy).sendKeys("Halis");
        driver.findElement(LastNameBy).sendKeys("Can");
        driver.findElement(UserNameBy).sendKeys("haliscan");
        driver.findElement(EmailBy).sendKeys("haliscan@hotmail.com");
        driver.findElement(PasswordBy).sendKeys("haliscan12345");
        driver.findElement(PhoneNumBy).sendKeys("804-505-6222");
        driver.findElement(MaleBy).click();
        driver.findElement(BirdDayBy).sendKeys("01/01/1977");
        //select method need to use!!!
        BrowserUtils.wait(2);
        Select departmentSelect=new Select(driver.findElement(DepartmentBy));
        departmentSelect.selectByVisibleText("Department of Engineering");

        Select jobTitleSelect=new Select(driver.findElement(JobTitleBy));
        jobTitleSelect.selectByVisibleText("QA");

        driver.findElement(LanguageBy).click();
        BrowserUtils.wait(2);

        driver.findElement(By.id("wooden_spoon")).click();
        BrowserUtils.wait(1);
        WebElement warningMessage=driver.findElement(By.tagName("p"));
        Assert.assertTrue(warningMessage.isDisplayed());
    }

    @BeforeMethod
    public void setup(){
     WebDriverManager.chromedriver().setup();
     driver=new ChromeDriver();
     driver.get(URL);
     driver.findElement(RegisFormBy).click();
     driver.manage().window().maximize();

    }
    @AfterMethod
    public void teardown(){
       BrowserUtils.wait(1);
       driver.quit();
    }



}
