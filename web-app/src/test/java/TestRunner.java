import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestRunner {

    @Test
    public static void launchApplication(){

        System.setProperty("webdriver.chrome.driver","drivers/chrome/2.42/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demosite.center/wordpress/wp-login.php");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();

    }

    @Test
    public void testMethod(){
        System.out.println("Hello World!");
    }
}
