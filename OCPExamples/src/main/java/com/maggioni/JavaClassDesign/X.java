package com.maggioni.JavaClassDesign;

import java.util.Objects;

public class X {

    String val1;
    String val2;

    public X(String val1, String val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.val1);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final X other = (X) obj;
        if (!Objects.equals(this.val1, other.val1)) {
            return false;
        }
        if (!Objects.equals(this.val2, other.val2)) {
            return false;
        }
        return true;
    }

    
    
    
}
