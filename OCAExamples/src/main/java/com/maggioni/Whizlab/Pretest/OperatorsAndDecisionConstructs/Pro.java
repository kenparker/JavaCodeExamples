package com.maggioni.Whizlab.Pretest.OperatorsAndDecisionConstructs;

public class Pro {

    public static void main(String[] args) {
        String out = "";
        int x = 7, y = 8;

        if (x == 3) {out += "1";} 
        else if (x > 9) {out += "2";} 
        else if (y < 9) {out += "3";}
        else if (x == 7) {out += "4";}
        else {out += "5";}
        System.out.println(out);
        
        if (x == 3)  {out += "1";} 
        else {if (x > 9) {out += "2";} 
        else {if (y < 9) {out += "3";}
        else {if (x == 7) {out += "4";}
        else {out += "5";}
        
        }}}
        System.out.println(out);
        
        if (x == 3)  out += "1"; 
        else {if (x > 9) out += "2"; 
        else {if (y < 9) out += "3";
        else {if (x == 7) out += "4";
        else {out += "5";}
        
        }}}
        System.out.println(out);
        
        if (x == 3)  out += "1"; 
        else if (x > 9) out += "2"; 
        else if (y < 9) out += "3";
        else if (x == 7) out += "4";
        else out += "5";
        
        System.out.println(out);
    }
}
