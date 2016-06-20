package com.maggioni.InnerClasses.Package1;

public class InnerClassDemo10 {

    public static void main(String[] args) {
        Cathedral c = new Cathedral();
        
        Cathedral.Sanctum e1 = c.new Sanctum();
        Cathedral.Sanctum e2 = new Cathedral().new Sanctum();
        
        //Inner i = new Inner();
    }
    
    void instMethod() {
        Inner i = new Inner();
        Inner.InnerInner ii;
    }
    
    private class Inner {
        
        class InnerInner {
            
        }
    }

}

class Cathedral {
    class Sanctum {
        void go() {System.out.println("spooky");}
    }
}
