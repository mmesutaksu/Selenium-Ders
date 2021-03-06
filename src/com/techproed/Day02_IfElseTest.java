package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElseTest {
    public static void main(String[] args) {


      /*
        1. Create a class : Day2Review
        2. ChromeDriver kullanarak, youtube web sayfasına gidin ve sayfa başlığının "youtube"
        olup olmadığını doğrulayın(verify), eğer değilse doğru başlığı(Actual Title) konsolda
        yazdirin.
        3. Sayfa URL'sinin "youtube" içerip içermediğini(contains) doğrulayın, içermiyorsa doğru
        URL'yi yazdırın.
        4. Daha sonra Navigate to https://www.amazon.com/
        5. Navigate back to youtube
        6. Refresh the page
        7. Navigate forward to amazon
        8. Maximize the window
        9. Ardından sayfa başlığının "Amazon" içerip içermediğini(contains) doğrulayın, Yoksa
        doğru başlığı(Actual Title) yazdırın.
        10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        URL'yi yazdırın
        11.Quit the browser
      */
        System.setProperty("webdriver.chrome.driver","C:/Users/user/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.get("http://youtube.com");
        String youtubeTitle=driver.getTitle();
        String youtubeUrl = driver.getCurrentUrl();


        System.out.println("YOUTUBE TITLE TEST");
        if(youtubeTitle.toLowerCase().contains("youtube")){
            System.out.println("Title: "+youtubeTitle+"\n'YouTube' kelimesi iceriyor.");
        }else{
            System.out.println("'YouTube' kelimesi icermiyor.\nDogru Title: "+youtubeTitle);
        }

        System.out.println("\nYOUTUBE URL TEST");

        if (youtubeUrl.toLowerCase().contains("youtube")) {
            System.out.println("URL: "+youtubeUrl+"\n'YouTube' kelimesi iceriyor.");
        }else{
            System.out.println("'YouTube' kelimesi icermiyor.\nDogru URL: "+youtubeUrl);
        }

        driver.navigate().to("http://amazon.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.manage().window().maximize();

        String amazonTitle= driver.getTitle();
        String amazonUrl= driver.getCurrentUrl();

        System.out.println("\nAMAZON TITLE TEST");
        if(amazonTitle.toLowerCase().contains("amazon")){
            System.out.println("Title"+amazonTitle+"\n'Amazon' kelimesi iceriyor.");
        }else{
            System.out.println("'Amazon' kelimesi icermiyor.\nDogru Title: "+amazonTitle);
        }

        System.out.println("\nAMAZON URL TEST");
        if (amazonUrl.toLowerCase().contains("https://www.amazonjk.com/")) {
            System.out.println("URL: "+amazonUrl+"\n'https://www.amazon.com/' URL'si iceriyor.");
        }else{
            System.out.println("'https://www.amazon.com/' URL'si icermiyor.\nDogru URL: "+amazonUrl);
        }

        driver.quit();
    }
}
