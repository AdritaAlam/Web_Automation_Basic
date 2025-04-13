package me.adritaalam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class InteractingWithDropdown extends DriverSetup{

    @Test
    public void testDropdown() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");


        WebElement selectElement = driver.findElement(By.id("dropdown-class-example"));
        selectElement.click();
        Thread.sleep(2000);
        //select from dropdown options
        Select select = new Select(selectElement);
        select.selectByValue("option3");
        Thread.sleep(2000);
        select.selectByIndex(1);
        Thread.sleep(2000);
        select.selectByVisibleText("Option2");
        Thread.sleep(2000);
        System.out.println("First selected option:" + select.getFirstSelectedOption().getText());
//        System.out.println("All selected options: "+ select.getAllSelectedOptions());
        System.out.println("Is multiple selections there? : "+ select.isMultiple());
//        select.deselectByIndex(2);  // only for multiple selections
//        select.deselectAll();
//        select.deselectByValue("option2");

        List<WebElement> options = select.getOptions();
        for (WebElement el: options){
            System.out.println(el.getText());
            System.out.println(el.getAttribute("value"));
        }
    }
}
