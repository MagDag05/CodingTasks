package webstaurantstore.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import webstaurantstore.pages.RegistrationPage;

public class LoginTest extends BaseTest {



    @Test

     public void navigateMyaccountPage() {

        driver.findElement(By.cssSelector("[class='menu-text-name']")).click();
        String login = driver.findElement(By.cssSelector("h1[class='']")).getText();
        System.out.println(login);
        Assert.assertEquals(login,"Login");
    }

//    @Test
//
//    public void logIn() {
//
//    //  String email = "mkurbanqa@gmail.com";
//    //  String password = "Ma102030";
//        driver.findElement(By.id("id='email'")).sendKeys(email);
//        driver.findElement(By.id("id='password'")).sendKeys();
//
//
//    }


}
