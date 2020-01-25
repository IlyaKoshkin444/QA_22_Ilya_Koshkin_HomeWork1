package com.wiki.koshkin.manage;

import com.wiki.koshkin.model.WatchlistData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WatchlistHelper  extends HelperBase{
    public WatchlistHelper(WebDriver wd) {
        super(wd);
    }

    public void createEditViewWatchlist() throws InterruptedException {
        clickWatchList();
        clickEditWatchList();
        clickEditRowWatchList();
        inputCreateWatchlistTitle(new WatchlistData("Dance" +"\n"+"Song"));
        clickViewAndEditWatchList();
    }

    public void clickViewAndEditWatchList() throws InterruptedException {
        clickWatchList();
        clickEditWatchList();
        click(By.cssSelector("[href='/wiki/Dance']"));
        pause(5000);
        clickWatchList();
        clickEditWatchList();
        click(By.cssSelector("[href='/wiki/Song']"));
        pause(5000);

    }

    public void inputCreateWatchlistTitle(WatchlistData dataWatchlist) {
        Type(By.cssSelector("[name='wpTitles']"),dataWatchlist.getWatchlistName());
        click(By.cssSelector("[title='Update watchlist [ctrl-option-s]']"));
    }

    public void clickEditRowWatchList() throws InterruptedException {
        click(By.cssSelector("[title='Special:EditWatchlist/raw']"));
        pause(5000);
    }

    public void clickEditWatchList() throws InterruptedException {
        click(By.cssSelector("[href='/wiki/Special:EditWatchlist']"));
        pause(5000);
    }

    public void clickWatchList() throws InterruptedException {
        click(By.id("pt-watchlist"));
        pause(5000);

    }

    public void clickClearWatchList() throws InterruptedException {
        click(By.cssSelector("[title='Special:EditWatchlist/clear']"));
        pause(5000);
        click(By.xpath("//button[@class='oo-ui-inputWidget-input oo-ui-buttonElement-button']"));
        pause(5000
        );
    }

    public void ClearWatchlist() throws InterruptedException {
        clickWatchList();
        clickEditWatchList();
        clickClearWatchList();
    }
}
