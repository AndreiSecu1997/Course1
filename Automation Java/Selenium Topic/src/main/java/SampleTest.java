import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {

    @Test
    public static void aboutUsPageIsAvailable() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\andrei.secu\\Desktop\\Ade\\FirstAttemptToDiscoverTheWorld\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.phptravels.net/");

        WebElement companyDropDown = driver.findElement(By.xpath("//*[@id=\"mobileMenuMain\"]/nav/ul[2]/li/a"));
        WebElement contactUsButton = driver.findElement(By.xpath("//*[@id=\"mobileMenuMain\"]/nav/ul[2]/li/ul/li[2]/a"));

        companyDropDown.click();
        Thread.sleep(2500);
        contactUsButton.click();

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.phptravels.net/about-U";

        Assert.assertEquals(actualUrl, expectedUrl);
    }

}
