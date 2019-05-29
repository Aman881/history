package com.something.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
public class Triptest {
    @Test
    public void loginTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://40.122.109.2");
        driver.findElement( By.xpath( "//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a" )).click();
        driver.findElement( By.name( "email" ) ).sendKeys( "kharel.kumud02@gmail.com" );
        driver.manage().timeouts().implicitlyWait( 3,TimeUnit.SECONDS );
        driver.findElement( By.name( "password" ) ).sendKeys( "111111" );
        Thread.sleep( 3000 );
        driver.findElement( By.id( "submit_button" ) ).click();
        String expectedUrl = "http://40.122.109.2/host/dashboard/";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals( actualUrl, expectedUrl );
    }
}