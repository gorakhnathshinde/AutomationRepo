package basictestng.priority;

import org.testng.annotations.Test;

public class InvocationCountAttributeExample {

    @Test(invocationCount = 500,invocationTimeOut = 10)
    public void AmazonTest(){
        System.out.println("Amazon Test");
    }
}
