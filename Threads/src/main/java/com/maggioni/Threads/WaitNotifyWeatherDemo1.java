package com.maggioni.Threads;

public class WaitNotifyWeatherDemo1 {

    public static void main(String[] args) {
        Forcaster forcaster = new Forcaster();
        forcaster.startThread();
        new Listener(forcaster);
        new Listener(forcaster);
        new Listener(forcaster);
    }

    static Integer integer = 123;
    static class Forcaster extends Thread{
        private int tomorrowsTemperature;
        public Forcaster(){
            
        }
        public void startThread() {start();}
        public synchronized int getTomorrowsTemperature() {
            return tomorrowsTemperature;
        }
        @Override
        public void run(){
            System.out.println("integer from Outclass : " + integer) ;
            try {
                for (;;) {
                    sleep(1000);
                    synchronized(this){
                        tomorrowsTemperature = (int) ( 40 * Math.random() - 10);
                        notifyAll();    // es mach hier ein unterschied, ob notify() oder notifyAll()
                                        // verwendet wird
                    }
                }       
            } catch (Exception e) {
                throw new RuntimeException();
            }
        }
    }
    static class Listener extends Thread{
        public final Forcaster forcaster;
        public Listener(Forcaster forcaster){
            this.forcaster = forcaster;
            start();
        }
        public void run() {
            try {
                for(;;){
                    synchronized(forcaster){
                        forcaster.wait();
                    }
                    /*
                    da notifyAll() verwendt wird werden alle Listener Threads die selber Temperatur anzeigen
                    */
                    System.out.println(getName() + " I hear tomorrow . . . "+ forcaster.getTomorrowsTemperature());
                }
            } catch (Exception e) {
                throw new RuntimeException();
            }
        }
    }
}



