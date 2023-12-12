package basictestng.attribute;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodExample {


   // Que-How to make a dependencies with the help of TestNG annotation?
    @Test
    public void verifyLogin(){
        System.out.println("Login functionality");
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = {"verifyLogin"})         //Depends on Method
    public void verifyHomePage(){
        System.out.println("Home page functionality");
    }

    @Test
    public void verifyCardTransaction(){
        System.out.println("Home Card Transactions");
    }
    @Test
    public void verifyCashBackOffer(){
        System.out.println("CashBack Offer");
    }
}
