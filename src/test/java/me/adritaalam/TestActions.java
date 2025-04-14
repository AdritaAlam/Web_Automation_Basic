package me.adritaalam;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;

public class TestActions extends DriverSetup{

    By iframe_section = By.xpath("//legend[normalize-space()='iFrame Example']");
    By mouse_hover = By.xpath("//button[@id='mousehover']");

    @Test
    public void testDiffActions() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        Actions actions = new Actions(driver);

        // SCROLL
//        actions.scrollByAmount(0,1000).build().perform();
        actions.scrollToElement(getElement(iframe_section)).build().perform();
        Thread.sleep(3000);

        // HOVER
        actions.moveToElement(getElement(mouse_hover)).build().perform();
        Thread.sleep(3000);
        actions.click(getElement(By.xpath("//a[normalize-space()='Top']"))).build().perform();
        Thread.sleep(3000);

        // COPY & PASTE
        actions.sendKeys(getElement(By.xpath("//input[@id='autocomplete']")), "Hello world!").build().perform();
        Thread.sleep(3000);

        actions.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
        Thread.sleep(2000);
        actions.keyDown(Keys.CONTROL).sendKeys("x").build().perform();
        Thread.sleep(2000);

        actions.click(getElement(By.id("name"))).build().perform();
        actions.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
        Thread.sleep(3000);



    }




}
