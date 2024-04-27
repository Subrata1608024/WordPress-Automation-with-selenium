package com.wordPress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage extends BasePage{
    public LogInPage(WebDriver driver) {
        super(driver);
    }

    public LogInPage fillUsername(String username){

        getWebElement(By.cssSelector("input[id='user_login']")).sendKeys(username);
        return this;

    }
    public LogInPage fillPassword(String password){

        getWebElement(By.xpath("//input[@id='user_pass']")).sendKeys(password);
        return this;
    }



   public Dashboard clickLoginBtn() {
       getWebElement(By.xpath("//input[@value='Log In']")).click();

       return getInstance(Dashboard.class);
   }

   public boolean isLoginPage(){
        return getWebElements(By.cssSelector("input[name='wp-submit']")).size() > 0;
   }


    public Dashboard doLogin(String username, String password){
        return
                fillUsername(username)
                        .fillPassword(password)
                        .clickLoginBtn();
    }

}
