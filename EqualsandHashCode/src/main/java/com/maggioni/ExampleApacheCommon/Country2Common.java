package com.maggioni.ExampleApacheCommon;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Country2Common {

    String name;
    int population;

    public Country2Common(String name, int population) {
        super();
        this.name = name;
        this.population = population;
    }
    
    // for test purpose
    @Override
    public int hashCode() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(name);    
        return builder.toHashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if( obj != null && obj.getClass() == this.getClass() ) {
            Country2Common other = (Country2Common) obj;
            EqualsBuilder builder = new EqualsBuilder();
            builder.append(this.name, other.name);           
            return builder.isEquals();
        }
        return false;
    }
}
