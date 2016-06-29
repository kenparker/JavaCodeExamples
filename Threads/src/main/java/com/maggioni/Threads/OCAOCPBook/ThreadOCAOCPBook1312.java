package com.maggioni.Threads.OCAOCPBook;

public class ThreadOCAOCPBook1312 {

    static Thread lauren, hardy;
    public static void main(String[] args) {
        lauren = new Thread() {
          @Override
          public void run() {
              System.out.println("A");
              try {
                  hardy.sleep(1000);
              } catch (Exception ex) {
                  System.out.println("B");
              }
              System.out.println("C");
          }
        };
        hardy = new Thread() {
          public void run() {
              System.out.println("D");
              try {
                  /*
                  the following statement throws always an IllegalMonitorStateException
                  because the objectmonitor is not acquired
                  */
                  lauren.wait();
              } catch (Exception ex) {
                  System.out.println(ex);
                  System.out.println("E");         
              }
              System.out.println("F");
          }
        };
        lauren.start();
        hardy.start();
    }

}
