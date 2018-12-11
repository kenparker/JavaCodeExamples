package com.maggioni.ObserverPattern;

import java.util.HashMap;
import java.util.Map;

public class StockMarket extends AbstractStockMarket {
    private Map<String, Double> stockList = new HashMap<>();

    @Override
    public void addStock(String stockSymbol, Double price) {
        stockList.putIfAbsent(stockSymbol, price);
        System.out.println("StockList : " + stockList);
    }

    @Override
    public void update(String stockSymbol, Double price) {
        stockList.put(stockSymbol, price);
        notifyStockBroker(stockList);
    }

    @Override
    public Double getPrice(String stockSymbol) {
        return stockList.getOrDefault(stockSymbol,999.99);
    }
}
