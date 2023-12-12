package basictestng.annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationExample {

    @BeforeMethod
    public void BeforeMethodExample(){
        System.out.println("Before Method");
        }
    @Test
    public void verifyAbhibusWebsite() {
        System.out.println("Test case 1");
    }
    @Test
    public void verifyEdsoWebsite(){
        System.out.println("Test case 2");

    }
    @AfterMethod
    public void AfterMethodExample(){
        System.out.println("After Method");
    }
}
