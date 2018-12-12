import org.junit.Test;

public class StocksTest {

    private Stocks stocks = new Stocks();
    private String spy = "SPY";
    private Double spyPrice = 12.334;
    private String nasdaq = "NAS";
    private Double nasdaqPrice =3333.1;

    @Test
    public void name() {
        stocks.addElement(spy, spyPrice);
        stocks.addElement(nasdaq, nasdaqPrice);
        System.out.println(stocks.toString());
    }
}