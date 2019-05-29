
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TripTest{
    public static void main(String[] args) {

        try {
            System.out.println("I am here!!!!");
            System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
            WebDriver driver= new ChromeDriver();
            String baseUrl="http://104.43.248.110/";
            String expectedTitle="TripTnT";
            String actualTitle="TripTnT";
            driver.get(baseUrl);
            actualTitle = driver.getTitle();
            driver.findElement(By.xpath("//*[@id=\"chatBot\"]/div/div/div/a")).click();
            String s[] =new String[] {"Hi","Hello","What is TripTnT?","Travel"};
            for(int i=0;i<=(s.length-1);i++) {
                System.out.println("here");
                driver.findElement(By.xpath("//*[@id=\"chatBot\"]/div/div/div/div/div[3]/input")).sendKeys(s[i]);
                Thread.sleep(3000);
                driver.findElement(By.xpath("//*[@id=\"chatBot\"]/div/div/div/div/div[3]/button")).click();
                Thread.sleep(5000);


            }
            Thread.sleep(3000);


//            if (actualTitle.contentEquals(expectedTitle)){
//                System.out.println("Test Passed");
//            }
//            else{
//                System.out.println("Test Failed");
//            }
////            driver.close();
        }

        catch (Exception e) {
            System.out.println(e);
        }

    }
}
