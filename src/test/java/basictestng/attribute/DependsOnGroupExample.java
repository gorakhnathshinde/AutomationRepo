package basictestng.attribute;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupExample {

    // Que-How to make a dependencies with the help of TestNG annotation?
    @Test(groups = {"smoke"})
    public void verifyLogin(){
        System.out.println("Login functionality");
        Assert.assertTrue(false);
    }

    @Test(dependsOnGroups = {"smoke"})         //Depends on smoke
    public void verifyHomePage(){
        System.out.println("Home page functionality");
    }

    @Test(groups = {"sanity"})
    public void verifyCardTransactions(){
        System.out.println("Home Card Transactions");
    }
    @Test
    public void verifyCashBackOffer(){
        System.out.println("CashBack Offer");
    }

}
