package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day04_LocatorsLinkTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/user/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://a.testaddressbook.com/");

        WebElement signInLink = driver.findElement(By.linkText("Sign in")); // By.linkText sayfada görünen ismiyle linkleri bulabilir
        signInLink.click();


        WebElement homeLinki = driver.findElement(By.partialLinkText("Home"));  // icinde 'Home' gecen bir link aratip bulduk
        homeLinki.click();


    }
}
