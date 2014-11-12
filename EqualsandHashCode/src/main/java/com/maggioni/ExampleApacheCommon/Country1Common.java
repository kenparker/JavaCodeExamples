package com.maggioni.ExampleApacheCommon;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Country1Common {

    String name;

    public Country1Common(String name) {
        super();
        this.name = name;
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
            Country1Common other = (Country1Common) obj;
            EqualsBuilder builder = new EqualsBuilder();
            builder.append(this.name, other.name);           
            return builder.isEquals();
        }
        return false;
    }
}
