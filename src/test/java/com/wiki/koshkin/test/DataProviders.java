package com.wiki.koshkin.test;
import com.wiki.koshkin.model.WatchlistData;
import org.testng.annotations.DataProvider;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviders {
    @DataProvider
    public Iterator<Object[]> validWatchlist() {
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{"Deep Purple"});
        list.add(new Object[]{"ZZ Top"});
        list.add(new Object[]{"The Beatles"});
        return list.iterator();
    }

    @DataProvider
    public Iterator<Object[]> validWatchlistCSV() throws IOException {
        List<Object[]> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/watchlistPositiveCSV.csv")));
        String line = reader.readLine();
        while (line != null) {
            String[] split = line.split(",");
            list.add(new Object[]{new WatchlistData().setWatchlistName(split[0])});
            line = reader.readLine();
        }
        return list.iterator();
    }

}