package com.maggioni.Locks;

public class EmployeeDemo2 extends Thread {

    Bus bus;
    String name;

    public EmployeeDemo2(Bus bus, String name) {
        this.bus = bus;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            bus.lock.lockInterruptibly();
            try {
                bus.boardBus(name);
            } finally {
                bus.lock.unlock();        
            }
        } catch (InterruptedException e) {
            System.out.println(name + ": interrupted!");
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        EmployeeDemo2 e1 = new EmployeeDemo2(new Bus(), "paul");
        e1.start();
        e1.interrupt();
        EmployeeDemo2 e2 = new EmployeeDemo2(new Bus(), "lukas");
        e2.start();
    }

}
