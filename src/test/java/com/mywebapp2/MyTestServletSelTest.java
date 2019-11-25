package com.mywebapp2;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import  org.testng.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyTestServletSelTest {

    private WebDriver driver;
    private String baseUrl="http://slc06eou.us.oracle.com:8081/mysamplewebproject2-1.0/index.jsp";
    public static void main(String args[]) throws Exception {
        MyTestServletSelTest myProdVerify = new MyTestServletSelTest();
        try {
            myProdVerify.setUp();
            myProdVerify.testProdVerify();
        } catch(Exception e) {
            myProdVerify.tearDown();
            throw e;
        } finally {

            myProdVerify.tearDown();
        }

    }

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver","/tmp/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(baseUrl);

    }

    @Test
    public void testProdVerify() throws Exception {
        //TODO - add validation content
        Thread.sleep(5000);
        String expected_data = "My first test page";
        String bodyText = driver.findElement(By.xpath("//body")).getText();
        Assert.assertTrue(bodyText.contains(expected_data),"Text not found!");
    }
    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
    }
    

}
