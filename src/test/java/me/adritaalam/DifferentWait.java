package me.adritaalam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class DifferentWait extends DriverSetup{
    @Test
    public void testDelayElement() throws InterruptedException {
        driver.get("https://testing-and-learning-hub.vercel.app/WebAutomation/pages/slow_resources_page.html");

        driver.findElement(By.xpath("//button[normalize-space()='Trigger Slow Request']")).click();
//        Thread.sleep(15000);

        // implicite wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement successMsg = driver.findElement(By.xpath("//p[normalize-space()='Success: The slow request has completed.']"));

        Assert.assertTrue(successMsg.isDisplayed());  //is it displayed or not?
        Assert.assertEquals(successMsg.getText(),"Success: The slow request has completed.");

        driver.findElement(By.xpath("//button[normalize-space()='Trigger Slow Request']")).click();
        successMsg = driver.findElement(By.xpath("//p[normalize-space()='Success: The slow request has completed.']"));

        Assert.assertTrue(successMsg.isDisplayed());  //is it displayed or not?
        Assert.assertEquals(successMsg.getText(),"Success: The slow request has completed.");


    }

    @Test
    public void testExplicitWait(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
//        driver.get("https://qavbox.github.io/demo/delay/");
//        driver.findElement(By.xpath("//input[@id='loaderStart']")).click();
//
//        WebElement message = driver.findElement(By.xpath("//h2[@id='loaderdelay']"));
//
//        Assert.assertTrue(message.isDisplayed());
//        Assert.assertEquals(message.getText(),"I appeared after 5 sec loading");

//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

        driver.get("https://qavbox.github.io/demo/delay/");
        driver.findElement(By.xpath("//input[@name='commit']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@id='two']")));
//
//        WebElement message = driver.findElement(By.xpath("//h2[@id='two']"));

//        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@id='two']")));

//        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h2[@id='two']"),"I am here!"));

//        WebElement message = driver.findElement(By.xpath("//h2[@id='two']"));
        WebElement message = getElement(By.xpath("//h2[@id='two']"));
        wait.until(ExpectedConditions.textToBePresentInElement(message,"I am here!"));
        Assert.assertTrue(message.isDisplayed());
        Assert.assertEquals(message.getText(),"I am here!");
    }



}
