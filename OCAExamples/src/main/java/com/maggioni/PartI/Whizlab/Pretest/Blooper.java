package com.maggioni.PartI.Whizlab.Pretest;

/**
 *
 * @author magang
 */
class Blooper {
    private int a;
    protected Blooper(int a) {
        this.a = a;
    }
}

class Blop extends Blooper {
    public Blop(int a) {
        super(a);
    }
    public Blop() {
        this(5);
    }
    
    public void greet(String greeting){
        
    }
    public String greet() {return "ss";}
}
