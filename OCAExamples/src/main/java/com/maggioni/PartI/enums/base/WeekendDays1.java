package com.maggioni.PartI.enums.base;

enum WeekendDays1 {SATURDAY, SUNDAY} // Allowed

/*
[B]public[/B] enum WeekendDays2 {SATURDAY, SUNDAY} // Allowed
  
[B]private[/B] enum WeekendDays3 {SATURDAY, SUNDAY} // NOT Allowed
[B]protected[/B] enum WeekendDays4 {SATURDAY, SUNDAY} // NOT Allowed
[B]static[/B] enum WeekendDays5 {SATURDAY, SUNDAY} // NOT Allowed
*/

class OuterClass {
    enum WeekendDays6 {SATURDAY, SUNDAY} // Allowed
    public enum WeekendDays7 {SATURDAY, SUNDAY} // Allowed
    private enum WeekendDays8 {SATURDAY, SUNDAY} // Allowed
    protected enum WeekendDays9 {SATURDAY, SUNDAY} // Allowed
    static enum WeekendDays10 {SATURDAY, SUNDAY} // Allowed
    
    WeekendDays10 getEnum10() {
        return WeekendDays10.SATURDAY;
    }
    WeekendDays9 getEnum9() {
        return WeekendDays9.SUNDAY;
    }
    WeekendDays8 getEnum8() {
        return WeekendDays8.SUNDAY;
    }
}