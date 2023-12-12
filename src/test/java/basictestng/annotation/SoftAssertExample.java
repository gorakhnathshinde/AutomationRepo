package basictestng.annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {

    @Test
    public void verifyHomePage() {

        SoftAssert softAssert = new SoftAssert();
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\RN\\Downloads\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();       //upcasting
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        String websiteTitle=driver.getTitle();
        softAssert.assertFalse(driver.findElement(By.xpath("//u[text()='Forgot Password?']")).isDisplayed());
        softAssert.assertEquals(websiteTitle,"Rediffmail","Title of the website should be rediffmail");

        System.out.println("How are you....");
        softAssert.assertAll();              // case are pass or fail all data are gather assertAll()
        driver.close();

    }

}
