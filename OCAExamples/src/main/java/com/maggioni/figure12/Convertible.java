package com.maggioni.figure12;

class Convertible extends SportsCar{
    
    public static void main(String[] args) {
        Convertible co = new Convertible();
        co.doMore();
        co.doThings();
        
    }
    void doThings() {
        SportsCar sc = new SportsCar();
        sc.goFast();
    }
    
    void doMore() {
        goFast();
    }
    
}
