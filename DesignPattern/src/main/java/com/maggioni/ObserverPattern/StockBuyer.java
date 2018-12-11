package com.maggioni.ObserverPattern;

import java.util.Map;

public class StockBuyer implements StockBroker {
    @Override
    public void update(Map<String, Double> stockList) {
        System.out.println("StockBuyer: stockList is changed");
        stockList.forEach((symbol, value) -> System.out.println(symbol + " - $" + value));
    }
}
