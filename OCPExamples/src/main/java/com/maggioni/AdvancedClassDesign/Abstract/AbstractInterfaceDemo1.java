package com.maggioni.AdvancedClassDesign.Abstract;

abstract class AA {
}
abstract class BB extends AA {
    String s = "from BB";
    abstract void met1();
    /*
    abstract method cannot have a body
    abstract public String met2() {};
    */
    abstract public String met2();
    String met3() {return "hello";}
}

interface CC {
    String s = "from CC";
}

interface DD extends CC {
    /*
    met1() is also existing in BB but the access modifier ist Default
    because the access modifier in DD ist public we have a conflict
    void met1();
    */
    String met2();
}


public abstract class AbstractInterfaceDemo1 extends BB implements  DD{

    void met4() {
        /*
        reference to s is anbiguous
        System.out.println(" " + s);
        */
        
        System.out.println(" " + DD.s);
    }
    
    @Override
    public String met2() {
        return "hello";
    }
    
}

class AClass extends BB implements DD {

    @Override
    void met1() {
        System.out.println("");
    }

    @Override
    public String met2() {
        return "hello";
    }
    
}
