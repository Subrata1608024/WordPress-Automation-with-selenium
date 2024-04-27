package com.wordPress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboard extends BasePage{


    public Dashboard(WebDriver driver) {
        super(driver);
    }

    public PluginPage plugin(){
        getWebElement(By.xpath("//a[@href='plugins.php']")).click();
        return getInstance(PluginPage.class);

    }

    public boolean WPDarkModeActivated(){
        return getWebElements(By.linkText("Deactivate")).size() > 0;

    }


    public GeneralSetting navigateToWpDarkMode(){
        getWebElement(By.linkText("WP Dark Mode")).click();
        return getInstance(GeneralSetting.class);
    }
    public Dashboard navigateToDashboard(){
        getWebElement(By.linkText("Dashboard")).click();
        return getInstance(Dashboard.class);
    }

    public Dashboard darkModeBtn(){
        getWebElement(By.xpath("//div[@class='_track wp-dark-mode-ignore']")).click();
        return getInstance(Dashboard.class);
    }

    public boolean modeName(){
        boolean present;
        try {
            getWebElement(By.xpath("//html[@class='wp-toolbar wp-dark-mode-active']"));
            present = true;
        }catch (Exception exception){
            present = false;
        }
        return  present;

    }

    public boolean isLogout(){
        return getWebElements(By.linkText("Plugins")).size() > 0;
    }



}
