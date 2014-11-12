package com.maggioni.ExampleApacheCommon;

public class Country {

    String name;
    long population;

    public Country(String name, long population) {
        super();
        this.name = name;
        this.population = population;
    }
    
    // for Test purpose wrong way of implementing hasCode
    @Override
    public int hashCode() {
        if (this.name.equals("india")) {
            return 10;
        } else {
            if (this.name.length() % 2 == 0) {
                return 31;
            } else {
                return 95;
            }
        }
    }

    // The equals method is also wrong
    @Override
    public boolean equals(Object obj) {
        Country other = (Country) obj;
        if (this.name.equalsIgnoreCase(other.name)) {
            return true;
        }
        return false;
    }
}
