package com.wordPress.pages;

import org.checkerframework.checker.optional.qual.Present;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;
import java.util.List;

public class BasePage extends Page{

    public BasePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getPageTittle() {
        return driver.getTitle();
    }

    @Override
    public WebElement getWebElement(By locator) {
        WebElement webElement = null;
        try {
            waitForWebElement(locator);
            webElement= driver.findElement(locator);

        }catch (Exception exception){
            System.out.println(locator.toString() +"Select or locator Not Found");
        }
        return webElement;
    }

    @Override
    public List<WebElement> getWebElements(By selector) {
        List<WebElement> webElements = null;
        try {
            waitForWebElement(selector);
           webElements = driver.findElements(selector);

        }catch (Exception exception){
            System.out.println(selector.toString() +"Select or locator Not Found");
        }
        return webElements;
    }

    @Override
    public void waitForWebElement(By locator) {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));

        }catch (Exception exception){
            System.out.println(locator.toString() +"Select or locator Not Found");
        }

    }



}
