package com.wiki.koshkin.test;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginWiki extends TestBase {

    @BeforeMethod
    public void ensurePreconditions() {
        if(app.getSession().isAvatarPresentOnHeader()){
            app.getSession().logout();
        }
    }

    @Test
    public void openWikipediaTest() throws InterruptedException {
        app.getSession().fillWikiLoginForm();
        Assert.assertTrue
                (app.getSession().isAvatarPresentOnHeader());

    }




}
