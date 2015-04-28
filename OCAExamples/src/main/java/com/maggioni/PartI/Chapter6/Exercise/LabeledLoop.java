/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maggioni.PartI.Chapter6.Exercise;

import sun.management.Agent;

/**
 *
 * @author maggioni
 */
public class LabeledLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int age = 0;
        outer:
        while (age < 21) {
            if (age == 16) {
                System.out.println("get driving lessons");
                continue outer; // never ending loop as the control is moved to the beginning of the while loop and the age varianle is never added
            } else {
                System.out.println("Another year " + age);
            }
            age++;
        }
    }
}
