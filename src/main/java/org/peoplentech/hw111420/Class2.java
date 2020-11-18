package org.peoplentech.hw111420;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class2 {                                   // Walmart
         /*                                         Sign in to walmart
         1- Setup Driver
         2- Navigate to Url
         3- Click on what we need
         4- Close Driver
*/
    private static WebDriver webDriver;

    public static void main(String[] args) {
        setupDriver("chrome");

        goToUrl("https://www.walmart.com");

        webDriver.manage().window().maximize();

        sleepFor(3);

        clickOn("//span[text()='Account'][1]");

        sleepFor(3);

        clickOn("//a[@title='Sign In']");

        sleepFor(4);

        goBack();

        sleepFor(3);

        webDriver.navigate().refresh();

        sleepFor(3);

        webDriver.navigate().forward();

        webDriver.close();

    }


    public static void setupDriver(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            webDriver = new ChromeDriver();
        } else {
            System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
            webDriver = new FirefoxDriver();
        }
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
