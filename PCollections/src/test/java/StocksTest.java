import org.pcollections.HashPMap;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

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

    @Test
    public void addTwoStocks() {
        Stocks stocks = new Stocks.Builder()
                .addStock(nyse, nysePrice)
                .addStock(nasdaq,nasdaqPrice)
                .build();
        long id = Thread.currentThread().getId();
        System.out.println("addTwoStocks " + " HashCode : " + stocks.hashCode() + " Thread is: " + id + " " + stocks.toString());
    }

    @Test
    public void addListAndStock() {
        Stocks stocksWithNyse = new Stocks.Builder()
                .addStock(nyse, nysePrice)
                .build();

        Stocks stocks = new Stocks.Builder()
                .withStockList(stocksWithNyse.getStockListNewObject())
                .addStock(nasdaq,nasdaqPrice)
                .build();

        long id = Thread.currentThread().getId();
        System.out.println("addListAndStock " + " HashCode : " + stocks.hashCode() + " Thread is: " + id + " " + stocks.toString());

    }

    @Test
    public void testGetMethod() {
        Stocks stocksWithNyse = new Stocks.Builder()
                .addStock(nyse, nysePrice)
                .build();

        HashPMap<String, Double> stockList1 = stocksWithNyse.getStockListNewObject();
        HashPMap<String, Double> stockList2 = stocksWithNyse.getStockListNewObject().plus(nasdaq,nasdaqPrice);
        System.out.println("testGetMethod :" + System.identityHashCode(stockList1) + " " + System.identityHashCode(stockList2));
        System.out.println(" " +  stockList1 + " " + stockList2);
        assertThat(stockList1).isNotSameAs(stockList2);
    }

    @Test
    public void testGetMethodReference() {
        Stocks originalStocks = new Stocks.Builder()
                            .addStock(nyse,nysePrice)
                            .addStock(nasdaq, nasdaqPrice)
                            .build();

        HashPMap<String, Double> stockListReference = originalStocks.getStockListReference();
        HashPMap<String, Double> stockListReferenceA = stockListReference.plus(spy,spyPrice);
        HashPMap<String, Double> stockListReferenceB = stockListReferenceA.minus(spy);

        Stocks newStocks = new Stocks.Builder()
                                .withStockList(stockListReferenceB)
                                .build();


        assertThat(stockListReference).isNotSameAs(stockListReferenceA);
        assertThat(stockListReferenceA).isNotSameAs(stockListReferenceB);
        assertThat(stockListReferenceB).isEqualTo(stockListReference);


        assertThat(stockListReferenceB).isNotSameAs(originalStocks.getStockListReference());
        assertThat(stockListReferenceB).isEqualTo(originalStocks.getStockListReference());

        assertThat(newStocks).isNotSameAs(originalStocks);
        assertThat(newStocks).isEqualTo(originalStocks);

    }
}