package com.maggioni.PartI.enums.base;

enum CoffeSize {

    BIG(8), SMALL(10), MEDIUM(15) {
        public String getLidCode() {
            return "A";
        }
    };

    private CoffeSize(int ounces) {
        this.ounces = ounces;
    }
    private int ounces;

    public int getOunces() {
        return ounces;
    }
    
    public String getLidCode() {
        return "B";
    }

} // Declaration in same file but outside class

class Coffee {

    CoffeSize size;
    NameEnums name; // Declaration in another file
    AnimalType animalType; // Public enum same Package

    enum Location {

        SEDRIANO, MAGENTA, MILANO
    }; // Declaration within the Class
    Location location;
}

public class EnumDemo1 {

    public static void main(String[] args) {
        Coffee cf = new Coffee();
        cf.size = CoffeSize.BIG;
        cf.name = NameEnums.MARCO;
        cf.location = Coffee.Location.MILANO; // Class name required because enclosed in a class
        cf.animalType = AnimalType.MAMMALS;
        
        System.out.println(CoffeSize.BIG.getLidCode()); // returns the default value B
        System.out.println(CoffeSize.MEDIUM.getLidCode()); // returns the overriden value A
    }
}
