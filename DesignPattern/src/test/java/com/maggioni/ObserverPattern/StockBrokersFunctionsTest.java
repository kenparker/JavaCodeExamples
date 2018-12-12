package com.maggioni.ObserverPattern;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

public class StockBrokersFunctionsTest {

    @Test
    public void givenaStockList_whenNotify_ThenBrokerUpdateIsCalled() {
        Map<String, Double> stockList = new HashMap<>();
        stockList.put("AAPL",100.22);
        stockList.put("AMZN",154.33);

        StockBroker buyer = new StockBuyer();
        StockBroker viewer = new StockViewer();
        StockBrokers stockBrokers = StockBrokers.builder()
                                        .addStockBroker(buyer)
                                        .addStockBroker(viewer)
                                        .build();

        StockBrokersFunctions.notifyBrokers.apply(stockList).accept(stockBrokers);
    }
}