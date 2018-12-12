package com.maggioni.ObserverPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class AbstractStockMarket {

    public abstract void addStock(String stockSymbol, Double price);
    public abstract void update(String stockSymbol, Double price, StockBrokers stockBrokers);
    public abstract Double getPrice(String stockSymbol);
}
