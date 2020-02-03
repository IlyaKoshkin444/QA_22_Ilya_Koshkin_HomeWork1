package com.wiki.koshkin.manage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class ApplicationManager  {
    EventFiringWebDriver wd;

    WatchlistHelper watchlist;
    SessionHelper session;

    public static class MyListener extends AbstractWebDriverEventListener {
       Logger logger = LoggerFactory.getLogger(MyListener.class);
        @Override
        public void beforeFindBy(By by, WebElement element, WebDriver driver) {
           // super.beforeFindBy(by, element, driver);
            System.out.println("Search element " + by);
            logger.info("Search element " + by);
        }

        @Override
        public void afterFindBy(By by, WebElement element, WebDriver driver) {
            //super.afterFindBy(by, element, driver);
            System.out.println(by + "found! ");
            logger.info(by + "found! ");
        }

        @Override
        public void onException(Throwable throwable, WebDriver driver) {
           // super.onException(throwable, driver);

            System.out.println("!!Error!!" + throwable);
            logger.error("!!Error!!" + throwable);

        }
    }
    public void init() {
        String browser =
                System.getProperty("browser", BrowserType.CHROME);
        if (browser.equals(BrowserType.CHROME)) {
            wd = new EventFiringWebDriver(new ChromeDriver());
        } else if (browser.equals(BrowserType.FIREFOX)) {
            wd = new EventFiringWebDriver(new FirefoxDriver());
        } else if (browser.equals(BrowserType.SAFARI)) {
            wd = new EventFiringWebDriver(new SafariDriver());
        }

        wd.register(new MyListener());
        wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        openSite("https://www.wikipedia.org");
        session = new SessionHelper(wd);
        watchlist = new WatchlistHelper(wd);
    }

    public void stop() {
        wd.quit();
    }

    public void openSite(String url) {
        wd.get(url);
    }

    public WatchlistHelper getWatchlist() {
        return watchlist;
    }

    public SessionHelper getSession() {
        return session;
    }
}