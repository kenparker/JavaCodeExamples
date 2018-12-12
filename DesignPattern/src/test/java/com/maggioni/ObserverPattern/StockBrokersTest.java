package com.maggioni.ObserverPattern;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StockBrokersTest {

    StockBroker buyer = new StockBuyer();
    StockBroker viewer = new StockViewer();

    @Test
    public void givenSomeStockBrokers_whenCreate_thenAStockBrokersInstanceIsCreated() {

        StockBrokers stockBrokers = StockBrokers.builder()
                                    .addStockBroker(buyer)
                                    .addStockBroker(viewer)
                                    .build();

        stockBrokers.stockBrokers().forEach(System.out::println);

        assertThat(stockBrokers.stockBrokers().size()).isEqualTo(2);
        assertThat(stockBrokers.stockBrokers().contains(buyer)).isTrue();
    }
}