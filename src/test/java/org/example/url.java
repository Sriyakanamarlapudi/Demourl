package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class url {
    @Test
    public void test() {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.alibaba.com/");
        System.out.println(driver.getTitle());
        driver.findElement(By.id("J_SC_header"));
        highlight(driver,driver.findElement(By.id("J_SC_header")));
        driver.findElement(By.className("ui-searchbar-main"));
        highlight(driver,driver.findElement(By.className("ui-searchbar-main")));
        driver.findElement(By.name("SearchText"));
        highlight(driver,driver.findElement(By.name("SearchText")));
        driver.findElement(By.tagName("h3"));
        highlight(driver,driver.findElement(By.tagName("h3")));



    }

    public static void highlight(WebDriver driver, WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
    }}