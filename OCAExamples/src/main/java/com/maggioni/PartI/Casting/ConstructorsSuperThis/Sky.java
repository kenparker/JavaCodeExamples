package com.maggioni.PartI.Casting.ConstructorsSuperThis;

class Sky {

    private int s;
    //protected Sky() {}
    protected Sky(int s) {this.s = s;}
    
}
class Star extends Sky {
    public Star(int s) {super(s);}
    //public Star() {this.s = 9;}
    public Star() {super(9);}
}
