package com.wiki.koshkin.model;

public class WatchlistData {
    private String watchlistName;
    String watchlist;

    public String getWatchlistName() {
        return watchlistName;
    }

    public WatchlistData setWatchlistName(String watchlistName) {
        this.watchlistName = watchlistName;
        return this;
    }

    @Override
    public String toString() {
        return "WatchlistData{" +
                "watchlistName='" + watchlistName + '\'' +
                '}';
    }
}

