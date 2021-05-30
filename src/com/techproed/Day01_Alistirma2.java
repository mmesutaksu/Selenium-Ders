package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_Alistirma2 {
    public static void main(String[] args) {
        /*
        1- google.com'a gidelim.
        2- youtube.com'a gidelim.
        3- google.com'a geri donelim
        4- youtube.com'a tekrar gidelim.
        5- Driver'i fullscreen yapalim
        6- Bulunugumuz sayfayi yenileyelim.
        7- Driver'i kapatalim.
        */
        System.setProperty("webdriver.chrome.driver","C:/Users/user/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://google.com");
        driver.get("https://youtube.com");
        driver.navigate().back();
        driver.manage().window().maximize();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.close();

    }
}
