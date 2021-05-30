package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_NavigationMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/user/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize(); // pencereyi tam ekran acmasini saglar

        driver.get("http://google.com");  // google.com'u acar.

        driver.navigate().to("http://amazon.com");  //// .get() ile ayni isi yapiyor. Ancak .get() daha hizli

        driver.navigate().back();  // bir önceki sayfaya döner

        driver.navigate().forward();  // bir sonrki sayfaya gider

        driver.navigate().refresh();  // bulundugu sayfayi yeniler

        driver.close();  // acilan sekmeyi kapatir
    }
}
