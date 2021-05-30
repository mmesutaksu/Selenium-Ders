package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Day04_FindElements {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/user/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://a.testaddressbook.com/");

        List<WebElement> list = driver.findElements(By.tagName("a"));

        for (WebElement each : list) {
            System.out.println(each.getText());
        }

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i).getText());
//        }


    }
}
