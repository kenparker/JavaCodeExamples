package com.maggioni.ToString;


/**
 *
 * @author angelomaggioni
 */
public class ToStringUeberschreiben {

    private String s = "Hallo evere there";
    private int n = 100;
    private double d = 13.1234;
    
    public static void main(String[] args) {
        
        ToStringUeberschreiben toStringUeberschreiben = new ToStringUeberschreiben();
       
        System.out.println(" String :" + toStringUeberschreiben);
    }
    
    @Override
    public String toString() {
        
        return "s : " + s + " n : "+ n + " d :"+ d;
    }
    
}
