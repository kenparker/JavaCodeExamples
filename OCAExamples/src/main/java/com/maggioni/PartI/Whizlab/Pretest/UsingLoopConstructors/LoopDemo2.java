package com.maggioni.PartI.Whizlab.Pretest.UsingLoopConstructors;

public class LoopDemo2 {

    public static void main(String[] args) {
        int x = 0;
        String[] animal = new String[3];
        
        do {animal[x]="cat";x++;} while (false);
        System.out.println("x = " + x);
        do {animal[x]="dog";} while (x>animal[x++].length());
        System.out.println("x = " + x);
        do {animal[x]="rat";} while (x>3);
        System.out.println("x = " + x);
        
        for (String animal1 : animal) {
            System.out.print(animal1+" ");
        }
    }
    
}
