package com.wiki.koshkin.test;

import com.wiki.koshkin.model.WatchlistData;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateWatchlistTest extends TestBase {

   @BeforeMethod
    public void ensurePreconditionsTestCreateWatchList() throws InterruptedException {
        if (!app.getSession().isAvatarPresentOnHeader()) {
            app.getSession().fillWikiLoginForm();
        }

    }

    @Test(dataProvider = "validWatchlist", dataProviderClass = DataProviders.class)
    public void testCreateWatchlistDP(String watchlistName) throws InterruptedException {

        app.getWatchlist().clickWatchList();
        app.getWatchlist().clickEditWatchList();
        app.getWatchlist().clickEditRowWatchList();
        app.getWatchlist().inputCreateWatchlistTitle(new WatchlistData().setWatchlistName(watchlistName)); //"Dance" +"\n"+"Song"));
        app.getWatchlist().clickViewAndEditWatchList();
    }
    @Test(dataProvider = "validWatchlistCSV", dataProviderClass = DataProviders.class)
    public void testCreateWatchlistCSV(WatchlistData watchlist) throws InterruptedException {

        app.getWatchlist().clickWatchList();
        app.getWatchlist().clickEditWatchList();
        app.getWatchlist().clickEditRowWatchList();
        app.getWatchlist().inputCreateWatchlistTitle(watchlist); //"Dance" +"\n"+"Song"));
        app.getWatchlist().clickViewAndEditWatchList();
    }

}
