/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maggioni.PartI.Chapter4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author magang
 */
public class MyException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            checkFood(args[0]);
        } catch (BadFoodException ex) {
            Logger.getLogger(MyException.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    static void checkFood(String food) throws BadFoodException {
        
        switch(food){
            case "spaghetti":
                // do something
                break;
            case "pizza":
                // do something
                break;
            default:
                throw new BadFoodException();
        }
        
        Integer i = new Integer(food);
    }
    
}
