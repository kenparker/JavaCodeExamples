package com.maggioni.SelfTest;

public class Electronic implements Device{

    @Override // all methods from Device are implemented
    public void doIt() {    
    }

    @Override
    public void doThat() {      
    }

    @Override // method need to be public, default is not working as Device.doOther() ist default
    public void doOther() {
    }
}

abstract class Phone1 extends Electronic {
    
    public void a() {
        doIt(); // method defined in Electronic Class
    }
    
}

abstract class Phone2 extends Electronic {

    public void doIt(int x) { // It does not hide the Method from Electronic because signature is different
        
    }
    
    abstract public void doSomethingelse();
}
class Phone4 extends Phone2 {
    
    public static void main(String[] args) {
        new Phone4().doIt();    // Method from Electronic
        new Phone4().doIt(22);  // Method from Phone2
    }

    @Override // the first real methods need to define classes
    public void doSomethingelse() {
        
    }
}
abstract class Phone5 extends Phone2 {   

    /* Overriding of Phone2
    @Override
    public abstract void doSomethingelse();
    */
      
    /* Implementation of Phone2
    @Override
    public void doSomethingelse() {
    }
    */
    
    // Phone5 sees all Methods from Electronic and from Phone2
    
}

class Phone3 extends Electronic implements Device {
    // Phone 3 does not have to implement methods from Device 
    // because Electronic already do that
   
    void d(Electronic e) {
        e.doIt();
        e.doThat();
    }

    @Override
    public void doOther() {
    }
}

class Phone6 implements Device {

    // Phone6 must implements all Methods of Device
    @Override
    public void doIt() {     
    }

    @Override
    public void doThat() {
    }

    @Override
    public void doOther() {
    }
    
}

interface Device {
    public void doIt();
    
    public void doThat();
    
     void doOther();
}
