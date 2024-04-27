package com.wordPress.pages;

import org.checkerframework.checker.optional.qual.Present;
import org.openqa.selenium.*;

public class PluginPage extends BasePage {

    public PluginPage(WebDriver driver) {
        super(driver);
    }



    public PluginPage searchForWpDarkModePlugin(){
        getWebElement(By.xpath("//input[@class='wp-filter-search']")).sendKeys("WP Dark Mode");
        return getInstance(PluginPage.class);
    }
    public PluginPage enter(){
        getWebElement(By.xpath("//input[@class='wp-filter-search']")).sendKeys(Keys.ENTER);
        return getInstance(PluginPage.class);

    }

    public boolean WPDarkModeActivated(){
        return getWebElements(By.xpath("//a[@id='deactivate-wp-dark-mode']")).size() > 0;

    }

    public PluginPage searchForPlugin(){
        getWebElement(By.linkText("Search for plugins in the WordPress Plugin Directory.")).click();
        return getInstance(PluginPage.class);
    }

    public void installWPdarkMode(){
       getWebElement(By.xpath("//a[@data-slug='wp-dark-mode']")).click();
   }
   public void activateWPdarkMode(){
        getWebElement(By.xpath("//a[@aria-label='Activate WP Dark Mode']")).click();
   }

   public PluginPage wpDarkModeIsDisplayed(){
       getWebElement(By.xpath("//td[@class='plugin-title column-primary']")).isDisplayed();
       return getInstance(PluginPage.class);
   }

}
