package com.maggioni.MostMissed.PracticeTestII;

class AN{
    protected void aMet(){System.out.println("from aMet");}
    
    CharSequence bMet(){ return "from AN";}   
}

class BN extends AN{
    
    
    @Override
    public final void aMet(){System.out.println("from BN");}
    
    @Override
    protected String bMet() {return "sasdfsd";}
}
public class OverridingAgainDemo1 {

    public static void main(String[] args) {
        
    }

}
