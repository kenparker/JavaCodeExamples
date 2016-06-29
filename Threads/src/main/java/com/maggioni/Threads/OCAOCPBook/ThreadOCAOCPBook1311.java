package com.maggioni.Threads.OCAOCPBook;

public class ThreadOCAOCPBook1311 {

    /*
    the combination x.a() y.a() is possible
    */
    synchronized void a() { 
        System.out.println(this.hashCode() + "a() from " +  Thread.currentThread().getName());
        actBusy();}
    /*
    all following combinations are not possible
    x.b() and x.b()
    x.b() and y.b()
    y.b() and y.b()
    */    
    static synchronized void b() {
        System.out.println("b() from " +  Thread.currentThread().getName());
        actBusy();}
    static void actBusy() {
        //System.out.println("waiting . . ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {}
    }
    public static void main(String[] args) {
        final ThreadOCAOCPBook1311 x = new ThreadOCAOCPBook1311();
        final ThreadOCAOCPBook1311 y = new ThreadOCAOCPBook1311();
        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                int option = (int) (Math.random() * 4);
                //System.out.println("option= "+option );
                switch (option) {
                    case 0: x.a(); break;
                    case 1: x.b(); break;
                    case 2: y.a(); break;
                    case 3: y.b(); break;
                }
            }
        };
        
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t1.start();
        t2.start();
    }

}
