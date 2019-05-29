package com.something.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FileTest {
    @Test
            public void loginTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Chromedriver.exe"); //extracts the webpage as chrome
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://103.69.124.104:8080/");
        driver.findElement(By.xpath("//*[@id=\"sign-in\"]")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.name("_58_login")).clear();
        driver.findElement(By.name("_58_login")).sendKeys("bpradhan@mof.gov.np");
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        driver.findElement(By.name("_58_password")).sendKeys("test");
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
//        driver.findElement(By.className("")).click();
        driver.findElement(By.cssSelector(".btn btn btn-warning btn-primary#yui_patched_v3_11_0_1_1554204241700_167")).click();
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
//        String expectedUrl = "http://103.69.124.104:8080/group/user-panel";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(actualUrl, expectedUrl);
//        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("li.tm-user>a.tmba-user>span.fa-img-icons.fa-img-user"))).click();
//        new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@src='/app/sso/user/login']")));
//        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("input.input-block-level.form-text.required.form-control#edit-name"))).sendKeys("khawar");
//        driver.findElement(By.cssSelector("input.input-block-level.form-text.required.form-control#edit-pass")).sendKeys("khawar");
            driver.close();
    }
}
