package com.maggioni.Core.EqualHashCodeOverride;

import java.util.Objects;

/**
 * hasCode and equals generated from NetBeans
 */
public class Stock_1 {

    public String ticket;
    public int close;

    @Override
    public int hashCode()
    {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.ticket);
        hash = 89 * hash + this.close;
        return hash;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Stock_1 other = (Stock_1) obj;
        if (!Objects.equals(this.ticket, other.ticket)) {
            return false;
        }
        if (this.close != other.close) {
            return false;
        }
        return true;
    }
    
    
}
