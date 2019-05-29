import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LamaMain {
//   public static String baseURL="http://13.90.151.82:8763";
//    private static WebDriver driver;
@Test
    public static void selectBrowsers() {
//    String expectedTitle="Lama Group";
    System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
       WebDriver driver =new ChromeDriver();
        driver.get("http://40.122.109.2/");
        driver.manage().window().maximize();
    }
}
