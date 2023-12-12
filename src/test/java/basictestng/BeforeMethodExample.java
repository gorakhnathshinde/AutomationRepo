package basictestng;

import basictestng.annotation.BeforeClassAfterClassExample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BeforeMethodExample extends BeforeClassAfterClassExample {

    @BeforeTest
    public void BeforeTestExample(){System.out.println("This is an Before Test Method of BeforeMethodExample");}

    @BeforeMethod
    public void BeforeMethodExample(){
        System.out.println("Before Method");
    }
    @Test(groups = "smoke")
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
    @AfterTest
    public void AfterTestExample(){System.out.println("This is an After Test Method of BeforeMethodExample");}

}
