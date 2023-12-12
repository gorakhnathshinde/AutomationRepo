package basictestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGExample {
    @Test
    public void verifyAbhibusWebsite() {
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\RN\\Downloads\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();       //upcasting
        driver.get("https://www.abhibus.com/");
        driver.manage().window().maximize();
        driver.close();
    }
    @Test
    public void verifyEdsoWebsite(){

        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\RN\\Downloads\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();       //upcasting
        driver.get("https://edso.in/");
        driver.manage().window().maximize();
        driver.close();
    }
    @Test
    public void verifyRediffmailWebsite(){

        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\RN\\Downloads\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();       //upcasting
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        driver.close();
    }
    @Test
    public void verifyFacebookWebsite(){

        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\RN\\Downloads\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();       //upcasting
        driver.get("http://www.facebook.com");
        driver.manage().window().maximize();
        driver.close();
    }

}
