package com.maggioni.figure12;

 class SportsCar {
    void goFast() {
        System.out.println("I go very fast");
    }   
    // invoking a method declared in the same class
    void doStuff() {
        goFast();
    }
}
