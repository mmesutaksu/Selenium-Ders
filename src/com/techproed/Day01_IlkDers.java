package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/user/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        // driver'a google.com'a gitmesini söyledik
        driver.get("http://google.com");
        //driver.get("https://amazon.com");


        //driver.close();  // actigimiz sayfayi sekmeden kapatir

        driver.quit();  // actigimiz sayfayi tüm sekmelerle kapatir



    }
}
