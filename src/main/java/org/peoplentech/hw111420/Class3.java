package org.peoplentech.hw111420;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class3 {

                                 // www.audiusa.com
                                // Buy a new Audi S4 Sedan

    private static WebDriver webDriver;
/*

    public static void main(String[] args) {
        buyACar();
*/



@Test
    public static void buyACar(){

        setupDriver();

        goToUrl("https://www.audiusa.com");

        webDriver.manage().window().maximize();

        sleepFor(5);

        //dismissAlert();

        //sleepFor(4);

        clickOn("//span[text()='Sedans & Sportbacks'][1]");

        sleepFor(4);

        clickOn("//span[text()='2021 S4 Sedan'][1]");

        sleepFor(4);

        clickOn("//span[text()='\tRequest a Quote']");

        sleepFor(5);

        goBack();

        webDriver.close();


    }



    public static void setupDriver(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        webDriver = new ChromeDriver();
    }

    public static void goToUrl(String url){
        webDriver.get(url);
    }

    public static void dismissAlert(){
        Alert alert = webDriver.switchTo().alert();
        alert.dismiss();
    }

    public static void sleepFor(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void clickOn(String element) {
        webDriver.findElement(By.xpath(element)).click();

    }

    public static void goBack(){
        webDriver.navigate().back();
    }
}