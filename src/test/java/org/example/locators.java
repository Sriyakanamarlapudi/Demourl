package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class locators{
    @Test
    public void test() {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.github.com/login");
        System.out.println(driver.getTitle());
        driver.findElement(By.id("login_field")).sendKeys("sriya30295@gmail.com");

        driver.findElement(By.name("password")).sendKeys("welcome");

        driver.findElement(By.className("header-logo"));

        //driver.findElement(By.linkText("Forgot password?")).click();

        driver.findElement(By.partialLinkText("Create an account")).click();
        driver.findElement(By.tagName("h1"));




    }}

