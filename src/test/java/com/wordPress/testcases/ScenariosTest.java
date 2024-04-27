package com.wordPress.testcases;

import com.wordPress.pages.Dashboard;
import com.wordPress.pages.GeneralSetting;
import com.wordPress.pages.LogInPage;
import com.wordPress.pages.PluginPage;
import com.wordPress.util.WordpressString;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScenariosTest extends BaseTest{

    @Test(priority = 0)
    public void loginShouldSucceed(){
        Dashboard dashboard = page.getInstance(LogInPage.class)
                .fillUsername(getUsername())
                .fillPassword(getPassword())
                .clickLoginBtn();
        Assert.assertTrue(dashboard.isLogout());
    }
    @Test(priority = 1)
    public void CheckWPDarkModeActive() {
        PluginPage plugin = page.getInstance(LogInPage.class)
                .doLogin(getUsername(), getPassword())
                .plugin()
                .wpDarkModeIsDisplayed();
        Assert.assertFalse(plugin.WPDarkModeActivated());
    }
    @Test(priority = 2)
    public void InstallWPDarkMode(){
        PluginPage pluginPage = page.getInstance(LogInPage.class)
                .doLogin(getUsername(), getPassword())
                .plugin()
                .searchForWpDarkModePlugin();
        boolean install= pluginPage.WPDarkModeActivated();
        if(install == false) {
            pluginPage.searchForPlugin();
            pluginPage.installWPdarkMode();
            pluginPage.activateWPdarkMode();
        }
    }

    @Test(priority = 3)
    public void EnableDefaultLightMode() throws InterruptedException {
        GeneralSetting generalSetting = page.getInstance(LogInPage.class)
                .doLogin(getUsername(), getPassword())
                .navigateToWpDarkMode()
                .ClickAdminPanelDarkMode()
                .disableAdminDashboardDarkMode()
                .EnableAdminDashboardDarkMode();

    }
    @Test(priority = 4)
    public void ValidateDarkMode(){
        Dashboard dashboard = page.getInstance(LogInPage.class)
                .doLogin(getUsername(),getPassword())
                .darkModeBtn()
                        .navigateToDashboard();
        Assert.assertEquals(dashboard.modeName(), WordpressString.Mode);

    }
    @Test(priority = 5)
    public void SelectFloatingSwitchStyle(){
        GeneralSetting generalSetting = page.getInstance(LogInPage.class)
                .doLogin(getUsername(),getPassword())
                .navigateToWpDarkMode()
                .clickCustomization()
                .switchSettingClick()
                .changeFloatingSwitchStyle()
                .saveChanges();
    }
    @Test(priority = 6)
    public void SelectCustomizeSwitchSize(){
        GeneralSetting generalSetting = page.getInstance(LogInPage.class)
                .doLogin(getUsername(),getPassword())
                .navigateToWpDarkMode()
                .clickCustomization()
                .switchSettingClick()
                .floatingSwitchSize()
                .fillclear()
                .fillValue()
                .saveChanges();

    }

    @Test(priority = 7)
    public void ChangeFloatingSwitchPosition(){
        GeneralSetting generalSetting = page.getInstance(LogInPage.class)
                .doLogin(getUsername(),getPassword())
                .navigateToWpDarkMode()
                .clickCustomization()
                .clickCustomization()
                .switchSettingClick()
                .positionSwitchLeft()
                .saveChanges();
    }

    @Test(priority = 8)
    public void DisableKeyboardShortcut() throws InterruptedException {
        GeneralSetting generalSetting = page.getInstance(LogInPage.class)
                .doLogin(getUsername(),getPassword())
                .navigateToWpDarkMode()
                .clickAdvanceMenu()
                .clickAdvance()
                .clickAccessibility()
                .disableKeyboardshortcut()
                .saveChanges();
    }

    @Test(priority = 9)
    public void ChangeAnimation() throws InterruptedException {
        GeneralSetting generalSetting = page.getInstance(LogInPage.class)
                .doLogin(getUsername(),getPassword())
                .navigateToWpDarkMode()
                .clickCustomization()
                .switchSettingClick()
                .toggleAnimation()
                .saveChanges();

    }

}


