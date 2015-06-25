/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maggioni.PartI.Chapter3.Exercise;

/**
 *
 * @author maggioni
 */
public class SwitchDemo1 {

    static int x;
    public static void main(String[] args) {
        String ss = "aBc";
        String s = "ABC";
        switch (s) {
            case "A":
                x++;
            case "B":
                x++;
                break;
            case "C":
                x--;
            default:
                x++;
            // case ss: // this line won't compile unless ss is final
                x++;
                break;
        }
    }

}
