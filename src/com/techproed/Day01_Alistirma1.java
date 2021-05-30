package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_Alistirma1 {
    public static void main(String[] args) {
        // 1- google.com'a gidin
        // 2- navigate to ile amazin.com'a gidin
        // 3- back ile geri gelin
        // 4- forward ile ileri gidin
        // 5- sayfayi yenileyin
        // 6- driveri kapatin
        // 7- driver'a ekrani kaplatin

        System.setProperty("webdriver.chrome.driver","C:/Users/user/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://google.com");
        driver.navigate().to("https://amazon.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        driver.close();


    }
}
