package com.wiki.koshkin.test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateWatchlistTest extends TestBase {

   @BeforeMethod
    public void ensurePreconditionsTestCreateWatchList() throws InterruptedException {
        if (!app.getSession().isAvatarPresentOnHeader()) {
            app.getSession().fillWikiLoginForm();
        }

    }

    @Test
    public void testCreateWatchlist() throws InterruptedException {

        app.getWatchlist().createEditViewWatchlist();
    }

}
