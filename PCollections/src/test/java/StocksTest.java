import org.junit.Before;
import org.junit.Test;

public class StocksTest {

    private Stocks stocks = new Stocks();
    private String spy = "SPY";
    private Double spyPrice = 12.334;
    private String nasdaq = "NAS";
    private Double nasdaqPrice =3333.1;

    @Before
    public void setUp() throws Exception {
        stocks.addElement(spy, spyPrice);
    }

    @Test
    public void givenSomeStocks_whenAddElement_thenStocksAreAdded() {
        stocks.addElement(nasdaq, nasdaqPrice);
        System.out.println(stocks.toString());
    }

    @Test
    public void givenAExistingStock_whenAddElement_thenStockISNotAdded() {
        stocks.addElement(spy,spyPrice);
        System.out.println(stocks.toString());
    }
}