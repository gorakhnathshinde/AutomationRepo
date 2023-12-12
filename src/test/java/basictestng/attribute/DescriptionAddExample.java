package basictestng.attribute;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DescriptionAddExample {
    // Que-How to make a dependencies with the help of TestNG annotation?
    @Test
    public void verifyLogin(){
        System.out.println("Login functionality");                     //parent case
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = {"verifyLogin"},alwaysRun = true)         //child case
    public void verifyHomePage(){
        System.out.println("Home page functionality");
    }

    @Test(description = "verify credit card transaction")              //summary to add
    public void verifyCardTransaction(){
        System.out.println("Home Card Transactions");
    }
    @Test(enabled = false)
    public void verifyCashBackOffer(){
        System.out.println("CashBack Offer");
    }

}
