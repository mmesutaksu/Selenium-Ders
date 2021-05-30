package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Mesut01_Test {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/user/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://yesilkartforum.com");
        WebElement forumLink = driver.findElement(By.linkText("Forum"));
        forumLink.click();

        WebElement kayitLink = driver.findElement(By.linkText("Kayıt Ol"));
        kayitLink.click();

        WebElement mailKutusu = driver.findElement(By.id("email"));
        mailKutusu.sendKeys("asdf@gmail.com");

        WebElement userNameKutusu = driver.findElement(By.id("username"));
        userNameKutusu.sendKeys("asdfg");

        WebElement konumKutusu = driver.findElement(By.id("inputLocation"));
        konumKutusu.sendKeys("Ordu");

        WebElement passwordKutusu = driver.findElement(By.id("password"));
        passwordKutusu.sendKeys("3234371");

        WebElement password2Kutusu = driver.findElement(By.id("password-confirm"));
        password2Kutusu.sendKeys("3234371");

        WebElement kayitButon = driver.findElement(By.id("register"));
        kayitButon.click();

        WebElement sözlesmeTikKutusu = driver.findElement(By.id("agree-terms"));
        sözlesmeTikKutusu.click();

        WebElement gönderLink = driver.findElement(By.xpath("//*[@id=\"content\"]/form[1]/div[2]/div/button"));
        gönderLink.click();

    }
}
