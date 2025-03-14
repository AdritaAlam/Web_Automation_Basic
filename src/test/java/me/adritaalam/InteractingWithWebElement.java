package me.adritaalam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InteractingWithWebElement extends DriverSetup{

    @Test
    public void testWebElementState() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement radioButtonExample = driver.findElement(By.xpath("//legend[normalize-space()='Radio Button Example']"));

        // check text
        String text = radioButtonExample.getText();
        System.out.println(text);

        System.out.println(radioButtonExample.isDisplayed());

        // type
        WebElement autoCompleteInputBox = driver.findElement(By.xpath("//input[@id='autocomplete']"));
        autoCompleteInputBox.sendKeys("Bangladesh");
        Thread.sleep(1000);
        autoCompleteInputBox.clear();
        Thread.sleep(1000);

        // radio button click
        WebElement radioButton1 = driver.findElement(By.xpath("//input[@value='radio1']"));
        System.out.println("Radio button 1(Before clicked): "+ radioButton1.isSelected());
        radioButton1.click();
        Thread.sleep(3000);
        System.out.println("Radio button 1(After clicked): "+ radioButton1.isSelected());

        // get attribute value
        WebElement inputName = driver.findElement(By.xpath("//input[@id='name']"));
        String placeHolderText = inputName.getAttribute("placeholder");
        System.out.println(placeHolderText);

        // css style of an element
        WebElement homeBtn = driver.findElement(By.xpath("//button[normalize-space()='Home']"));
        String cssValue = homeBtn.getCssValue("background-color");
        System.out.println(cssValue);

        System.out.println(radioButton1.isEnabled());






    }
}
