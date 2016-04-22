package com.maggioni.MostDifficults;

class ACloneable implements Cloneable {
    public int i = 20;
}

class BCloneable extends ACloneable {
    public int i = 30;
    
    public Object getClone() throws CloneNotSupportedException {
        return this.clone();
    }
}

class CCloneable extends ACloneable {
    public int i = 30;
    
    @Override
    public CCloneable clone() {
        CCloneable c = new CCloneable();
        c.i = this.i;
        return c;
    }
}

public class ClonableDemo1 {

    public static void main(String[] args) {
       BCloneable b1 = new BCloneable();
       //BCloneable b2 = b1.clone(); // do not compile because clone() is protected
       //BCloneable b2 = (BCloneable)b1.clone(); // do not compile because clone() is protected
       CCloneable c1 = new CCloneable();
       CCloneable c2 = c1.clone();
       CCloneable c3 = (CCloneable)c1.clone();
    }

}
