package com.maggioni.AdvancedClassDesign.Enum;

enum A {A }
public class EnumDemo4Difficult {
    enum B {B}
    void C() {
        /*
        Error, DO not Compile: enum Types cannot be local
        enum D {D};
        */
    }
}
