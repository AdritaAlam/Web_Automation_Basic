package me.adritaalam;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class InteractingWithDifferentAlert extends DriverSetup{

    @Test
    public void testAlert() throws InterruptedException {
        driver.get("https://testing-and-learning-hub.vercel.app/WebAutomation/pages/javascript_alerts.html");

        driver.findElement(By.xpath("//button[normalize-space()='Show Alert']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        Thread.sleep(3000);
        alert.accept();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[normalize-space()='Show Confirm']")).click();
        System.out.println(alert.getText());
        Thread.sleep(3000);
        alert.dismiss();
        Thread.sleep(3000);
//        alert.accept();
//        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[normalize-space()='Show Prompt']")).click();
        Thread.sleep(3000);
//
        alert.sendKeys("Bangladesh");
        Thread.sleep(3000);
        alert.accept();
        Thread.sleep(2000);
//        alert.sendKeys();


    }


}
