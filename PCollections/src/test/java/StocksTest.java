import org.pcollections.HashPMap;
import org.testng.annotations.Test;

public class StocksTest {

    private Stocks stocks = new Stocks();
    private String spy = "SPY";
    private Double spyPrice = 12.334;
    private String nasdaq = "NAS";
    private Double nasdaqPrice =3333.1;
    private String nyse = "NYE";
    private Double nysePrice = 2345.55;


    @Test
    public void addSPY() {
        HashPMap<String, Double> stockList = stocks.addElement(spy, spyPrice);

        long id = Thread.currentThread().getId();
        System.out.println("addSPY " + " HashCode : " + stockList.hashCode() + " Thread is: " + id + " " + stockList.toString());
    }

    @Test
    public void addNAS()  {
        HashPMap<String, Double> stockList = stocks.addElement(nasdaq, nasdaqPrice);

        long id = Thread.currentThread().getId();
        System.out.println("addNAS " + " HashCode : " + stockList.hashCode() + " Thread is: " + id + " " + stockList.toString());
    }


    @Test
    public void addNYSE()  {
        HashPMap<String, Double> stockList = stocks.addElement(nyse, nysePrice);

        long id = Thread.currentThread().getId();
        System.out.println("addNYSE " + " HashCode : " + stockList.hashCode() + " Thread is: " + id + " " + stockList.toString());
    }
}