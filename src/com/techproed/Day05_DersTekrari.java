package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_DersTekrari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/user/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://amazon.com");
        WebElement aramaBox = driver.findElement(By.id("twotabsearchtextbox"));
        aramaBox.sendKeys("computers");

        WebElement aramaTusu = driver.findElement(By.id("nav-search-submit-button"));
        aramaTusu.click();

        WebElement sonucAdeti = driver.findElement(By.className("sg-col-inner"));
        System.out.println(sonucAdeti.getText());
        if (sonucAdeti.isDisplayed()) {
            System.out.println("Sonuc adeti görünüyor");
        } else {
            System.out.println("Sonuc adeti görünmüyor");
        }






    }
}
