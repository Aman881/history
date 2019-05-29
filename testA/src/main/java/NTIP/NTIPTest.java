package NTIP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NTIPTest {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver" , "D://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://103.69.125.156:8080/");
        WebElement login=driver.findElement(By.cssSelector("a[href='http://103.69.125.156:8080/c/portal/login?p_l_id=20146']"));
        login.click();
        WebElement email=driver.findElement(By.cssSelector("input[id='#_com_liferay_login_web_portlet_LoginPortlet_login']"));
        email.clear();
//        driver.close();
        }
    }

