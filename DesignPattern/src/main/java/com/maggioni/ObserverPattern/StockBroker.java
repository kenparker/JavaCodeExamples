package com.maggioni.ObserverPattern;

import java.util.Map;

interface StockBroker {
    void update(Map<String, Double> stockList);
}
