package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/user/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://google.com");
        driver.navigate().to("http://amazon.com");

        String amazonTitle = driver.getTitle();  // amazon'un title'ini Stringe atadik
        System.out.println("Amazon'un Title'i: " + amazonTitle);

        String amazonUrl = driver.getCurrentUrl();  // amazon'un url'sini aldik ve stringe atadik
        System.out.println("Amazon'un URL'si: "+amazonUrl);
    }
}
