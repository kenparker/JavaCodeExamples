package com.maggioni.PartI.Chapter2.Examples;

public class UseAbs {

    public static void main(String[] args) {
        // Abs b = new Abs(); Class is Abstract = it cannot be instantiated
        Abs a = new Abs() {

            @Override
            public void display() {
                super.display(); //To change body of generated methods, choose Tools | Templates.
                System.out.println("Hello again");
            }
        };
        a.display();
    }
    
}
