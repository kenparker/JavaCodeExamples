package com.maggioni.ObserverPattern;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class StockMarketTest {

    private static StockMarket stockMarket = new StockMarket();
    private static String appleSymbol = "APPLE";
    private static Double applePrice = 500.22;

    @BeforeClass
    public static void setUp() throws Exception {
        StockBuyer stockBuyer = new StockBuyer();
        StockViewer stockViewer = new StockViewer();
        stockMarket.addStockBroker(stockBuyer);
        stockMarket.addStockBroker(stockViewer);

        stockMarket.addStock(appleSymbol, applePrice);
    }

    @Test
    public void givenANewStock_whenAddStock_thenNewStockIsAdded() {
        String spySymbol = "SPY";
        Double spyPrice = 123.44;
        stockMarket.addStock(spySymbol, spyPrice);

        assertThat(stockMarket.getPrice(spySymbol)).isEqualTo(spyPrice);
    }

    @Test
    public void givenAExistingStock_whenAddStock_thenExistingStockNotChanged() {
        stockMarket.addStock(appleSymbol, 5.5);

        assertThat(stockMarket.getPrice(appleSymbol)).isEqualTo(applePrice);
    }

    @Test
    public void givenAExistingStock_whenUpdateStock_thenExistingPriceIsChanged() {
        Double appleNewPrice = 600.11;
        stockMarket.update(appleSymbol, appleNewPrice);

        assertThat(stockMarket.getPrice(appleSymbol)).isEqualTo(appleNewPrice);
    }
}