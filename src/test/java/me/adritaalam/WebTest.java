package me.adritaalam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTest extends DriverSetup{
//    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://google.com");
//        Thread.sleep(2000);
//        driver.close();
//    }

    @Test
    public void testPageTitle(){
        driver.get("https://facebook.com");
        Assert.assertEquals(driver.getTitle(),"Facebook – log in or sign up");

//        System.out.println(driver.getCurrentUrl());
    }

    @Test
    public void testUrl(){
//        System.out.println(driver.getCurrentUrl());
        driver.get("https://facebook.com");
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/");


    }

}
