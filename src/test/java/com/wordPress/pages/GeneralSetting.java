package com.wordPress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v119.indexeddb.model.Key;

public class GeneralSetting extends BasePage {

    public GeneralSetting(WebDriver driver) {
        super(driver);
    }


    public GeneralSetting ClickAdminPanelDarkMode() {
        getWebElement(By.xpath("//a[text()='Admin Panel Dark Mode']")).click();
        return getInstance(GeneralSetting.class);
    }

    public GeneralSetting EnableAdminDashboardDarkMode() {
        getWebElement(By.xpath("//div[text()='Enable Admin Dashboard Dark Mode']")).click();
        return getInstance(GeneralSetting.class);
    }
    public GeneralSetting disableAdminDashboardDarkMode(){
        getWebElement(By.xpath("//div[text()='Enable Admin Dashboard Dark Mode']")).click();
        return getInstance(GeneralSetting.class);
    }

    public GeneralSetting defaultDarkMode() throws InterruptedException {
        Thread.sleep(1000);
        getWebElement(By.xpath("//span[@class='flex w-4 rounded-full h-4 shadow group-hover:bg-blue-100 border border-gray-300']")).click();

        return getInstance(GeneralSetting.class);
    }

    public GeneralSetting saveChanges() {
        getWebElement(By.xpath("//button[@class='disabled:opacity-50 disabled:cursor-not-allowed inline-flex items-center gap-2 px-4 py-2 text-sm font-medium rounded-md cursor-pointer outline-none focus:outline-none hover:opacity-90 transition duration-75 bg-blue-500 text-white border border-blue-500']")).click();
        return getInstance(GeneralSetting.class);
    }

    public GeneralSetting clickCustomization() {
        getWebElement(By.xpath("//h4[contains(@class, 'text-base') and contains(@class, 'wp-dark-mode-white')][text()='Customization']")).click();
        return getInstance(GeneralSetting.class);
    }
    public GeneralSetting switchSettingClick() {
        getWebElement(By.xpath("//a[@href='#/switch']")).click();
        return getInstance(GeneralSetting.class);
    }

    public GeneralSetting changeFloatingSwitchStyle(){
        getWebElement(By.xpath("//div[@class='wp-dark-mode-ignore wp-dark-mode-switch ignore dummy wp-dark-mode-switch-3   dummy']")).click();
        return getInstance(GeneralSetting.class);
    }

    public GeneralSetting floatingSwitchSize(){
        getWebElement(By.xpath("//div[contains(@class, 'cursor-pointer')]//span[text()='Custom']")).click();
        return getInstance(GeneralSetting.class);

    }
    public GeneralSetting fillclear(){
        getWebElement(By.xpath("//div[@data-v-5ca4e721]//input[@type='number']")).clear();
        return getInstance(GeneralSetting.class);
    }

    public GeneralSetting fillValue(){
        getWebElement(By.xpath("//div[@data-v-5ca4e721]//input[@type='number']")).sendKeys("220");
        return getInstance(GeneralSetting.class);
    }



    public GeneralSetting positionSwitchLeft(){
        getWebElement(By.xpath("//div[contains(@class, 'cursor-pointer')]//span[text()='Left']")).click();
       return getInstance(GeneralSetting.class);
    }

    public GeneralSetting clickAdvanceMenu(){
        getWebElement(By.xpath("//h4[contains(@class, 'text-base') and contains(@class, 'wp-dark-mode-white')][text()='Advanced']")).click();
        return getInstance(GeneralSetting.class);
    }

    public GeneralSetting clickAdvance(){
        getWebElement(By.xpath("//h4[contains(@class, 'text-base') and text()='Advanced']")).click();
        return getInstance(GeneralSetting.class);
    }



    public GeneralSetting clickAccessibility(){
        getWebElement(By.xpath("//a[@href='#/accessibility']")).click();

        return getInstance(GeneralSetting.class);
    }





    public GeneralSetting disableKeyboardshortcut(){
        getWebElement(By.xpath("//div[contains(@class, 'text-base')]//div[text()='Keyboard Shortcut']")).click();
        return getInstance(GeneralSetting.class);
    }

    public GeneralSetting toggleAnimation() {
        getWebElement(By.xpath("//span[contains(@class, '')][text()='Vibrate']")).click();

        return getInstance(GeneralSetting.class);
    }

    public GeneralSetting switchAttentionEffectOn() throws InterruptedException {
        getWebElement(By.xpath("//div[contains(@class, '')][text()='Switch Attention Effect ']")).click();
        Thread.sleep(3000);
        return getInstance(GeneralSetting.class);
    }





}
