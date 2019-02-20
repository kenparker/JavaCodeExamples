import org.pcollections.HashPMap;
import org.pcollections.HashTreePMap;

import java.util.Objects;

public class Stocks {

    private final HashPMap<String, Double> stockList;

    private Stocks(Builder builder) {
        stockList = builder.stockList;
    }

    public HashPMap<String, Double> getStockList() {
        return HashTreePMap.from(stockList);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stocks)) return false;
        Stocks stocks = (Stocks) o;
        return Objects.equals(stockList, stocks.stockList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stockList);
    }

    @Override
    public String toString() {
        return "Stocks{" +
                "stockList=" + stockList +
                '}';
    }

    public static final class Builder {
        private HashPMap<String, Double> stockList;

        public Builder() {
            stockList = HashTreePMap.empty();
        }

        public Builder withStockList(HashPMap<String, Double> val) {
            stockList = val;
            return this;
        }

        public Builder addStock(String stock, Double price) {
            stockList = stockList.plus(stock,price);
            return this;
        }

        public Stocks build() {
            return new Stocks(this);
        }
    }
}
