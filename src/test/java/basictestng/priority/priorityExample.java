package basictestng.priority;

import org.testng.Assert;
import org.testng.annotations.Test;

public class priorityExample {

    @Test
    public void TestCaseZ(){
        System.out.println("Test case Z");
    }
    @Test(priority = -2)
    public void TestCase9(){
        System.out.println("Test case B");
    }
    @Test(priority = 3)
    public void TestCase3(){
        System.out.println("Test case X");
    }
    @Test(groups = "smoke")
    public void TestCaseF(){
        System.out.println("Test case F");
    }
    @Test(priority = -5)
    public void TestCaseD(){
        System.out.println("Test case D");
    }
    @Test(priority = 6)
    public void TestCaseA(){
        System.out.println("Test case A");
        Assert.assertTrue(false);
    }
}
