package com.maggioni.ObserverPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class AbstractStockMarket {
    private List<StockBroker> stockBrokers = new ArrayList<>();

    public void addStockBroker(StockBroker stockBroker) {
        stockBrokers.add(stockBroker);
    }

    public void notifyStockBroker(Map<String, Double> stockList) {
        stockBrokers.forEach( stockBroker -> stockBroker.update(stockList));
    }

    public abstract void addStock(String stockSymbol, Double price);
    public abstract void update(String stockSymbol, Double price);
    public abstract Double getPrice(String stockSymbol);
}
