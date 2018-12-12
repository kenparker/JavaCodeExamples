package com.maggioni.ObserverPattern;

import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

public class StockBrokersFunctions {

    public static Function<Map<String,Double>,Consumer<StockBrokers>> notifyBrokers = stockList -> stockBrokers -> stockBrokers.stockBrokers().forEach(stockBroker -> stockBroker.update(stockList));
}
