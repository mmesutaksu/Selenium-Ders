package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day04_LocatorsTagName {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/user/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://a.testaddressbook.com/");

        WebElement homeTagName = driver.findElement(By.tagName("a"));
        homeTagName.click();

        String homeYazisi = homeTagName.getText();
        System.out.println("Home elementinin yazisi: "+homeYazisi);



    }
}
