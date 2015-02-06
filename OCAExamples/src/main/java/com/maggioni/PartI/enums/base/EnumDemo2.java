package com.maggioni.PartI.enums.base;

public class EnumDemo2 {

    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.size = CoffeSize.BIG;
        
        OuterClass oc = new OuterClass();
        OuterClass.WeekendDays10 enum10 = oc.getEnum10(); // this works
        OuterClass.WeekendDays9 enum9 = oc.getEnum9(); // this works
        //OuterClass.WeekendDays8 enum8 = oc.getEnum8(); // does not work because WeekendDays8 is private
    }
    
}
