package basictestng.annotation;

import org.testng.annotations.*;

public class BeforeClassAfterClassExample {

    @BeforeTest
    public void BeforeTestExample(){System.out.println("This is an Before Test Method of BeforeClassAfterClassExample");}
    @BeforeClass
    public void BeforeClassExample(){
        System.out.println("Before Class");
    }
    @BeforeMethod
    public void BeforeMethodExample(){
        System.out.println("Before Method");
    }
    @Test(groups = "smoke")
    public void verifyTest1() {
        System.out.println("Test case 1");
    }
    @Test
    public void verifyTest2(){
        System.out.println("Test case 2");
    }
    @AfterMethod
    public void AfterMethodExample(){
        System.out.println("After Method");
    }

    @AfterClass
    public void AfterClassExample(){
        System.out.println("After Class");
    }
    @AfterTest
    public void AfterTestExample(){System.out.println("This is an After Test Method of BeforeClassAfterClassExample");}

}
