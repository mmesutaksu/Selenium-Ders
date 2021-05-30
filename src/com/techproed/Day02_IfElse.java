package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Locale;

public class Day02_IfElse {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/user/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://amazon.com");
        String amazonTitle = driver.getTitle();

        if (amazonTitle.toLowerCase().contains("computer")){
            System.out.println(amazonTitle+"\n-----COMPUTER KELIMESI ICERIYOR-----");
        }else{
            System.out.println(amazonTitle+"\n-----COMPUTER KELIMESI ICERMIYOR-----");
        }

        driver.close();
    }
}
