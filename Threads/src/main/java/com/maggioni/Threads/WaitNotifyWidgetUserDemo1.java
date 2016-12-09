package com.maggioni.Threads;

import java.util.ArrayList;
import java.util.List;

public class WaitNotifyWidgetUserDemo1 extends Thread{

    private WidgetMaker maker;
    public WaitNotifyWidgetUserDemo1(String name, WidgetMaker maker){
        super(name);
        this.maker = maker;
    }
    
    public void run(){
        Widget w = maker.waitForWidget();
        System.out.println(getName() + "  got a widget");
    }

    public static void main(String[] args) {
     WidgetMaker maker = new WidgetMaker();
     maker.start();
     
     new WaitNotifyWidgetUserDemo1("lenny", maker).start();
     new WaitNotifyWidgetUserDemo1("Moe", maker).start();
     new WaitNotifyWidgetUserDemo1("Curly", maker).start();
    }
}

class Widget{}
class WidgetMaker extends Thread{
    List<Widget> finishedWidgets = new ArrayList<>();
    public void run(){
        try {
            while (true) {                
                Thread.sleep(2000);
                Widget w = new Widget();
                synchronized(finishedWidgets){
                    finishedWidgets.add(w);
                    finishedWidgets.notify();   // we could also use notifyAll() here
                                                // but in this case one of the waiting thread will success
                                                // returning a widget (remove(0))
                                                // but the other two will also try to get a widget
                                                // which is not there anymore and throwing a runtimeerror
                }
            }
        } catch (InterruptedException e) {}
    }
    public Widget waitForWidget(){
        synchronized(finishedWidgets){
            if (finishedWidgets.size() == 0) {
                try {
                    finishedWidgets.wait(); // the thread stop execution, release the lock and wait the notify
                } catch (InterruptedException e) {}
            }
            // after the notify the thread try to get the lock again and move on here
            return finishedWidgets.remove(0);   // there could be an IndexOutOfBoundException as another thread could have taken
                                                // the element 0 already
        }
    }
}
