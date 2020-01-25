package com.wiki.koshkin.test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClearWatchlistTest extends TestBase {

    @BeforeMethod
    public void ensurePreconditionsTestClearWatchList() throws InterruptedException {
        if (!app.getSession().isAvatarPresentOnHeader()) {
            app.getSession().fillWikiLoginForm();
        }

    }

    @Test
    public void testClearWatchlist() throws InterruptedException {

        app.getWatchlist().ClearWatchlist();
    }

}
