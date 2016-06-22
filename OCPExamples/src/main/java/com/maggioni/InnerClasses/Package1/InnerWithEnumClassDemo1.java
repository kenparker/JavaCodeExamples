package com.maggioni.InnerClasses.Package1;

public class InnerWithEnumClassDemo1 {

    enum Size {
        SMALL, MEDIUM, LARGE
    }

    void met1() {
        /*
         enum type cannot be local
         enum Size {SMALL, MEDIUM, LARGE}
         */
    }

    class Inner {
        /*
        
        enum Size {
            SMALL, MEDIUM, LARGE
        }
        */
    }

    static class StaticNested {

        enum Size {
            SMALL, MEDIUM, LARGE
        }

    }
}
