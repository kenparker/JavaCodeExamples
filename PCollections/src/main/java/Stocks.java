import org.pcollections.HashPMap;
import org.pcollections.HashTreePMap;

public class Stocks {

    private HashPMap<String, Double> stockList = HashTreePMap.empty();

    public synchronized HashPMap addElement(String stockName, Double price) {
        return stockList = stockList.plus(stockName, price);
    }

    public void removeElement(String stockName) {
        stockList.minus(stockName);
    }

    public void updateElement(String stockName, Double price) {
        stockList.minus(stockName).plus(stockName, price);
    }
}
