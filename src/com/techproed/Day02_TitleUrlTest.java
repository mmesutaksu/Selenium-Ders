package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Locale;

public class Day02_TitleUrlTest {
    public static void main(String[] args) {
        /*
        1-youtube.com'a gidin
        2-sayfa başlığı video kelimesi içeriyor mu ona bakın
        3-driver'ı kapatın
         */
        System.setProperty("webdriver.chrome.driver","C:/Users/user/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.get("http://youtube.com");
        String youtubeTitle=driver.getTitle();

        if(youtubeTitle.toLowerCase().contains("video")){
            System.out.println(youtubeTitle+"\n----------video kelimesi iceriyor-------------");
        }else{
            System.out.println(youtubeTitle+"\n----------Video kelimesi icermiyor-------------");
        }



        driver.close();

    }
}
