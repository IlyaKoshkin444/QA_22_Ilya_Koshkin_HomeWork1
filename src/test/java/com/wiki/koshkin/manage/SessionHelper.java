package com.wiki.koshkin.manage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {

    public SessionHelper(WebDriver wd) {
        super(wd);
    }

    public void selectLangEN() {
        wd.findElement(By.id("js-link-box-en")).click();
    }

    public void initlogin() {
        wd.findElement(By.id("pt-login")).click();
    }

    public void fillLoginForm(String user, String password) {
        Type(By.id("wpName1"), user);
        Type(By.id("wpPassword1"), password);
    }

    public boolean isAvatarPresentOnHeader() {
        return isElementPresent
                (By.xpath("//li[@id='pt-notifications-alert']"));
    }

    public void clickLogInButton() throws InterruptedException {
        wd.findElement(By.id("wpLoginAttempt")).click();
        pause(5000);
    }

    public void fillWikiLoginForm() throws InterruptedException {
        selectLangEN();
        pause(5000);
        initlogin();
        pause(5000);
        fillLoginForm("Eliyahu.Kosh", "wiki23081967");
        pause(5000);
        clickLogInButton();
    }

    public void logout() {
    click(By.id("pt-logout"));
    }
}
