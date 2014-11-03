package com.maggioni.Core.EqualHashCodeOverride;

import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * http://javarevisited.blogspot.sg/2011/10/override-hashcode-in-java-example.html
 */
public class Stock_3
{

    private String symbol;
    private String exchange;
    private long lotSize;
    private int tickSize;
    private boolean isRestricted;
    private Date settlementDate;
    private BigDecimal price;

    public static void main(String args[])
    {
        Stock_3 sony = new Stock_3("6758.T", "Toyo Stock Exchange", 1000, 10, false, new Date(),
                BigDecimal.valueOf(2200));
        Stock_3 sony2 = new Stock_3("6758.T", "Tokyo Stock Exchange", 1000, 10, false, new Date(),
                BigDecimal.valueOf(2200));

        System.out.println("Equals result: " + sony.equals(sony2));
        System.out.println("HashCode result: " + (sony.hashCode() == sony2.hashCode()));
    }

    private Stock_3(String symbol, String exchange, long lotSize, int tickSize, boolean isRestricted,
            Date settlementDate,
            BigDecimal price)
    {
        this.symbol = symbol;
        this.exchange = exchange;
        this.lotSize = lotSize;
        this.tickSize = tickSize;
        this.isRestricted = isRestricted;
        this.settlementDate = settlementDate;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Stock_3) {
            Stock_3 other = (Stock_3) obj;
            EqualsBuilder builder = new EqualsBuilder();
            builder.append(this.symbol, other.symbol);
            builder.append(this.exchange, other.exchange);
            builder.append(this.lotSize, other.lotSize);
            builder.append(this.tickSize, other.tickSize);
            builder.append(this.isRestricted, other.isRestricted);
            builder.append(this.settlementDate, other.settlementDate);
            builder.append(this.price, other.price);
            return builder.isEquals();
        }
        return false;
    }

    @Override
    public int hashCode()
    {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(symbol);
        builder.append(exchange);
        builder.append(lotSize);
        builder.append(tickSize);
        builder.append(isRestricted);
        builder.append(settlementDate);
        builder.append(price);
        return builder.toHashCode();
    }

}
