package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverÖdev {
    //driverı ekranı kaplıcakşekilde kullanalım
    //1-ilk önce google.com'a gidelim
    //2-sayfanın title'ını alalım ekrana yazdıralım
    //3-daha sonra youtube.com'a gidelim
    //4-sayfanın title'ını ve urlsini alıp ekrana yazdıralım
    //5-google.com'a geri gelelim ve sayfanın url'sini alıp ekrana yazdıralım
    //6-driverımızı kapatalım

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/user/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://google.com");
        String googleTitle=driver.getTitle();
        System.out.println("Google Title'i: "+googleTitle);

        driver.get("http://youtube.com");
        String youtubeTitle=driver.getTitle();
        String youtubeUrl=driver.getCurrentUrl();
        System.out.println("Youtube Title'i: "+youtubeTitle);
        System.out.println("Youtube URL'si: "+youtubeUrl);

        driver.navigate().back();
        String googleUrl=driver.getCurrentUrl();
        System.out.println("Google URL'si: "+googleUrl);

        driver.close();
    }

}
