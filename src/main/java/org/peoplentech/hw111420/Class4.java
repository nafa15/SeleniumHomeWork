package org.peoplentech.hw111420;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Class4 extends TestBase {


    public static void main(String[] args) {

        setupDriver();
        goToUrl("https://www.walmart.com");

        String data =  webDriver.findElement(By.xpath("//button[@id='global-search-dropdown-toggle']")).getText();

        System.out.println(data);



        webDriver.close();


    }

@Test
    public static void validateUserCanTypeOnSearchBar() {
        setupDriver();
        goToUrl("https://www.walmart.com");

        sleepFor(2);
        webDriver.manage().window().maximize();
        webDriver.findElement(By.id("global-search-input")).sendKeys("playstation5");
        sleepFor(2);
        webDriver.close();
    }

@Test
        public static void validateUserCanTypeOnSearchBarAndClickSearchButton () {
            setupDriver();
            goToUrl("https://www.walmart.com");

            sleepFor(2);

            webDriver.manage().window().maximize();

            webDriver.findElement(By.id("global-search-input")).sendKeys("playstation5");

            // clickOn("//input[@id=\"global-search-input\"]");

            sleepFor(2);

            clickOn("//button[@id='global-search-submit']");

            // webDriver.findElement(By.id("global-search-submit")).click();

            sleepFor(4);
            webDriver.close();
        }


@Test
    public static void validateProductDropDown(){

        setupDriver();
        goToUrl("https://www.walmart.com");
        webDriver.manage().window().maximize();

        sleepFor(2);

       // webDriver.findElement(By.id("global-search-category-label")).click();

        clickOn("//button[@id='global-search-dropdown-toggle']");

        sleepFor(2);

        clickOn("//button[@data-catid=\"3944\"]");

        sleepFor(2);

       webDriver.findElement(By.id("global-search-input")).sendKeys("playstation5");

       sleepFor(2);

        clickOn("//button[@id='global-search-submit']");

        sleepFor(5);

        webDriver.close();
    }





    }

