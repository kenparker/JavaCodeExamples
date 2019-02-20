import org.pcollections.HashPMap;
import org.testng.annotations.Test;

public class StocksTest {

    private String spy = "SPY";
    private Double spyPrice = 12.334;
    private String nasdaq = "NAS";
    private Double nasdaqPrice =3333.1;
    private String nyse = "NYE";
    private Double nysePrice = 2345.55;


    @Test
    public void addSPY() {

        Stocks stocks = new Stocks.Builder()
                .addStock(spy, spyPrice)
                .build();

        long id = Thread.currentThread().getId();
        System.out.println("addSPY " + " HashCode : " + stocks.hashCode() + " Thread is: " + id + " " + stocks.toString());
    }

    @Test
    public void addNAS()  {
        Stocks stocks = new Stocks.Builder()
                .addStock(nasdaq, nasdaqPrice)
                .build();

        long id = Thread.currentThread().getId();
        System.out.println("addNAS " + " HashCode : " + stocks.hashCode() + " Thread is: " + id + " " + stocks.toString());
    }


    @Test
    public void addNYSE()  {
        Stocks stocks = new Stocks.Builder()
                .addStock(nyse, nysePrice)
                .build();

        long id = Thread.currentThread().getId();
        System.out.println("addNYSE " + " HashCode : " + stocks.hashCode() + " Thread is: " + id + " " + stocks.toString());
    }
}