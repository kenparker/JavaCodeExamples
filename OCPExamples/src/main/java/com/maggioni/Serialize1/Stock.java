package com.maggioni.Serialize1;

import java.io.Serializable;

public class Stock implements Serializable{
    public String name;
    public Quote quote;         // java.io.NotSerializableException: com.maggioni.Serialize.Quote

    public Stock() {
        name = "default";
        quote = new Quote();
    }
    
}
