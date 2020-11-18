package org.peoplentech.hw111420;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

    public static WebDriver webDriver;

    public static void setupDriver(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        webDriver = new ChromeDriver();
    }

    public static void goToUrl(String url){
        webDriver.get(url);
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
