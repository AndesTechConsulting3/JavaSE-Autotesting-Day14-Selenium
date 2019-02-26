package org.andestech.learning.rfb19.g3;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AppTest 
{

    @Test
    public void siteOpen2Test() throws InterruptedException
    {

        System.setProperty("webdriver.gecko.driver", "E:\\selenium_driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        System.out.println(driver);

        driver.navigate().to("http://newsru.com");
        Thread.sleep(3000);

        assertTrue( true );
        //..


        if(driver != null) driver.quit();
    }


    @Test
    public void siteOpenTest() throws InterruptedException
    {

       System.setProperty("webdriver.chrome.driver", "E:\\selenium_driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        System.out.println(driver);

        driver.navigate().to("http://lenta.ru");
        Thread.sleep(3000);

        assertTrue( true );
        //..


        if(driver != null) driver.quit();
    }
}
