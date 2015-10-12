package com.maggioni.Locks;

public class EmployeeDemo1 extends Thread{

    Bus bus;
    String name;

    public EmployeeDemo1(Bus bus, String name) {
        this.bus = bus;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            bus.lock.lockInterruptibly();
            bus.boardBus(name);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(name+": interrupted!");
            /*
            why the Thread.currentThread().interrupt() statements?
            see:
            http://www.javaspecialists.eu/archive/Issue056.html
            http://www.javaspecialists.eu/archive/Issue056.html
            http://stackoverflow.com/questions/4906799/why-invoke-thread-currentthread-interrupt-when-catch-any-interruptexception
            */
            Thread.currentThread().interrupt(); 
        }
        finally {
            bus.lock.unlock();          // in some case this will throw a "IllegalMonitorStateException"
                                        // because the lock may not be acquired
        }
    }
    
   
    public static void main(String[] args)  {
        EmployeeDemo1 e1 = new EmployeeDemo1( new Bus(),"paul");
        e1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("after sleep");
        }
        e1.interrupt();
    }

}
