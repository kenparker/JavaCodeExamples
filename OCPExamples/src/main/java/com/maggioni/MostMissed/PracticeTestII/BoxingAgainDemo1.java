package com.maggioni.MostMissed.PracticeTestII;

class Box {
    
    void aM1(double d) {System.out.println(""+d);}
    
    void aM2(Double d) {System.out.println(""+d);}
}
public class BoxingAgainDemo1 {

    public static void main(String[] args) {
        
        Box box = new Box();
        Double d1 = new Double(125.56);
        Double d2 = new Double("125");
        double d3 = new Double("3000");
        float f1 = 123f;
        
        
        box.aM1(d1);
        box.aM1(d2);
        
        box.aM2(d3);
        
        box.aM1(f1);
        //box.aM2(f1);  // do not compile
    }

}
