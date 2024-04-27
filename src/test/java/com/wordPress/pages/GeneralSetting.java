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
        getWebElement(By.xpath("//a[@href='#/admin']")).click();
        return getInstance(GeneralSetting.class);
    }

    public GeneralSetting EnableAdminDashboardDarkMode() {
        getWebElement(By.xpath("//div[@class='text-base w-content leading-6 font-medium flex items-center gap-3 text-black']")).click();
        return getInstance(GeneralSetting.class);
    }
    public GeneralSetting disableAdminDashboardDarkMode(){
        getWebElement(By.xpath("//div[@class='text-base w-content leading-6 font-medium flex items-center gap-3 text-black']")).click();
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
        getWebElement(By.xpath("//h4[@class='text-base leading-6 wp-dark-mode-white']")).click();
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
        getWebElement(By.xpath("//h4[contains(@class, 'text-base') and text()='Advanced']")).click();
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

    public GeneralSetting toggleAnimation() throws InterruptedException {
        getWebElement(By.xpath("//div[@class='relative w-10 h-full rounded-full transition duration-100 bg-slate-200']")).click();
        Thread.sleep(3000);
        return getInstance(GeneralSetting.class);
    }





}
