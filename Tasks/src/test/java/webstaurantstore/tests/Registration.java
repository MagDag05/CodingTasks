package webstaurantstore.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Registration extends BaseTest {


    @Test

  public void registrationPage() {
        driver.findElement(By.cssSelector("li.desktop-only.menu-item--register")).click();
        String accountRegistration = driver.findElement(By.cssSelector("[class*= 'page-header']")).getText();
        Assert.assertEquals(accountRegistration,"Account Registration");
    }

//    public void billingAndShiping() {
//
//        driver.findElement(By.id("id='email'")).sendKeys();
//        Assert.assertEquals();
//




}

