package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class facebook{
    @Test
    public void test() {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        System.out.println(driver.getTitle());
        driver.findElement(By.id("pageTitle"));
        highlight(driver,driver.findElement(By.id("pageTitle")));
        driver.findElement(By.name("email"));
        highlight(driver,driver.findElement(By.name("email")));
        driver.findElement(By.className("_8esn"));
        highlight(driver,driver.findElement(By.className("_8esn")));


        driver.findElement(By.tagName("h2"));
        highlight(driver,driver.findElement(By.tagName("h2")));



    }

    public static void highlight(WebDriver driver, WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
    }}
