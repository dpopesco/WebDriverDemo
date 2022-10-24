package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCheckboxes {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String localDir = System.getProperty("user.dir");
        driver.get("file:///" + localDir + "/src/main/webapp/CheckboxTest.html");

        WebElement checkbox = driver.findElement(By.id("lettuceCheckbox"));
        checkbox.click();
    }
}
