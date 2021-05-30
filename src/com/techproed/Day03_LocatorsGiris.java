package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day03_LocatorsGiris {
    public static void main(String[] args) {
        /*
            1. http://a.testaddressbook.com/sign_in adresine gidiniz.
            2. email textbox,password textbox, and signin button elementlerini locate ediniz..
            3. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
            4. Username : testtechproed@gmail.com
            5. Password : Test1234!
            6. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        */

        System.setProperty("webdriver.chrome.driver","C:/Users/user/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://a.testaddressbook.com/");

        // <a id="sign-in" class="nav-item nav-link" data-test="sign-in" href="/sign_in">Sign in</a>
        // tagname  : a
        // attribute: id,class,data-test,href
        // value    : "sign-in", "nav-item nav-link", "sign-in", "/sign_in"

        // sign in linkini bulur
        WebElement signInLinki = driver.findElement(By.id("sign-in")); // sign in butonunu aldik
        signInLinki.click();  // tikladik

        WebElement emailKutusu = driver.findElement(By.id("session_email"));
        emailKutusu.sendKeys("testtechproed@gmail.com");

        WebElement passwordKutusu = driver.findElement(By.id("session_password"));
        passwordKutusu.sendKeys("Test1234!");

        WebElement signInSubmit = driver.findElement(By.name("commit"));
        signInSubmit.click();

        String testTitle = driver.getTitle();
        String testUrl = driver.getCurrentUrl();

        System.out.println("TITLE TEST");
        if(testTitle.toLowerCase().contains("address book")){
            System.out.println("Title"+testTitle+"\n'Address Book' iceriyor.");
        }else{
            System.out.println("'Address Book' icermiyor.\nDogru Title: "+testTitle);
        }

        System.out.println("\nURL TEST");
        if (testUrl.toLowerCase().contains("http://a.testaddressbook.com/")) {
            System.out.println("URL: "+testUrl+"\n'http://a.testaddressbook.com/' URL'si iceriyor.");
        }else{
            System.out.println("'http://a.testaddressbook.com/' URL'si icermiyor.\nDogru URL: "+testUrl);
        }

    }
}
