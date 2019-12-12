package hackerrank;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class testcases {


    WebDriver webDriver;
    WebDriverWait wait;

    @BeforeMethod
    public void setupBeforeMethod() {
        webDriver = new ChromeDriver();
        wait = new WebDriverWait(webDriver,10);
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_login_page/9a83bda125cd7398f9f482a3d6d45ea4/static/attachments/reference_page.html");
    }

    @AfterMethod
    public void teardown() {
        webDriver.quit();
    }


    @Test
    public void testLoginFormPresent() {
        // below you can find already setup webDriver
        webDriver.findElement(By.id("email-input"));
        webDriver.findElement(By.id("password-input"));
        webDriver.findElement(By.id("login-button"));

    }

    @Test
    public void login() {
        wait.until(ExpectedConditions.visibilityOf(By.id("email-input"))).sendKeys("login@codility.com");
        webDriver.findElement(By.id("email-input")).sendKeys("login@codility.com");
        webDriver.findElement(By.id("password-input")).sendKeys("password");
        webDriver.findElement(By.id("login-button")).click();
        String Error = webDriver.findElement(By.cssSelector("[class='message error']")).getText();
        System.out.println(Error);
//        Assert.assertEquals(Error);
//        webDriver.findElement(Error).isDisplayed();
//        Assert.assertEquals(Error);
//        <div class="message error">You shall not pass! Arr!</div>

    }
}

