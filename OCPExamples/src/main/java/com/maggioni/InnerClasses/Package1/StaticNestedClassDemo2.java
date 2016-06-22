package com.maggioni.InnerClasses.Package1;

public class StaticNestedClassDemo2 {
    static int outerStatic = 10;
    int outerInstance = 20;
    
    static class StaticNested {
        static int innerStatic = 10;
        int innerInstance = 20;
        String outerVar() {
            /*
            System.out.println(" outer variables :" + outerStatic + StaticNestedClassDemo2.this.outerInstance);
            */
            return " outer static variables :" + outerStatic;
        }
    }
    
    static class StaticNestedWithConstructor {

        public StaticNestedWithConstructor() {
            innerInstance2 = 22;
        }
        int innerInstance2;
    }
    
    class Inner1 {
        /*
        static int innerStatic2 = 20;
        */
        public int inner22;
        int inner23;
        protected int inner24;
        private int inner25;
    }
    
    public static void main(String[] args) {
        StaticNestedClassDemo2.StaticNested nested1 = new StaticNestedClassDemo2.StaticNested();
        StaticNested nested2 = new StaticNested();
        
        nested1.innerStatic = 99;
        nested1.innerInstance = 999;
        
        System.out.println(nested1.innerInstance + " " + nested1.innerStatic + " " +  nested1.outerVar());  // 999 99
        System.out.println(nested2.innerInstance + " " + nested2.innerStatic);  // 20 99
        
        /*
        important: access to static variable without instance
        */
        System.out.println(" " + StaticNestedClassDemo2.StaticNested.innerStatic);
        /*
        access to inner variable require an instance
        */
        System.out.println(" " + new StaticNestedClassDemo2.StaticNested().innerInstance);
        
    }
}
