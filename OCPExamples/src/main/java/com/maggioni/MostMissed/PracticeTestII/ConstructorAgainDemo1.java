package com.maggioni.MostMissed.PracticeTestII;

class Z{
    private int i;

    public Z(int i) {
        this.i = i;
    }
    
}

class Y extends Z {

    /*
    without this constructor which is calling super(0)
    the class do not compile
    */
    public Y() {
        super(0);
    }
    
}
public class ConstructorAgainDemo1 {

    public static void main(String[] args) {
        
    }

}
